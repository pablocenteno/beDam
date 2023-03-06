package aad.pablo.modelo;

import com.google.gson.annotations.Expose;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Usuario {
    @Expose
    @Id
    Long idUsuario;
    @Expose
    String nickName;
    @Expose
    String nombre;
    @Expose
    String apellidos;
    @Expose
    Date fechaNac;
    @DBRef
    List<Plan> planes = new ArrayList<>();
}
