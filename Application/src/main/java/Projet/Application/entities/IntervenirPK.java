/**
 * 
 */
package Projet.Application.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;

@Embeddable
public class IntervenirPK implements Serializable {
	
	private static final long serialVersionUID = 1L;

    @Column(name = "Id_Technicien", table="Technicien")
    private Integer idTechnicien;
    @Column(name = "Id_Batiment", table="Batiment")
    private Integer idBatiment;
    @Column(name = "Id_Intervention", table="Intervention")
    private Integer idIntervention;
    @Column(name = "Id_Statut", table="Statut")
    private Integer idStatut;

    public IntervenirPK() {}

    public IntervenirPK(Integer idTechnicien, Integer idBatiment, int idIntervention, int idStatut) {
        this.idTechnicien = idTechnicien;
        this.idBatiment = idBatiment;
        this.idIntervention = idIntervention;
        this.idStatut = idStatut;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntervenirPK autre = (IntervenirPK) obj;
        return Objects.equals(idTechnicien, autre.idTechnicien) &&
               Objects.equals(idBatiment, autre.idBatiment) &&
               Objects.equals(idIntervention, autre.idIntervention) &&
               Objects.equals(idStatut, autre.idStatut);
    }

    public int hashCode() {
        return Objects.hash(idTechnicien, idBatiment, idIntervention, idStatut);
    }
}