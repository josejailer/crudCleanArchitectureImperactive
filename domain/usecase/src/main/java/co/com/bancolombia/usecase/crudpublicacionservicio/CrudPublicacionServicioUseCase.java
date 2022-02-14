package co.com.bancolombia.usecase.crudpublicacionservicio;

import co.com.bancolombia.model.publicacion.Publicacion;
import co.com.bancolombia.model.publicacion.gateways.PublicacionRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
public class CrudPublicacionServicioUseCase {

    private PublicacionRepository publicacionRepository;

    public void create(Publicacion publicacion) {
        publicacionRepository.create(publicacion);
    }

    public Optional<Publicacion> read(long id) {
        return publicacionRepository.read(id);
    }

    public void update(Publicacion publicacion) throws Exception {
        publicacionRepository.update(publicacion);
    }

    public void delete(long id) {
        publicacionRepository.delete(id);
    }

    public List<Publicacion> getAll() {
        return publicacionRepository.getAll();
    }
}
