package aad.pablo.servicio;

import aad.pablo.modelo.Usuario;
import aad.pablo.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario obtenerUnPlan(Long idUsuario) {
        return usuarioRepository.findById(idUsuario).get();
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public boolean borrarUsuario(Long idUsuario) {
        usuarioRepository.deleteById(idUsuario);
        return true;
    }
}
