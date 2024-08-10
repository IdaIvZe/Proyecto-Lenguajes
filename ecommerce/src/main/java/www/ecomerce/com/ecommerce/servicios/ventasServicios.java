package www.ecomerce.com.ecommerce.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.ecomerce.com.ecommerce.repositorios.ventasRepositorios;

@Service
public class ventasServicios {

    @Autowired
    private ventasRepositorios ventasRepositorios;
}
