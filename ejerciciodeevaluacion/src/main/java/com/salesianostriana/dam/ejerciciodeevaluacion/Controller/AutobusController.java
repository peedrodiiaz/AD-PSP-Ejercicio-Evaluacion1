package com.salesianostriana.dam.ejerciciodeevaluacion.Controller;

import com.salesianostriana.dam.ejerciciodeevaluacion.Model.RutaAutobus;
import com.salesianostriana.dam.ejerciciodeevaluacion.Service.AutobusService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rutas")
@Tag(name = "Controller",description = "Gestiona las peticiones de las rutas")
public class AutobusController {

    private final AutobusService autobusService;
    @GetMapping
    @Operation(description = "Responde a la petición para conseguir todas las rutas")
    public ResponseEntity<List> findAll(){

        return ResponseEntity.ok(autobusService.findAll());

    }


    @GetMapping ("/{id}")
    public ResponseEntity<RutaAutobus> findById(@PathVariable Long id){
        return ResponseEntity.ok(autobusService.findById(id));
    }




}
