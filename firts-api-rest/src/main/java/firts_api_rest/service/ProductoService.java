package firts_api_rest.service;

import firts_api_rest.model.Producto;
import firts_api_rest.repository.productoReprository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductoService {

    @Autowired
    private productoReprository productoReprository;

    public Producto saveProducto(Producto producto){
        return productoReprository.save(producto);
    }

    public List<Producto> getProductos(){
        return productoReprository.getAllProductos();
    }

    public Producto geProductoById(int id){
        return productoReprository.findById(id);
    }

    public String deleteProducto(int id){
        productoReprository.delete(id);
        return "el producto se elimino el id : " + id;
    }

    public Producto updateProducto(Producto producto){
        return productoReprository.update(producto);
    }
}
