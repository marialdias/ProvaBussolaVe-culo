package com.novadoc.prova.controller;

import com.novadoc.prova.model.VeiculoModel;
import com.novadoc.prova.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public VeiculoModel create(@RequestBody VeiculoModel veiculoModel){
        return veiculoService(veiculoModel);
    }

    private VeiculoModel veiculoService(VeiculoModel veiculoModel) {
        return null;
    }

    @GetMapping
    public List<VeiculoModel> getAll(){
        return veiculoService.getAll();
    }

    @GetMapping("/{id}")
    public VeiculoModel getById(@PathVariable Long id){
        return veiculoService.getById(id);
    }

    @PutMapping("/{id}")
    public VeiculoModel update(@PathVariable Long id, @RequestBody VeiculoModel veiculoModel){
        return veiculoService.update(id, veiculoModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        veiculoService.delete(id);
    }
}