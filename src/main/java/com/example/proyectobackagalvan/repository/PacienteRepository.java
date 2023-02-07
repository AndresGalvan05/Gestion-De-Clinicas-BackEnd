package com.example.proyectobackagalvan.repository;

import com.example.proyectobackagalvan.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Optional<Paciente> findByEmail(String email);
    List<Paciente> findAllByNombreAndApellido(String nombre, String apellido);
}
