package com.salesianostriana.dam.ejerciciodeevaluacion.Service;

import com.salesianostriana.dam.ejerciciodeevaluacion.Dto.BusRouteRequestDto;
import com.salesianostriana.dam.ejerciciodeevaluacion.Model.RutaAutobus;
import com.salesianostriana.dam.ejerciciodeevaluacion.Repository.AutobusRepository;
import com.salesianostriana.dam.ejerciciodeevaluacion.errors.BusRouteNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AutobusService {

    private final AutobusRepository autobusRepository;


    public List<RutaAutobus> findAll(){
        return autobusRepository.findAll();
    }


    public RutaAutobus findById(Long id){
        return autobusRepository.findById(id)
                .orElseThrow(() -> new BusRouteNotFoundException(id));
    }

    public RutaAutobus createRuta(BusRouteRequestDto cmd){
        RutaAutobus rutaAutobus = cmd.toEntity(cmd);
        return rutaAutobus;
    }



    }


