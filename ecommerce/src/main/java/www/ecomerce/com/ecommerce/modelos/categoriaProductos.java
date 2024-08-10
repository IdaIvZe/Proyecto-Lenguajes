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
@Table(name = "categoria_productos")
@Data
public class categoriaProductos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_categoria")
    private long codigo_categoria;

    @JsonProperty("nombre_categoria")
    @Column(name = "nombre_categoria")
    private String nombreCategoria;
}
