package sn.example.demoD.services;

import sn.example.demoD.entities.Etudiant;

import java.util.List;

public interface EtudiantService {

    Etudiant addEtudiant( Etudiant etudiant);
    List<Etudiant> getAllEtudiant();
}
