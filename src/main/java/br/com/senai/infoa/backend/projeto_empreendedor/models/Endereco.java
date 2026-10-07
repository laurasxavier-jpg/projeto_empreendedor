package br.com.senai.infoa.backend.projeto_empreendedor.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name="Endereco")
public class Endereco {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="cep")
    private String cep;

    @Column(name="numero")
    private String numero;

    @Column(name="logradouro")
    private String logradouro;

    @ManyToOne 
    @JoinColumn(name="Empreendedor")
    private Empreendedor empreendedor;

    
    public Endereco() {
    }


    public Endereco(Integer id, String cep, String numero, String logradouro) {
        this.id = id;
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getCep() {
        return cep;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getLogradouro() {
        return logradouro;
    }


    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}

