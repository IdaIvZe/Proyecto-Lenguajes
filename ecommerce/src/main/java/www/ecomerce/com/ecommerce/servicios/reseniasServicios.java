package www.ecomerce.com.ecommerce.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.ecomerce.com.ecommerce.modelos.productos;
import www.ecomerce.com.ecommerce.modelos.resenias;
import www.ecomerce.com.ecommerce.repositorios.reseniasRepositorios;
import www.ecomerce.com.ecommerce.repositorios.productosRepositorios;

@Service
public class reseniasServicios {

    @Autowired
    private reseniasRepositorios reseniasRepositorios;

    @Autowired
    private productosRepositorios productosRepositorios;

    /*
     * //se planea hacer un metodo que crea un a resenai y lo asocie con un codigo
     * perfil de usuairo
     * public resenias nuevaResenias(resenias nvaResenia, long codigoproducto) {
     * 
     * resenias localResenia = this.nvaResenia.getCodigoResenia().get();
     * productos produtolocal =
     * this.productoRepositorios.findById(codigoproducito).get();
     * 
     * if (nvaResenia != null) {
     * 
     * 
     * localResenia.setComentario(nvaResenia.getComentario());
     * 
     * }
     * }
     * 
     * 
     * // metodo para crear una reseña asociada a un producto
     */
}
