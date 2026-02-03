package Projet.Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Projet.Application.entities.Disponible;
import java.util.List;

public interface DisponibleRepository extends JpaRepository<Disponible, Integer>{
    Disponible findId(int id);
    
    List<Disponible> findAll();
}