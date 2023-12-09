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

import br.com.docvet.docvet.domain.Veterinario;
import br.com.docvet.docvet.service.VeterinarioService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1/veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioService service;

    @GetMapping("/{id}")
    public ResponseEntity<Veterinario> getOne(@PathVariable Integer id){
        return ResponseEntity.ok().body(service.getOne(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<Veterinario>> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @PostMapping("/")
    public ResponseEntity<Void> post(@RequestBody Veterinario veterinario, HttpServletRequest request, HttpServletResponse response) throws URISyntaxException{
        service.save(veterinario);

        StringBuffer path = new StringBuffer();

        path.append(request.getRequestURI())
            .append("/")
            .append(veterinario.getId());

        URI uri = new URI(path.toString());

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody Veterinario veterinario, @PathVariable Integer id){
        service.update(veterinario, id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
