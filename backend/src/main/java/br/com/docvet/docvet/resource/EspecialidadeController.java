package br.com.docvet.docvet.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.docvet.docvet.domain.Especialidade;
import br.com.docvet.docvet.service.EspecialidadeService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1/especialidades")
public class EspecialidadeController {

    @Autowired
    private EspecialidadeService service;

    @GetMapping("/")
    public ResponseEntity<List<Especialidade>> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Especialidade> getOne(@PathVariable Integer id){
        return ResponseEntity.ok().body(service.getOne(id));
    }

    @PostMapping("/")
    public ResponseEntity<Void> save(@RequestBody Especialidade especialidade, HttpServletRequest request, HttpServletResponse response) throws URISyntaxException{
        service.save(especialidade);

        StringBuffer path = new StringBuffer();

        path.append(request.getServletPath())
            .append("/")
            .append(especialidade.getId());

        URI uri = new URI(path.toString());

        return ResponseEntity.created(uri).build();

    }

    @PutMapping("/")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Especialidade especialidade){
        service.update(id, especialidade);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);

        return ResponseEntity.noContent().build();
    }
}
