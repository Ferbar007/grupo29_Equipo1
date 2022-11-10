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
    private String correo;
    private String contrasena;

    public String get_id() {
        return _id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre_seudonimo() {
        return nombre_seudonimo;
    }

    public void setNombre_seudonimo(String nombre_seudonimo) {
        this.nombre_seudonimo = nombre_seudonimo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Usuario(String nombres, String apellidos, String cedula, String nombre_seudonimo, String correo, String contrasena) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.nombre_seudonimo = nombre_seudonimo;
        this.correo = correo;
        this.contrasena = contrasena;
    }
}
