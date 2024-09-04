package com.DvFabricio.TicketSales.domain.email;


public interface EnviadorDeEmail {

    void enviar(String destinatario, String assunto, String mensagem);

}
