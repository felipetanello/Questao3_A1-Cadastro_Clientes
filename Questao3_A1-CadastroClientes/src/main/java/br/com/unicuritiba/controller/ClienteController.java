package br.com.unicuritiba.controller;

import br.com.unicuritiba.model.Cliente;
import br.com.unicuritiba.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@Valid @RequestBody Cliente cliente) {
        Cliente clienteSalvo = clienteRepository.save(cliente);
        return new ResponseEntity<>(clienteSalvo, HttpStatus.CREATED);
    }
}

