package sn.example.demoD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.example.demoD.entities.Etudiant;

public interface Etudiantrepositories extends JpaRepository<Etudiant , Long> {
}
