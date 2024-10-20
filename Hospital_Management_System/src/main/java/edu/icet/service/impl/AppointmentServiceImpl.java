package edu.icet.service.impl;

import edu.icet.dto.Appointment;
import edu.icet.repository.AppointmentRepository;
import edu.icet.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addAppointment(Appointment appointment) {
        repository.save(mapper.map(appointment,edu.icet.entity.Appointment.class));
    }

    @Override
    public Boolean deleteAppointment(Integer id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<Appointment> getAll() {
        List<edu.icet.entity.Appointment> all = repository.findAll();
        ArrayList<Appointment> appointments = new ArrayList<>();
        all.forEach(appointment -> appointments.add(mapper.map(appointment, Appointment.class)));
        return appointments;
    }

    @Override
    public Appointment getById(Integer id) {
        return mapper.map(repository.findById(id), Appointment.class);
    }

    @Override
    public List<Appointment> getByType(String type) {
        List<edu.icet.entity.Appointment> byType = repository.findByType(type);
        ArrayList<Appointment> appointments = new ArrayList<>();
        byType.forEach(appointment -> appointments.add(mapper.map(appointment, Appointment.class)));
        return appointments;
    }

    @Override
    public List<Appointment> getByAdminId(Integer id) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        repository.findByAdminId(id).forEach(appointment -> appointments.add(mapper.map(appointment,Appointment.class)));
        return appointments;
    }

    @Override
    public List<Appointment> getByRoomNumber(Integer id) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        repository.findByRoomNumber(id).forEach(appointment -> appointments.add(mapper.map(appointment,Appointment.class)));
        return appointments;
    }
}
