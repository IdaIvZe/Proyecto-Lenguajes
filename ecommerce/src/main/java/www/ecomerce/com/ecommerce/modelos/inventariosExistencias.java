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
@Table(name = "inventarios_existencias")
@Data
public class inventariosExistencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_inventario")
    private long codigoInventario;

    @JsonProperty("cantidad_disponible")
    @Column(name = "cantidad_disponible")
    private int cantidadDisponible;

    @CreationTimestamp
    @Column(name = "fecha_entrada")
    @JsonProperty("fecha_entrada")
    private LocalDateTime fechaEntrada;

    @CreationTimestamp
    @Column(name = "fecha_salida")
    @JsonProperty("fecha_salida")
    private LocalDateTime fechaSalida;

}
