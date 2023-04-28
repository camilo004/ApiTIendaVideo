package apitiendavideo.apitiendavideo.interfaces;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Region;

public interface IRegionServicio {
    public List<Region>listar();
    public Region obtener(Long id);
    List<Region> buscar (String nombre);
    public Region guardar(Region region);
    public boolean borrar (Long id);
}
