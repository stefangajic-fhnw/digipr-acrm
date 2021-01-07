package rocks.process.acrm.data.repository;


import rocks.process.acrm.data.domain.Job;
import rocks.process.acrm.data.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findById(Integer id);
/*
    Member findMemberByEmail(String email);

    Member findByEmailAndIdNot(String email, Integer memberId);

    Member findByPhone(String phone);

    Member findByJobs(Job jobs);

    */


}