/**
 * 
 */
package intergiciels.beans;

import java.util.Collection;

import javax.persistence.*;

import java.util.Date;

/**
 * @author Jade BOUMAZA
 *
 */

@Entity
public class Offre {
	
	/* Constructeur */
	public Offre() {}
	
	/* Attributs */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idOffre;
	
	@ManyToOne
	private User user;
	
	private String intitule;
	private String entreprise;
	private Date deadLine;
	private String description;
	
	@OneToMany(mappedBy = "offre")
	private Collection<Tache> taches;
	
	@OneToOne(mappedBy="offre")
	private Correspondance correspondance;
	
	/* Getters et Setters */
	
	// idOffre
	public int getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(int idOffre) {
		this.idOffre = idOffre;
	}
	
	// user
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	// intitule
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	// entreprise
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	
	// deadLine
	public Date getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
	
	// description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	// taches
	public Collection<Tache> getTaches() {
		return taches;
	}
	public void setTaches(Collection<Tache> taches) {
		this.taches = taches;
	}
	
	// correspondance
	public Correspondance getCorrespondance() {
		return correspondance;
	}
	public void setCorrespondance(Correspondance correspondance) {
		this.correspondance = correspondance;
	}
	
	/* Méthodes complémentaires sur la collection de tâches */
	
	// ajouter
		
	public void addTache(Tache tache) {
		this.taches.add(tache);
	}
				
	// supprimer
	
	public void removeTache(Tache tache) {
		this.taches.remove(tache);
	}
	public void removeAllTaches() {
		this.taches.clear();
	}
	
	
}
