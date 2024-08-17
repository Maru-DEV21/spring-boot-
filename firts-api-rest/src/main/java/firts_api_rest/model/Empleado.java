package firts_api_rest.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data   
@AllArgsConstructor
@NoArgsConstructor

public class  Empleado {

    private int id;
    private String nombre;
    private String apellido;
    private int edad ;
    private int sueldo ;
    private String email;
    private String anosExperience;
    private int telefono;
    

    
}
