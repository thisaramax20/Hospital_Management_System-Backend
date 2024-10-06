package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String nic;
    private String address;
    private String bloodGroup;
    private String category;
    private String gender;
    private String contact;
    private String note;
    private String age;
    private String allergies;
}
