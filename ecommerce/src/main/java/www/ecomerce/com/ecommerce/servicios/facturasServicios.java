package www.ecomerce.com.ecommerce.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.ecomerce.com.ecommerce.repositorios.facturasRepositorios;

@Service
public class facturasServicios {

    @Autowired
    private facturasRepositorios fRepositorios;
}
