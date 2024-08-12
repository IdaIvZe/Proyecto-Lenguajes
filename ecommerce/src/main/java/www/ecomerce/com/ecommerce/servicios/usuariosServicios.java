package www.ecomerce.com.ecommerce.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.ecomerce.com.ecommerce.modelos.lugares;
import www.ecomerce.com.ecommerce.modelos.productos;
import www.ecomerce.com.ecommerce.modelos.usuarios;
import www.ecomerce.com.ecommerce.repositorios.usuariosRepositorios;
import www.ecomerce.com.ecommerce.repositorios.lugaresRepositorios;
import www.ecomerce.com.ecommerce.repositorios.productosRepositorios;

@Service
public class usuariosServicios {

    @Autowired
    private usuariosRepositorios usuariosRepositorios;

    @Autowired
    private lugaresRepositorios lugaresRepositorios;

    @Autowired
    private productosRepositorios productosRepositorios;

    // metodo para crear nuevo usuario
    public usuarios crearNuevoUsuario(usuarios nvUsuario) {

        return this.usuariosRepositorios.save(nvUsuario);

    }

    // Metodo para obtner un usuario
    public Optional<usuarios> obtenerInformacionUsuario(long codigousuario) {

        // si esxiste se obtendra toda su informacion
        if (this.usuariosRepositorios.existsById(codigousuario)) {

            return this.usuariosRepositorios.findById(codigousuario);

        }

        return null;

    }

    // metodo para validar que no exista un usuario en las BD con los missmos campos
    // unicos que el que vamos a crear
    public boolean validarExistenciaUsuario(long codigoUsuario, String correoElectronico, String nombre) {

        if (this.usuariosRepositorios.existsById(codigoUsuario) != true) {

            if (this.usuariosRepositorios.existsBycorreoElectronico(correoElectronico) != true
                    && this.usuariosRepositorios.existsBynombre(nombre) != true) {

                return true;

            }

        }

        return false;

    }

    // Metodo para validar que los datos con los que el usuariso quiera accesder a
    // una cuenta sean correctos
    public boolean validarUsuarioLogeado(String nombre, String contrasenia) {

        if (this.usuariosRepositorios.existsBynombre(nombre)
                && this.usuariosRepositorios.existsBycontrasenia(contrasenia)) {
            return true;
        }

        return false;

    }

    // medoto para asociar el lugar de procendencia del usuario durante la creacion
    // de su cuenta (como nuevo usuarios)
    public usuarios crearNuvUsuarioInfoCompleta(usuarios nvUsuarios) {

        lugares nvolugar = nvUsuarios.getLugares();
        if (nvolugar != null) {

            nvolugar.setNombrePais(nvUsuarios.getLugares().getNombrePais());
            nvolugar.setDepartamento(nvUsuarios.getLugares().getDepartamento());
            nvolugar.setCodigoPostal(nvUsuarios.getLugares().getCodigoPostal());

            this.lugaresRepositorios.save(nvolugar);
        }

        return this.usuariosRepositorios.save(nvUsuarios);
    }

    // Metodo para poder crear la lista de favoritos por usuario
    public usuarios listaFavoritoUsuario(long codigousuario, long codigoproducto) {

        usuarios usuario = this.usuariosRepositorios.findById(codigousuario).get();
        productos producto = this.productosRepositorios.findById(codigoproducto).get();

        if (usuario != null && producto != null) {

            // Verificar si el producto ya está en la lista de favoritos
            if (!usuario.getListaproductos().contains(producto)) {
                // Agregar el producto a la lista de favoritos del usuario
                usuario.getListaproductos().add(producto);
                // Guardar los cambios en la lista
                this.usuariosRepositorios.save(usuario);
            }

            return usuario;

        } else {
            // Manejo de error si no se encuentra el usuario o el producto
            throw new RuntimeException("Usuario o producto no encontrado");
        }
    }

    // Metodo para borrar un producto de la lista de favoritos
    public usuarios eliminarProductoDelistaFavorito(long codigousuario, long codigoproducto) {

        usuarios usuario = this.usuariosRepositorios.findById(codigousuario).get();
        productos producto = this.productosRepositorios.findById(codigoproducto).get();

        if (usuario != null && producto != null) {

            // Verificar si el producto ya está en la lista de favoritos
            if (usuario.getListaproductos().contains(producto)) {
                // Agregar el producto a la lista de favoritos del usuario
                usuario.getListaproductos().remove(producto);
                // Guardar los cambios en la lista
                this.usuariosRepositorios.save(usuario);
            }

            return usuario;

        } else {
            // Manejo de error si no se encuentra el usuario o el producto
            throw new RuntimeException("Usuario o producto no encontrado");
        }
    }

    //////////////////////////////////////////////////////////////
    ////////////////// METODOS EN CONSTRUCCION ///////////////////
    //////////////////////////////////////////////////////////////

    // METODO para crear un usuario pero si la informacion de el lugar que ingreso
    // ya esta en la BD no la crear solo la solicitara
    public usuarios crearNuvUsuario(usuarios nvUsuario) {

        // obtine
        long codigoLugarFiltradoPorPais = this.lugaresRepositorios
                .findBynombrePais(nvUsuario.getLugares().getNombrePais()).getCodigoLugar();
        long codigoLugarFiltradoPorDepartamento = this.lugaresRepositorios
                .findBydepartamento(nvUsuario.getLugares().getDepartamento()).getCodigoLugar();

        if (codigoLugarFiltradoPorPais == codigoLugarFiltradoPorDepartamento) {

            lugares lugarexistente = this.lugaresRepositorios.findById(codigoLugarFiltradoPorPais).get();

            nvUsuario.setLugares(lugarexistente);
        }
        return this.usuariosRepositorios.save(nvUsuario);
    }

}
