/**
 * 
 */
package intergiciels.beans;

import java.util.Set;

import javax.persistence.*;

/**
 * @author Jade BOUMAZA & Anthony MARCO
 *
 */

@Entity
public class Correspondance {
	
	/* Constructeur */
	public Correspondance() {
		this.nbMessages = 0;
	}
	
	/* Attributs */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCorres;
	
	@OneToOne
	private Offre offre;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "correspondance")
	private Set<Message> messages;
	
	private int nbMessages;
	
	/* Getters et Setters */
	
	public int getIdCorres() {
		return idCorres;
	}
	public void setIdCorres(int idCorres) {
		this.idCorres = idCorres;
	}
	
	public Offre getOffre() {
		return offre;
	}
	public void setOffre(Offre offre) {
		this.offre = offre;
	}
	public int getNbMessages() {
		return nbMessages;
	}
	public void setNbMessages(int nbMessages) {
		this.nbMessages = nbMessages;
	}
	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}
	
	
		
	/* M�thodes compl�mentaires sur les Sets */
	
	// ajouter
		
	public void addMessage(Message message) {
		this.messages.add(message);
	}
				
	// supprimer
	
	public void removeMessage(Message message) {
		this.messages.remove(message);
	}
	public void removeAllMessages() {
		this.messages.clear();
	}
	

}
