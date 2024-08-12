package www.ecomerce.com.ecommerce.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "productos")
@Data
public class productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoproducto")
    private long codigoProducto;

    @Column(name = "nombreproducto")
    private String nombreProducto;

    @Column(name = "preciounitario")
    private double precioUnitario;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "cantidaddisponible")
    private Integer cantidadDisponible;

    // relacion enrtre tabla de productos y categorias
    @ManyToOne
    @JoinColumn(name = "codigocategoria", referencedColumnName = "codigocategoria")
    private categorias categorias;

    // relacion muchos a muchos con tabla intermedia de listaproductosfavoritos
    // entre productos y usuarios
    @JsonIgnore
    @ManyToMany(mappedBy = "listaproductos")
    private List<usuarios> listausuarios;

    // reliacion de muchos a mcuhos con tabla intermedia reseniasporproductos entre
    // productos y resenias
    @JsonIgnore
    @ManyToMany(mappedBy = "listproductos")
    private List<resenias> listresenias;

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

/*
 * @Column(name = "codigocategoria")
 * private Integer codigoCategoria;
 */