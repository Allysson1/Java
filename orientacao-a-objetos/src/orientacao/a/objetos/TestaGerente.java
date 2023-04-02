/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientacao.a.objetos;

/**
 *
 * @author alunofatec
 */
public class TestaGerente {

    
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.salario = 1000;
        
        System.out.println("Salário: " + g.salario);
        
        System.out.println("Aumentando o salário em 10%");
        g.aumentarSalario();
        
        System.out.println("Salário:" + g.salario);
        
        System.out.println("Aumentando o salário em 30%");
        g.aumentarSalario(0.3);
        
        System.out.println("Salário: " + g.salario);
        
    }
     
    
}
