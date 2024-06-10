package me.dio.service.impl;

import me.dio.domain.model.Paciente;
import me.dio.domain.repository.PacienteRepository;
import me.dio.service.PacienteService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PacienteServiceImpl implements PacienteService {

    private PacienteRepository pacienteRepository;


    public PacienteServiceImpl(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public Paciente inserir(Paciente paciente){
        Paciente p = pacienteRepository.save(paciente);
        return p;
    }

    @Override
    public Paciente findById(Long id) { return pacienteRepository.findById(id).orElseThrow(NoSuchElementException::new); }

}
