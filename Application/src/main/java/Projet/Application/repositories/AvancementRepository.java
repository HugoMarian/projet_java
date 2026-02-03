package Projet.Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Projet.Application.entities.Avancement;
import java.util.List;

public interface AvancementRepository extends JpaRepository<Avancement, Integer>{
    Avancement findId(int id);
	Avancement findStatut(String statut);
    
    List<Avancement> findAll();
}