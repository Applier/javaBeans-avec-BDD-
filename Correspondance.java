/**
 * 
 */
package intergiciels.beans;

import java.util.Collection;
import javax.persistence.*;

/**
 * @author Jade BOUMAZA & Anthony MARCO
 *
 */

@Entity
public class Correspondance {
	
	/* Constructeur */
	public Correspondance() {}
	
	/* Attributs */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCorres;
	
	@OneToOne
	private Offre offre;
	
	@OneToMany(mappedBy = "correspondance")
	private Collection<Message> messages;
	
	/* Getters et Setters */
	
	// idCorres
	public int getIdCorres() {
		return idCorres;
	}
	public void setIdCorres(int idCorres) {
		this.idCorres = idCorres;
	}
	// messagesRecus
	public Collection<Message> getMessages() {
		return messages;
	}
	public void setMessagesRecus(Collection<Message> messages) {
		this.messages = messages;
	}
		
	/* Méthodes complémentaires sur les collections */
	
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
