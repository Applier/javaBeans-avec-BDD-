/**
 * 
 */
package intergiciels.beans;

import java.util.Date;
import javax.persistence.*;

/**
 * @author Jade BOUMAZA & Anthony MARCO
 *
 */

@Entity
public class Message {
	
	/* Constructeur */
	public Message() {}

	/* Attributs */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idMsg;
	
	@ManyToOne
	private Correspondance correspondance;
	
	private boolean recu; // true si msg reçu, false si msg envoyé
	
	private String expediteur;
	private Date date;
	private String sujet;
	private String contenu;
	
	/* Getters et Setters */
	
	// idMsg
	public int getIdMsg() {
		return idMsg;
	}
	public void setIdMsg(int idMsg) {
		this.idMsg = idMsg;
	}
	
	// correspondance
	public Correspondance getCorrespondance() {
		return correspondance;
	}
	public void setCorrespondance(Correspondance correspondance) {
		this.correspondance = correspondance;
	}
	
	// estEnvoye
	public boolean isRecu() {
		return recu;
	}
	public void setEnvoye(boolean recu) {
		this.recu = recu;
	}
	
	// expediteur
	public String getExpediteur() {
		return expediteur;
	}
	public void setExpediteur(String expediteur) {
		this.expediteur = expediteur;
	}
	
	// date
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	// sujet
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	
	// contenu
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
}
