package com.FortSolutions.CadastroDeNinjas.Ninjas;


import com.FortSolutions.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//Annotation serve para tranformar uma classe em entidade, para dps ir como tabela pro banco de dados
@Entity
@Table(name = "tabela_cadastro_ninja")

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
    private List<MissoesModel> missoes;
        //CONSTRUTOR VAZIO
    public NinjaModel() {
    }
        //CONSTRUTOR CHEIO
    public NinjaModel(String email, int idade, String nome) {
        this.email = email;
        this.idade = idade;
        this.nome = nome;
    }

    //GETTER E SETTER
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}
