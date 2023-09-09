package com.pedro.demo.repository;


import com.pedro.demo.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
}
