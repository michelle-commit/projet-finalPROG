package com.example.outil_gestion_projet.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "\"project\"")
public class Project implements Serializable {
    @Id
    @Column(nullable = false, name = "id_project")
    private long id;
    @Column(nullable = false,length = 25)
    private String name;
    @Column(nullable = false)
    private LocalDateTime start_end;
    @Column(nullable = false)
    private LocalDateTime end_end;

}
