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

import br.com.docvet.docvet.domain.DonoDoPet;
import br.com.docvet.docvet.service.DonoDoPetService;

@RestController
@RequestMapping("/api/v1/dono-pets")
public class DonoDoPetResource {

    @Autowired
    private DonoDoPetService donoDoPetService;

    @GetMapping("/")
    public ResponseEntity<List<DonoDoPet>> getAll(){
        List<DonoDoPet> donoDoPets = donoDoPetService.finAll();
        return new ResponseEntity<List<DonoDoPet>>(donoDoPets, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DonoDoPet> getOne(@PathVariable("id") Integer id){
        DonoDoPet donoDoPet = donoDoPetService.findById(id);
        return new ResponseEntity<DonoDoPet>(donoDoPet, HttpStatus.OK);
    }

    @PostMapping(value = "/")
    public ResponseEntity<DonoDoPet> posst(@RequestBody final DonoDoPet donoDoPet){
        donoDoPetService.save(donoDoPet);
        return new ResponseEntity<DonoDoPet>(donoDoPet, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<DonoDoPet> update(@PathVariable("id") Integer id, @RequestBody DonoDoPet donoDoPet){
        DonoDoPet donoDoPetOriginal = donoDoPetService.findById(id);
        donoDoPetOriginal.setNome(donoDoPet.getNome());
        donoDoPetOriginal.setEmail(donoDoPet.getEmail());
        donoDoPetOriginal.setCpf(donoDoPet.getCpf());
        donoDoPetOriginal.setFoto(donoDoPet.getFoto());

        donoDoPetService.update(donoDoPetOriginal);
        return new ResponseEntity<DonoDoPet>(donoDoPetOriginal, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        donoDoPetService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
