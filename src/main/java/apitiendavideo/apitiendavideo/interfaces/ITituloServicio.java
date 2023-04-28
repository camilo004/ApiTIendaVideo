package apitiendavideo.apitiendavideo.interfaces;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Titulo;

public interface ITituloServicio {
    public List<Titulo>listar();
    public Titulo obtener(Long id);
    List<Titulo> buscar (String nombre);
}
