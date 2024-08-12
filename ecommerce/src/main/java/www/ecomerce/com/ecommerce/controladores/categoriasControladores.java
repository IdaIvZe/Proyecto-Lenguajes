package www.ecomerce.com.ecommerce.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import www.ecomerce.com.ecommerce.modelos.categorias;
import www.ecomerce.com.ecommerce.servicios.categoriasServicios;

@RestController
@RequestMapping("/api/categorias")
public class categoriasControladores {

    @Autowired
    private categoriasServicios categoriasServicios;

    // metodo para mostrar toda las categorias existentes
    @Operation(summary = "Metodo para obtener todas las categorias")
    @GetMapping("/mostrar/todas")
    public List<categorias> mostrarTodasCategorias() {

        return this.categoriasServicios.obtenerTodasCategorias();
    }

}
