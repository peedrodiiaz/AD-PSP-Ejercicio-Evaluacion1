package com.salesianostriana.dam.ejerciciodeevaluacion.Dto;

import com.salesianostriana.dam.ejerciciodeevaluacion.Model.RutaAutobus;

public record BusRouteRequestDto(
         String codRuta,
         String origen,
         String destino,
         double kms,
         int minutos,
         String desRuta
) {
    public RutaAutobus toEntity(BusRouteRequestDto cmd){
        return RutaAutobus.builder()
                .codRuta(codRuta)
                .origen(origen)
                .destino(destino)
                .kms(kms)
                .minutos(minutos)
                .desRuta(desRuta)
                .build();
    }
}
