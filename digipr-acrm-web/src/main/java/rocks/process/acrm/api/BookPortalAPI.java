package rocks.process.acrm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import rocks.process.acrm.data.domain.Customer;
import rocks.process.acrm.data.domain.Member;
import rocks.process.acrm.service.MemberService;

import javax.validation.ConstraintViolationException;
import java.net.URI;

@RestController
@RequestMapping(path = "/book-api")
public class BookPortalAPI {

    @Autowired
    private MemberService memberService;

    @PostMapping(path = "/member", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Member> postMember(@RequestBody Member member) {
        try {
            member = memberService.registerMember(member);
        } catch (ConstraintViolationException e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getConstraintViolations().iterator().next().getMessage());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{memberId}")
                .buildAndExpand(member.getId()).toUri();

        return ResponseEntity.created(location).body(member);
    }
}
