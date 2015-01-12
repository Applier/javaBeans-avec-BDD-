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
		InfosCV infos = new InfosCV();
		user.setMail(mail);
		user.setPassword(password);
		user.setInfos(infos);
		infos.setUser(user);
		em.persist(infos);
		em.persist(user);
		User u1 = (User) em.find(User.class, mail);
		System.out.println("1ajoutUSEReeeeeeeeeeeee " + u1.toString() + " fffffffffffff" + mail);
		//User u2 = em.find(User.class, "toto");
		//System.out.println("2ajoutUSEReeeeeeeeeeeee " + u2.toString() + " fffffffffffff" + mail);
	}
	
	public User getUser(String mail) {
		User user = (User) em.createQuery("FROM User WHERE mail =" + "\'" + mail + "\'", User.class).getSingleResult();
		System.out.println("Recup des infos de " + user.getMail());
		return user;
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
		return (user.getMail() == mail); // return true si user est présent dans la BDD
	}
	
	public boolean verificationUser(String mail, String password) {
		User user = (User) em.find(User.class, mail);
		return (user.getPassword().equals(password));
	}
	
	/* LES OFFRES */
	
	public void ajoutOffre(String mailUser, String intitule, String entreprise, String description, Date dateLimite) {
		Offre offre = new Offre();
		offre.setIntitule(intitule);
		offre.setEntreprise(entreprise);
		offre.setDescription(description);
		offre.setdateLimite(dateLimite);
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
	
	public void modificationEtatTache(int idTache) {
		Tache tache = em.find(Tache.class, idTache);
		boolean etat = tache.isEtat();
		tache.setEtat(!etat);	
	}
		
	/* LE PROFIL POUR LE CV */
	
	public InfosCV getInfos(String mailUser) {
		InfosCV infos = (InfosCV) em.createQuery("FROM InfosCV WHERE user_mail =" + "\'" + mailUser + "\'", InfosCV.class).getSingleResult();
		System.out.println("Recup des infos de " + infos.getUser().getMail());
		return infos;
	}
	
	public void setInfos(String mailUser, InfosCV newInfos) {
		this.getInfos(mailUser).setNom(newInfos.getNom());
		this.getInfos(mailUser).setPrenom(newInfos.getPrenom());
		this.getInfos(mailUser).setNumTel(newInfos.getNumTel());
		this.getInfos(mailUser).setAdresse(newInfos.getAdresse());
		this.getInfos(mailUser).setMailPro(newInfos.getMailPro());
		this.getInfos(mailUser).setDateNaissance(newInfos.getDateNaissance());	
	}
		
}
