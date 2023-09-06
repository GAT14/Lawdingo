package com.upc.edu.lawdingo.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfile;








}
