package com.udea.vuelovirtual.service;

import com.udea.vuelovirtual.dao.IFlightDAO;

import com.udea.vuelovirtual.exception.FlightNotFoundException;
import com.udea.vuelovirtual.model.Flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired private IFlightDAO dao;

    public Flight save(Flight f) {
        return dao.save(f);
    }

    public String delete(long id){
        dao.deleteById(id);
        return "Flight deleted";
    }

    public Iterable<Flight> list() {
        return dao.findAll();
    }

    public Optional<Flight> listId(long id) {
        return dao.findById(id);
    }


    public Flight update(Flight f) {
        Flight exisitingFlight = dao.findById(f.getIdFlight()).orElse(null);
        exisitingFlight.setNombreAvion(f.getNombreAvion());
        exisitingFlight.setNumeroVuelo(f.getNumeroVuelo());
        exisitingFlight.setOrigen(f.getOrigen());
        exisitingFlight.setDestino(f.getDestino());
        exisitingFlight.setRating(f.getRating());
        exisitingFlight.setPlanVuelo(f.getPlanVuelo());
        exisitingFlight.setCapacidad(f.getCapacidad());
        exisitingFlight.setCumplido(f.isCumplido());
        return dao.save(exisitingFlight);
    }

    public List<Flight> viewBestFlight() throws FlightNotFoundException{
        List<Flight> flights =dao. viewBestFlight();
        if(flights.size()>0)
            return flights;
        else throw new FlightNotFoundException("No Flight found with rating >=4");

    }



}
