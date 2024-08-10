package www.ecomerce.com.ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import www.ecomerce.com.ecommerce.servicios.metodoPagosServicios;

@RestController
@RequestMapping("/api/metodo_pago")
public class metodoPagoControladores {

    @Autowired
    private metodoPagosServicios metodoPagosServicios;
}
