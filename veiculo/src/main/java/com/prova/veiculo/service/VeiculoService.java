package com.prova.veiculo.service;

import com.prova.veiculo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo saveVeiculo(Veiculo veiculo){
        return VeiculoRepository.save(veiculos);
    }
    public VeiculosModel<veiculos> findCustomerById(Long id){
        return VeiculosRepository.findById(id);
    }
 }
