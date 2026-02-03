package Projet.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import Projet.Application.repositories.TechnicienRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@EnableAutoConfiguration
public class TestEm{
	//@Autowired
	//private static TechnicienRepository technicienRepository;
	
	static void test() {
		Technicien tech = new Technicien();
        tech.setPrenom("Hugo");
        tech.setNom("M");
        
        System.out.println("id nom prenom="
        			 + tech.getId()
        			 + " "
        	         + tech.getNom()
        	         + " "
        	         + tech.getPrenom());
        
        Technicien tech2 = new Technicien();
        tech2.setPrenom("Test");
        tech2.setNom("test");
        
        System.out.println("id nom prenom="
        			 + tech2.getId()
        			 + " "
        	         + tech2.getNom()
        	         + " "
        	         + tech2.getPrenom());
        
		//Technicien saved = technicienRepository.save(tech);
		
		//System.out.println(saved.getId());
		System.out.println("test");
	}
	
	
	public static void main(String[]argv) {
		test();
		// EntityManagerFactory emf = Persistence.createEntityManagerFactory("projet");
	    // EntityManager em = emf.createEntityManager();    
	    // EntityTransaction transac = em.getTransaction();
	    
	    // transac.begin();
	    // Technicien nouveauTech = new Technicien();
	    // nouveauTech.setNom("M");
	    // nouveauTech.setPrenom("Hugo");
	    // em.persist(nouveauTech);
	    // transac.commit();
	    
	    
	    // Technicien personneTech = em.find(Technicien.class, 1);
	    // System.out.println("nom prenom="
	    //     + personneTech.getNom()
	    //     + " "
	    //     + personneTech.getPrenom());
	    
	    // em.close();
	    // emf.close();
	    
	}
}