package intergiciels.beans;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Tache {
	
	/* Constructeur */
	public Tache() {}
	
	/* Attributs */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idTache;
	
	@ManyToOne
	private Offre offre;
	
	private String intitule;
	private boolean etat; // false si t�che non effectu�e, true sinon
	private Date dateLimite;
	
	/* Getters et Setters */
	
	// idTache
	
	public int getIdTache() {
		return idTache;
	}
	public void setIdTache(int idTache) {
		this.idTache = idTache;
	}
	
	// offre
	public Offre getOffre() {
		return offre;
	}
	public void setOffre(Offre offre) {
		this.offre = offre;
	}
	
	// intitule
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	// etat
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	// dateLimite
	public Date getDateLimite() {
		return dateLimite;
	}
	public void setDateLimite(Date dateLimite) {
		this.dateLimite = dateLimite;
	}

}
