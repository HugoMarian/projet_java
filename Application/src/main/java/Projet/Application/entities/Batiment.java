/**
 * 
 */
package Projet.Application.entities;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
/**
 * 
 */

@Entity
@Table(schema="projet_db", name="Batiment")
public class Batiment implements Serializable {
/**
 * 
 */
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "localisation")
	private String localisation;
	
	@Column(name = "nom")
	private String nom;
	private static final long serialVersionUID = 1L;
	
	public Batiment() {
		super();
	}

	public Integer getId() {
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
