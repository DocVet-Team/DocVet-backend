package br.com.docvet.docvet.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.docvet.docvet.domain.Cidade;
import br.com.docvet.docvet.domain.error.NotFoundException;
import br.com.docvet.docvet.repository.CidadeRepository;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public CidadeService(CidadeRepository cidadeRepository){
        this.cidadeRepository = cidadeRepository;
    }

    public List<Cidade> finAll() {
        return cidadeRepository.findAll();
    }

    public void save(Cidade cidade) {
        cidadeRepository.save(cidade);
    }

    public Cidade findById(Integer id) {
        return cidadeRepository.findById(id).orElseThrow(() -> new NotFoundException("Cidade não encontrada: id="+id));
    }

    public void delete(Integer id) {
        if (!cidadeRepository.existsById(id)) {
            throw new NotFoundException("Cidade não encontrada: id="+id);
        }
        cidadeRepository.deleteById(id);
    }

    public void update(Cidade cidade) {
        if(!cidadeRepository.existsById(cidade.getId())){
            throw new NotFoundException("Cidade não encontrada: id="+cidade.getId());
        }
        cidadeRepository.saveAndFlush(cidade);
    }

}
