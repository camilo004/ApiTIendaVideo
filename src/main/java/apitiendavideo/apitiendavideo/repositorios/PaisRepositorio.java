package apitiendavideo.apitiendavideo.repositorios;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Pais;
@Repository
public interface PaisRepositorio extends JpaRepository<Pais,Long> {


    @Query("select p from Pais p WHERE UPPER(p.pais) like UPPER('%' || ?1 || '%')")
    
    List<Pais> buscar (String nombre);
}