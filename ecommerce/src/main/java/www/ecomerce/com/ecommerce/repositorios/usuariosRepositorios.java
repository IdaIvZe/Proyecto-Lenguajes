package www.ecomerce.com.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import www.ecomerce.com.ecommerce.modelos.usuarios;

@Repository
public interface usuariosRepositorios extends JpaRepository<usuarios, Long> {

    public boolean existsBycorreoElectronico(String correoElectronico);

    public boolean existsBynombreUsuario(String nombreUsuario);

    public boolean existsBycontrasenia(String contrasenia);

}
