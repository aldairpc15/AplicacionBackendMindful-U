package com.upc.trabajotf.projectbienestarcompany.dtos;

import com.upc.trabajotf.projectbienestarcompany.entities.Grupo_Apoyo;
import com.upc.trabajotf.projectbienestarcompany.entities.Rol;
import com.upc.trabajotf.projectbienestarcompany.entities.Tratamiento;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UsuarioDTO {

    private int id;

    private String usuario;

    private String contrasena;

    private String nombre;

    private String apellido;

    private int edad;

    private String correo;

    private Boolean enabled;

    private Rol rol;

    private Grupo_Apoyo grupoApoyo;

    private Tratamiento tratamiento;
}
