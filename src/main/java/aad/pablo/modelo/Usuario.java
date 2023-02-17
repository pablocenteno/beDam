package aad.pablo.modelo;

import java.util.Date;
import java.util.List;


public class Usuario {

    Long idUsuario;
    String nickName;
    String nombre;
    String apellidos;
    Date fechaNac;
    List<Plan> planes;
}
