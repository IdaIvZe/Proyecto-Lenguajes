package www.ecomerce.com.ecommerce.modelos;


import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;


import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_usuarios")
@Data
public class usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_usuario")
    @JsonProperty("codigo_usuario")
    private long CODIGO_USUARIO;

    @JsonProperty("correo_electronico")
    @Column(name = "correo_electronico")
    private String CORREOELECTRONICO;

    @JsonProperty("nombre_cuenta")
    @Column(name = "nombre_cuenta")
    private String NOMBRECUENTA;

    @Column(name = "contrasennia")
    private String CONTRASENNA;

    
    @CreationTimestamp
    @Column(name = "fecha_creacion")
    @JsonProperty("fecha_creacion")
    private LocalDateTime FECHA_CREACION;

   

}