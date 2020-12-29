package rocks.process.acrm.data.repository;

/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */


import rocks.process.acrm.data.domain.Author;
import rocks.process.acrm.data.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
interface AuthorRepository extends JpaRepository <Author,  Long> {
   /*  Optional<Author> findById(Long id);
    List<Author> findByName(String name);
    List<Author> findByBook(Book book);
    List<Author> findByNameAndFirstName(String name, String firstName);

    */

}