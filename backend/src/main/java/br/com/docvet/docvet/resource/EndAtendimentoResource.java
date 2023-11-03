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

import br.com.docvet.docvet.domain.EndAtendimento;
import br.com.docvet.docvet.service.EndAtendimentoService;

@RestController
@RequestMapping("api/v1/enderecos")
public class EndAtendimentoResource {

    @Autowired
    private EndAtendimentoService endAtendimentoService;

    @GetMapping("/")
    public ResponseEntity<List<EndAtendimento>> getAll(){
        List<EndAtendimento> endAtendimentos = endAtendimentoService.finAll();
        return new ResponseEntity<List<EndAtendimento>>(endAtendimentos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EndAtendimento> getOne(@PathVariable("id") Integer id){
        EndAtendimento endAtendimento = endAtendimentoService.findById(id);
        return new ResponseEntity<EndAtendimento>(endAtendimento, HttpStatus.OK);
    }

    @PostMapping(value = "/")
    public ResponseEntity<EndAtendimento> posst(@RequestBody final EndAtendimento endAtendimento){
        endAtendimentoService.save(endAtendimento);
        return new ResponseEntity<EndAtendimento>(endAtendimento, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<EndAtendimento> update(@PathVariable("id") Integer id, @RequestBody EndAtendimento endAtendimento){
        EndAtendimento enderecoOriginal = endAtendimentoService.findById(id);
        enderecoOriginal.setClinica(endAtendimento.getClinica());
        enderecoOriginal.setLogadouro(endAtendimento.getLogadouro());
        enderecoOriginal.setNumero(endAtendimento.getNumero());
        enderecoOriginal.setComplemento(endAtendimento.getComplemento());
        enderecoOriginal.setBairro(endAtendimento.getBairro());
        enderecoOriginal.setCep(endAtendimento.getCep());
        endAtendimentoService.update(enderecoOriginal);
        return new ResponseEntity<EndAtendimento>(enderecoOriginal, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        endAtendimentoService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


}
