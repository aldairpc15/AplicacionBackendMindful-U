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
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;
    @Column(name = "hora", nullable = false)
    private Time hora;
    @Column(name = "tipo_cita",length = 50, nullable = false)
    private String tipo_cita;
    @Column(name = "estado",length = 50, nullable = false)
    private String estado;
    @Column(name = "pago", nullable = false)
    private int pago;
    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
