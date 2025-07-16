package com.FortSolutions.CadastroDeNinjas.Missoes;


import com.FortSolutions.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tabela_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldade;
    private NinjaModel ninja;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;




}