package www.ecomerce.com.ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import www.ecomerce.com.ecommerce.modelos.usuarios;
import www.ecomerce.com.ecommerce.servicios.usuariosServicios;

@RestController
@RequestMapping("/api")
public class usuariosControladores {

    @Autowired
    private usuariosServicios usuariosServicios;

    // Metodo para crear usuarios, validando que no exista en la base de datos ya
    // sea por correo, codigo usuario, nombre cuenta.
    @PostMapping("/nuevo")
    public usuarios crearNuevoUsuario(@RequestBody usuarios nvUsuarios) {

        if (this.usuariosServicios.validarExistenciaUsuario(nvUsuarios.getCodigoUsuario(),
                nvUsuarios.getCorreoElectronico(), nvUsuarios.getNombre())) {

            return this.usuariosServicios.crearNuevoUsuario(nvUsuarios);
        }

        return null;

    }

    @GetMapping("/inicio_sesion")
    public boolean validarDatosLogeosUsuarios(@RequestParam String nombre, String contrasenia) {

        return this.usuariosServicios.validarUsuarioLogeado(nombre, contrasenia);

    }

}
