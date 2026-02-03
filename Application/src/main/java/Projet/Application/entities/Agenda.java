/**
 * 
 */
package Projet.Application.entities;

import java.io.Serializable;
import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * 
 */

@Entity
@Table(schema="projet_db", name="Agenda")
public class Agenda implements Serializable {
/**
 * 
 */
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
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
