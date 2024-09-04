package com.DvFabricio.TicketSales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.DvFabricio.TicketSales"})
public class TicketSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketSalesApplication.class, args);
	}

}
