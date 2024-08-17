
package firts_api_rest.repository;
import firts_api_rest.model.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class EmpleadoRepository {

    private List<Empleado> empleado = new  ArrayList<>();

    public void createEmpleado(){
           
            //crea un empleado
         empleado =  new ArrayList<>(List.of(

            new Empleado(1,"maria 01","martinez",21,150000,"martinez1@lte.com","2anos",536871066),
            new Empleado(2,"maria 02","gonzalez",26,150000,"martinez2@lte.com","2anos",536871066),
            new Empleado(3,"maria 03","savedra",25,160000,"martinez@3lte.com","2anos",536871066),
            new Empleado(4,"maria 04","caldon",24,150000,"martinez4@lte.com","2anos",536871066),
            new Empleado(5,"maria 05","quira",23,150000,"martinez5@lte.com","2anos",536871066),
            new Empleado(6,"maria 06","polo",22,150000,"martinez6@lte.com","2anos",536871066)
         ));

    }           
    
                public EmpleadoRepository(){
                    createEmpleado();
                }

                //se encarga de enlistar
            public List<Empleado> getAllEmpleados(){
                return empleado;
            }
            
                //busca un empleado
            public Empleado findById(int id) {
                for (Empleado empleados : empleado) {
                    if (empleados.getId() == id) {
                        return empleados;
                    }
                }
                return null;
            }

             //busca un empleado
            public List<Empleado> search(String nombre){
                return empleado.stream()
                .filter(x -> x.getNombre()
                .startsWith(nombre))
                .collect(Collectors.toList());
            }

            //guarda un empleado
            public Empleado save(Empleado e){

                Empleado empleados = new Empleado();
                
                empleados.setId(e.getId());
                empleados.setNombre(e.getNombre());
                empleados.setApellido(e.getApellido());
                empleados.setEdad(e.getEdad());
                empleados.setSueldo(e.getSueldo());
                empleados.setEmail(e.getEmail());
                empleados.setAnosExperience(e.getAnosExperience());
                empleados.setTelefono(e.getTelefono());
                
                empleado.add(empleados);
                return empleados;

            }

             //elimina un empleado
            public String delete(Integer id){
                empleado.removeIf(x-> x.getId() == id );

                return null;
            }

            public Empleado update(Empleado empleados) {
                int idEmp = 0;
                int id = 0;
            
                for(int i = 0; i < empleado.size(); i++) {
                    if(empleado.get(i).getId() == (empleados.getId())) {
                        id = empleados.getId(); // id del empleado
                        idEmp = i; // posicion en la lista
                        break;
                    }
                }

                Empleado empleado1= new Empleado();
                empleado1.setId(id);
                empleado1.setNombre(empleados.getNombre());
                empleado1.setApellido(empleados.getApellido());
                empleado1.setEdad(empleados.getEdad());
                empleado1.setSueldo(empleados.getSueldo());
                empleado1.setEmail(empleados.getEmail());
                empleado1.setAnosExperience(empleados.getAnosExperience());
                empleado1.setTelefono(empleados.getTelefono());
                empleado.set(idEmp, empleados);

                return empleado1;
               
            }
          
            
}   