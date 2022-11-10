package Equipo1.minTIC.seguridad.Repositorios;
import Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RepositorioUsuario extends MongoRepository<Usuario,String>{
}
