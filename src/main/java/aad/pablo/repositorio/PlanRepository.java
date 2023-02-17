package aad.pablo.repositorio;

import aad.pablo.modelo.Plan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends MongoRepository<Plan,Long > {

    public Plan unirsePlan(Long idUsuario, Long idPlan);
    public Plan borrarsePlan(Long idUsuario, Long idPlan);


}
