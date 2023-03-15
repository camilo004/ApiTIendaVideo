package apitiendavideo.apitiendavideo.repositorios;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Tecnologia;
@Repository
public interface TecnologiaRepositorio extends JpaRepository<Tecnologia,Long> {
    @Query("select t from Tecnologia t WHERE UPPER(t.nombre) like UPPER('%' || ?1 || '%')")
    List<Tecnologia> buscar (String nombre);  
}
