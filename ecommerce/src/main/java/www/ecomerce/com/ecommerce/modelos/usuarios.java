package www.ecomerce.com.ecommerce.modelos;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_usuario")
    @JsonProperty("codigo_usuario")
    private long codigoUsuario;

    @JsonProperty("nombre_real")
    @Column(name = "nombre_real")
    private String nombreReal;

    @JsonProperty("apellido_real")
    @Column(name = "apellido_real")
    private String apellidoReal;

    @JsonProperty("correo_electronico")
    @Column(name = "correo_electronico")
    private String correoElectronico;

    @JsonProperty("nombre_usuario")
    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @JsonProperty("contrasenia")
    @Column(name = "contrasenia")
    private String contrasenia;

    @JsonProperty("clave_accesso")
    @Column(name = "clave_accesso")
    private Integer claveAccesso;

    @JsonProperty("tipo_rollUsuario")
    @Column(name = "tipo_rollUsuario")
    private String tipoRollUsuario;

    @CreationTimestamp
    @Column(name = "fecha_creacion")
    @JsonProperty("fecha_creacion")
    private LocalDateTime fechaCreacionCuenta;

    // relacion entre la tbla de usuarios ---- lugares =>(un usuario(cliente y
    // admin) solo se le asocia un lugar en el momneto de la creacion,
    // y en la tabla luegares, un lugar pertenece a muchos usuarios(clientes y
    // admin))
    // Relacion desde la prespectiva de los usuarios: MUCHOS A UNO
    // dueño de la relacion( tabla eu tiene la llave foranea): Usuarios dueño de la
    // relacion
    @ManyToOne
    @JoinColumn(name = "codigo_lugar", referencedColumnName = "codigo_lugar")
    private lugares lugar;

    @OneToMany
    @JsonProperty("direccion")
    private List<direccionEntregas> direccion;

}