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
@Table(name = "facturas")
@Data
public class facturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_factura")
    private long codigo_factura;

    @JsonProperty("precio_final")
    @Column(name = "precio_final")
    private String precioFinal;

    @CreationTimestamp
    @Column(name = "fecha_emision")
    @JsonProperty("fecha_emision")
    private LocalDateTime fechaEminision;
}
