package tn.esprit.spring.tuniBanque.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.tuniBanque.entities.Client;
import tn.esprit.spring.tuniBanque.entities.Compte;



@Repository
public interface CompteRepository extends CrudRepository<Compte, Integer> {
	
	public Compte findByIdCpte(int id);
	public Compte findByClient(Client client);

}
