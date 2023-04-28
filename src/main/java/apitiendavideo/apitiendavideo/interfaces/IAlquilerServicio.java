package apitiendavideo.apitiendavideo.interfaces;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Alquiler;

public interface IAlquilerServicio {
    public List<Alquiler>listar();
    public Alquiler obtener(Long id);
    List<Alquiler> buscar (String nombre);
}
