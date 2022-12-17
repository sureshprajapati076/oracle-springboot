package com.oracle.randomusers.randomuser.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "RandomUser")
@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class RandomUser{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;


    private String gender;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty(value = "name")
    private Name name;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty(value = "location")
    private Location location;


    @Column(unique = true)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty(value = "login")
    private Login login;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty(value = "dob")
    private Dob dob;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty(value = "registered")
    private Dob registered;

    private String phone;
    private String cell;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty(value = "id")
    private Identity identity;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty(value = "picture")
    private Picture picture;

    private String nat;
}