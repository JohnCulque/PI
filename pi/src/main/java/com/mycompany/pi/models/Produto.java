/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi.models;

import com.mycompany.pi.utils.Categoria;

/**
 *
 * @author igor
 */
public class Produto {
    
    private int id_produto;
    private int estoque;
    private String nome;
    private Categoria categoria;
    private double valor_unitario;
    private String descricao;

    public Produto(int id_produto, int estoque, String nome, Categoria categoria, double valor_unitario, String descricao) {
        this.id_produto = id_produto;
        this.estoque = estoque;
        this.nome = nome;
        this.categoria = categoria;
        this.valor_unitario = valor_unitario;
        this.descricao = descricao;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
