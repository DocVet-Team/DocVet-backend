package br.com.docvet.docvet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.docvet.docvet.domain.EndAtendimento;
import br.com.docvet.docvet.repository.EndAtendimentoRepository;

@Service
public class EndAtendimentoService {

    @Autowired
    private EndAtendimentoRepository endAtendimentoRepository;

    public EndAtendimentoService(EndAtendimentoRepository endAtendimentoRepository){
        this.endAtendimentoRepository = endAtendimentoRepository;
    }

    public List<EndAtendimento> finAll() {
        return endAtendimentoRepository.findAll();
    }

    public void save(EndAtendimento endAtendimento) {
        endAtendimentoRepository.save(endAtendimento);
    }

    public EndAtendimento findById(Integer id) {
        return endAtendimentoRepository.findById(id).orElse(null);
    }

    public void delete(Integer id) {
        endAtendimentoRepository.deleteById(id);
    }

    public void update(EndAtendimento endAtendimento) {
        if(endAtendimentoRepository.existsById(endAtendimento.getId())){
            endAtendimentoRepository.save(endAtendimento);
        }
    }

}
