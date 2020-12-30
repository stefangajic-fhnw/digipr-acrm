package rocks.process.acrm.data.domain;

/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */



import com.fasterxml.jackson.annotation.JsonProperty;
import rocks.process.acrm.data.domain.Job;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "t_member")
public class Member {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    @Email(message = "Please provide a valid e-mail.")
    @NotEmpty(message = "Please provide an e-mail.")
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) // only create object property from JSON
    private String password;
    private String phone;
    @OneToMany(
            mappedBy ="member", cascade = CascadeType.ALL, orphanRemoval = true
    )
    private List<Job> jobs;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        String transientPassword = this.password;
        this.password = null;
        return transientPassword;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    private void addJob(Job job){
        jobs.add(job);
    }
    private void removeJob(Job job){
        jobs.remove(job);
    }




    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}