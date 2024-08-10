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
@Table(name = "ventas")
@Data
public class ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_venta")
    private long codigo_venta;

    @JsonProperty("codigo_lugar")
    @Column(name = "codigo_lugar")
    private Integer codigoLugar;

    @JsonProperty("cantidad_unidades")
    @Column(name = "cantidad_unidades")
    private Integer cantidadUnidades;

    @JsonProperty("precio_unitario")
    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @JsonProperty("total_venta")
    @Column(name = "total_venta")
    private Double totalVenta;

    @CreationTimestamp
    @Column(name = "fecha_venta")
    @JsonProperty("fecha_venta")
    private LocalDateTime venta;
}
