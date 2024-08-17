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
import firts_api_rest.model.Producto;
import firts_api_rest.service.ProductoService;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public Producto agregaProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

    @GetMapping
    public List<Producto> listaProductos(){
        return productoService.getProductos();
    }

    @GetMapping("/{id}")
    public Producto busProducto(@PathVariable int id){
        return productoService.geProductoById(id);
    }

    @PutMapping
    public Producto actuProducto(@PathVariable Producto producto){
        return productoService.updateProducto(producto);
    }
    
    @DeleteMapping("/{id}")
    public String eliminarProducto (@PathVariable int id ){
        return productoService.deleteProducto(id);
    }
}
