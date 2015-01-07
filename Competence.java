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
	private DomaineCompetences domaine;
	
	private String intitule;

	/* Getters et Setters */
	
	public int getIdCompetence() {
		return idCompetence;
	}

	public void setIdCompetence(int idCompetence) {
		this.idCompetence = idCompetence;
	}

	public DomaineCompetences getDomaine() {
		return domaine;
	}

	public void setDomaine(DomaineCompetences domaine) {
		this.domaine = domaine;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	

}
