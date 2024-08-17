package firts_api_rest.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data   
@AllArgsConstructor
@NoArgsConstructor


public class Producto {

    private int id;
    private String nombre;
    private  int cantidad;
    private double precio;
     
}

