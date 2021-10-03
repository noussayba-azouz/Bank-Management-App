package tn.esprit.spring.tuniBanque.Service;

import java.util.List;

import tn.esprit.spring.tuniBanque.Repository.HistoireRepository;
import tn.esprit.spring.tuniBanque.entities.Client;
import tn.esprit.spring.tuniBanque.entities.Compte;
import tn.esprit.spring.tuniBanque.entities.Historique;

public interface BankInterface {
	
	public Compte ajoutCompte(Compte cp);
	public Compte consulterCompte(int id);
	public void verser(int id, float montant);
	public void retirer(int id, float montant);
	public void virement(int id1,int id2, float montant);
	public Historique historiqueParCompte(int id);
	public Client ajoutClient(Client cl);
	

}
