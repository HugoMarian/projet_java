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
@Table(schema="projet_db", name="Qualification")
public class Qualification implements Serializable {
/**
 * 
 */
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "qualification")
	private String qualification;
	
	private static final long serialVersionUID = 1L;
	
	public Qualification() {
		super();
	}

	public Integer getId() {
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
