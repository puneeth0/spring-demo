package com.example.spring_demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "frequently_used_spells")
public class FrequentlyUsedSpell {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary key

    @Column(name = "spell", nullable = false)
    private String spell; // Spell name

    @Column(nullable = false)
    private Severity severity;

    public FrequentlyUsedSpell(long id, String spell, Severity severity) {
        this.id = id;
        this.spell = spell;
        this.severity = severity;
    }

    public enum Severity {
        LOW, MID, HIGH;
    }
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "character_id", nullable = false)
//    private HarryPotterCharacter character; // Reference to the character

    @ManyToMany(mappedBy = "frequentlyUsedSpells")
    @JsonBackReference
    private Set<HarryPotterCharacter> character;

    // Default constructor
    public FrequentlyUsedSpell() {
    }

    public FrequentlyUsedSpell(String spell, Severity severity) {
        this.spell = spell;
        this.severity = severity;
    }

    // Parameterized constructor
    public FrequentlyUsedSpell(String spell, Set<HarryPotterCharacter> character) {
        this.spell = spell;
        this.character = character;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public Set<HarryPotterCharacter> getCharacter() {
        return character;
    }

    public void setCharacter(Set<HarryPotterCharacter> character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "FrequentlyUsedSpell{" +
                "id=" + id +
                ", spell='" + spell + '\'' +
                ", severity=" + severity +
                ", character=" + character +
                '}';
    }
}