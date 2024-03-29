package apitiendavideo.apitiendavideo.controladores;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apitiendavideo.apitiendavideo.interfaces.IInventarioServicio;
import apitiendavideo.apitiendavideo.modelos.Inventario;
@RestController
@RequestMapping("/inventario")
public class InventarioControlador {
    @Autowired
    private IInventarioServicio servicio;
  
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Inventario> listar() {
        return servicio.listar();
    }

    @RequestMapping(value="/obtener/{id}", method = RequestMethod.GET)
    public Inventario obtener(@PathVariable Long id){
        return servicio.obtener(id);
    }

    @RequestMapping(value="/buscar/{nombre}", method = RequestMethod.GET)
    public List<Inventario>buscar(@PathVariable String nombre){
        return servicio.buscar(nombre);
    }
}
