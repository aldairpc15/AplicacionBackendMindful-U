package com.upc.trabajotf.projectbienestarcompany.controller;

import com.upc.trabajotf.projectbienestarcompany.dtos.UsuarioDTO;
import com.upc.trabajotf.projectbienestarcompany.entities.Usuario;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.UsuarioServiceInterfaces;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceInterfaces usuarioServiceInterfaces;

    //Listar Usuario
    @GetMapping
    public List<UsuarioDTO> obtenerUsuarios(){

        return usuarioServiceInterfaces.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    //Registrar Usuario
    @PostMapping
    public void registrar(@RequestBody UsuarioDTO usuarioDTO){
        ModelMapper m = new ModelMapper();
        Usuario usuario = m.map(usuarioDTO, Usuario.class);
        usuarioServiceInterfaces.registrar(usuario);
    }

    //Listar por Id Usuario
    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        UsuarioDTO usuarioDTO=m.map(usuarioServiceInterfaces.listarId(id),UsuarioDTO.class);
        return usuarioDTO;
    }

    //Actualizar Usuario
    @PutMapping
    public void actualizar(@RequestBody UsuarioDTO usuarioDTO){
        ModelMapper m=new ModelMapper();
        Usuario usuario=m.map(usuarioDTO,Usuario.class);
        usuarioServiceInterfaces.actualizar(usuario);
    }

    //Eliminar Usuario
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        usuarioServiceInterfaces.eliminar(id);
    }
}
