package rocks.process.acrm.data.repository;


/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */
import rocks.process.acrm.data.domain.Institute;
import rocks.process.acrm.data.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
 interface InstituteRepository extends JpaRepository<Institute, Long> {
    /* Institute findById(Integer id);
    List<Institute> findByName(String name);
    Institute findByLocation(Location location);

     */
}