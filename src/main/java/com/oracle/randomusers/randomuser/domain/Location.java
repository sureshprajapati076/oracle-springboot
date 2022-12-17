package com.oracle.randomusers.randomuser.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.CascadeType;
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
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Street street;
    private String city;
    private String state;
    private String country;
    private String postcode;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty(value = "coordinates")
    private Coordinates coordinates;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty(value = "timezone")
    private Timezone timezone;
}
