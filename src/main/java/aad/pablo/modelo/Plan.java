package aad.pablo.modelo;

import com.google.gson.annotations.Expose;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Plan {
    @Id
    @Expose
    Long idPlan;
    @Expose
    String nombre;
    @Expose
    String descripcion;
    @Expose
    Date fecha;

    @DBRef
    List<Usuario> participantes = new ArrayList<>();
}
