/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.heranca2;

/**
 *
 * @author alunofatec
 */
public class TestaFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Rafael Consentino");
        g.setSalario(2000);
        g.setUsuario("Rafael Consentino");
        g.setSenha("12345");
        
        //System.out.println(g.mostraDados());
        
        
        Telefonista t = new Telefonista();
        t.setNome("Carolina Melo");
        t.setSalario(1000);
        t.setEstacaoDeTrabalho(13);
        
        
        Secretaria s = new Secretaria();
        s.setNome("Tatiane Andrade");
        s.setSalario(1500);
        s.setRamal(198);
  
        
        System.out.println("GERENTE");
        g.MostraDados();
        System.out.println("Usuário: "+ g.getUsuario());
        System.out.println("Senha: "+ g.getSenha());
       
        
        
        System.out.println("TELEFONISTA");
        t.MostraDados();
        System.out.println("Estação De Trabalho: "+ t.getEstacaoDeTrabalho());
       

        
        System.out.println("SECRETARIA");
        s.MostraDados();
        System.out.println("Ramal: "+ s.getRamal());

    }
    
}
