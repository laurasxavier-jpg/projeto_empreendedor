package br.com.senai.infoa.backend.projeto_empreendedor.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity 
@Table(name="Produto")
public class Produto {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="dataFabricacao")
    private String dataFabricacao;

    @Column(name="preco")
    private Double preco;

    @ManyToMany 
    @JoinTable(
        name="Empreendedor_Produto",
        joinColumns=@JoinColumn(name="Empreendedor_id", referencedColumnName="id"),
        inverseJoinColumns=@JoinColumn(name="Produto_id", referencedColumnName="id")
    )

    private List<Empreendedor> empreendedores;
    

    
    public Produto() {
    }


    public Produto(Integer id, String nome, String dataFabricacao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.dataFabricacao = dataFabricacao;
        this.preco = preco;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDataFabricacao() {
        return dataFabricacao;
    }


    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }


    public Double getPreco() {
        return preco;
    }


    public void setPreco(Double preco) {
        this.preco = preco;
    }

}