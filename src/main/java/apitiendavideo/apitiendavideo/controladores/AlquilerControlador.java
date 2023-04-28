package apitiendavideo.apitiendavideo.controladores;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apitiendavideo.apitiendavideo.interfaces.IAlquilerServicio;
import apitiendavideo.apitiendavideo.modelos.Alquiler;
@RestController
@RequestMapping("/alquiler")
public class AlquilerControlador {
    @Autowired
    private IAlquilerServicio servicio;
  
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Alquiler> listar() {
        return servicio.listar();
    }

    @RequestMapping(value="/obtener/{id}", method = RequestMethod.GET)
    public Alquiler obtener(@PathVariable Long id){
        return servicio.obtener(id);
    }

    @RequestMapping(value="/buscar/{nombre}", method = RequestMethod.GET)
    public List<Alquiler>buscar(@PathVariable String nombre){
        return servicio.buscar(nombre);
    }
}
