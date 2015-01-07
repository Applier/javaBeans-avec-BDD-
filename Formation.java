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
public class Formation {
	
	/* Constructeur */
	public Formation() {}
	
	/* Attributs */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idFormation;
	
	@ManyToOne
	private InfosCV infos;
	
	private String dateDebut; // peut �tre null si on consid�re une date de dipl�me
	private String dateFin;
	private String etablissement;
	private String intitule; // intitul� de la formation ou dipl�me
	
	/* Getters et Setters */
	
	// idFormation
	public int getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
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
	
	// etablissement
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	
	// intitule
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	// description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String description;

}
