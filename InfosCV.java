/**
 * 
 */
package intergiciels.beans;

import java.util.Set;

import javax.persistence.*;

/**
 * @author Jade BOUMAZA
 *
 */

@Entity
public class InfosCV {
	
	/* Constructeur */
	public InfosCV() {}
	
	/* Attributs */
	
	@Id
	@GeneratedValue
	private int idInfos;
	
	@OneToOne
	private User user;

	private String nom;
	private String prenom;
	private String numTel;
	private String dateNaissance;
	private String adresse;
	private String mailPro;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "infos")
	private Set<Competence> competences;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "infos")
	private Set<Emploi> emplois;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "infos")
	private Set<Formation> formations;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "infos")
	private Set<Langue> langues;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "infos")
	private Set<Loisir> loisirs;
	
	/* Setters et Getters */
	
	// idInfos
	public int getIdInfos() {
		return idInfos;
	}
	public void setIdInfos(int idInfos) {
		this.idInfos = idInfos;
	}
	
	// user
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	// nom
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	// prenom
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	// numTel
	public String getNumTel() {
		return this.numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
		
	// dateNaissance
	public String getDateNaissance() {
		return this.dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	// adresse
	public String getAdresse() {
		return this.adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	// mailPro
	public String getMailPro() {
		return mailPro;
	}
	public void setMailPro(String mailPro) {
		this.mailPro = mailPro;
	}
	
	// domainesCompetences
	public Set<Competence> getCompetences() {
		return this.competences;
	}
	public void setCompetences(Set<Competence> competences) {
		this.competences = competences;
	}
	
	// emplois
	public Set<Emploi> getEmplois() {
		return this.emplois;
	}
	public void setEmplois(Set<Emploi> emplois) {
		this.emplois = emplois;
	}
		
	// formations
	public Set<Formation> getFormations() {
		return this.formations;
	}
	public void setFormations(Set<Formation> formations) {
		this.formations = formations;
	}
	
	// langues
	public Set<Langue> getLangues() {
		return this.langues;
	}
	public void setLangues(Set<Langue> langues) {
		this.langues = langues;
	}
		
	// loisirs
	public Set<Loisir> getLoisirs() {
		return this.loisirs;
	}
	public void setLoisirs(Set<Loisir> loisirs) {
		this.loisirs = loisirs;
	}
		
		
	/* M�thodes compl�mentaires sur les Sets */
		
	// ajouter
		
	public void addCompetence(Competence competence) {
		this.competences.add(competence);
	}
	
	public void addEmploi(Emploi emploi) {
		this.emplois.add(emploi);
	}
	
	public void addFormation(Formation formation) {
		this.formations.add(formation);
	}
	
	public void addLangue(Langue langue) {
		this.langues.add(langue);
	}
	
	public void addLoisir(Loisir loisir) {
		this.loisirs.add(loisir);
	}
			
	// supprimer
	
	public void removeCompetence(Competence competence) {
		this.competences.remove(competence);
	}
	public void removeAllCompetences() {
		this.competences.clear();
	}
	
	public void removeEmploi(Emploi emploi) {
		this.emplois.remove(emploi);
	}
	public void removeAllEmplois() {
		this.emplois.clear();
	}
	
	public void removeFormation(Formation formation) {
		this.formations.remove(formation);
	}
	public void removeAllFormations() {
		this.formations.clear();
	}
	
	public void removeLangue(Langue langue) {
		this.langues.remove(langue);
	}
	public void removeAllLangues() {
		this.langues.clear();
	}
		
	public void removeLoisir(Loisir loisir) {
		this.loisirs.remove(loisir);
	}
	public void removeAllLoisirs() {
		this.loisirs.clear();
	}	

}
