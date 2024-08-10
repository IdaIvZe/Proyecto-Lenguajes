package www.ecomerce.com.ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import www.ecomerce.com.ecommerce.servicios.listaProductosFavoritosServicios;

@RestController
@RequestMapping("/api/lista_Produtos_Favoritos")
public class listaProductosFavoritosControladores {

    @Autowired
    private listaProductosFavoritosServicios listaProductosFavoritosServicios;

}
