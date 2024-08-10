package www.ecomerce.com.ecommerce.controladores;

import org.springframework.web.bind.annotation.RestController;

import www.ecomerce.com.ecommerce.servicios.lugaresServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/lugares")
public class lugaresControladores {

    @Autowired
    private lugaresServicios lugaresServicios;
}
