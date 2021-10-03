package tn.esprit.spring.tuniBanque.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Banque implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//attributs 
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int matricule;
	private String nomBq;
	private String siegeSocial;
	private String emailBq;
	private int tlfnBq;
	
	@OneToMany(mappedBy="banque")
	private List<Compte> compteBq;
	
	
	//constructeurs 
	
	
	public Banque() {
		super();
	}


	public Banque(int matricule, String nomBq, String siegeSocial, String emailBq, int tlfnBq) {
		super();
		this.matricule = matricule;
		this.nomBq = nomBq;
		this.siegeSocial = siegeSocial;
		this.emailBq = emailBq;
		this.tlfnBq = tlfnBq;
	}

	//getters et setters

	public int getMatricule() {
		return matricule;
	}


	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}


	public String getNomBq() {
		return nomBq;
	}


	public void setNomBq(String nomBq) {
		this.nomBq = nomBq;
	}


	public String getSiegeSocial() {
		return siegeSocial;
	}


	public void setSiegeSocial(String siegeSocial) {
		this.siegeSocial = siegeSocial;
	}


	public String getEmailBq() {
		return emailBq;
	}


	public void setEmailBq(String emailBq) {
		this.emailBq = emailBq;
	}


	public int getTlfnBq() {
		return tlfnBq;
	}


	public void setTlfnBq(int tlfnBq) {
		this.tlfnBq = tlfnBq;
	}
	
	

}
