package aad.pablo.modelo;

import java.util.Date;
import java.util.List;

public class Plan {

    Long idPlan;
    String nombre;
    String descripcion;
    Date fecha;
    List<Usuario> participantes;
}
