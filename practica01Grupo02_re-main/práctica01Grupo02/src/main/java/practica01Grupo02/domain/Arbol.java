package practica01Grupo02.domain;

import jakarta.persistence.*;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // Genera un constructor con todos los atributos
@NoArgsConstructor //Genera uno vacio 
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idArbol;  
    private String nombreComun;
    private String tipoFlor;
    private String durezaMadera;
    private Double alturaPromedio;
    private boolean activo; 

    

}
