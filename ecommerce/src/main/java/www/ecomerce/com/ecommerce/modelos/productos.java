package www.ecomerce.com.ecommerce.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "productos")
@Data
public class productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoProducto")
    private long codigoProducto;

    @Column(name = "codigoCategoria")
    private Integer codigoCategoria;

    @Column(name = "nombreProducto")
    private String nombreProducto;

    @Column(name = "precioUnitario")
    private double precioUnitario;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "cantidadDisponible")
    private Integer cantidadDisponible;

}

/*
 * CREATE TABLE productos (
 * codigoProducto INT PRIMARY KEY AUTO_INCREMENT,
 * codigoCategoria INT,
 * nombreProducto VARCHAR(50),
 * precioUnitario DECIMAL(14,2),
 * imagenProducto VARCHAR(100),
 * descripcion VARCHAR(100),
 * cantidadDisponible INT,
 * FOREIGN KEY (codigoCategoria) REFERENCES categorias(codigoCategoria)
 * );
 * 
 */