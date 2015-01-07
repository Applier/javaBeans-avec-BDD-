/**
 * 
 */
package intergiciels.beans;

import javax.persistence.*;

/**
 * @author Jade BOUMAZA
 *
 */

@Entity
public class Emploi {
	
	/* Constructeur */
	public Emploi() {}
	
	/* Attributs */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEmploi;
	
	@ManyToOne
	private InfosCV infos;
	
	private String dateDebut;
	private String dateFin;
	private String employeur;
	private String poste;
	private String description;
	
	/* Getters et Setters */
	
	// idEmploi
	public int getIdEmploi() {
		return idEmploi;
	}
	public void setIdEmploi(int idEmploi) {
		this.idEmploi = idEmploi;
	}
	
	// infos
	public InfosCV getInfos() {
		return infos;
	}
	public void setInfos(InfosCV infos) {
		this.infos = infos;
	}
	
	// dateDebut
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	// dateFin
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	
	// employeur
	public String getEmployeur() {
		return employeur;
	}
	public void setEmployeur(String employeur) {
		this.employeur = employeur;
	}
	
	// poste
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	
	// description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
