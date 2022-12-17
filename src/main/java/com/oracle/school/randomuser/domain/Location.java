package com.oracle.school.randomuser.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "Location")
@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Location{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long sn;
    @OneToOne(cascade = CascadeType.ALL)
    private Street street;
    private String city;
    private String state;
    private String country;
    private int postcode;

    @OneToOne(cascade = CascadeType.ALL)
    private Coordinates coordinates;
    @OneToOne(cascade = CascadeType.ALL)
    private Timezone timezone;
}
