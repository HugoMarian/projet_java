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
@Table(schema="projet_db", name="Avancement")
public class Avancement implements Serializable {
/**
 * 
 */
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "statut")
	private String statut;
	
	private static final long serialVersionUID = 1L;
	
	public Avancement() {
		super();
	}

	public Integer getId() {
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
