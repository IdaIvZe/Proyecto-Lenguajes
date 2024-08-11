package www.ecomerce.com.ecommerce.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.ecomerce.com.ecommerce.modelos.usuarios;
import www.ecomerce.com.ecommerce.repositorios.usuariosRepositorios;

@Service
public class usuariosServicios {

    @Autowired
    private usuariosRepositorios usuariosRepositorios;

    // METODO PARA CREAR UN NUEVO USUARIO
    public usuarios crearNuevoUsuario(usuarios nvUsuario) {

        return this.usuariosRepositorios.save(nvUsuario);

    }

    // AQUI VALIDAMOS QUE EL USUARIO A CREAR NO EXISTA EN LOS REGISTROS DE LA BASE
    // DE DATOS

    public boolean validarExistenciaUsuario(long codigoUsuario, String correoElectronico, String nombreCuenta) {

        if (this.usuariosRepositorios.existsById(codigoUsuario) != true) {

            if (this.usuariosRepositorios.existsBycorreoElectronico(correoElectronico) != true
                    && this.usuariosRepositorios.existsBynombreUsuario(nombreCuenta) != true) {

                return true;

            }

        }

        return false;

    }

    public boolean validarUsuarioLogeado(String nombreUsuario, String contraenia) {

        if (this.usuariosRepositorios.existsBynombreUsuario(nombreUsuario)
                && this.usuariosRepositorios.existsBycontrasenia(contraenia)) {
            return true;
        }

        return false;

    }
}
