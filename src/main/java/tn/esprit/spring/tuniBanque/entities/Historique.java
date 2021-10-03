package tn.esprit.spring.tuniBanque.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Historique implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//attributs 
	
	
	@Id
	@Temporal(TemporalType.DATE)
	private Date dateHis;
	private float montant;
	private String typeOp;
	private float solde;
	private int idCpte;
	private String rib;
	
	
	//constructeurs
	
	public Historique() {
		super();
	}
	
	


	public Historique(Date dateHis, float montant, String typeOp, int idCpte) {
		super();
		this.dateHis = dateHis;
		this.montant = montant;
		this.typeOp = typeOp;
		this.idCpte = idCpte;
		
	}




	public Historique(Date dateHis, float montant, String typeOp, float solde, int idCpte, String rib) {
		super();
		this.dateHis = dateHis;
		this.montant = montant;
		this.typeOp = typeOp;
		this.solde = solde;
		this.idCpte = idCpte;
		this.rib = rib;
	}
	
	
	//getters et setters 


	public Date getDateHis() {
		return dateHis;
	}


	public void setDateHis(Date dateHis) {
		this.dateHis = dateHis;
	}


	public float getMontant() {
		return montant;
	}


	public void setMontant(float montant) {
		this.montant = montant;
	}


	public String getTypeOp() {
		return typeOp;
	}


	public void setTypeOp(String typeOp) {
		this.typeOp = typeOp;
	}


	public float getSolde() {
		return solde;
	}


	public void setSolde(float solde) {
		this.solde = solde;
	}


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
	
	
	
	

}
