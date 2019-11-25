package com.ebudget.application.model;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;


@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaction;
    private String nom;
    private LocalDate dateTransaction;
    private Float value;
    private Boolean debit;

    public Transaction() {}

    public Transaction(String nom, String dateTransaction, Float value, Boolean debit) {
        this.nom = nom;
        this.setDateTransaction(dateTransaction);
        this.value = value;
        this.debit = debit;
    }

    // Return date with correct format for JPA
    private LocalDate parseToLocalDate(String dateString) {
        return LocalDate.parse(dateString, DateTimeFormat.forPattern("DD/MM/YYYY"));
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "idTransaction=" + idTransaction +
                ", nom='" + nom + '\'' +
                ", dateTransaction=" + dateTransaction +
                ", value=" + value +
                ", debit=" + debit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(idTransaction, that.idTransaction) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(dateTransaction, that.dateTransaction) &&
                Objects.equals(value, that.value) &&
                Objects.equals(debit, that.debit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransaction, nom, dateTransaction, value, debit);
    }

    public Long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(Long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = parseToLocalDate(dateTransaction);
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Boolean getDebit() {
        return debit;
    }

    public void setDebit(Boolean debit) {
        this.debit = debit;
    }
}
