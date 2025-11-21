package com.salesianostriana.dam.ejerciciodeevaluacion.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class RutaAutobus {


    @Id
    @GeneratedValue
    private Long id;
    private String codRuta;
    private String origen;
    private String destino;
    private double kms;
    private int minutos;
    private String desRuta;
}
