package com.DvFabricio.TicketSales.domain.autenticacao.repository;

import com.DvFabricio.TicketSales.domain.autenticacao.entity.PerfilAcesso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilAcessoRepository extends JpaRepository<PerfilAcesso, Long> {

    PerfilAcesso findByNome(String nome);

}
