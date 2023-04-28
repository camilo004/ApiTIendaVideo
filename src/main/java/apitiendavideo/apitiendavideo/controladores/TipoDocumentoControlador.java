package apitiendavideo.apitiendavideo.controladores;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apitiendavideo.apitiendavideo.interfaces.ITipoDocumentoServicio;
import apitiendavideo.apitiendavideo.modelos.Tipodocumento;
@RestController
@RequestMapping("/documento")
public class TipoDocumentoControlador {
    @Autowired
    private ITipoDocumentoServicio servicio;
  
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Tipodocumento> listar() {
        return servicio.listar();
    }

    @RequestMapping(value="/obtener/{id}", method = RequestMethod.GET)
    public Tipodocumento obtener(@PathVariable Long id){
        return servicio.obtener(id);
    }

    @RequestMapping(value="/buscar/{nombre}", method = RequestMethod.GET)
    public List<Tipodocumento>buscar(@PathVariable String nombre){
        return servicio.buscar(nombre);
    }
}
