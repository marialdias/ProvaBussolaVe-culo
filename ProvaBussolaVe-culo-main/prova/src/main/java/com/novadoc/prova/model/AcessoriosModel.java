package com.novadoc.prova.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "/acessorios")
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
    @JoinColumn(name = "veiculo_id")

    private AcessoriosModel acessoriosModel;



}
