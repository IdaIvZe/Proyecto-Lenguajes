package www.ecomerce.com.ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import www.ecomerce.com.ecommerce.servicios.productosXventasServicios;

@RestController
@RequestMapping("api/productos_por_ventas")
public class productosXventasControlladores {

    @Autowired
    private productosXventasServicios productosXventasServicios;
}
