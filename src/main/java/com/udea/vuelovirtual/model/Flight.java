package com.udea.vuelovirtual.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.*;

import java.io.Serializable;

@Data
@Entity

@Table(name = "flight")
public class Flight implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFlight")
    private Long idFlight;

    @Column(name = "nombreAvion", nullable = false, length = 80)
    private @NonNull String nombreAvion;

    @Column(name = "numeroVuelo", nullable = false, length = 80)
    private @NonNull String numeroVuelo;

    @Column(name = "origen", nullable = false, length = 80)
    private @NonNull String origen;

    @Column(name = "destino", nullable = false, length = 80)
    private @NonNull String destino;

    @Column(name = "capacidad", nullable = false, length = 80)
    private @NonNull int capacidad;

    @Column(name = "rating", nullable = false, length = 80)
    @Min(value = 1, message = "id should be more or than equal 1")
    @Max(value = 5, message = "id should be less or than equal 5")
    private @NonNull int rating;

    @Column(name = "planvuelo", nullable = false, length = 80)
    private @NonNull long planVuelo;

    private boolean cumplido;


    public Flight() {
    }

    public Flight(Long idFlight, @NonNull String nombreAvion, @NonNull String numeroVuelo, @NonNull String origen, @NonNull String destino, @NonNull int capacidad, @NonNull int rating, @NonNull long planVuelo, boolean cumplido) {
        this.idFlight = idFlight;
        this.nombreAvion = nombreAvion;
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.capacidad = capacidad;
        this.rating = rating;
        this.planVuelo = planVuelo;
        this.cumplido = cumplido;
    }

    public Long getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(Long idFlight) {
        this.idFlight = idFlight;
    }

    public @NonNull String getNombreAvion() {
        return nombreAvion;
    }

    public void setNombreAvion(@NonNull String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }

    public @NonNull String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(@NonNull String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public @NonNull String getOrigen() {
        return origen;
    }

    public void setOrigen(@NonNull String origen) {
        this.origen = origen;
    }

    public @NonNull String getDestino() {
        return destino;
    }

    public void setDestino(@NonNull String destino) {
        this.destino = destino;
    }

    @NonNull
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(@NonNull int capacidad) {
        this.capacidad = capacidad;
    }

    @Min(value = 1, message = "id should be more or than equal 1")
    @Max(value = 5, message = "id should be less or than equal 5")
    @NonNull
    public int getRating() {
        return rating;
    }

    public void setRating(@Min(value = 1, message = "id should be more or than equal 1") @Max(value = 5, message = "id should be less or than equal 5") @NonNull int rating) {
        this.rating = rating;
    }

    @NonNull
    public long getPlanVuelo() {
        return planVuelo;
    }

    public void setPlanVuelo(@NonNull long planVuelo) {
        this.planVuelo = planVuelo;
    }

    public boolean isCumplido() {
        return cumplido;
    }

    public void setCumplido(boolean cumplido) {
        this.cumplido = cumplido;
    }
}