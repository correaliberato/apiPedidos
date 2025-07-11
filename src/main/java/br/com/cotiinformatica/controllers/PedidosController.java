package br.com.cotiinformatica.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/V1/pedidos")
@Tag(
		name = "Controle de pedidos.",
		description = "Serviços para gerenciamento de solicitiações de pedidos."
	)

public class PedidosController {
	
	@Operation(
			summary = "Cria um novo pedido - summary",
			description = "Cria um novo pedido - description")
	@PostMapping
	public ResponseEntity<?> post() {
		// TODO: Implementar a criação do pedido
		return ResponseEntity.ok().build();
	}

	@Operation(
			summary = "Atualiza um novo pedido - summary",
			description = "Atualiza um novo pedido - description")
	@PutMapping
	public ResponseEntity<?> put() {
		// TODO: Implementar a alteração do pedido
		return ResponseEntity.ok().build();
	}
	
	@Operation(
			summary = "Delete um novo pedido - summary",
			description = "Delete um novo pedido - description")
	@DeleteMapping
	public ResponseEntity<?> delete() {
		// TODO: Implementar a exclusão do pedido
		return ResponseEntity.ok().build();
	}
	
	@Operation(
			summary = "Consultas um novo pedido - summary",
			description = "Consulta um novo pedido - description")
	@GetMapping
	public ResponseEntity<?> get() {
		// TODO: Implementar a consulta do pedidos
		return ResponseEntity.ok().build();
	}

}
