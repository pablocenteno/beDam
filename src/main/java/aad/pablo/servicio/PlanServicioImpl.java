package aad.pablo.servicio;

import aad.pablo.modelo.Plan;
import aad.pablo.repositorio.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanServicioImpl implements PlanServicio{

    @Autowired
    private PlanRepository planRepository;
    @Override
    public Plan obtenerPlan(Long idPlan) {
        return planRepository.findById(idPlan).get();
    }

    @Override
    public Plan crearPlan(Plan plan) {
        return planRepository.save(plan);
    }

    @Override
    public Plan modificarPlan(Plan plan) {
        return planRepository.save(plan);
    }

    @Override
    public boolean borrarPlan(Long idPlan) {
        planRepository.deleteById(idPlan);
        return true;
    }

    @Override
    public Plan unirsePlan(Long idUsuario, Long idPlan) {
        return planRepository.unirsePlan(idUsuario, idPlan);
    }

    @Override
    public Plan borrarsePlan(Long idUsuario, Long idPlan) {
        return planRepository.borrarsePlan(idUsuario, idPlan);
    }
}
