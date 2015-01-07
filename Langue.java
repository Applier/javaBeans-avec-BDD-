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
public class Loisir {
	
	/* Constructeur */
	public Loisir() {}
	
	/* Attributs */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idLoisir;
	
	@ManyToOne
	private InfosCV infos;

	private String nom;
	private String description;

	/* Getters et Setters */
	
	public int getIdLoisir() {
		return idLoisir;
	}

	public void setIdLoisir(int idLoisir) {
		this.idLoisir = idLoisir;
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
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
