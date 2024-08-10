package www.ecomerce.com.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface direccionEntregas extends JpaRepository<direccionEntregas, Long> {

}
