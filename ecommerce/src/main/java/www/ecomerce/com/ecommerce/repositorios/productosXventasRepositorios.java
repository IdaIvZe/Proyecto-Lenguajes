package www.ecomerce.com.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import www.ecomerce.com.ecommerce.modelos.productosXventas;

@Repository
public interface productosXventasRepositorios extends JpaRepository<productosXventas, Long> {

}
