package Projet.Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Projet.Application.entities.Agenda;
import java.util.List;
import java.util.Calendar;

public interface AgendaRepository extends JpaRepository<Agenda, Integer>{
    Agenda findId(int id);
	Agenda findDateDispo(Calendar dateDisponibilite);
    
    List<Agenda> findAll();
}