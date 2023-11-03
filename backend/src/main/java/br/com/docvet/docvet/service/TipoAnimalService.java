package br.com.docvet.docvet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.docvet.docvet.domain.TipoAnimal;
import br.com.docvet.docvet.repository.TipoAnimalRepository;

@Service
public class TipoAnimalService {

    @Autowired
    private TipoAnimalRepository repository;

    public TipoAnimal getOne(Integer id){
        return repository.findById(id).get();
    }

    public List<TipoAnimal> getAll(){
        return repository.findAll();
    }

    public void save(TipoAnimal tipoAnimal){
        repository.save(tipoAnimal);
    }

    public void update(Integer id, TipoAnimal tipoAnimal){
        TipoAnimal tipoExistente = repository.findById(id).get();

        tipoExistente.setNome(tipoAnimal.getNome());

        repository.saveAndFlush(tipoExistente);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

}
