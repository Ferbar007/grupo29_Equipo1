package Equipo1.minTIC.seguridad.Modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document()

public class Usuario {
    @Id
    private String _id;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String nombre_seudonimo;
    private String contrasena;
    private String idRol;
    private String iDUser;

}
