package co.com.bancolombia.jpa;

import co.com.bancolombia.model.publicacion.Publicacion;
import co.com.bancolombia.model.publicacion.gateways.PublicacionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
@AllArgsConstructor
public class JpaPublicacionImpl implements PublicacionRepository {

    private JPARepositoryAdapter jpaRepositoryAdapter;

    @Override
    public void create(Publicacion publicacion) {
        jpaRepositoryAdapter.save(publicacion);
    }

    @Override
    public Optional<Publicacion> read(long id) {
        return Optional.ofNullable(jpaRepositoryAdapter.findById(id));
    }

    @Override
    public void update(Publicacion publicacion) throws Exception {
        jpaRepositoryAdapter.save(publicacion);
    }

    @Override
    public List<Publicacion> getAll() {
        return jpaRepositoryAdapter.findAll();
    }

    @Override
    public void delete(long id) {
      jpaRepositoryAdapter.deleteById(id);
    }

    @Override
    public Optional<Publicacion> findById(long publicacionId) {
        return Optional.ofNullable(jpaRepositoryAdapter.findById(publicacionId));    }
}
