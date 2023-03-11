package apitiendavideo.apitiendavideo.servicios;
import apitiendavideo.apitiendavideo.modelos.Empresa;
import java.util.List;

public interface IEmpresaServicio {
  public List<Empresa>listar();
  public Empresa obtener(Long id);
  public List<Empresa>buscar(String nombre);
}
