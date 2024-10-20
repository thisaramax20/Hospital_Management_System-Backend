package edu.icet.controller;

import edu.icet.dto.Patient;
import edu.icet.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patient")
public class PatientController {
    private final PatientService patientService;

    @GetMapping("/get-all")
    public List<Patient> getPatient(){
        return patientService.getAll();
    }

    @PostMapping("/add-patient")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable Integer id){
        patientService.deleteById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updatePatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
    }

    @GetMapping("/get-by-name/{name}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getByName(@PathVariable String name){
        return patientService.getByName(name);
    }

    @GetMapping("get-by-address/{address}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getByAddress(@PathVariable String address){
        return patientService.getByAddress(address);
    }

    @GetMapping("get-by-nic/{nic}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getByNic(@PathVariable String nic){
        return patientService.getByNic(nic);
    }

    @GetMapping("get-by-bloodGroup/{bloodGroup}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getByBloodGroup(@PathVariable String bloodGroup){
        return patientService.getByBloodGroup(bloodGroup);
    }

    @GetMapping("get-by-category/{category}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getByCategory(@PathVariable String category){
        return patientService.getByCategory(category);
    }

    @GetMapping("get-by-gender/{gender}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getByGender(@PathVariable String gender){
        return patientService.getByGender(gender);
    }

}
