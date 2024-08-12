package www.ecomerce.com.ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import www.ecomerce.com.ecommerce.modelos.lugares;
import www.ecomerce.com.ecommerce.servicios.lugaresSericios;

@RestController
@RequestMapping("/api")
public class lugaresControladores {

    @Autowired
    private lugaresSericios lugaresSericios;

    @Operation(summary = "Validar que una direccion de un mismo lugar no este ya registrado en la BBDD")
    @PostMapping("/validar")
    public lugares existeEnLaBBDD(@RequestBody lugares nvolugar) {

        if (this.lugaresSericios.validarExistenciaPorPaisYDepto(nvolugar.getNombrePais(), nvolugar.getDepartamento(),
                nvolugar.getCodigoPostal())) {

        }

        return null;
    }

    //////////////////////////////////////////////////////////////
    ////////////////// METODOS EN PRUEBAS ///////////////////
    //////////////////////////////////////////////////////////////

}
