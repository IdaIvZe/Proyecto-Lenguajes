import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bases.proyecto.backend.backengithub.modelos.usuarios;

@Repository
public interface usuariosRepositorios extends JpaRepository<usuarios, Long> {

    public boolean existsByCORREOELECTRONICO(String CORREOELECTRONICO);

    public boolean existsByNOMBRECUENTA(String NOMBRECUENTA);

}
