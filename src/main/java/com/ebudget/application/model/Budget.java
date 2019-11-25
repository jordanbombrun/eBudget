package com.ebudget.application.model;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;


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

    public Budget() {
    }

    public Budget(String nom, String datedeDebut, Float valeurInitiale,
                  Float valeurReel, Boolean etat, String datedeFin) {
        this.nom = nom;
        this.setDatedeDebut(datedeDebut);
        this.valeurInitiale = valeurInitiale;
        this.valeurReel = valeurReel;
        this.etat = etat;
        this.setDatedeFin(datedeFin);
    }

    // Return date with correct format for JPA
    private LocalDate parseToLocalDate(String dateString) {
        return LocalDate.parse(dateString, DateTimeFormat.forPattern("DD/MM/YYYY"));
    }

    @Override
    public String toString() {
        return "Budget{" +
                "idBudget=" + idBudget +
                ", nom='" + nom + '\'' +
                ", datedeDebut=" + datedeDebut +
                ", valeurInitiale=" + valeurInitiale +
                ", valeurReel=" + valeurReel +
                ", etat=" + etat +
                ", datedeFin=" + datedeFin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Budget)) return false;
        Budget budget = (Budget) o;
        return Objects.equals(idBudget, budget.idBudget) &&
                Objects.equals(nom, budget.nom) &&
                Objects.equals(datedeDebut, budget.datedeDebut) &&
                Objects.equals(valeurInitiale, budget.valeurInitiale) &&
                Objects.equals(valeurReel, budget.valeurReel) &&
                Objects.equals(etat, budget.etat) &&
                Objects.equals(datedeFin, budget.datedeFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBudget, nom, datedeDebut, valeurInitiale, valeurReel, etat, datedeFin);
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

    public void setDatedeDebut(String datedeDebut) {
        this.datedeDebut = parseToLocalDate(datedeDebut);
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

    public Boolean isEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public LocalDate getDatedeFin() {
        return datedeFin;
    }

    public void setDatedeFin(String datedeFin) {
        this.datedeFin = parseToLocalDate(datedeFin);
    }

}
