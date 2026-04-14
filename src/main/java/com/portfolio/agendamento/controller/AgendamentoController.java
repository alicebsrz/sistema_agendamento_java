package com.portfolio.agendamento.controller;


import com.portfolio.agendamento.model.Agendamento;
import com.portfolio.agendamento.service.AgendamentoService;
import com.portfolio.agendamento.dto.AgendamentoRequestDTO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") // Isso libera o acesso para o nosso Front-end!
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

    private final AgendamentoService service;

    public AgendamentoController(AgendamentoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> criarAgendamento(@jakarta.validation.Valid @RequestBody AgendamentoRequestDTO dto) {
        try {
            Agendamento novoAgendamento = service.salvar(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(novoAgendamento);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<List<Agendamento>> listarAgendamentos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarUm(@PathVariable Long id) {
        try {
            Agendamento agendamento = service.buscarPorId(id);
            return ResponseEntity.ok(agendamento);
        } catch (IllegalArgumentException e) {
            // Se não achar, devolve o erro 404 Not Found com a nossa mensagem
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarAgendamento(@PathVariable Long id) {
        try {
            service.deletar(id);
            // Retorna o status 204 (No Content), que é o padrão da web para "Deletado com sucesso"
            return ResponseEntity.noContent().build(); 
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}