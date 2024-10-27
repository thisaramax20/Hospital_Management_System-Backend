package edu.icet.controller;

import edu.icet.dto.MedicalReport;
import edu.icet.service.MedicalReportsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/medical-reports")
@RequiredArgsConstructor
public class MedicalReportsController {
    private final MedicalReportsService medicalReportsService;

    @PostMapping("/save")
    public void addMedicalReport(@RequestBody MedicalReport medicalReport){
        medicalReportsService.addMedicalReport(medicalReport);
    }

    @GetMapping("/get-all")
    public List<MedicalReport> getAll(){
        return medicalReportsService.getAll();
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteById(@PathVariable Integer id){
        medicalReportsService.deleteById(id);
    }

    @GetMapping("/get-by-category/{category}")
    public List<MedicalReport> getByCategory(@PathVariable String category){
        return medicalReportsService.getByCategory(category);
    }

    @GetMapping("/get-by-patient-id/{id}")
    public List<MedicalReport> getByPatientId(@PathVariable Integer id){
        return medicalReportsService.getByPatientId(id);
    }

    @GetMapping("/get-by-admin-id/{id}")
    public List<MedicalReport> getByAdminId(@PathVariable Integer id){
        return medicalReportsService.getByAdminID(id);
    }

    @GetMapping("/get-by-lab-id/{id}")
    public List<MedicalReport> getByLabId(@PathVariable Integer id){
        return medicalReportsService.getByLabId(id);
    }

}
