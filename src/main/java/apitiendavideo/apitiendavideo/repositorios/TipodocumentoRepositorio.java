package apitiendavideo.apitiendavideo.repositorios;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Tipodocumento;
@Repository
public interface TipodocumentoRepositorio extends JpaRepository<Tipodocumento,Long> {
    @Query("select d from Tipodocumento d WHERE UPPER(d.tipo) like UPPER('%' || ?1 || '%')")
    List<Tipodocumento> buscar (String nombre);
}
