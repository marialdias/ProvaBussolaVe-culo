package com.novadoc.prova.service;

import com.novadoc.prova.model.AcessoriosModel;
import com.novadoc.prova.repository.AcessoriosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcessoriosService {

    @Autowired
    private static AcessoriosRepository acessoriosRepository;

    public AcessoriosModel create(AcessoriosModel acessoriosModel){
        return acessoriosRepository.save(acessoriosModel);
    }

    public List<AcessoriosModel> getAll(){
        return acessoriosRepository.findAll();
    }

    public AcessoriosModel getById(Long id){
        return acessoriosRepository.findById(id).orElseThrow(() -> new RuntimeException("Veiculo não encontrado"));
    }

    public AcessoriosModel update(Long id, AcessoriosModel acessorioAtualizado){
        AcessoriosModel acessorios = getById(id);

        acessorios.setParabrisa(acessorioAtualizado.getParabrisa());
        acessorios.setCinto(acessorioAtualizado.getCinto());
        acessorios.setPneu(acessorioAtualizado.getPneu());
        acessorios.setParachoque(acessorioAtualizado.getParachoque());
        acessorios.setRadio(acessorioAtualizado.getRadio());
        acessorios.setRetrovisor(acessorioAtualizado.getRetrovisor());
        acessorios.setTapete(acessorioAtualizado.getTapete());

        return acessorios;
    }
   

    public static void delete(Long id){
        acessoriosRepository.deleteById(id);
    }
}
