package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Pais;

public interface IPaisServicio {
    public List<Pais>listar();
    public Pais obtener(Long id);
    List<Pais> buscar (String nombre);
}
