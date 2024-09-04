package com.DvFabricio.TicketSales.domain.evento.vo;

import com.DvFabricio.TicketSales.domain.evento.entity.Ingresso;

import java.math.BigDecimal;

public record DadosIngressoCompra(String codigo, String descricao, BigDecimal preco, TipoIngresso tipo) {

    public DadosIngressoCompra(Ingresso ingresso) {
        this(ingresso.getCodigo(), ingresso.getDescricao(), ingresso.getPreco(), ingresso.getTipo());
    }

}
