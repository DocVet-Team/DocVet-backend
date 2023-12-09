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

import br.com.docvet.docvet.domain.Pet;
import br.com.docvet.docvet.service.PetService;

@RestController
@RequestMapping("/api/v1/pets")
public class PetResource {
    

      @Autowired
    private PetService petService;

    @GetMapping("/")
    public ResponseEntity<List<Pet>> getAll(){
        List<Pet> pets = petService.finAll();
        return new ResponseEntity<List<Pet>>(pets, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pet> getOne(@PathVariable("id") Integer id){
        Pet pet = petService.findById(id);
        return new ResponseEntity<Pet>(pet, HttpStatus.OK);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Pet> posst(@RequestBody final Pet pet){
        petService.save(pet);
        return new ResponseEntity<Pet>(pet, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Pet> update(@PathVariable("id") Integer id, @RequestBody Pet pet){
        Pet petOriginal = petService.findById(id);
        petOriginal.setNome(pet.getNome());
        petOriginal.setRaca(pet.getRaca());
        petOriginal.setSexo(pet.getSexo());
        petOriginal.setPorte(pet.getPorte());
        petOriginal.setPeso(pet.getPeso());
        petOriginal.setTamanho(pet.getTamanho());
        petOriginal.setIdade(pet.getIdade());
        petOriginal.setFoto(pet.getFoto());

        petService.update(petOriginal);
        return new ResponseEntity<Pet>(petOriginal, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        petService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
