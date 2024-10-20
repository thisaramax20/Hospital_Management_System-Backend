package edu.icet.controller;

import edu.icet.dto.Appointment;
import edu.icet.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor
@Slf4j
public class AppointmentController {
    private final AppointmentService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAppointment(@RequestBody Appointment appointment){
        log.info(appointment.toString());
        service.addAppointment(appointment);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAppointment(@RequestBody Appointment appointment){
        service.addAppointment(appointment);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteAppointment(@PathVariable Integer id){
        return service.deleteAppointment(id);
    }

    @GetMapping("/get-all")
    public List<Appointment> getAll(){
        return service.getAll();
    }

    @GetMapping("/get-by-id/{id}")
    public Appointment getById(@PathVariable Integer id){
        return service.getById(id);
    }

    @GetMapping("/get-by-type/{type}")
    public List<Appointment> getByType(@PathVariable String type){
        return service.getByType(type);
    }

    @GetMapping("/get-by-room-number/{id}")
    public List<Appointment> getByRoomNumber(@PathVariable Integer id){
        return service.getByRoomNumber(id);
    }

    @GetMapping("get-by-adminId/{id}")
    public List<Appointment> getByAdminId(@PathVariable Integer id){
        return service.getByAdminId(id);
    }
}
