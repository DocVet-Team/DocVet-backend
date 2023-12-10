package br.com.docvet.docvet.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.docvet.docvet.domain.Estado;
import br.com.docvet.docvet.service.EstadoService;

@RestController
@RequestMapping("/api/v1/estados")
public class EstadoResource {

        @Autowired
    private EstadoService estadoService;

    @GetMapping("/")
    public ResponseEntity<List<Estado>> getAll(){
        List<Estado> estados = estadoService.finAll();
        return new ResponseEntity<List<Estado>>(estados, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estado> getOne(@PathVariable("id") Integer id){
        Estado estado = estadoService.findById(id);
        return new ResponseEntity<Estado>(estado, HttpStatus.OK);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Estado> posst(@RequestBody final Estado estado){
        estadoService.save(estado);
        return new ResponseEntity<Estado>(estado, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Estado> update(@PathVariable("id") Integer id, @RequestBody Estado estado){
        Estado estadoOriginal = estadoService.findById(id);
        estadoOriginal.setNome(estado.getNome());
        estadoService.update(estadoOriginal);
        return new ResponseEntity<Estado>(estadoOriginal, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        estadoService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
