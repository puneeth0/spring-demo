package com.example.spring_demo.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "harry_potter_characters")
public class HarryPotterCharacter {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary key

    @Column(nullable = false)
    private String name; // Character name

    @Column(nullable = false)
    private int age; // Character's age

    @Column(nullable = false)
    private String house; // Hogwarts house

    @Column(nullable = false)
    private String role; // Role in Hogwarts (e.g., Student, Professor)

    @Column(name = "blood_status", nullable = false)
    private String bloodStatus; // Blood status (e.g., Half-Blood, Pure-Blood)

    @Column(nullable = false)
    private String team; // Team (Potter or Voldemort)

    @Column(name = "snitch_match_player", nullable = false)
    private String snitchMatchPlayer; // Whether the character plays Snitch Match

    @Column(nullable = false)
    private String gender; // Gender of the character

    @ManyToMany(cascade = { CascadeType.MERGE})
    @JoinTable(
            name = "character_spells",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "spell_id")
    )
    @JsonManagedReference
    private List<FrequentlyUsedSpell> frequentlyUsedSpells = new ArrayList();
    
//    @ElementCollection
//    @CollectionTable(name = "character_spells", joinColumns = @JoinColumn(name = "character_id"))
//    @Column(name = "spell")
//    private List<String> frequentlyUsedSpells;

    // Default constructor
    public HarryPotterCharacter() {}

    // Parameterized constructor
    public HarryPotterCharacter(String name, int age, String house, String role, String bloodStatus, String team,
                                 String snitchMatchPlayer, String gender,
                                 List<FrequentlyUsedSpell> frequentlyUsedSpells) {
        this.name = name;
        this.age = age;
        this.house = house;
        this.role = role;
        this.bloodStatus = bloodStatus;
        this.team = team;
        this.snitchMatchPlayer = snitchMatchPlayer;
        this.gender = gender;
        this.frequentlyUsedSpells = frequentlyUsedSpells;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBloodStatus() {
        return bloodStatus;
    }

    public void setBloodStatus(String bloodStatus) {
        this.bloodStatus = bloodStatus;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getSnitchMatchPlayer() {
        return snitchMatchPlayer;
    }

    public void setSnitchMatchPlayer(String snitchMatchPlayer) {
        this.snitchMatchPlayer = snitchMatchPlayer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<FrequentlyUsedSpell> getFrequentlyUsedSpells() {
        return frequentlyUsedSpells;
    }

    public void setFrequentlyUsedSpells(List<FrequentlyUsedSpell> frequentlyUsedSpells) {
        this.frequentlyUsedSpells = frequentlyUsedSpells;
    }

    @Override
    public String toString() {
        return "HarryPotterCharacter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", house='" + house + '\'' +
                ", role='" + role + '\'' +
                ", bloodStatus='" + bloodStatus + '\'' +
                ", team='" + team + '\'' +
                ", snitchMatchPlayer=" + snitchMatchPlayer +
                ", gender='" + gender + '\'' +
                ", frequentlyUsedSpells=" + frequentlyUsedSpells +
                '}';
    }
}