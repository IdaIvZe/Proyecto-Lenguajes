package www.ecomerce.com.ecommerce.modelos;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
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
    @Column(name = "codigousuario")
    private long codigoUsuario;

    @JsonProperty("nombre")
    @Column(name = "nombre")
    private String nombre;

    @JsonProperty("apellido")
    @Column(name = "apellido")
    private String apellido;

    @JsonProperty("correo")
    @Column(name = "correo")
    private String correoElectronico;

    @JsonProperty("contrasenia")
    @Column(name = "contrasenia")
    private String contrasenia;

    @CreationTimestamp
    @Column(name = "fecha_creacion")
    @JsonProperty("fecha_creacion")
    private LocalDateTime fechaCreacionCuenta;

    /*
     * CREATE TABLE usuarios (
     * codigoUsuario INT PRIMARY KEY AUTO_INCREMENT,
     * nombre VARCHAR(50),
     * apellido VARCHAR(50),
     * correo VARCHAR(100),
     * contrasenia VARCHAR(50),
     * codigoLugar INT,
     * FOREIGN KEY (codigoLugar) REFERENCES lugares(codigoLugar)
     * );
     */

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // relacion entre la tbla de usuarios ---- lugares

    @OneToMany(mappedBy = "usuarios", cascade = CascadeType.ALL)
    @JoinColumn(name = "codigolugar", referencedColumnName = "codigolugar")
    private List<lugares> lugar;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // @OneToMany
    // @JsonProperty("direccion")
    // private List<direccionEntregas> direccion;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}