package br.com.docvet.docvet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.docvet.docvet.domain.DonoDoPet;
import br.com.docvet.docvet.domain.error.NotFoundException;
import br.com.docvet.docvet.repository.DonoDoPetRepository;

@Service
public class DonoDoPetService {

    @Autowired
    private DonoDoPetRepository donoDoPetRepository;

    public List<DonoDoPet> finAll() {
        return donoDoPetRepository.findAll();
    }

    public DonoDoPet findById(Integer id) {
        return donoDoPetRepository.findById(id).orElseThrow(() -> new NotFoundException("Dono de pet não encontrado: id= "+id));
    }

    public void save(DonoDoPet donoDoPet) {
        donoDoPetRepository.save(donoDoPet);
    }

    public void update(DonoDoPet donoDoPet) {
        if (!donoDoPetRepository.existsById(donoDoPet.getId())) {
            throw new NotFoundException("Dono de pet não encontrado: id= "+donoDoPet.getId());
        }
            donoDoPetRepository.saveAndFlush(donoDoPet);

    }

    public void delete(Integer id) {
        if (!donoDoPetRepository.existsById(id)) {
            throw new NotFoundException("Dono de pet não encontrado: id="+id);
        }
        donoDoPetRepository.deleteById(id);
    }

}
