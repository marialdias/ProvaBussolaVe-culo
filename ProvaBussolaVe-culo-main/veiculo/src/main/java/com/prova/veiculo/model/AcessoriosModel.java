package com.prova.veiculo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "acessorios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AcessoriosModel {
    @Id
    @Column(name = "acessorios_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String  pneu;
    private String retrovisor;
    private String parabrisa;
    private String parachoque;
    private String tapete;
    private String radio;
    private String cinto;


    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "acessorios_id")

    private AcessoriosModel acessoriosModel;



}
