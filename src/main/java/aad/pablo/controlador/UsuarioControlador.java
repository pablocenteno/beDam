package aad.pablo.controlador;


import aad.pablo.modelo.Usuario;
import aad.pablo.servicio.PlanServicio;
import aad.pablo.servicio.UsuarioServicio;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {

    public String toJson(Object object)
    {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        return gson.toJson(object);
    }
    @Autowired
    UsuarioServicio usuarioServicio;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> obtenerUnPlan(@RequestParam Long idPlan){
        return ResponseEntity.status(HttpStatus.OK)
                .header("Content-Type","application/json")
                .body(toJson(usuarioServicio.obtenerUnPlan(idPlan)));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String>crearUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.OK)
                .header("Content-Type","application/json")
                .body(toJson(usuarioServicio.crearUsuario(usuario)));
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Boolean>borrarUsuario(@RequestParam Long idUsuario){
        return ResponseEntity.status(HttpStatus.OK)
                .header("Content-Type","application/json")
                .body(usuarioServicio.borrarUsuario(idUsuario));
    }
   

}
