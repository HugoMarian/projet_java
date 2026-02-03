package Projet.Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Projet.Application.entities.Technicien;
import java.util.List;

public interface TechnicienRepository extends JpaRepository<Technicien, Integer>{
	Technicien findId(int id);
	Technicien findNom(String nom);
	Technicien findPrenom(String prenom);

	List<Technicien> findAll();
}
