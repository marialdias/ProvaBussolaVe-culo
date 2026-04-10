package com.novadoc.prova.controller;

import com.novadoc.prova.model.AcessoriosModel;
import com.novadoc.prova.service.AcessoriosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acessorios")
public class AcessoriosController {

    @Autowired
    private AcessoriosService acessoriosService;

    @PostMapping
    public AcessoriosModel create(@RequestBody AcessoriosModel acessoriosModel){
        return acessoriosService.create(acessoriosModel);
    }

    private AcessoriosModel AcessoriosService(AcessoriosModel acessoriosModel) {
        return null;
    }

    @GetMapping
    public List<AcessoriosModel> getAll(){
        return acessoriosService.getAll();
    }

    @GetMapping("/{id}")
    public AcessoriosModel getById(@PathVariable Long id){
        return acessoriosService.getById(id);
    }

    @PutMapping("/{id}")
    public AcessoriosModel update(@PathVariable Long id, @RequestBody AcessoriosModel acessoriosModel
    ){
        return acessoriosService.update(id, acessoriosModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        AcessoriosService.delete(id);
    }
}