package tn.esprit.spring.tuniBanque.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//attributs;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int cin;  // cle primaire
	private String nom;
	private Date date_de_naissance;
	private String email;
	private String telephone;
	private float salaire;
	
	@OneToMany(mappedBy="client")
	private Collection<Compte> compte;
	
	//constructeurs 
	
	public Client() {
		super();
	}

	public Client(int cin, String nom, Date date_de_naissance, String email, String telephone, float salaire) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.date_de_naissance = date_de_naissance;
		this.email = email;
		this.telephone = telephone;
		this.salaire = salaire;
	}
	
	
	//getters et setters 
	

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDate_de_naissance() {
		return date_de_naissance;
	}

	public void setDate_de_naissance(Date date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public Collection<Compte> getCompte() {
		return compte;
	}

	public void setCompte(Collection<Compte> compte) {
		this.compte = compte;
	}
	
	
	
	
	

}
