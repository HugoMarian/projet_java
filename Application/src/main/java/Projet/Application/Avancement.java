/**
 * 
 */
package Projet.Application;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
/**
 * 
 */

@Entity
public class Avancement implements Serializable {
/**
 * 
 */
	@Id
	@GeneratedValue
	private int id;
	
	private String statut;
	
	private static final long serialVersionUID = 1L;
	
	public Avancement() {
		super();
	}

	public int getId() {
	    return this.id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getStatut() {
	    return this.statut;
	}

	public void setStatut(String statut) {
	    this.statut = statut;
	}

}
