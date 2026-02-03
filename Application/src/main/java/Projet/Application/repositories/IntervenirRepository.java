package Projet.Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Projet.Application.entities.Intervenir;
import java.util.List;
import java.util.Calendar;

public interface IntervenirRepository extends JpaRepository<Intervenir, Integer>{
    Intervenir findById(int id);
    Intervenir findByStatut(String statut);
    Intervenir findDesc(String description);
	Intervenir findDateInterv(Calendar dateIntervention);
    
    List<Intervenir> findAll();
}