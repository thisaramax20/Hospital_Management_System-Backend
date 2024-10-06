package edu.icet.service;

import edu.icet.dto.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{
    @Override
    public List<Patient> getAll() {
        return List.of();
    }

    @Override
    public void addPatient(Patient patient) {

    }
}
