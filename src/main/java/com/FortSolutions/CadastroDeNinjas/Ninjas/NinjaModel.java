package com.FortSolutions.CadastroDeNinjas.Ninjas;


import com.FortSolutions.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Annotation serve para tranformar uma classe em entidade, para dps ir como tabela pro banco de dados
@Entity
@Table(name = "tabela_cadastro_ninja")
//CRIA AUTOMATICAMENTE UM CONSTRUTOR VAZIO
@NoArgsConstructor
//CRIA AUTOMATICAMENTE UM CONSTRUTOR COM TODOS OS ATRIBUTOS SETADOS
@AllArgsConstructor
//CRIA AUTOMATICAMENTE UM GETTER E UM SETTER PARA TODOS OS ATRIBUTOS
@Data
//CLASSE
public class NinjaModel {
    //ESSAS 2 ANOTACOES SERVEM PARA INCREMENTAR O ID NO BANCO DE DADOS AUTOMATICAMENTE
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    //AS 2 JUNTAS PARA FAZER A MESMA COISA, VARIAVEL MAIS PROXIMA RECEBE A FUNCAO
    private Long id;
    private String nome;
    private String email;
    private int idade;
    //@ManyToOne Um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;





}
