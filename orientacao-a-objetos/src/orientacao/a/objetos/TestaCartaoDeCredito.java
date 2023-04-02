/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientacao.a.objetos;

/**
 *
 * @author alunofatec
 */
public class TestaCartaoDeCredito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        CartaoDeCredito cdc2 = new CartaoDeCredito();

        
        cdc1.numero = 1;
        cdc1.dataDeValidade = "30/01/2030";
        
        cdc2.numero = 2;
        cdc2.dataDeValidade = "30/05/2030";
        
        
        System.out.println(cdc1.numero);
        System.out.println(cdc1.dataDeValidade);
        
        System.out.println(cdc2.numero);
        System.out.println(cdc2.dataDeValidade);
    }
    
}
