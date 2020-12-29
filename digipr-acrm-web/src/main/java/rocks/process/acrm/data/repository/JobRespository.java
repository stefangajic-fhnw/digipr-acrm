package rocks.process.acrm.data.repository;

/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */




import rocks.process.acrm.data.domain.Job;
import rocks.process.acrm.data.domain.Book;
import rocks.process.acrm.data.domain.Member;
import rocks.process.acrm.data.domain.JobStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
 interface JobRepository extends JpaRepository<Job, Long> {
   /*  List<Job> findByBook(Book book);
     List<Job> findByMember(Member member);
     Job findById(Integer id);
     List<Job> findByJobStatus(JobStatus jobStatus);

    */
}