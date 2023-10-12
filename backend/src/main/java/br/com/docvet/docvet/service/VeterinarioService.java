package br.com.docvet.docvet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.docvet.docvet.domain.Veterinario;
import br.com.docvet.docvet.repository.VeterinarioRepository;

@Service
public class VeterinarioService {

    @Autowired
    private VeterinarioRepository repository;

    public Veterinario getOne(Integer id){
        return repository.findById(id).get();
    }

    public List<Veterinario> getAll(){
        return repository.findAll();
    }

    public void save(Veterinario veterinario){
        repository.save(veterinario);
    }

    public void update(Veterinario veterinario, Integer id){
        Veterinario existente = repository.findById(id).get();

        existente.setNome(veterinario.getNome());
        existente.setEndereco(veterinario.getEndereco());
        existente.setEmail(veterinario.getEmail());
        existente.setTelefone(veterinario.getTelefone());
        existente.setFoto(veterinario.getFoto());
        existente.setCrmv(veterinario.getCrmv());
        // existente.setEspecialidades(veterinario.getEspecialidades());
        // existente.setPortes(veterinario.getPortes());
        // existente.setTiposAnimal(veterinario.getTiposAnimal());

        repository.saveAndFlush(existente);

    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
