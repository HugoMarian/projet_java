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
public class Intervention implements Serializable {
/**
 * 
 */
	@Id
	@GeneratedValue
	private int id;
	
	private String typeIntervention;
	
	private static final long serialVersionUID = 1L;
	
	public Intervention() {
		super();
	}

	public int getId() {
	    return this.id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getTypeIntervention() {
	    return this.typeIntervention;
	}

	public void setTypeIntervention(String typeIntervention) {
	    this.typeIntervention = typeIntervention;
	}

}
