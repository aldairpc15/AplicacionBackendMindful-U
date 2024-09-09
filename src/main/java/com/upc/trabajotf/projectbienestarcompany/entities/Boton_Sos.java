package com.upc.trabajotf.projectbienestarcompany.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Boton_Sos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descripcion", length = 50, nullable = false)
    private String descripcion;

    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;

    @Column(name = "hora", nullable = false)
    private Time hora;

    @Column(name = "motivo", length = 100, nullable = false)
    private String motivo;

    @ManyToOne
    @JoinColumn(name = "id_Usuario")
    private Usuario usuario;
}
