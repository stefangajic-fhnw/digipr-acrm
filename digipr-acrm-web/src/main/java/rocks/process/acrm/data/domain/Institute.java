package rocks.process.acrm.data.domain;

/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */



import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_institute")
public class Institute {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
   /*  @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "jnd_institute_author",
            joinColumns = @JoinColumn(name = "institute_fk"),
            inverseJoinColumns = @JoinColumn(name = "author_fk"))
    private List<Author> authors;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "institute_fk")
    private List<Location> location;

    */
    private String name;
    private String legalNotice;
    private String nameOfHead;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

  /*  public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
        this.location = location;
    }


   */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegalNotice() {
        return legalNotice;
    }

    public void setLegalNotice(String legalNotice) {
        this.legalNotice = legalNotice;
    }

    public String getNameOfHead() {
        return nameOfHead;
    }

    public void setNameOfHead(String nameOfHead) {
        this.nameOfHead = nameOfHead;
    }
}