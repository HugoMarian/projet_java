/**
 * 
 */
package Projet.Application;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * 
 */

@Entity
public class Technicien implements Serializable {
/**
 * 
 */
	@Id
	@GeneratedValue
	private int id;
	
	private String prenom;
	
	private String nom;
	private static final long serialVersionUID = 1L;
	
	public Technicien() {
		super();
	}

	public int getId() {
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
