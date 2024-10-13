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
    private final PatientRepository repository;
    private final ModelMapper mapper;

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

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Patient> getByName(String name) {
        List<PatientEntity> byName = repository.findByName(name);
        ArrayList<Patient> patients = new ArrayList<>();
        byName.forEach(patientEntity -> patients.add(mapper.map(patientEntity,Patient.class)));
        return patients;
    }

    @Override
    public List<Patient> getByAddress(String address) {
        List<PatientEntity> byAddress = repository.findByAddress(address);
        ArrayList<Patient> patients = new ArrayList<>();
        byAddress.forEach(patientEntity -> patients.add(mapper.map(patientEntity,Patient.class)));
        return patients;
    }

    @Override
    public List<Patient> getByNic(String nic) {
        List<PatientEntity> byAddress = repository.findByNic(nic);
        ArrayList<Patient> patients = new ArrayList<>();
        byAddress.forEach(patientEntity -> patients.add(mapper.map(patientEntity,Patient.class)));
        return patients;
    }

    @Override
    public List<Patient> getByBloodGroup(String bloodGroup) {
        List<PatientEntity> byAddress = repository.findByBloodGroup(bloodGroup);
        ArrayList<Patient> patients = new ArrayList<>();
        byAddress.forEach(patientEntity -> patients.add(mapper.map(patientEntity,Patient.class)));
        return patients;
    }

    @Override
    public List<Patient> getByCategory(String category) {
        List<PatientEntity> byAddress = repository.findByCategory(category);
        ArrayList<Patient> patients = new ArrayList<>();
        byAddress.forEach(patientEntity -> patients.add(mapper.map(patientEntity,Patient.class)));
        return patients;
    }

    @Override
    public List<Patient> getByGender(String gender) {
        List<PatientEntity> byAddress = repository.findByGender(gender);
        ArrayList<Patient> patients = new ArrayList<>();
        byAddress.forEach(patientEntity -> patients.add(mapper.map(patientEntity,Patient.class)));
        return patients;
    }
}
