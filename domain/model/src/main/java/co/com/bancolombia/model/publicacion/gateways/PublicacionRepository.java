package co.com.bancolombia.model.publicacion.gateways;

import co.com.bancolombia.model.publicacion.Publicacion;


import java.util.List;
import java.util.Optional;
 public interface PublicacionRepository {
    void create(Publicacion publicacion);
    Optional<Publicacion> read(long id);
    void update(Publicacion publicacion) throws Exception;
    List<Publicacion> getAll();
    void delete(long id);
    Optional<Publicacion> findById(long publicacionId);
}
