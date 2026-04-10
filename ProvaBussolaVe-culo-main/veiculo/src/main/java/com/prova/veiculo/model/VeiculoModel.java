package com.prova.veiculo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "veiculo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VeiculoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String modelo;
    private Integer anoFabricacao;
    private String placa;


    @OneToMany(
            mappedBy = "AcessoriosModel",
    cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<VeiculoModel> veiculos = new ArrayList<>();
}
