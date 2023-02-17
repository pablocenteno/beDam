package aad.pablo.repositorio;


import aad.pablo.modelo.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, Long> {
}
