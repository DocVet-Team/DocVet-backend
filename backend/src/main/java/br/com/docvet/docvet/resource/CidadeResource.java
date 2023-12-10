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

import br.com.docvet.docvet.domain.Cidade;
import br.com.docvet.docvet.service.CidadeService;

@RestController
@RequestMapping("/api/v1/cidades")
public class CidadeResource {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping("/")
    public ResponseEntity<List<Cidade>> getAll(){
        List<Cidade> cidades = cidadeService.finAll();
        return new ResponseEntity<List<Cidade>>(cidades, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cidade> getOne(@PathVariable("id") Integer id){
        Cidade cidade = cidadeService.findById(id);
        return new ResponseEntity<Cidade>(cidade, HttpStatus.OK);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Cidade> posst(@RequestBody final Cidade cidade){
        cidadeService.save(cidade);
        return new ResponseEntity<Cidade>(cidade, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Cidade> update(@PathVariable("id") Integer id, @RequestBody Cidade cidade){
        Cidade cidadeOriginal = cidadeService.findById(id);
        cidadeOriginal.setNome(cidade.getNome());
        cidadeService.update(cidadeOriginal);
        return new ResponseEntity<Cidade>(cidadeOriginal, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        cidadeService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
