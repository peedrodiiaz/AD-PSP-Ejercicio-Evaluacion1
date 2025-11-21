package com.salesianostriana.dam.ejerciciodeevaluacion.Dto;

import com.salesianostriana.dam.ejerciciodeevaluacion.Model.RutaAutobus;

public record BusRouteResponseDto(
        String codRuta,
        String origen,
        String destino,
        double kms,
        int minutos,
        String desRuta
) {
    public RutaAutobus to (BusRouteResponseDto cmd){
        return RutaAutobus.builder()
                .codRuta(cmd.codRuta)
                .origen(cmd.origen)
                .destino(cmd.destino)
                .kms(cmd.kms)
                .minutos(cmd.minutos)
                .desRuta(cmd.desRuta)
                .build();

    }
}
