package com.example.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue
    public Integer id;

    @Column
    public String name;
    @Column
    public String email;
    @Column
    public String password;



    @ManyToMany
    public List<Role>roles;


}
