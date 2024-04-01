package com.example.hospital.service;

import com.example.hospital.entities.Consultation;
import com.example.hospital.entities.Medecin;
import com.example.hospital.entities.Patient;
import com.example.hospital.entities.RendezVous;
import com.example.hospital.repositories.PatientRepository;
import com.example.hospital.repositories.ConsultationRepository;
import com.example.hospital.repositories.RendezvousRepository;
import com.example.hospital.repositories.MedecinRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class HospitalServiceImpl implements IHospitalService {


    private PatientRepository patientRepository;
    private ConsultationRepository consultationRepository;
    private MedecinRepository medecinRepository;
    private RendezvousRepository rendezvousRepository;
    @Override
    public Medecin addMedecin(Medecin medecin) {

        return medecinRepository.save(medecin);
    }

    @Override
    public Patient addPatient(Patient patient) {

        return patientRepository.save(patient);
    }

    @Override
    public RendezVous addRendezVous(RendezVous rendezVous) {

        rendezVous.setId(UUID.randomUUID().toString());
        return rendezvousRepository.save(rendezVous);
    }

    @Override
    public Consultation addConsultation(Consultation consultation) {

        return consultationRepository.save(consultation);
    }
}
