package com.example.hospital.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class RendezVous {
@Id
    private String id;
    private Date date;
    @Enumerated(EnumType.STRING)
    private StatusRDV status;
    @ManyToOne
    @JsonIgnore
    private Patient patient;
    @JsonIgnore
    @ManyToOne
    private Medecin medecin;
    @OneToOne(mappedBy = "rendezVous",fetch = FetchType.LAZY)
    private Consultation consultation;
}
