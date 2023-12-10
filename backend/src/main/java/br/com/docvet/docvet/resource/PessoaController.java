package br.com.docvet.docvet.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.docvet.docvet.EstadoDto.NovaSenhaDto;
import br.com.docvet.docvet.domain.Pessoa;
import br.com.docvet.docvet.service.PessoaService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> getOne(@PathVariable Integer id){
        return ResponseEntity.ok().body(service.getOne(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<Pessoa>> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @PostMapping("/")
    public ResponseEntity<Void> save(@RequestBody Pessoa pessoa, HttpServletRequest request, HttpServletResponse response) throws URISyntaxException{
        service.save(pessoa);

        StringBuffer path = new StringBuffer();

        path.append(request.getServletPath())
            .append("/")
            .append(pessoa.getId());

        URI uri = new URI(path.toString());

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Pessoa pessoa){
        service.update(id, pessoa);

        return ResponseEntity.ok().build();
    }

    @PatchMapping("/alterarSenha/")
    public ResponseEntity<Void> alterarSenha(@RequestBody NovaSenhaDto novaSenha){
        service.alterarSenha(novaSenha);

        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);

        return ResponseEntity.noContent().build();
    }
}