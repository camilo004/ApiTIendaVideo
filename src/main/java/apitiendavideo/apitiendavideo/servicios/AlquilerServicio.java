package apitiendavideo.apitiendavideo.servicios;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.interfaces.IAlquilerServicio;
import apitiendavideo.apitiendavideo.modelos.Alquiler;
import apitiendavideo.apitiendavideo.repositorios.AlquilerRepositorio;
@Service
public class AlquilerServicio implements IAlquilerServicio {
    @Autowired
    private AlquilerRepositorio repositorio;

    @Override
    public List<Alquiler> listar() {
     return repositorio.findAll();
    }
    @Override
    public Alquiler obtener(Long id){
        return repositorio.findById(id).get();
    }
    @Override
    public List<Alquiler> buscar(String nombre){
        return repositorio.buscar(nombre);
    }
}
