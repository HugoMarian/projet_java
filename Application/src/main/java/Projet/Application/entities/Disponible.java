package Projet.Application.entities;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(schema="projet_db", name="Disponnible")
public class Disponible implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "Id_Technicien")
    private Technicien technicien;

    @ManyToOne
    @JoinColumn(name = "Id_Agenda")
    private Agenda agenda;

    public Disponible() {}
}
