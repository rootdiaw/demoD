package sn.example.demoD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.example.demoD.entities.Etudiant;
import sn.example.demoD.services.EtudiantService;

@SpringBootApplication
public class DemoDApplication implements CommandLineRunner {

	@Autowired
	private EtudiantService etudiantService;

	public static void main(String[] args) {
		SpringApplication.run(DemoDApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



		etudiantService.addEtudiant( new Etudiant(2L,"aly","fall"));
		etudiantService.addEtudiant( new Etudiant(3L,"cheikh","diaw"));
		etudiantService.addEtudiant( new Etudiant(4L,"john","Samb"));
		etudiantService.addEtudiant( new Etudiant(5L,"Fred","Mendy"));
		System.out.println("my etudiant=="+etudiantService.getAllEtudiant());


	}
}
