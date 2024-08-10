package www.ecomerce.com.ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import www.ecomerce.com.ecommerce.servicios.categoriaProductosServicios;

@RestController
@RequestMapping("/api/categoria_productos")
public class categoriaProductosControladores {

    @Autowired
    private categoriaProductosServicios categoriaProductosServicios;
}
