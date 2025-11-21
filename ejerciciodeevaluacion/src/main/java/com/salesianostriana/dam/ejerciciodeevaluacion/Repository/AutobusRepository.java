package com.salesianostriana.dam.ejerciciodeevaluacion.Repository;

import com.salesianostriana.dam.ejerciciodeevaluacion.Model.RutaAutobus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutobusRepository extends JpaRepository<RutaAutobus,Long> {
}
