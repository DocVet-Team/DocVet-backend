package br.com.docvet.docvet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.docvet.docvet.domain.Estado;
import br.com.docvet.docvet.domain.error.NotFoundException;
import br.com.docvet.docvet.repository.EstadoRepository;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> finAll() {
        return estadoRepository.findAll();
    }

    public Estado findById(Integer id) {
        return estadoRepository.findById(id).orElseThrow(()-> new NotFoundException("Estado não encontrado: id="+id));
    }

    public void save(Estado estado) {
        estadoRepository.save(estado);
    }

    public void update(Estado estado) {
        if (!estadoRepository.existsById(estado.getId())) {
            throw new NotFoundException("Estado não encontrado: id="+estado.getId());
        }
        estadoRepository.saveAndFlush(estado);
    }

    public void delete(Integer id) {
        if (!estadoRepository.existsById(id)) {
            throw new NotFoundException("Estado não encontrado: id="+id);
        }
        estadoRepository.deleteById(id);
    }

}
