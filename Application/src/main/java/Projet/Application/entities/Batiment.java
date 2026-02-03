/**
 * 
 */
package Projet.Application.entities;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
/**
 * 
 */

@Entity
public class Batiment implements Serializable {
/**
 * 
 */
	@Id
	@GeneratedValue
	private int id;
	
	private String localisation;
	
	private String nom;
	private static final long serialVersionUID = 1L;
	
	public Batiment() {
		super();
	}

	public int getId() {
	    return this.id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getLocalisation() {
	    return this.localisation;
	}

	public void setLocalisation(String localisation) {
	    this.localisation = localisation;
	}

	public String getNom() {
	    return this.nom;
	}

	public void setNom(String nom) {
	    this.nom = nom;
	}

}
