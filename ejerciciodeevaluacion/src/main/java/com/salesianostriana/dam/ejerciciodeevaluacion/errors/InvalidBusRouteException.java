package com.salesianostriana.dam.ejerciciodeevaluacion.errors;

public class InvalidBusRouteException extends RuntimeException{

    public InvalidBusRouteException(){
        super("Los valores no son válidos");
    }
}
