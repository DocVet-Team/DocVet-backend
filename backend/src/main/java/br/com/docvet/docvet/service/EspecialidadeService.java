package br.com.docvet.docvet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.docvet.docvet.domain.Especialidade;
import br.com.docvet.docvet.repository.EspecialidadeRepository;

@Service
public class EspecialidadeService {

    @Autowired
    private EspecialidadeRepository repository;


    public Especialidade getOne(Integer id){
        return repository.findById(id).get();
    }

    public List<Especialidade> getAll(){
        return repository.findAll();
    }

    public void save(Especialidade especialidade){
        repository.save(especialidade);
    }

    public void update(Integer id, Especialidade especialidade){
        Especialidade especialidadeExistente = repository.findById(id).get();

        especialidadeExistente.setEspecialidade(especialidade.getEspecialidade());

        repository.saveAndFlush(especialidadeExistente);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
