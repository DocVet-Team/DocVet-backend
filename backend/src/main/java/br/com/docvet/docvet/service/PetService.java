package br.com.docvet.docvet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.docvet.docvet.domain.Pet;
import br.com.docvet.docvet.domain.error.NotFoundException;
import br.com.docvet.docvet.repository.PetRepository;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public void update(Pet pet) {
        if (!petRepository.existsById(pet.getId())) {
            throw new NotFoundException("Pet não encontrado: id="+pet.getId());
        }
        petRepository.save(pet);
    }

    public List<Pet> finAll() {
        return petRepository.findAll();
    }

    public Pet findById(Integer id) {
        return petRepository.findById(id).orElseThrow(()-> new NotFoundException("Pet não encontrado: id="+id));
    }

    public void save(Pet pet) {
        petRepository.save(pet);
    }

    public void delete(Integer id) {
        if (!petRepository.existsById(id)) {
          throw  new NotFoundException("Pet não encontrado: id="+id);
        }
        petRepository.deleteById(id);
    }

}

