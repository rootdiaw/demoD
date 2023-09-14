package sn.example.demoD.controllers;

import org.springframework.web.bind.annotation.*;
import sn.example.demoD.entities.Etudiant;
import sn.example.demoD.services.EtudiantService;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apietudiant")
public class EtudiantController {

    private EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping
    public List<Etudiant>listEtudiant(){
        return etudiantService.getAllEtudiant();
    }

    @PostMapping
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant){
     return    etudiantService.addEtudiant(etudiant);
    }
}
