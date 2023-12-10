package br.com.docvet.docvet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.docvet.docvet.domain.TipoAnimal;
import br.com.docvet.docvet.domain.error.NotFoundException;
import br.com.docvet.docvet.repository.TipoAnimalRepository;

@Service
public class TipoAnimalService {

    @Autowired
    private TipoAnimalRepository repository;

    public TipoAnimal getOne(Integer id){
        return repository.findById(id).orElseThrow(()-> new NotFoundException("Tipo de animal não encontrado: id="+id));
    }

    public List<TipoAnimal> getAll(){
        return repository.findAll();
    }

    public void save(TipoAnimal tipoAnimal){
        repository.save(tipoAnimal);
    }

    public void update(Integer id, TipoAnimal tipoAnimal){
        if (!repository.existsById(tipoAnimal.getId())) {
            throw new NotFoundException("Tipo animal não encontrado: id="+tipoAnimal.getId());
        }
        // TipoAnimal tipoExistente = repository.findById(id).get();

        // tipoExistente.setNome(tipoAnimal.getNome());

        repository.saveAndFlush(tipoAnimal);
    }

    public void delete(Integer id){
        if (!repository.existsById(id)) {
            throw new NotFoundException("Tipo animal não encontrado: id="+id);

        }
        repository.deleteById(id);
    }

}
