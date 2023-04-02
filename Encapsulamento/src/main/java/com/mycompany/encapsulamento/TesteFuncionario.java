/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.encapsulamento;

/**
 *
 * @author allysson
 */
public class TesteFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        
        f.setNome("Rafael Cosenmtino");
        f.setSalario(2000);
        
        System.out.println(f.getNome());
        System.out.println(f.getSalario());

    }
    
}
