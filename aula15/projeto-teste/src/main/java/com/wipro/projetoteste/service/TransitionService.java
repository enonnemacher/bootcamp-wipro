package com.wipro.projetoteste.service;

import com.wipro.projetoteste.domain.Transition;
import com.wipro.projetoteste.repository.TransitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransitionService {

    @Autowired
    private TransitionRepository transitionRepository;

    public Transition findById(Integer id) {
        Optional<Transition> obj = transitionRepository.findById(id);
        return obj.orElse(null);
    }

    public List<Transition> findAll() {
        return transitionRepository.findAll();
    }

    public Transition create(Transition obj) {
        return transitionRepository.save(obj);
    }
}
