package com.upc.trabajotf.projectbienestarcompany.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "usuario", length = 50, nullable = false, unique = true )
    private String usuario_name;

    @Column(name = "contrasena", length = 200, nullable = false )
    private String contrasena;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "correo", length = 50, nullable = false )
    private String correo;

    private Boolean enabled;

    @ManyToOne
    @JoinColumn(name = "id_Rol")
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "id_Grupo_Apoyo")
    private Grupo_Apoyo grupoApoyo;

    @ManyToOne
    @JoinColumn(name = "id_Tratamiento")
    private Tratamiento tratamiento;
}
