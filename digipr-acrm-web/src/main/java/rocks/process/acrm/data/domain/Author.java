package rocks.process.acrm.data.domain;

/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_author")
public class Author {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "jnd_book_author",
            joinColumns = @JoinColumn(name = "author_fk"),
            inverseJoinColumns = @JoinColumn(name = "book_fk"))
    private List<Book> books;


    private String name;
    private String firstName;
    private String legalNotice;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "jnd_institute_author",
            joinColumns = @JoinColumn(name = "author_fk"),
            inverseJoinColumns = @JoinColumn(name = "institute_fk"))
    private List<Institute> institutes;





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   /* public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (books == null)
            books = new ArrayList<>();
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLegalNotice() {
        return legalNotice;
    }

    public void setLegalNotice(String legalNotice) {
        this.legalNotice = legalNotice;
    }

   /* public List<Institute> getInstitutes() {
        return institutes;
    }

    public void setInstitutes(List<Institute> institutes) {
        this.institutes = institutes;
    }

    public void addInstitute(Institute institute) {
        if (institutes == null)
            institutes = new ArrayList<>();
        institutes.add(institute);
    }

    public void removeInstitute(Institute institute) {
        institutes.remove(institute);
    }

    */
}