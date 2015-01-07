/**
 * 
 */
package intergiciels.beans;

import java.util.Date;

import javax.ejb.Singleton;
import javax.persistence.*;

/**
 * @author Jade BOUMAZA
 *
 */

@Singleton
public class Facade {

	@PersistenceContext(unitName = "MaPU")
	private EntityManager em;
	
	public Facade() {}
	
	/* LES UTILISATEURS */

	public void ajoutUser(String mail, String password) {
		User user = new User();
		user.setMail(mail);
		user.setPassword(password);
		em.persist(user);
		User u1 = (User) em.find(User.class, mail);
		System.out.println("1ajoutUSEReeeeeeeeeeeee " + u1.toString() + " fffffffffffff" + mail);
		//User u2 = em.find(User.class, "toto");
		//System.out.println("2ajoutUSEReeeeeeeeeeeee " + u2.toString() + " fffffffffffff" + mail);
	}
	
	public boolean userPresent(String mail) {
		System.out.println("FACADEeeeeeeeeeeeeeeeeeeeeeeeee "+" fdddddddddddddddd "+mail);
		User user = new User();
		user.setMail(" ");
		try {
			User u = (User) em.find(User.class, mail); // renvoie NullPointerException s'il n'existe pas de User avec comme cl� mail [PB!!]
			System.out.println("FACADEeeeeeeeeeeeeeeeeeeeeeeeee "+user+" ffffffffffffff "+u.getMail());
			user = u;
		} catch (java.lang.NullPointerException e) {}
		
		if (user.getMail() != mail) {
			System.out.println("l'user n'existe pas !!!!!!!!!!!!!!!!!!!!!!!");
		}
		return (user.getMail() == mail); // return true si user est pr�sent dans la BDD
	}
	
	public boolean verificationUser(String mail, String password) {
		User user = (User) em.find(User.class, mail);
		return (user.getPassword() == password);
	}
	
	/* LES OFFRES */
	
	public void ajoutOffre(String mailUser, String intitule, String entreprise, String description, Date deadLine) {
		Offre offre = new Offre();
		offre.setIntitule(intitule);
		offre.setEntreprise(entreprise);
		offre.setDescription(description);
		offre.setDeadLine(deadLine);
		User user = em.find(User.class, mailUser);
		offre.setUser(user);
		em.persist(offre);
	}
	
	public void ajoutTache(int idOffre, String intitule, Date dateLimite) {
		Tache tache = new Tache();
		tache.setEtat(false);
		tache.setIntitule(intitule);
		tache.setDateLimite(dateLimite);
		Offre offre = em.find(Offre.class, idOffre);
		tache.setOffre(offre);
		em.persist(tache);
	}
	
	public void modifierEtatTache(int idTache) {
		Tache tache = (User) em.find(Tache.class, idTache);
		boolean etat = tache.isEtat();
		tache.setEtat(!etat);	
	}
		
	/* LE PROFIL POUR LE CV */
	
	public void modificationNom(String mailUser, String nom) {
		User user = (User) em.find(User.class, mailUser);
		InfosCV infos = user.getInfos();
		infos.setNom(nom);
		user.setInfos(infos);
	}
	
	public void modificationPrenom(String mailUser, String prenom) {
		User user = (User) em.find(User.class, mailUser);
		InfosCV infos = user.getInfos();
		infos.setPrenom(prenom);
		user.setInfos(infos);
	}
	
	public void modificationNumTel(String mailUser, String numTel) {
		User user = (User) em.find(User.class, mailUser);
		InfosCV infos = user.getInfos();
		infos.setNumTel(numTel);
		user.setInfos(infos);	
	}
	
	public void modificationDateNaissance(String mailUser, String dateNaissance) {
		User user = (User) em.find(User.class, mailUser);
		InfosCV infos = user.getInfos();
		infos.setDateNaissance(dateNaissance);
		user.setInfos(infos);	
		em.merge(user);
	}
	
	public void modificationAdresse(String mailUser, String adresse) {
		User user = (User) em.find(User.class, mailUser);
		InfosCV infos = user.getInfos();
		infos.setAdresse(adresse);
		user.setInfos(infos);	
	}
	
	public void modificationMailPro(String mailUser, String mailPro) {
		User user = (User) em.find(User.class, mailUser);
		InfosCV infos = user.getInfos();
		infos.setMailPro(mailPro);
		user.setInfos(infos);	
	}
	
	
}
