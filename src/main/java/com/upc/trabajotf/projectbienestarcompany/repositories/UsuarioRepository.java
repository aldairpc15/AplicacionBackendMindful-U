package com.upc.trabajotf.projectbienestarcompany.repositories;

import com.upc.trabajotf.projectbienestarcompany.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
