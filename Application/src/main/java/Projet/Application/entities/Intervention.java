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
@Table(schema="projet_db", name="Intervention")
public class Intervention implements Serializable {
/**
 * 
 */
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "type_intervention")
	private String typeIntervention;
	
	private static final long serialVersionUID = 1L;
	
	public Intervention() {
		super();
	}

	public Integer getId() {
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
