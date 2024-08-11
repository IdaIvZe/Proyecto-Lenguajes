package www.ecomerce.com.ecommerce.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "categorias")
@Data
public class categorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoCategoria")
    private long codigoCategoria;

    @Column(name = "nombreCategoria")
    private String nombreCategoria;
}

/*
 * CREATE TABLE categorias (
 * codigoCategoria INT PRIMARY KEY AUTO_INCREMENT,
 * nombreCategoria VARCHAR(50)
 * );
 */
