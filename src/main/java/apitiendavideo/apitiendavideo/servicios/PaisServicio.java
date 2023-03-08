package apitiendavideo.apitiendavideo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import apitiendavideo.apitiendavideo.modelos.Pais;
import apitiendavideo.apitiendavideo.repositorios.PaisRepositorio;

@Service

public class PaisServicio implements IPaisServicio {
    @Autowired
    PaisRepositorio repositorio;

    @Override
    public List <Pais> listar(){
        return repositorio.findAll();
    }

    @Override
    public Pais obtener(Long id){
        return repositorio.findById(id).get();
    }
    
}
