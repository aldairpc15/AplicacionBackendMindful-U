package com.upc.trabajotf.projectbienestarcompany.dtos;

import com.upc.trabajotf.projectbienestarcompany.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDate;

@Getter
@Setter
public class Boton_SosDTO {

    private int id;

    private String descripcion;

    private LocalDate fecha;

    private Time hora;

    private String motivo;

    private Usuario usuario;
}
