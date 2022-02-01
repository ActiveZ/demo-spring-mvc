package dev.demospringmvc.controller;

import dev.demospringmvc.dto.Personne;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personnes")
public class PersonneCtrl {
    @PostMapping
    public String creerPersonne(@RequestBody Personne personne){
        return "nom = " + personne.getNom() + " prénom = " + personne.getPrenom()
                + " habite rue: " + personne.getAdresse().getRue() + " ville: " + personne.getAdresse().getVille();
    }
}
