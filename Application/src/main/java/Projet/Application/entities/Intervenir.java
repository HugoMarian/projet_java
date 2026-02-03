/**
 * 
 */
package Projet.Application.entities;

import java.io.Serializable;
import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * 
 */

@Entity
@Table(schema="projet_db", name="Intervenir")
public class Intervenir implements Serializable{

    @EmbeddedId
    private IntervenirPK id;

    @Column(name = "date_intervention")
    private Calendar dateIntervention;

    @Column(name = "statut")
    private String statut;

    @Column(name = "description")
    private String description;

    private static final long serialVersionUID = 1L;

    public Intervenir(){
        super();
    }

    
    public IntervenirPK getClePrimaire() {
        return this.id;
    }

    public void setId(IntervenirPK id) {
        this.id = id;
    }

    public Calendar getDateIntervention(){
        return this.dateIntervention;
    }

    public void setDateIntervention(Calendar dateIntervention){
        this.dateIntervention = dateIntervention;
    }

    public String getStatut(){
        return this.statut;
    }

    public void setStatut(String statut){
        this.statut = statut;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }


}