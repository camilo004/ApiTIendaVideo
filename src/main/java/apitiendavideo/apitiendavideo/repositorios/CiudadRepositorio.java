package apitiendavideo.apitiendavideo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Ciudad;

@Repository
public interface CiudadRepositorio extends JpaRepository<Ciudad,Long> {
    @Query("select c from Ciudad c WHERE UPPER(c.ciudad) like UPPER('%' || ?1 || '%')")
    List<Ciudad> buscar (String nombre);
    
}
