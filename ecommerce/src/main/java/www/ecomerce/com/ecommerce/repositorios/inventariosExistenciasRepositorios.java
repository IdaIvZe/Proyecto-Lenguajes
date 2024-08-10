package www.ecomerce.com.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import www.ecomerce.com.ecommerce.modelos.inventariosExistencias;

@Repository
public interface inventariosExistenciasRepositorios extends JpaRepository<inventariosExistencias, Long> {

}
