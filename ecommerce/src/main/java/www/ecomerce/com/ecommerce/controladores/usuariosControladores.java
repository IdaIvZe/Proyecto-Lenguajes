package www.ecomerce.com.ecommerce.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import www.ecomerce.com.ecommerce.modelos.usuarios;
import www.ecomerce.com.ecommerce.servicios.lugaresSericios;
import www.ecomerce.com.ecommerce.servicios.usuariosServicios;

@RestController
@RequestMapping("/api")
public class usuariosControladores {

    @Autowired
    private usuariosServicios usuariosServicios;

    @Autowired
    private lugaresSericios lugaresSericios;

    // Metodo para crear usuarios, validando que no exista en la base de datos ya
    // sea por correo, codigo usuario, nombre cuenta.
    @PostMapping("/nuevo")
    public usuarios crearNuevoUsuario(@RequestBody usuarios nvUsuarios) {

        if (this.usuariosServicios.validarExistenciaUsuario(nvUsuarios.getCodigoUsuario(),
                nvUsuarios.getCorreoElectronico(), nvUsuarios.getNombre())) {
            if (this.lugaresSericios.validarExistenciaPorPaisYDepto(nvUsuarios.getLugares().getNombrePais(),
                    nvUsuarios.getLugares().getDepartamento(), nvUsuarios.getLugares().getCodigoPostal())) {

                return this.crearNuevoUsuario(nvUsuarios);
            }
            return this.usuariosServicios.crearNuvUsuarioInfoCompleta(nvUsuarios);
        }
        return null;
    }

    //////////////////////////////////////////////////////////////
    ////////////////// METODOS EN CONSTRUCCION ///////////////////
    //////////////////////////////////////////////////////////////

    @GetMapping("/ver")
    public Optional<usuarios> verinformacion(@RequestParam long codigousuario) {

        return this.usuariosServicios.obtenerInformacionUsuario(codigousuario);

    }

    @PostMapping("/agregar/producto/listaFavorito/{codigousuario}")
    public usuarios listaFavoritos(@PathVariable(name = "codigousuario") long codigousuario,
            @RequestParam long codigoproducto) {
        return this.usuariosServicios.listaFavoritoUsuario(codigousuario, codigoproducto);
    }

    @Operation(summary = "Eliminar producto de lista favoritos")
    @DeleteMapping("/eliminar/producto/listaFavorito/{codigousuario}")
    public usuarios eliminarProductosDeLista(@PathVariable(name = "codigousuario") long codigousuario,
            @RequestParam long codigoproducto) {

        return this.usuariosServicios.eliminarProductoDelistaFavorito(codigousuario, codigoproducto);
    }

}
