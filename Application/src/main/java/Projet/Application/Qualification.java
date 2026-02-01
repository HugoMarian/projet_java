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
public class Qualification implements Serializable {
/**
 * 
 */
	@Id
	@GeneratedValue
	private int id;
	
	private String qualification;
	
	private static final long serialVersionUID = 1L;
	
	public Qualification() {
		super();
	}

	public int getId() {
	    return this.id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getQualification() {
	    return this.qualification;
	}

	public void setQualification(String qualification) {
	    this.qualification = qualification;
	}

}
