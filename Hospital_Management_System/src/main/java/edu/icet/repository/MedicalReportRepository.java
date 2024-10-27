package edu.icet.repository;

import edu.icet.entity.MedicalReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicalReportRepository extends JpaRepository<MedicalReport,Integer> {
    List<MedicalReport> findByCategory(String category);
    List<MedicalReport> findByAdminId(Integer id);
    List<MedicalReport> findByLabId(Integer id);
    List<MedicalReport> findByPatientId(Integer id);
}
