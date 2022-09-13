package com.algawork.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algawork.api.domain.modal.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
