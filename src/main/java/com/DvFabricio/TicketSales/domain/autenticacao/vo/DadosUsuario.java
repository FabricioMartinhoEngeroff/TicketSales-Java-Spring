package com.DvFabricio.TicketSales.domain.autenticacao.vo;

import com.DvFabricio.TicketSales.domain.autenticacao.entity.Usuario;

import java.time.LocalDate;

public record DadosUsuario(Long id, String nome, String cpf, String email, LocalDate dataNascimento) {

    public DadosUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getCpf(), usuario.getEmail(), usuario.getDataNascimento());
    }

}
