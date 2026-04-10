package com.novadoc.prova.service;

import com.novadoc.prova.model.VeiculoModel;
import com.novadoc.prova.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public VeiculoModel create(VeiculoModel veiculoModel){
        return veiculoRepository.save(veiculoModel);
    }

    public List<VeiculoModel> getAll(){
        return veiculoRepository.findAll();
    }

    public VeiculoModel getById(Long id){
        return veiculoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veiculo não encontrado"));
    }

    public VeiculoModel update(Long id, VeiculoModel veiculoAtualizado){
        VeiculoModel veiculo = getById(id);

        veiculo.setModelo(veiculoAtualizado.getModelo());
        veiculo.setPlaca(veiculoAtualizado.getPlaca());
        veiculo.setAnoFabricacao(veiculoAtualizado.getAnoFabricacao());

        return veiculoRepository.save(veiculo);
    }

    public void delete(Long id){
        veiculoRepository.deleteById(id);
    }
}