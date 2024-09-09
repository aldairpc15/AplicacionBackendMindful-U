package com.upc.trabajotf.projectbienestarcompany.repositories;

import com.upc.trabajotf.projectbienestarcompany.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,Integer> {
}
