package rocks.process.acrm.data.domain;

/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */
import rocks.process.acrm.data.domain.Member;
import javax.persistence.*;
@Entity
@Table(name = "t_job")
public class Job {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;
    @Enumerated(EnumType.STRING)
    private JobStatus jobStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

     public Member getMember() {
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

   @Override
   public boolean equals (Object o){
        if(this==o) return true;
        if(!(o instanceof Job)) return false;
        return id != null && id.equals(((Job) o).getId());
   }
 @Override
 public int hashCode() {
        return getClass().hashCode();
 }

}