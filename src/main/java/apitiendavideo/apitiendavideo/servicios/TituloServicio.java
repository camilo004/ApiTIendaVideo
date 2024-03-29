package apitiendavideo.apitiendavideo.servicios;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.interfaces.ITituloServicio;
import apitiendavideo.apitiendavideo.modelos.Titulo;
import apitiendavideo.apitiendavideo.repositorios.TituloRepositorio;
@Service
public class TituloServicio  implements ITituloServicio {
    @Autowired
    private TituloRepositorio repositorio;

    @Override
    public List<Titulo> listar() {
     return repositorio.findAll();
    }
    @Override
    public Titulo obtener(Long id){
        return repositorio.findById(id).get();
    }
    @Override
    public List<Titulo> buscar(String nombre){
        return repositorio.buscar(nombre);
    }
}
