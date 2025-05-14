package br.com.unicuritiba.repository;

import br.com.unicuritiba.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
