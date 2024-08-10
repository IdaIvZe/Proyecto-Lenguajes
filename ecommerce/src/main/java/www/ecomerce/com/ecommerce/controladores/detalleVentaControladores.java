package www.ecomerce.com.ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import www.ecomerce.com.ecommerce.servicios.detalleVentasServicios;

@RestController
@RequestMapping("/api/detalle_ventas")
public class detalleVentaControladores {

    @Autowired
    private detalleVentasServicios detalleVentasServicios;

}
