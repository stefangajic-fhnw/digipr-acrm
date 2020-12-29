package rocks.process.acrm.data.repository;

/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

import rocks.process.acrm.data.domain.Location;
import rocks.process.acrm.data.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;



@Repository
interface LocationRepository extends JpaRepository<Location, Long> {
     /* List<Location> findByStreet(String street);
     List<Location> findByZipCode(Integer zipCode);
     List<Location> findByCity(String city);
     Location findById(Integer id);
     List<Location> findByStreetAndBuildingNumber(String street, Integer buildingNumber);
     List<Location> findByCountry(String country);
     List<Location> findByBook(Book book);

      */

}