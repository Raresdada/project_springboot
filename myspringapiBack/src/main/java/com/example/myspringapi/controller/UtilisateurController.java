package com.example.myspringapi.controller;

import com.example.myspringapi.model.Utilisateur;
import com.example.myspringapi.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/utilisateur")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping
    public List<Utilisateur> getUtilisateurs(){
        System.out.println("utill >>>> " + this.utilisateurService.getUlilisateurs());
        return this.utilisateurService.getUlilisateurs();
    }

    @PostMapping
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur){
        System.out.println(">>>>Yh " + utilisateur);
        return this.utilisateurService.createUtilisateur(utilisateur);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Utilisateur> updateUtilisateur(@PathVariable Long id, @RequestBody Utilisateur utilisateur){
        Utilisateur updateUtilisateur = utilisateurService.updateUtilisateur(id, utilisateur);
        return ResponseEntity.ok(updateUtilisateur);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteUtilisateur(@PathVariable Long id){
        this.utilisateurService.deleteUtilisateur(id);
        return ResponseEntity.noContent().build();
    }

}
