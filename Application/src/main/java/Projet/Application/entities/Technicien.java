/**
 * 
 */
package Projet.Application.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * 
 */

@Entity
@Table(schema="projet_db", name="Agenda")
public class Technicien implements Serializable {
/**
 * 
 */
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "nom")
	private String nom;
	private static final long serialVersionUID = 1L;
	
	public Technicien() {
		super();
	}

	public Integer getId() {
	    return this.id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getPrenom() {
	    return this.prenom;
	}

	public void setPrenom(String prenom) {
	    this.prenom = prenom;
	}

	public String getNom() {
	    return this.nom;
	}

	public void setNom(String nom) {
	    this.nom = nom;
	}

}
