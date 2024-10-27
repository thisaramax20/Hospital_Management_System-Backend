package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MedicalReport {
    private Integer id;
    private String category;
    private String pdfSrc;
    private LocalDate localDate;
    private Integer patientId;
    private Integer adminId;
    private Integer labId;
}
