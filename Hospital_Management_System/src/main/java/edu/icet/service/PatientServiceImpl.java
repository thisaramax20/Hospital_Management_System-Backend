package edu.icet.service;

import edu.icet.dto.Patient;
import edu.icet.entity.PatientEntity;
import edu.icet.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{
    final PatientRepository repository;
    final ModelMapper mapper;
    @Override
    public List<Patient> getAll() {
        List<Patient> patients = new ArrayList<>();
        repository.findAll().forEach(patientEntity -> patients.add(mapper.map(patientEntity,Patient.class)));
        return patients;
    }

    @Override
    public void addPatient(Patient patient) {
        repository.save(mapper.map(patient, PatientEntity.class));
    }
}
