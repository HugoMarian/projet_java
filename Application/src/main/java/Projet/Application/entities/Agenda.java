/**
 * 
 */
package Projet.Application.entities;

import java.io.Serializable;
import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
/**
 * 
 */

@Entity
public class Agenda implements Serializable {
/**
 * 
 */
	@Id
	@GeneratedValue
	private int id;
	
	private Calendar dateDisponibilite;
	
	private static final long serialVersionUID = 1L;
	
	public Agenda() {
		super();
	}

	public int getId() {
	    return this.id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public Calendar getDateDisponibilite() {
	    return this.dateDisponibilite;
	}

	public void setDateDisponibilite(Calendar dateDisponibilite) {
	    this.dateDisponibilite = dateDisponibilite;
	}


}
