package com.ebudget.application.model;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBudget;
    private String nom;
    private LocalDate datedeDebut;
    private Float valeurInitiale;
    private Float valeurReel;
    private Boolean etat;
    private LocalDate datedeFin;

    public Budget() {}

    public Budget(String nom, LocalDate datedeDebut, Float valeurInitiale,
                  Float valeurReel, boolean etat, LocalDate datedeFin) {
        this.nom = nom;
        this.datedeDebut = datedeDebut;
        this.valeurInitiale = valeurInitiale;
        this.valeurReel = valeurReel;
        this.etat = etat;
        this.datedeFin = datedeFin;
    }

    public Long getIdBudget() {
        return idBudget;
    }

    public void setIdBudget(Long idBudget) {
        this.idBudget = idBudget;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDatedeDebut() {
        return datedeDebut;
    }

    public void setDatedeDebut(LocalDate datedeDebut) {
        this.datedeDebut = datedeDebut;
    }

    public Float getValeurInitiale() {
        return valeurInitiale;
    }

    public void setValeurInitiale(Float valeurInitiale) {
        this.valeurInitiale = valeurInitiale;
    }

    public Float getValeurReel() {
        return valeurReel;
    }

    public void setValeurReel(Float valeurReel) {
        this.valeurReel = valeurReel;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public LocalDate getDatedeFin() {
        return datedeFin;
    }

    public void setDatedeFin(LocalDate datedeFin) {
        this.datedeFin = datedeFin;
    }

}
