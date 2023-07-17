package com.chinhosoft.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chinhosoft.crud.models.Usuario;

@Repository
public interface UsaurioRepository extends JpaRepository<Usuario, Integer>{

}
