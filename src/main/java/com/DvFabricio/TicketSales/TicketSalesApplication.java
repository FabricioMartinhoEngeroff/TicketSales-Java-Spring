package com.DvFabricio.TicketSales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan(basePackages = {"com.DvFabricio.TicketSales"})
@EnableAsync
@EnableCaching
public class TicketSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketSalesApplication.class, args);
	}

}
