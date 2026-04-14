package com.portfolio.agendamento.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;


public record AgendamentoRequestDTO(
    
    @NotBlank(message = "O nome do cliente é obrigatório.")
    String nomeCliente,
    
    @NotBlank(message = "O serviço é obrigatório.")
    String servico,
    
    @NotNull(message = "A data e hora são obrigatórias.")
    @Future(message = "O agendamento deve ser feito para uma data futura.")
    LocalDateTime dataHora
) {
}