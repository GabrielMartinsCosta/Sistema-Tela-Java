/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja;

/**
 *
 * @author Gabriel
 */
public class Produto {
    private String tipo;
    private String nomeProduto;
    private int estoque;
    private double preco;
    
    public Produto(String tipo, String nome, int estoque) {
        this.tipo = tipo;
        this.nomeProduto = nome;
        this.estoque = estoque;
        this.preco = 0.0;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getEstoque() {
        return estoque;
    }
    
    public double getPreco(){
        return preco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public void setPreco (double preco){
        this.preco = preco;
    }

}