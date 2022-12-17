package com.oracle.school.randomuser.domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

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
    private Long sn;


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
    private Registered registered;

    private String phone;
    private String cell;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty(value = "id")
    private Identity id;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty(value = "picture")
    private Picture picture;

    private String nat;
}