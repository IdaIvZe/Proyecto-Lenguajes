package www.ecomerce.com.ecommerce.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.ecomerce.com.ecommerce.repositorios.inventariosExistenciasRepositorios;

@Service
public class inventariosExistenciasServicios {

    @Autowired
    private inventariosExistenciasRepositorios inventariosExistenciasRepositorios;
}
