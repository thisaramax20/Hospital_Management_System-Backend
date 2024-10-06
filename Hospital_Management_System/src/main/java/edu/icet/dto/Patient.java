package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Patient {
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
