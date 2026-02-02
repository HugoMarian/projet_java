/**
 * 
 */
package Projet.Application;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class IntervenirPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
    private int idTechnicien;
    private int idBatiment;
    private int idIntervention;
    private int idStatut;

    public IntervenirPK() {}

    public IntervenirPK(int idTechnicien, int idBatiment, int idIntervention, int idStatut) {
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