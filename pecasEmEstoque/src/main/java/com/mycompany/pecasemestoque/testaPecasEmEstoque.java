/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pecasemestoque;

/**
 *
 * @author allysson
 */
public class testaPecasEmEstoque {

    public static void main(String[] args) {
        pecas_Estoque pe = new pecas_Estoque();
        
       pe.setNomePeca("Biela");
        pe.removerPeca(100);
        pe.adicionarPeca(0);
        
        
        /*
        System.out.println("Nome Da Peça: " + pe.getNomePeca());
        System.out.println("Quantidade Adicionada: " + pe.getQuantidade());
        System.out.println("Quantidade em Estoque: " + pe.adicionaPeca());
        
        
        System.out.println("Nome Da Peça: " + pe.getNomePeca());
        System.out.println("Quantidade removida: " + pe.getQuantidade());
        System.out.println("Quantidade em Estoque: " + pe.removePeca());*/
        
        
        
    }
}