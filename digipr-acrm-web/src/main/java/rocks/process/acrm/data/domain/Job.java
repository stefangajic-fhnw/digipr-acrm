package rocks.process.acrm.data.domain;

/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

import javax.persistence.*;
@Entity
@Table(name = "t_job")
public class Job {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    /* @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "jnd_member_job",
            joinColumns = @JoinColumn(name = "job_fk"),
            inverseJoinColumns = @JoinColumn(name = "member_fk"))
    private Member member;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "job_fk")
    private Book book;

     */
    @Enumerated(EnumType.STRING)
    private JobStatus jobStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   /*  public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    */
}