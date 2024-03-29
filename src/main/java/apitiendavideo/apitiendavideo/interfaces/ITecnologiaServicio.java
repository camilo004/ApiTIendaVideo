package apitiendavideo.apitiendavideo.interfaces;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Tecnologia;

public interface ITecnologiaServicio {
    public List<Tecnologia>listar();
    public Tecnologia obtener(Long id);
    List<Tecnologia> buscar (String nombre);
}
