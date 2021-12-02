package com.devsuperior.dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Marcelo Rezende dos Santos", "09432677856", 6.456, Instant.now(), 2));
		list.add(new Client(2L, "João Carlos Ribeiro", "12432677854", 12.456, Instant.now(), 1));
		list.add(new Client(3L, "Maria Betania Rosa", "09432673487", 3.456, Instant.now(), 4));
		return ResponseEntity.ok().body(list);
	}

}
