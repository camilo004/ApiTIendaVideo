package apitiendavideo.apitiendavideo.repositorios;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Alquiler;
@Repository
public interface AlquilerRepositorio extends JpaRepository<Alquiler,Long> {
    @Query("select a from Alquiler a WHERE UPPER(a.precio) like UPPER('%' || ?1 || '%')")
    List<Alquiler> buscar (String nombre);
}
