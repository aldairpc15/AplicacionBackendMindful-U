package com.upc.trabajotf.projectbienestarcompany.serviceinterfaces;

import com.upc.trabajotf.projectbienestarcompany.entities.Usuario;

import java.util.List;

public interface UsuarioServiceInterfaces {

    //Listar Usuario
    public List<Usuario> listar();

    //Registrar Usuario
    public Usuario registrar (Usuario usuario);

    //Listar por Id Usuario
    public Usuario listarId(int id);

    //Actualizar Usuario
    public void actualizar(Usuario usuario);

    //Eliminar Usuario
    public void  eliminar(int id);
}
