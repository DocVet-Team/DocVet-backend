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

import br.com.docvet.docvet.domain.Telefone;
import br.com.docvet.docvet.service.TelefoneService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1/telefones")
public class TelefoneController {

    @Autowired
    private TelefoneService service;

    @GetMapping("/{id}")
    public ResponseEntity<Telefone> getOne(@PathVariable Integer id){
        return ResponseEntity.ok().body(service.getOne(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<Telefone>> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @PostMapping("/")
    public ResponseEntity<Void> save(@RequestBody Telefone telefone, HttpServletRequest request, HttpServletResponse response) throws URISyntaxException{
        service.save(telefone);

        StringBuffer path = new StringBuffer();

        path.append(request.getServletPath())
            .append("/")
            .append(telefone.getId());

        URI uri = new URI(path.toString());

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Telefone telefone){
        service.update(id, telefone);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);

        return ResponseEntity.noContent().build();
    }

}