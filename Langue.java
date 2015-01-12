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
public class Langue {
	
	/* Constructeur */
	public Langue() {}
	
	/* Attributs */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idLangue;
	
	@ManyToOne
	private InfosCV infos;
	
	private String nom;
	private String niveau;
	
	/* Getters et Setters */
	
	public int getIdLangue() {
		return idLangue;
	}

	public void setIdLangue(int idLangue) {
		this.idLangue = idLangue;
	}

	public InfosCV getInfos() {
		return infos;
	}

	public void setInfos(InfosCV infos) {
		this.infos = infos;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNiveau() {
		return niveau;
	}
	
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	

}
