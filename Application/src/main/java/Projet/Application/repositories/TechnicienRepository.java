package Projet.Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Projet.Application.entities.Technicien;

public interface TechnicienRepository extends JpaRepository<Technicien, Integer>{
	public Integer getId();
	public void setId(int id);
	public String getPrenom();
	public void setPrenom(String prenom);
	public String getNom();
	public void setNom(String nom);
}
