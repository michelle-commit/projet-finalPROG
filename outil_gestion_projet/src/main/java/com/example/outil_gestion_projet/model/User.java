package com.example.outil_gestion_projet.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name="\"user\"")
public class User implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String lastname;

        @Column(nullable = false)
        private String firstname;

        @Column(nullable = false)
        private String password;
        @Column(nullable = false)
        private String email;
        @ManyToOne
        private Role role;
        @ManyToOne
        private Task task;


    }


