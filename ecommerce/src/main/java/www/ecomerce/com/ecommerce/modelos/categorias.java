package www.ecomerce.com.ecommerce.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "categorias")
@Data
public class categorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocategoria")
    private long codigoCategoria;

    @Column(name = "nombrecategoria")
    private String nombreCategoria;

    @JsonIgnore
    @OneToMany(mappedBy = "categorias", cascade = CascadeType.ALL)
    private List<productos> productos;
}

/*
 * CREATE TABLE categorias (
 * codigoCategoria INT PRIMARY KEY AUTO_INCREMENT,
 * nombreCategoria VARCHAR(50)
 * );
 */
