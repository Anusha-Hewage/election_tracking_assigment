package com.example.election_tracking_assignment.models;

import lombok.Data;

@Data
public class Candidates {

    private String firstName;
    private String lastName;
    private int age;
    private String countryOfBirth;
    private String countryOfCitizen;
    private Address address;
    private PoliticalParty politicalParty;
}
