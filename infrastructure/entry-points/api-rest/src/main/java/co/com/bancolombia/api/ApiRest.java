package co.com.bancolombia.api;
import co.com.bancolombia.model.publicacion.Publicacion;
import co.com.bancolombia.usecase.crudpublicacionservicio.CrudPublicacionServicioUseCase;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/publicacion", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Api(tags = "Publicaciones", description = "EnPoints Para la Gestión de Publicaciones" )
public class ApiRest {
    private final CrudPublicacionServicioUseCase crudPublicacionServicioUseCase;

    @GetMapping()
    public List<Publicacion> getAllPublicaciones() {
        return crudPublicacionServicioUseCase.getAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Publicacion> read(@PathVariable long id) {
        return crudPublicacionServicioUseCase.read(id);
    }

    @PostMapping()
    public void create(@RequestBody Publicacion publicacion) {
        crudPublicacionServicioUseCase.create(publicacion);
    }

    @PutMapping()
    public void update(@RequestBody Publicacion publicacion) {
        try {
            crudPublicacionServicioUseCase.update(publicacion);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable long id) {
        crudPublicacionServicioUseCase.delete(id);
    }


}
