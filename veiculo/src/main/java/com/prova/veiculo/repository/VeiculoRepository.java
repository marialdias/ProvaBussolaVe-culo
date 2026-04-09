package com.prova.veiculo.repository;

import com.prova.veiculo.model.VeiculoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<VeiculoModel, Long> {
}
