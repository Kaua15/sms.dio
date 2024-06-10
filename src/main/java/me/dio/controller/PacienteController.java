package me.dio.controller;

import me.dio.domain.model.Paciente;
import me.dio.service.PacienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteService pacienteService;
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> findById(@PathVariable Long id) {
        var paciente = pacienteService.findById(id);
        return ResponseEntity.ok(paciente);
    }

    @PostMapping
    public ResponseEntity<Paciente> inserir(@RequestBody Paciente p) {
        var pac = pacienteService.inserir(p);
        return ResponseEntity.ok(pac);
    }


}
