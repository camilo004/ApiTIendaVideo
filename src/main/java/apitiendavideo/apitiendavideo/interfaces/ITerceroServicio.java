package apitiendavideo.apitiendavideo.interfaces;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Tercero;

public interface ITerceroServicio {
    public List<Tercero>listar();
    public Tercero obtener(Long id);
    List<Tercero> buscar (String nombre);
}
