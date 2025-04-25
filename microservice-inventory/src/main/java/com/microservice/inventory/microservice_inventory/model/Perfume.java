package com.microservice.inventory.microservice_inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Perfume {
    private int id;
    private String nombre;
    private String marca;
    private double precio;
    private String tipoFragancia;
    private int volumenEnMililitros;
    private String genero;
}
