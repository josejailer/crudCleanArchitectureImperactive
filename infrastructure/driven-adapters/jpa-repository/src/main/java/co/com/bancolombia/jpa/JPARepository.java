package co.com.bancolombia.jpa;

import co.com.bancolombia.jpa.entities.PublicacionEntity;
import co.com.bancolombia.model.publicacion.Publicacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends
        CrudRepository<PublicacionEntity/* change for adapter model */, Long>,
        QueryByExampleExecutor<PublicacionEntity/* change for adapter model */> {
}
