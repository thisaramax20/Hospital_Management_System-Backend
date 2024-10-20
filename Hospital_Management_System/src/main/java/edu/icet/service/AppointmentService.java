package edu.icet.service;

import edu.icet.dto.Appointment;

import java.util.List;

public interface AppointmentService {
    void addAppointment(Appointment appointment);

    Boolean deleteAppointment(Integer id);

    List<Appointment> getAll();

    Appointment getById(Integer id);

    List<Appointment> getByType(String type);

    List<Appointment> getByAdminId(Integer id);

    List<Appointment> getByRoomNumber(Integer id);
}
