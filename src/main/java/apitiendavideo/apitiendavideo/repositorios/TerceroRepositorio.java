package apitiendavideo.apitiendavideo.repositorios;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Tercero;
@Repository
public interface TerceroRepositorio extends JpaRepository<Tercero,Long> {
    @Query("select t from Tercero t WHERE UPPER(t.nombre) like UPPER('%' || ?1 || '%')")
    List<Tercero> buscar (String nombre);
}
