package www.ecomerce.com.ecommerce.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "metodo_pagos")
@Data
public class metodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_pago")
    private long codigoPago;

    @JsonProperty("numero_tarjeta")
    @Column(name = "numero_tarjeta")
    private Integer numeroTarjeta;

    @JsonProperty("annio")
    @Column(name = "annio")
    private Integer annio;

    @JsonProperty("mes")
    @Column(name = "mes")
    private String mes;

    @JsonProperty("cvv")
    @Column(name = "cvv")
    private Integer cvv;

}
