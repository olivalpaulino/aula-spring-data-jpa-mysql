package br.com.olival.aulaspringdatajpamysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.olival.aulaspringdatajpamysql.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
