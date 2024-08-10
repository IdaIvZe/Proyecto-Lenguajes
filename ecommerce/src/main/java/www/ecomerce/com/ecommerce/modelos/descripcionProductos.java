package www.ecomerce.com.ecommerce.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "descripcion_productos")
@Data
public class descripcionProductos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_descripcion")
    private long codigo_descripcion;

    @JsonProperty("descripcion")
    @Column(name = "descripcion")
    private String descripcion;

    @JsonProperty("color")
    @Column(name = "color")
    private String color;

    @JsonProperty("tamanio")
    @Column(name = "tamanio")
    private String tamanio;
}
