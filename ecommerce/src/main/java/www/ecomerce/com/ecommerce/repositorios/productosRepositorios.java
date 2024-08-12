package www.ecomerce.com.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import www.ecomerce.com.ecommerce.modelos.productos;
import java.util.List;

@Repository
public interface productosRepositorios extends JpaRepository<productos, Long> {

    List<productos> findByCategoriasCodigoCategoria(long codigocategoria);

}
