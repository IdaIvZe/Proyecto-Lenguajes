package www.ecomerce.com.ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import www.ecomerce.com.ecommerce.servicios.descripcionProductosServicios;

@RestController
@RequestMapping
public class descripcionProductosControladores {

    @Autowired
    private descripcionProductosServicios descripcionProductosServicios;

}
