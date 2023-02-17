package aad.pablo.servicio;

import aad.pablo.modelo.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{
    @Override
    public Usuario obtenerUnPlan(Long idUsuario) {
        return null;
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public boolean borrarUsuario(Long idUsuario) {
        return false;
    }
}
