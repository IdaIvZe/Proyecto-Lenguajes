package www.ecomerce.com.ecommerce.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.ecomerce.com.ecommerce.modelos.categorias;
import www.ecomerce.com.ecommerce.modelos.productos;
import www.ecomerce.com.ecommerce.repositorios.categoriasRepositorios;
import www.ecomerce.com.ecommerce.repositorios.productosRepositorios;

@Service
public class productosServicios {

    @Autowired
    private productosRepositorios productosRepositorios;

    @Autowired
    private categoriasRepositorios categoriasRepositorios;

    //////////////////////////////////////////////////////////////
    ////////////////// METODOS EN CONSTRUCCION ///////////////////
    //////////////////////////////////////////////////////////////

    // Metodo para crear productos
    public productos crearNuevoProducto(productos nvoProducto) {
        return this.productosRepositorios.save(nvoProducto);
    }

    // Metodo para crear un nuevo producto con su objeto categoria
    public productos crearNuevoProductoConCategoria(productos nvoProducto) {

        categorias categoriaAsociada = nvoProducto.getCategorias();
        if (categoriaAsociada != null) {
            categoriaAsociada.setNombreCategoria(nvoProducto.getCategorias().getNombreCategoria());
            this.categoriasRepositorios.save(categoriaAsociada);
        }

        return this.productosRepositorios.save(nvoProducto);
    }

    // Metodo para obtener un producto por id
    public Optional<productos> obtenerProductos(long codigoproducto) {
        // borre el optional<>
        return this.productosRepositorios.findById(codigoproducto);
    }

    // Metodo para mostrar todos los productos que pertencen a una misma categoria
    public List<productos> mostrarProductosDeMismaCategoria(long codigocategoria) {

        return this.productosRepositorios.findByCategoriasCodigoCategoria(codigocategoria);
    }
}
