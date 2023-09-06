package com.upc.edu.lawdingo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "username",length = 45,nullable = false)
    private String username;
    @Column(name = "email",length = 25,nullable = false)
    private String email;

    @Column(name = "password",length = 45,nullable = false)
    private String password;
    @Column(name = "cellPhoneNumber",nullable = false)
    private int cellPhone;

    @Column(name = "dni",nullable = false)
    private int DNI;

    @Column(name="birthDateUser",nullable = false)
    private LocalDate birthDateUser ;


    public Users() {

    }

    public Users(int idUser, String username, String email, String password, int cellPhone, int DNI, LocalDate birthDateUser) {
        this.idUser = idUser;
        this.username = username;
        this.email = email;
        this.password = password;
        this.cellPhone = cellPhone;
        this.DNI = DNI;
        this.birthDateUser = birthDateUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public LocalDate getBirthDateUser() {
        return birthDateUser;
    }

    public void setBirthDateUser(LocalDate birthDateUser) {
        this.birthDateUser = birthDateUser;
    }
}
