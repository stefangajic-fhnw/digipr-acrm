package rocks.process.acrm.data.domain;

/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import rocks.process.acrm.data.domain.Job;
import rocks.process.acrm.data.domain.Location;
import rocks.process.acrm.data.domain.Author;

@Entity
@Table(name = "t_book")
public class Book {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String ISBN;
    private String title;
    private String subtitle;
    private String comment;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "jnd_book_author",
            joinColumns = @JoinColumn(name = "book_fk"),
            inverseJoinColumns = @JoinColumn(name = "author_fk"))
    private List<Author> authors;


    private String yearOfPublication;
     @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "job_fk")
    private List<Job> bookWasInTheseJobs;

     @ManyToOne(fetch=FetchType.LAZY)
    private Location locationOfBook;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }
    public void setYearOfPublication   (String yearOfPublicationInput) {
        this.yearOfPublication = yearOfPublicationInput;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }
    /*
   public void setLocationOfBook(Location location) {
        this.locationOfBook = location;
    }

    public Location getLocationOfBook() {
        return locationOfBook;
    } */


    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Author> getAuthors() {
        return authors;
    }


    public void setAuthors(List<Author> authorsInput) {
        authors = new ArrayList<>();
        for (int i = 0; i<authorsInput.size(); i++){
            authors.add(authorsInput.get(i));
        }
    }

    public void addAuthor(Author author) {
        if (authors == null || authors.get(0).equals(null)) {
            authors = new ArrayList<>();
        }
        authors.add(author);
    }

    public void removeAuthor(Author author) {
        for(int i =0; i< authors.size();i++){
            if(authors.get(i).equals(author)){
                authors.remove(i);
            }
        }
    }

    public List<Job> getBookWasInTheseJobs() {
        return bookWasInTheseJobs;
    }
    public void setBookWasInTheseJobs(List<Job> jobsInput) {
        bookWasInTheseJobs = new ArrayList<>();
        for (int i = 0; i<jobsInput.size(); i++){
            bookWasInTheseJobs.add(jobsInput.get(i));
        }
    }

    public void addBookWasInTheseJobs (Job job) {
        if (bookWasInTheseJobs == null || bookWasInTheseJobs.get(0).equals(null)) {
            bookWasInTheseJobs = new ArrayList<>();
        }
        bookWasInTheseJobs.add(job);
    }

    public void removeBookWasInTheseJobs(Job  job) {
        for(int i =0; i< bookWasInTheseJobs.size();i++){
            if(bookWasInTheseJobs.get(i).equals(job)){
                bookWasInTheseJobs.remove(i);
            }
        }
    }
    @Override
    public boolean equals (Object o){
        if(this==o) return true;
        if(!(o instanceof Book)) return false;
        return id != null && id.equals(((Book) o).getId());
    }
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }


}