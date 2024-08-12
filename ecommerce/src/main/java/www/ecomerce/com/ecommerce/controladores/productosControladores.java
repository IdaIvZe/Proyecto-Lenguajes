package www.ecomerce.com.ecommerce.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import www.ecomerce.com.ecommerce.modelos.productos;
import www.ecomerce.com.ecommerce.servicios.productosServicios;

@RestController
@RequestMapping("/api/productos")
public class productosControladores {

    @Autowired
    private productosServicios productosServicios;

    // Metodo para crear solo el producto
    @Operation(summary = "Crear nuevo producto")
    @PostMapping("/crear/nvo")
    public productos nuevoProducto(@RequestBody productos nuevoProducto) {
        return this.productosServicios.crearNuevoProducto(nuevoProducto);
    }

    // Metodo para crear producto con su categoria asociada
    @Operation(summary = "Crear nuevo producto asociandole la categoria")
    @PostMapping("/crear/nvoCompleto")
    public productos crearNuevoProductoConCategoria(@RequestBody productos nvoProducto) {
        return this.productosServicios.crearNuevoProductoConCategoria(nvoProducto);

    }

    // Metodo para obtener un producto por id
    @Operation(summary = "Obtener un producto especifico por el ID")
    @GetMapping("/mostrar/{codigoproducto}")
    private Optional<productos> obtenerProductos(@PathVariable(name = "codigoproducto") long codigoproducto) {
        // borre el optinonal<>
        return this.productosServicios.obtenerProductos(codigoproducto);
    }

    // Metodo para obtener todos los productos por una misma categoria
    @Operation(summary = "Filtrar todos los produtos de una mismacategoria")
    @GetMapping("/mostrar/porCategoria/{codigocategoria}")
    public List<productos> mostrarPorCategorias(@PathVariable(value = "codigocategoria") long codigocategoria) {
        return this.productosServicios.mostrarProductosDeMismaCategoria(codigocategoria);
    }
}
