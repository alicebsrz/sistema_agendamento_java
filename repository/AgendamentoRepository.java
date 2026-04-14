package com.portfolio.agendamento.repository;

import com.portfolio.agendamento.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    
    boolean existsByDataHora(LocalDateTime dataHora);
}