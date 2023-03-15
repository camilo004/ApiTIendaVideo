package apitiendavideo.apitiendavideo.servicios;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.modelos.Inventario;
import apitiendavideo.apitiendavideo.repositorios.InventarioRepositorio;
@Service
public class InventarioServicio implements IInventarioServicio {

    @Autowired
    private InventarioRepositorio repositorio;

    @Override
    public List<Inventario> listar() {
     return repositorio.findAll();
    }
    @Override
    public Inventario obtener(Long id){
        return repositorio.findById(id).get();
    }
    @Override
    public List<Inventario> buscar(String nombre){
        return repositorio.buscar(nombre);
    }
    
}
