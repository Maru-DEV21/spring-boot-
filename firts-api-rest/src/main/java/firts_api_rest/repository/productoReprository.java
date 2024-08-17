
package firts_api_rest.repository;
import firts_api_rest.model.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class productoReprository {

    private List<Producto> productos = new  ArrayList<>();

    public void createProductos(){
           
            //crea un producto
         productos =  new ArrayList<>(List.of(

            new Producto(1,"Producto 01",10,10),
            new Producto(2,"Producto 02",12,350),
            new Producto(3,"Producto 03",13,50),
            new Producto(4,"Producto 04",14,120),
            new Producto(5,"Producto 05",15,1000),
            new Producto(6,"Producto 06",16,500)
         ));

    }           
    
                public productoReprository(){
                    createProductos();
                }

                //se encarga de enlistar
            public List<Producto> getAllProductos(){
                return productos;
            }
            
                //busca un producto
            public Producto findById(int id) {
                for (Producto producto : productos) {
                    if (producto.getId() == id) {
                        return producto;
                    }
                }
                return null;
            }

             //busca un producto
            public List<Producto> search(String nombre){
                return productos.stream()
                .filter(x -> x.getNombre()
                .startsWith(nombre))
                .collect(Collectors.toList());
            }

            //guarda un producto
            public Producto save(Producto p){

                Producto producto = new Producto();
                
                producto.setId(p.getId());
                producto.setNombre(p.getNombre());
                producto.setCantidad(p.getCantidad());
                producto.setPrecio(p.getPrecio());
                
                productos.add(producto);
                return producto;

            }

             //elimina un producto
            public String delete(Integer id){
                productos.removeIf(x-> x.getId() == id );

                return null;
            }

            public Producto update(Producto producto) {
                int idPos = 0;
                int id = 0;
            
                for(int i = 0; i < productos.size(); i++) {
                    if(productos.get(i).getId() == (producto.getId())) {
                        id = producto.getId(); // id del producto
                        idPos = i; // posicion en la lista
                        break;
                    }
                }

                Producto producto1= new Producto();
                producto1.setId(id);
                producto1.setNombre(producto.getNombre());
                producto1.setCantidad(producto.getCantidad());
                producto1.setPrecio(producto.getPrecio());
                productos.set(idPos, producto);

                return producto1;
               
            }
          
            
}   