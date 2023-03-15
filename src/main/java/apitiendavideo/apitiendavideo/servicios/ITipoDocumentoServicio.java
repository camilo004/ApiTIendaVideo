package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Tipodocumento;

public interface ITipoDocumentoServicio {
    public List<Tipodocumento>listar();
    public Tipodocumento obtener(Long id);
    List<Tipodocumento> buscar (String nombre);
}
