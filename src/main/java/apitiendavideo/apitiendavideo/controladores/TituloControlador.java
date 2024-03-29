package apitiendavideo.apitiendavideo.controladores;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apitiendavideo.apitiendavideo.interfaces.ITituloServicio;
import apitiendavideo.apitiendavideo.modelos.Titulo;
@RestController
@RequestMapping("/titulo")
public class TituloControlador {
    @Autowired
    private ITituloServicio servicio;
  
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Titulo> listar() {
        return servicio.listar();
    }

    @RequestMapping(value="/obtener/{id}", method = RequestMethod.GET)
    public Titulo obtener(@PathVariable Long id){
        return servicio.obtener(id);
    }

    @RequestMapping(value="/buscar/{nombre}", method = RequestMethod.GET)
    public List<Titulo>buscar(@PathVariable String nombre){
        return servicio.buscar(nombre);
    }
}
