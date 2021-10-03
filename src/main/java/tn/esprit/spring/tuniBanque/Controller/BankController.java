package tn.esprit.spring.tuniBanque.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.spring.tuniBanque.Service.BankInterface;
import tn.esprit.spring.tuniBanque.entities.Client;
import tn.esprit.spring.tuniBanque.entities.Compte;
import tn.esprit.spring.tuniBanque.entities.Historique;

@RestController
public class BankController {
	
	@Autowired
	private BankInterface banqueMetier;
	
	
	     //ajout d'un nouveau client 
	//URL : http://localhost:8080/SpringMVC/servlet/ajoutClient
	    @PostMapping("/ajoutClient")
	    public void ajoutNouveauClient(@RequestBody Client cl){
		banqueMetier.ajoutClient(cl);
	    }
	
	
	     //ajout d'un nouveau compte
	
		//URL : http://localhost:8080/SpringMVC/servlet/ajout
		@PostMapping("/ajout")
		public void ajoutNouveauCompte(@RequestBody Compte cp){
			banqueMetier.ajoutCompte(cp);
		}
		
		//consultation de compte
		
		//URL : http://localhost:8080/SpringMVC/servlet/consultation/{id}
		@GetMapping("/consultation/{id}")
		public Compte consultation(@PathVariable("id") int id){
			return banqueMetier.consulterCompte(id);
		}
		
		//Virement dans un compte
		
		//URL : http://localhost:8080/SpringMVC/servlet/versement/{id}/{newmontant}
		@PutMapping("/versement/{id}/{newmontant}")
		public void ajoutMontant(@PathVariable("id") int id,@PathVariable("newmontant") float montant){
			banqueMetier.verser(id, montant);
		}
		

		//retrait d'un compte
		
		//URL : http://localhost:8080/SpringMVC/servlet/retrait/{id}/{newmontant}
		@PutMapping("/retrait/{id}/{newmontant}")
		public void retraitMontant(@PathVariable("id") int id,@PathVariable("newmontant") float montant){
			banqueMetier.retirer(id, montant);
		}
		
		//Virement d'un compte à un autre
		
		//URL : http://localhost:8080/SpringMVC/servlet/virement/{id1}/{id2}/{newmontant}
		@PutMapping("/virement/{id1}/{id2}/{newmontant}")
		public void VirementMontant(@PathVariable("id1") int id1,@PathVariable("id2")int id2,@PathVariable("newmontant") float montant){
				banqueMetier.virement(id1, id2, montant);
		}
		
		//affichage de l'historique
		
				//URL : http://localhost:8080/SpringMVC/servlet/historique/{id}
		@GetMapping("/historique/{id}")
		public Historique getHistoriques(@PathVariable("id") int id){
			return banqueMetier.historiqueParCompte(id);
			
		}
		

}
