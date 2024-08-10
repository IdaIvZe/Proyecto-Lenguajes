package www.ecomerce.com.ecommerce.controladores;

import org.springframework.web.bind.annotation.RestController;

import www.ecomerce.com.ecommerce.servicios.facturasServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/facturas")
public class facturasControladores {

    @Autowired
    private facturasServicios facturasServicios;

}
