package com.udea.vuelovirtual.dao;

import com.udea.vuelovirtual.model.Flight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFlightDAO extends CrudRepository<Flight, Long> {
    //SQL   select * from flight as f where f.rating>=4 and f.cumplido=true
    //Hibernate -->  HQL
    //JPA -->  JPQL
    @Query("from Flight f where f.rating>=4 AND f.cumplido=true")
    public List<Flight> viewBestFlight();

}
