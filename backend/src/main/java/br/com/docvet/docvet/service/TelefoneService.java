package br.com.docvet.docvet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.docvet.docvet.domain.Telefone;
import br.com.docvet.docvet.repository.TelefoneRepository;

@Service
public class TelefoneService {

    @Autowired
    private TelefoneRepository repository;

    public Telefone getOne(Integer id){
        return repository.findById(id).get();
    }

    public List<Telefone> getAll(){
        return repository.findAll();
    }

    public void save(Telefone telefone){
        repository.save(telefone);
    }

    public void update(Integer id, Telefone telefone){
        Telefone telefoneExistente = repository.findById(id).get();

        telefoneExistente.setNumero(telefone.getNumero());

        repository.saveAndFlush(telefoneExistente);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
