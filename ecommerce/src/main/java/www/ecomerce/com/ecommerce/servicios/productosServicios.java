package www.ecomerce.com.ecommerce.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.ecomerce.com.ecommerce.repositorios.productosRepositorios;

@Service
public class productosServicios {

    @Autowired
    private productosRepositorios productosRepositorios;
}
