package me.dio.service;

import me.dio.domain.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface PacienteService {
    Paciente inserir(Paciente paciente);
    Paciente findById(Long id);
}
