
package com.portfolio.agendamento.service;

import com.portfolio.agendamento.model.Agendamento;
import com.portfolio.agendamento.repository.AgendamentoRepository;
import com.portfolio.agendamento.dto.AgendamentoRequestDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;

    public AgendamentoService(AgendamentoRepository repository) {
        this.repository = repository;
    }

    public Agendamento salvar(AgendamentoRequestDTO dto) {
        // 1. Verifica se o horário já existe usando a data que veio do DTO
        if (repository.existsByDataHora(dto.dataHora())) {
            throw new IllegalArgumentException("Este horário já está ocupado.");
        }

        // 2. Transforma o DTO em uma Entidade
        Agendamento agendamento = new Agendamento();
        agendamento.setNomeCliente(dto.nomeCliente());
        agendamento.setServico(dto.servico());
        agendamento.setDataHora(dto.dataHora());

        // 3. Salva a Entidade no banco de dados
        return repository.save(agendamento);
    }

    public List<Agendamento> listarTodos() {
        return repository.findAll();
    }

    public Agendamento buscarPorId(Long id) {
        // Vai no banco procurar o ID. Se não achar, lança um erro avisando.
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Agendamento não encontrado."));
    }

    public void deletar(Long id) {
        // Primeiro, usa o método acima para ver se o agendamento existe.
        Agendamento agendamento = buscarPorId(id);
        // Se existir, manda o banco deletar.
        repository.delete(agendamento);
    }
}
