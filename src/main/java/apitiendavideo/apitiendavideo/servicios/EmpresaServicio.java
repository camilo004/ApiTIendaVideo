package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.interfaces.IEmpresaServicio;
import apitiendavideo.apitiendavideo.modelos.Empresa;
import apitiendavideo.apitiendavideo.repositorios.EmpresaRepositorio;
@Service
public class EmpresaServicio  implements IEmpresaServicio    {

    @Autowired
    private EmpresaRepositorio repositorio;

    @Override
    public List<Empresa> listar() {
     return repositorio.findAll();
    }
    @Override
    public Empresa obtener(Long id){
        return repositorio.findById(id).get();
    }
    @Override
    public List<Empresa> buscar(String nombre){
        return repositorio.buscar(nombre);
    }

     
    @Override
    public Empresa guardar(Empresa empresa) {
        return repositorio.save(empresa);
    }

    @Override
    public boolean borrar(Long id) {
        try{
        repositorio.deleteById(id);
        return true;
        }
        catch(Exception ex){
        return false;
        }
    }
}
