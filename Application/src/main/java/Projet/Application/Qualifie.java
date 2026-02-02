package Projet.Application;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Qualifie implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "Id_Technicien")
    private Technicien technicien;

    @ManyToOne
    @JoinColumn(name = "Id_Qualification")
    private Qualification qualification;

    public Qualifie() {}
}

