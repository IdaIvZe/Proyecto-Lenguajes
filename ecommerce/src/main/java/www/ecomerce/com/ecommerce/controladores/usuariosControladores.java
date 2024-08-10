package www.ecomerce.com.ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import www.ecomerce.com.ecommerce.modelos.usuarios;
import www.ecomerce.com.ecommerce.servicios.usuariosServicios;

@RestController
@RequestMapping("/api/logeo/registro")
public class usuariosControladores {

    @Autowired
    private usuariosServicios usuariosServicios;

    // Metodo para crear usuarios, validando que no exista en la base de datos ya
    // sea por correo, codigo usuario, nombre cuenta.
    @PostMapping("/nuevo")
    public usuarios putMethodName(@RequestBody usuarios nvUsuarios) {

        if (this.usuariosServicios.validarExistenciaUsuario(nvUsuarios.getCodigoUsuario(),
                nvUsuarios.getCorreoElectronico(), nvUsuarios.getNombreUsuario())) {

            return this.usuariosServicios.crearNuevoUsuario(nvUsuarios);
        }

        return null;

    }

}
