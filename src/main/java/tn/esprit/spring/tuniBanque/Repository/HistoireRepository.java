package tn.esprit.spring.tuniBanque.Repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.tuniBanque.entities.Historique;


@Repository
public interface HistoireRepository extends CrudRepository<Historique, Date> {
	
	   public Historique findByIdCpte(int idCpte);

}
