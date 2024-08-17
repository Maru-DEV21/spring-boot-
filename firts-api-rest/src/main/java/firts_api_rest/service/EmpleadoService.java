package firts_api_rest.service;
import firts_api_rest.model.Empleado;
import firts_api_rest.repository.EmpleadoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public Empleado saveEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    public List<Empleado> getEmpleados(){
        return empleadoRepository.getAllEmpleados();
    }

    public Empleado geEmpleadoById(int id){
        return empleadoRepository.findById(id);
    }

    public String deleteEmpleado(int id){
        empleadoRepository.delete(id);
        return "el Empleado se elimino el id : " + id;
    }

    public Empleado updateEmpleado(Empleado empleado){
        return empleadoRepository.update(empleado);
    }

}
