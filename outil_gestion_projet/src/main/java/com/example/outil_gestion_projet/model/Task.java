package com.example.outil_gestion_projet.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "task")
public class Task implements Serializable {
    @Id
    private long id;
    @Column(nullable = false, length = 255)
    private String title;
    @Column(nullable = false)
    private LocalDateTime startDate;
    @Column(nullable = false)
    private LocalDateTime endDate;
    @ManyToOne
    private Project project;
    @ManyToOne
    private Status status;

}
