package apitiendavideo.apitiendavideo.interfaces;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Inventario;

public interface IInventarioServicio {
    public List<Inventario>listar();
    public Inventario obtener(Long id);
    List<Inventario> buscar (String nombre);
}
