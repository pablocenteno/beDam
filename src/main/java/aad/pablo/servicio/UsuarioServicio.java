package aad.pablo.servicio;

import aad.pablo.modelo.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioServicio {


    public Usuario obtenerUnPlan(Long idUsuario);
    public Usuario crearUsuario(Usuario usuario);
    public boolean borrarUsuario(Long idUsuario);
}
