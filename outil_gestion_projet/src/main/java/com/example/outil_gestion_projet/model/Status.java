package com.example.outil_gestion_projet.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table
public class Status implements Serializable {
    @Id
    @Column(nullable = false)
    private long id;
    @Column(nullable = false,length = 255)
    private String name;
}
