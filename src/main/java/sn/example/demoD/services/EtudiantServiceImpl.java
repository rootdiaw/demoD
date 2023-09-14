package sn.example.demoD.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.example.demoD.entities.Etudiant;
import sn.example.demoD.repositories.Etudiantrepositories;

import java.util.List;


@Service
public class EtudiantServiceImpl implements EtudiantService{

    @Autowired
    private Etudiantrepositories etudiantrepositories;


    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantrepositories.save(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantrepositories.findAll();
    }
}
