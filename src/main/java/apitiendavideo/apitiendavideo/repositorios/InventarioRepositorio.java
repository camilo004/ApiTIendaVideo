package apitiendavideo.apitiendavideo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import apitiendavideo.apitiendavideo.modelos.Inventario;
@Repository
public interface InventarioRepositorio extends JpaRepository<Inventario,Long> {
    @Query("select i from Inventario i WHERE UPPER(i.consecutivo) like UPPER('%' || ?1 || '%')")
    List<Inventario> buscar (String nombre);
}
