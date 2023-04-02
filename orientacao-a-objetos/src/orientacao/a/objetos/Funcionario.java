/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao.a.objetos;

/**
 *
 * @author alunofatec
 */
public class Funcionario {
    String nome;
    double salario;


    void aumentaSalario(double valor){
          this.salario += valor;
    }
    
    public String ConsultaFuncionario(){
        return "Funcionario: " + this.nome + ", Salario: " + this.salario;
    }

}