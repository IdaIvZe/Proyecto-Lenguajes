package www.ecomerce.com.ecommerce.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lugares")
@Data
public class lugares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigolugar")
    private long codigoLugar;

    @Column(name = "nombrepais")
    private String nombrePais;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "codigopostal")
    private String codigoPostal;

    //////////////////////////////////////
    @ManyToOne
    private usuarios usuarios;

}

/*
 * CREATE TABLE lugares (
 * codigoLugar INT PRIMARY KEY AUTO_INCREMENT,
 * nombrePais VARCHAR(50),
 * departamento VARCHAR(50),
 * codigoPostal VARCHAR(50)
 * );
 */