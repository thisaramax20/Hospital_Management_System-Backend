package edu.icet.service;

import edu.icet.dto.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAll();
    void addPatient(Patient patient);
    void deleteById(Integer id);
    List<Patient> getByName(String name);
    List<Patient> getByAddress(String address);
    List<Patient> getByNic(String nic);
    List<Patient> getByBloodGroup(String bloodGroup);
    List<Patient> getByCategory(String category);
    List<Patient> getByGender(String gender);
}
