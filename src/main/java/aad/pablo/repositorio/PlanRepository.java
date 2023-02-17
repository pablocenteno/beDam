package aad.pablo.repositorio;

import aad.pablo.modelo.Plan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends MongoRepository<Plan,Long > {
    @Query("{'id': ?0}")
    public Plan unirsePlan(Long idUsuario, Long idPlan);
    @Query("{'id': ?0}")
    public Plan borrarsePlan(Long idUsuario, Long idPlan);


}
