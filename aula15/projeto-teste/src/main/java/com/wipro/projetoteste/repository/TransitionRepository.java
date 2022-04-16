package com.wipro.projetoteste.repository;

import com.wipro.projetoteste.domain.Transition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransitionRepository extends JpaRepository<Transition, Integer> {
}
