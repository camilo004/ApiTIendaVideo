package apitiendavideo.apitiendavideo.servicios;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.interfaces.ITipoDocumentoServicio;
import apitiendavideo.apitiendavideo.modelos.Tipodocumento;
import apitiendavideo.apitiendavideo.repositorios.TipodocumentoRepositorio;
@Service
public class TipoDocumentoServicio implements ITipoDocumentoServicio {
    @Autowired
    private TipodocumentoRepositorio repositorio;

    @Override
    public List<Tipodocumento> listar() {
     return repositorio.findAll();
    }
    @Override
    public Tipodocumento obtener(Long id){
        return repositorio.findById(id).get();
    }
    @Override
    public List<Tipodocumento> buscar(String nombre){
        return repositorio.buscar(nombre);
    }
}
