/**
 * 
 */
package intergiciels.beans;

import java.util.Collection;
import javax.persistence.*;

/**
 * @author Jade BOUMAZA
 *
 */

@Entity
public class DomaineCompetences {
	
	/* Constructeur */
	public DomaineCompetences() {}
	
	/* Attributs */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDomComp;
	
	@ManyToOne
	private InfosCV infos;
	
	private String intitule; // l'intitul� du domaine (ex: informatique)
	
	@OneToMany(mappedBy = "domaine")
	private Collection<Competence> competences; // les comp�tences individuelles (ex : Java, C, LaTeX...)
	
	/* Getters et Setters */
	
	public int getIdDomComp() {
		return idDomComp;
	}

	public void setIdDomComp(int idDomComp) {
		this.idDomComp = idDomComp;
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
	
	public Collection<Competence> getCompetences() {
		return competences;
	}
	
	public void setCompetences(Collection<Competence> competences) {
		this.competences = competences;
	}
	
	/* M�thodes compl�mentaires sur la collection */
	
	// ajouter
	
	public void addCompetence(Competence competence) {
		this.competences.add(competence);
	}
	
	// supprimer
	
	public void removeCompetence(Competence competence) {
		this.competences.remove(competence);
	}

	public void removeAll() {
		this.competences.clear();
	}
	
}
