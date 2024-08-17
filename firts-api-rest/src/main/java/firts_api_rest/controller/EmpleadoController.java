package firts_api_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import firts_api_rest.model.Empleado;
import firts_api_rest.service.EmpleadoService;

@RestController
@RequestMapping("/api/v2/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping
    public Empleado agregaProducto(@RequestBody Empleado empleado){
        return empleadoService.saveEmpleado(empleado);
    }

    @GetMapping
    public List<Empleado> listaProductos(){
        return empleadoService.getEmpleados();
    }

    @GetMapping("/{id}")
    public Empleado busProducto(@PathVariable int id){
        return empleadoService.geEmpleadoById(id);
    }

    @PutMapping
    public Empleado actuProducto(@PathVariable Empleado empleado){
        return empleadoService.updateEmpleado(empleado);
    }
    
    @DeleteMapping("/{id}")
    public String eliminarProducto (@PathVariable int id ){
        return empleadoService.deleteEmpleado(id);
    }
}
