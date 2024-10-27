package edu.icet.service.impl;

import edu.icet.dto.MedicalReport;
import edu.icet.repository.MedicalReportRepository;
import edu.icet.service.MedicalReportsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalReportsServiceImpl implements MedicalReportsService {
    private final MedicalReportRepository medicalReportRepository;
    private final ModelMapper mapper;

    @Override
    public void addMedicalReport(MedicalReport medicalReport) {
        medicalReportRepository.save(mapper.map(medicalReport,edu.icet.entity.MedicalReport.class));
    }

    @Override
    public List<MedicalReport> getAll() {
        ArrayList<MedicalReport> medicalReports = new ArrayList<>();
        medicalReportRepository.findAll().forEach(medicalReport -> medicalReports.add(mapper.
                map(medicalReport, MedicalReport.class)));
        return medicalReports;
    }

    @Override
    public void deleteById(Integer id) {
        medicalReportRepository.deleteById(id);
    }

    @Override
    public List<MedicalReport> getByCategory(String category) {
        ArrayList<MedicalReport> medicalReports = new ArrayList<>();
        medicalReportRepository.findByCategory(category).forEach(medicalReport -> medicalReports.add(mapper.
                map(medicalReport, MedicalReport.class)));
        return medicalReports;

    }

    @Override
    public List<MedicalReport> getByAdminID(Integer id) {
        ArrayList<MedicalReport> medicalReports = new ArrayList<>();
        medicalReportRepository.findByAdminId(id).forEach(medicalReport -> medicalReports.add(mapper.
                map(medicalReport, MedicalReport.class)));
        return medicalReports;
    }

    @Override
    public List<MedicalReport> getByLabId(Integer id) {
        ArrayList<MedicalReport> medicalReports = new ArrayList<>();
        medicalReportRepository.findByLabId(id).forEach(medicalReport -> medicalReports.add(mapper.
                map(medicalReport, MedicalReport.class)));
        return medicalReports;
    }

    @Override
    public List<MedicalReport> getByPatientId(Integer id) {
        ArrayList<MedicalReport> medicalReports = new ArrayList<>();
        medicalReportRepository.findByPatientId(id).forEach(medicalReport -> medicalReports.add(mapper.
                map(medicalReport, MedicalReport.class)));
        return medicalReports;
    }
}
