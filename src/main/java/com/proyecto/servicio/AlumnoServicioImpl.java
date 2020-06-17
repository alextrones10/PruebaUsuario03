package com.proyecto.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entidad.Alumno;
import com.proyecto.repositorio.AlumnoRepositorio;

@Service
public class AlumnoServicioImpl implements AlumnoServicio{

	@Autowired
	private AlumnoRepositorio repositorio; 
	
	@Override
	public Alumno insertaActualizaAlumno(Alumno obj) {
		return repositorio.save(obj);
	}

	@Override
	public Optional<Alumno> buscarAlumnoPorId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public void eliminaAlumno(int idAlumno) {
		repositorio.deleteById(idAlumno);
	}

	@Override
	public List<Alumno> listaAlumno() {
		return repositorio.findAll();
	}

	

}


