package com.example.hospital;

import com.example.hospital.entities.*;
import com.example.hospital.repositories.ConsultationRepository;
import com.example.hospital.repositories.RendezvousRepository;
import com.example.hospital.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication {

    public static void main(String[] args) {

        SpringApplication.run(HospitalApplication.class, args);
    }@Bean
    CommandLineRunner start(IHospitalService hospitalService, ConsultationRepository consultationRepository, RendezvousRepository rendezvousRepository)
    {
        return args -> {
            RendezVous rendezVous = new RendezVous();



            Consultation consultation = new Consultation();
            consultation.setRapport("Le rapport");
            consultation.setDateConsultation(new Date());
            consultation.setRendezVous(rendezvousRepository.findById("2e2ddb62-0b2b-43cb-a4b7-5c6926890aa1").get());


            Medecin medecin = new Medecin();
            medecin.setNom("aymene hachidi");
            medecin.setEmail(medecin.getNom()+"gmail.com");
            medecin.setSpecialite("Chirurgien");

            Patient patient = new Patient();
            patient.setNom("aymene patient");
            patient.setMalade(true);
            patient.setDateNaissance(new Date());

            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setPatient(patient);
            rendezVous.setMedecin(medecin);
            rendezVous.setConsultation(consultationRepository.findById(Long.valueOf(1)).get());


            hospitalService.addMedecin(medecin);
            hospitalService.addPatient(patient);
            hospitalService.addConsultation(consultation);
            hospitalService.addRendezVous(rendezVous);



        };
    }

}
