package aad.pablo.servicio;

import aad.pablo.modelo.Plan;
import org.springframework.stereotype.Service;

@Service
public interface PlanServicio {

    public Plan obtenerPlan(Long idPlan);

    public Plan crearPlan(Plan plan);

    public Plan modificarPlan(Plan plan);

    public boolean borrarPlan(Long idPlan);

    public Plan unirsePlan(Long idUsuario, Long idPlan);
    public Plan borrarsePlan(Long idUsuario, Long idPlan);

}
