package com.wipro.projetoteste.controller;

import com.wipro.projetoteste.domain.Transition;
import com.wipro.projetoteste.service.TransitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/transacoes")
@CrossOrigin("*")
public class TransitionController {

    @Autowired
    private TransitionService transitionService;

    @GetMapping("/{id}")
    public ResponseEntity<Transition> GetById(@PathVariable Integer id) {
        Transition obj = this.transitionService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<Transition>> GetAll() {
        List<Transition> list = transitionService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Transition> Post(@RequestBody Transition transition) {
        Transition newObj = transitionService.create(transition);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.status(HttpStatus.GONE).body(transitionService.create(transition));
        // return ResponseEntity.created(uri).build();
    }
}
