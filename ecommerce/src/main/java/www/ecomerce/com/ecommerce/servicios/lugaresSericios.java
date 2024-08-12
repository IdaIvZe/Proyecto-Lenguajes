package www.ecomerce.com.ecommerce.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.ecomerce.com.ecommerce.modelos.lugares;
import www.ecomerce.com.ecommerce.repositorios.lugaresRepositorios;

@Service
public class lugaresSericios {

    @Autowired
    private lugaresRepositorios lugaresRepositorios;

    // Crud
    // Metodo para crear un nuevo lugar
    public lugares crearNuevoLugar(lugares nvoLugar) {
        return this.lugaresRepositorios.save(nvoLugar);
    }

    //////////////////////////////////////////////////////////////
    ////////////////// METODOS EN CONSTRUCCION ///////////////////
    //////////////////////////////////////////////////////////////

    // Metodo Para obtener un lugar

    public boolean validarExistenciaPorPaisYDepto(String nombrePais, String departamento, String codigoPostal) {

        if (!this.lugaresRepositorios.existsBynombrePais(nombrePais)
                && !this.lugaresRepositorios.existsBydepartamento(departamento)
                && !this.lugaresRepositorios.existsBycodigoPostal(codigoPostal)) {
            return true;
        }

        return false;
    }
}
