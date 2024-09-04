package com.DvFabricio.TicketSales.domain.evento.repository;

import com.DvFabricio.TicketSales.domain.autenticacao.entity.Usuario;
import com.DvFabricio.TicketSales.domain.evento.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {

    List<Compra> findAllByUsuario(Usuario usuario);

}
