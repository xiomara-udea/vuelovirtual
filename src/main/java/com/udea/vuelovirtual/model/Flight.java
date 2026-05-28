package com.udea.vuelovirtual.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Data
@Entity
@Table(name = "flight")
public class Flight implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFlight;

    @Column(nullable = false, length = 80)
    private String nombreAvion;

    @Column(nullable = false, length = 80)
    private String numeroVuelo;

    @Column(nullable = false, length = 80)
    private String origen;

    @Column(nullable = false, length = 80)
    private String destino;

    @Column(nullable = false)
    private int capacidad;

    @Min(1)
    @Max(5)
    @Column(nullable = false)
    private int rating;

    @Column(nullable = false)
    private long planVuelo;

    @Column(nullable = false)
    private boolean cumplido;
}