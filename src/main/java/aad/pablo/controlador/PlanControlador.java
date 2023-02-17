package aad.pablo.controlador;


import aad.pablo.modelo.Plan;
import aad.pablo.servicio.PlanServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
@RestController
@RequestMapping("/plan")
public class PlanControlador {

    public String toJson(Object object)
    {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        return gson.toJson(object);
    }
    @Autowired
    PlanServicio planServicio;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String>obtenerPlan(@RequestParam Long idPlan){
        return ResponseEntity.status(HttpStatus.OK)
                .header("Content-Type","application/json")
                .body(toJson(planServicio.obtenerPlan(idPlan)));
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String>crearPlan(@RequestParam Plan plan){
        return ResponseEntity.status(HttpStatus.OK)
                .header("Content-Type","application/json")
                .body(toJson(planServicio.crearPlan(plan)));
    }
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<String>modificarPlan(@RequestParam Plan plan){
        return ResponseEntity.status(HttpStatus.OK)
                .header("Content-Type","application/json")
                .body(toJson(planServicio.modificarPlan(plan)));
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Boolean>borrarPLan(@RequestParam Long  idPlan){
        return ResponseEntity.status(HttpStatus.OK)
                .header("Content-Type","application/json")
                .body(planServicio.borrarPlan(idPlan));
    }





}
