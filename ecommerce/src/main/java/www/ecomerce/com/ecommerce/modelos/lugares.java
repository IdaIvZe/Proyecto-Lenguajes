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
@Table(name = "lugares")
@Data
public class lugare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_lugar")
    private long codigo_lugar;

    @JsonProperty("nombre_pais")
    @Column(name = "nombre_pais")
    private String nombrePais;

    @JsonProperty("nombre_departamento")
    @Column(name = "nombre_departamento")
    private String nombreDepartamento;

    @JsonProperty("codigo_postal")
    @Column(name = "codigo_postal")
    private String codigoPostal;

}
