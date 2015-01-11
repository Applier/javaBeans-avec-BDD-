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
public class Competence {
	
	/* Constructeur */
	public Competence() {}
	
	/* Attributs */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCompetence;
	
	@ManyToOne
	private InfosCV infos;

	private String intitule;
	
	private String détails;

	/* Getters et Setters */
	
	public int getIdCompetence() {
		return idCompetence;
	}

	public void setIdCompetence(int idCompetence) {
		this.idCompetence = idCompetence;
	}
	
	public InfosCV getInfos() {
		return infos;
	}

	public void setInfos(InfosCV infos) {
		this.infos = infos;
	}
	
	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getDétails() {
		return détails;
	}

	public void setDétails(String détails) {
		this.détails = détails;
	}
	
}
