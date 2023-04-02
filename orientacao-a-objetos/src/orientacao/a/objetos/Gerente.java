/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao.a.objetos;

/**
 *
 * @author alunofatec
 */
public class Gerente {
    String nome;
    double salario;
    
    void aumentarSalario(){
        this.aumentarSalario(0.1);
    }
    
    void aumentarSalario (double taxa) {
        this.salario += this.salario * taxa;
    }
}
