package com.novadoc.prova.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "/veiculo")
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
            mappedBy = "/acessorios",
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<VeiculoModel> veiculos = new ArrayList<>();
}
