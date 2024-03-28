package com.example.myspringapi.service;

import com.example.myspringapi.model.Utilisateur;
import com.example.myspringapi.repository.UtilisateurRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> getUlilisateurs(){
        return utilisateurRepository.findAll();
    }

    public Utilisateur createUtilisateur(Utilisateur utilisateur){
        System.out.println(">>>>>>> " + utilisateur);
        return this.utilisateurRepository.save(utilisateur);
    }

    public Utilisateur deleteUtilisateur(Long id){
        this.utilisateurRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patron with id " + id + " not found"));
        this.utilisateurRepository.deleteById(id);
        return null;
    }

    public Utilisateur updateUtilisateur(Long id, Utilisateur utilisateur){
        Utilisateur utilisateurToUtilisateur = utilisateurRepository.findById(id).orElseThrow(() -> new IllegalStateException(String.format("Utilisateur with id %s doesn't exist", id)));
        utilisateurToUtilisateur.setNom(utilisateur.getNom());
        utilisateurToUtilisateur.setPrenom(utilisateur.getPrenom());
        utilisateurToUtilisateur.setDateNaissance(utilisateur.getDateNaissance());
        utilisateurToUtilisateur.setEmail(utilisateur.getEmail());
        utilisateurToUtilisateur.setCodePostal(utilisateur.getCodePostal());
        utilisateurToUtilisateur.setAdresse(utilisateur.getAdresse());
        utilisateurToUtilisateur.setTelephone(utilisateur.getTelephone());
        utilisateurToUtilisateur.setSalaireFixe(utilisateur.getSalaireFixe());
        utilisateurToUtilisateur.setSalaireVariable(utilisateur.getSalaireVariable());
        utilisateurToUtilisateur.setLogin(utilisateur.getLogin());
        utilisateurToUtilisateur.setPassword(utilisateur.getPassword());
        utilisateurToUtilisateur.setRole(utilisateur.getRole());

        utilisateurRepository.save(utilisateurToUtilisateur);
        return utilisateurToUtilisateur;
    }


}
