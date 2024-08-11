package www.ecomerce.com.ecommerce.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.ecomerce.com.ecommerce.modelos.usuarios;
import www.ecomerce.com.ecommerce.repositorios.usuariosRepositorios;

@Service
public class usuariosServicios {

    @Autowired
    private usuariosRepositorios usuariosRepositorios;

    ///////////////////////////////////////////////////////////
    // METODO PARA CREAR UN NUEVO USUARIO
    public usuarios crearNuevoUsuario(usuarios nvUsuario) {

        return this.usuariosRepositorios.save(nvUsuario);

    }

    ///////////////////////////////////////////////////////////
    // AQUI VALIDAMOS QUE EL USUARIO A CREAR NO EXISTA EN LOS REGISTROS DE LA BASE
    // DE DATOS

    public boolean validarExistenciaUsuario(long codigoUsuario, String correoElectronico, String nombre) {

        if (this.usuariosRepositorios.existsById(codigoUsuario) != true) {

            if (this.usuariosRepositorios.existsBycorreoElectronico(correoElectronico) != true
                    && this.usuariosRepositorios.existsBynombre(nombre) != true) {

                return true;

            }

        }

        return false;

    }

    // validamos que los datos con los que el usuariso quiera accesder a una cuenta
    // sean correctos
    public boolean validarUsuarioLogeado(String nombre, String contrasenia) {

        if (this.usuariosRepositorios.existsBynombre(nombre)
                && this.usuariosRepositorios.existsBycontrasenia(contrasenia)) {
            return true;
        }

        return false;

    }

}
