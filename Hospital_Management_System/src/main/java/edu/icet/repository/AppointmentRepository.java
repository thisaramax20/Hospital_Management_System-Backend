package edu.icet.repository;

import edu.icet.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
    List<Appointment> findByType(String type);
    List<Appointment> findByAdminId(Integer id);
    List<Appointment> findByRoomNumber(Integer roomNumber);
    Appointment findByPatientId(Integer id);
}
