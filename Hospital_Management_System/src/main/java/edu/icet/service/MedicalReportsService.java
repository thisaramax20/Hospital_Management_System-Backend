package edu.icet.service;

import edu.icet.dto.MedicalReport;

import java.util.List;

public interface MedicalReportsService {
    void addMedicalReport(MedicalReport medicalReport);
    List<MedicalReport> getAll();
    void deleteById(Integer id);
    List<MedicalReport> getByCategory(String category);
    List<MedicalReport> getByAdminID(Integer id);
    List<MedicalReport> getByLabId(Integer id);
    List<MedicalReport> getByPatientId(Integer id);
}
