package com.salesianostriana.dam.ejerciciodeevaluacion.errors;

public class BusRouteNotFoundException extends  RuntimeException{

    public BusRouteNotFoundException  (){
        super("No se han encontrado rutas de autobuses");
    }
    public BusRouteNotFoundException (Long id){
        super("No se ha encontrado el la ruta de autobús con id".formatted(id));
    }
}
