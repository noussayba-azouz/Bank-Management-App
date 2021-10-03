package tn.esprit.spring.tuniBanque.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.tuniBanque.Repository.ClientRepository;
import tn.esprit.spring.tuniBanque.Repository.CompteRepository;
import tn.esprit.spring.tuniBanque.Repository.HistoireRepository;
import tn.esprit.spring.tuniBanque.entities.Client;
import tn.esprit.spring.tuniBanque.entities.Compte;
import tn.esprit.spring.tuniBanque.entities.Historique;


@Service
public class BankImplementation implements BankInterface{
	
	//injection des repositories 
	
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private HistoireRepository historiqueRepository;
	

	@Override
	public Compte ajoutCompte(Compte cp) {
		
    //Collection<Compte> collectionExistante = 
    //( (Collection<Compte>)compteRepository.findByClient(cp.getClient()));
		
		//if(collectionExistante == null) throw new RuntimeException("Client introuvable");
		
		return compteRepository.save(cp);
	}

	
	
	@Override
	public Compte consulterCompte(int id) {
		
		Compte cp = compteRepository.findByIdCpte(id);
		if (cp == null) throw new RuntimeException("Compte introuvable");
			return cp;
		
	}

	

	@Override
	public void verser(int id, float montant) {
		Compte cp=consulterCompte(id);
		Historique h = new Historique(new Date(),montant, "Versement",id);
		historiqueRepository.save(h);
		cp.setSolde(cp.getSolde()+montant);
		compteRepository.save(cp);
		
	}

	@Override
	public void retirer(int id, float montant) {
		Compte cp=consulterCompte(id);
		
		if(cp.getSolde()<montant)
			throw new RuntimeException("Solde insuffisant");
		Historique h = new Historique(new Date(),montant, "Retrait",id);
		historiqueRepository.save(h);
		cp.setSolde(cp.getSolde()- montant);
		compteRepository.save(cp);
		
	}

	@Override
	public void virement(int id1,int id2, float montant) {
		retirer(id1,montant);
		verser(id2,montant);
		
	}

	@Override
	public Historique historiqueParCompte(int id) {
		//List<Historique> list = new ArrayList<Historique>();
		
		return historiqueRepository.findByIdCpte(id) ;
	}



	@Override
	public Client ajoutClient(Client cl) {
		return clientRepository.save(cl);
	}
	
}