package com.ebudget.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class AppliUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    private String username;
    private String pass;
    private String mail;

    public AppliUser() {}

    public AppliUser(String lastName, String firstName, String username, String pass, String mail) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.username = username;
        this.pass = pass;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "AppliUser{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AppliUser)) return false;
        AppliUser appliUser = (AppliUser) o;
        return Objects.equals(id, appliUser.id) &&
                Objects.equals(lastName, appliUser.lastName) &&
                Objects.equals(firstName, appliUser.firstName) &&
                Objects.equals(username, appliUser.username) &&
                Objects.equals(pass, appliUser.pass) &&
                Objects.equals(mail, appliUser.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, username, pass, mail);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
