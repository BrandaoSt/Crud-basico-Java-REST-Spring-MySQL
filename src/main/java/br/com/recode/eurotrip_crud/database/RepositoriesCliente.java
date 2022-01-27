package br.com.recode.eurotrip_crud.database;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.recode.eurotrip_crud.entidade.Cliente;

public interface RepositoriesCliente extends JpaRepository<Cliente, Long> {
    
}
