package www.ecomerce.com.ecommerce.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.ecomerce.com.ecommerce.modelos.categorias;
import www.ecomerce.com.ecommerce.repositorios.categoriasRepositorios;

@Service
public class categoriasServicios {

    @Autowired
    private categoriasRepositorios categoriasRepositorios;

    // metodo para obtener todas las cateegorias
    public List<categorias> obtenerTodasCategorias() {

        return this.categoriasRepositorios.findAll();

    }

}
