package aad.pablo.servicio;

import aad.pablo.modelo.Plan;
import aad.pablo.modelo.Usuario;
import aad.pablo.repositorio.PlanRepository;
import aad.pablo.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class PlanServicioImpl implements PlanServicio{

    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;
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
        Plan plan = planRepository.findById(idPlan).get();
        Usuario usuario = usuarioRepository.findById(idUsuario).get();

        plan.getParticipantes().add(usuario);
        usuario.getPlanes().add(plan);
        return plan;

    }

    @Override
    public Plan borrarsePlan(Long idUsuario, Long idPlan) {
        Plan plan = planRepository.findById(idPlan).get();
        Usuario usuario = usuarioRepository.findById(idUsuario).get();

        plan.getParticipantes().remove(usuario);
       usuario.getPlanes().remove(plan);
        return plan;
    }
}
