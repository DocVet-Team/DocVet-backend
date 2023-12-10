package br.com.docvet.docvet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.docvet.docvet.domain.Veterinario;
import br.com.docvet.docvet.domain.error.NotFoundException;
import br.com.docvet.docvet.repository.VeterinarioRepository;

@Service
public class VeterinarioService {

    @Autowired
    private VeterinarioRepository repository;

    public Veterinario getOne(Integer id){
        return repository.findById(id).orElseThrow(()-> new NotFoundException("Veterinário não encontrado: id="+id));
    }

    public List<Veterinario> getAll(){
        return repository.findAll();
    }

    public void save(Veterinario veterinario){
        repository.save(veterinario);
    }

    public void update(Veterinario veterinario, Integer id){
        if (!repository.existsById(veterinario.getId())) {
            throw new NotFoundException("Veterinário não encontrado: id="+veterinario.getId());

        }
        // Veterinario existente = repository.findById(id).get();

        // existente.setNome(veterinario.getNome());
        // existente.setEmail(veterinario.getEmail());
        // existente.setFoto(veterinario.getFoto());
        // existente.setCrmv(veterinario.getCrmv());

        repository.saveAndFlush(veterinario);

    }

    public void delete(Integer id){
        if (!repository.existsById(id)) {
            throw new NotFoundException("Veterinário não encontrado: id="+id);
        }
        repository.deleteById(id);
    }
}
