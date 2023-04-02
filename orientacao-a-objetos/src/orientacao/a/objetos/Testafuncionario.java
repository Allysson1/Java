/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientacao.a.objetos;

/**
 *
 * @author alunofatec
 */
public class Testafuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        
        f1.nome = "Allysson";
        f1.salario = 20000;
        
        f2.nome = "Guilherme";
        f2.salario = 20000;
        f2.aumentaSalario(2000);
        

        
        //System.out.println("Funcionario: " + f1.nome);
        //System.out.println("Salario: " + f1.salario);
        System.out.println(f1.ConsultaFuncionario());
        
        //System.out.println("Funcionario: " + f2.nome);
        //System.out.println("Salario: " + f2.salario);
        System.out.println(f2.ConsultaFuncionario());

    }
    
}
