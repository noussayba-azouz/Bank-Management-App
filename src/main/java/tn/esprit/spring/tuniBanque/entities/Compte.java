package tn.esprit.spring.tuniBanque.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Compte implements Serializable {
	
	//attributs 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idCpte;
	private String rib;
	private String typecpte;
	private float solde;
	
	@ManyToOne
	private Client client;
	
	@ManyToOne()
	private Banque banque;
	
	@OneToOne
	private Historique historique;
	
	//constructeurs
	
	public Compte() {
		super();
	}



	public Compte(int idCpte, String rib, String typecpte, float solde) {
		super();
		this.idCpte = idCpte;
		this.rib = rib;
		this.typecpte = typecpte;
		this.solde = solde;
	}

    //getters and setters 

	public int getIdCpte() {
		return idCpte;
	}



	public void setIdCpte(int idCpte) {
		this.idCpte = idCpte;
	}



	public String getRib() {
		return rib;
	}



	public void setRib(String rib) {
		this.rib = rib;
	}



	public String getTypecpte() {
		return typecpte;
	}



	public void setTypecpte(String typecpte) {
		this.typecpte = typecpte;
	}



	public float getSolde() {
		return solde;
	}



	public void setSolde(float solde) {
		this.solde = solde;
	}



	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}



	public Banque getBanque() {
		return banque;
	}



	public void setBanque(Banque banque) {
		this.banque = banque;
	}



	public Historique getHistorique() {
		return historique;
	}



	public void setHistorique(Historique historique) {
		this.historique = historique;
	}
	
	



	
	
	
	

}
