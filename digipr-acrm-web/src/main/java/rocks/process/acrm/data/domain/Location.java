package rocks.process.acrm.data.domain;

/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_location")
public class Location {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String street;
    private Integer buildingNumber;
    private String comment;
    private Integer zipCode;
    private String city;
    private String country;
   /* @OneToOne
    private String contactInfo;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "location_fk")
    private List<Book> books;

    */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(Integer buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

   /* public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    */
}