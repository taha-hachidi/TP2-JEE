package com.example.hospital.service;

import com.example.hospital.entities.Consultation;
import com.example.hospital.entities.Medecin;
import com.example.hospital.entities.Patient;
import com.example.hospital.entities.RendezVous;

public interface IHospitalService {

    Medecin addMedecin(Medecin medecin);
    Patient addPatient(Patient patient);
    RendezVous addRendezVous(RendezVous rendezVous);
    Consultation addConsultation(Consultation consultation);
}
