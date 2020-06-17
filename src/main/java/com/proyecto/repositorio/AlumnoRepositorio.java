package com.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.entidad.Alumno;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Integer> {

	

}
