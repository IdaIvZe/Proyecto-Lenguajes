package www.ecomerce.com.ecommerce.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.ecomerce.com.ecommerce.repositorios.descripcionProductosRepositorios;

@Service
public class descripcionProductosServicios {

    @Autowired
    private descripcionProductosRepositorios dProductosRepositorios;
}
