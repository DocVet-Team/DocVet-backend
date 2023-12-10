package br.com.docvet.docvet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.docvet.docvet.EstadoDto.NovaSenhaDto;
import br.com.docvet.docvet.domain.Pessoa;
import br.com.docvet.docvet.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa getOne(Integer id){
        return repository.findById(id).get();
    }

    public List<Pessoa> getAll(){
        return repository.findAll();
    }

    public void save(Pessoa pessoa){
        repository.save(pessoa);
    }

    public void update(Integer id, Pessoa pessoa){
        Pessoa pessoaExistente = repository.findById(id).get();

        pessoaExistente.setNome(pessoa.getNome());
        pessoaExistente.setCpf(pessoa.getCpf());
        pessoaExistente.setFoto(pessoa.getFoto());
        pessoaExistente.setEmail(pessoa.getEmail());

        repository.saveAndFlush(pessoaExistente);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    public void alterarSenha(NovaSenhaDto novaSenha) {

        Pessoa pessoaExistente = repository.findByEmail(novaSenha.getEmail());

        if (repository.existsById(pessoaExistente.getId())){
            pessoaExistente.setSenha(novaSenha.getSenha());
            repository.saveAndFlush(pessoaExistente);
        }else{
            System.out.println("------------------- Karol" + novaSenha.getEmail() + " " + novaSenha.getSenha());
            System.out.println("------------------- Karol" + pessoaExistente.getEmail());
        }
    }

}
