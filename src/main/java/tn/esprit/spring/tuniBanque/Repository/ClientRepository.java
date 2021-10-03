package tn.esprit.spring.tuniBanque.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.tuniBanque.entities.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

}
