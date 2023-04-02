/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao.a.objetos;

/**
 *
 * @author alunofatec
 */
public class Conta {
    int numero;
    double saldo;
    double limite = 100;
    
    
    void deposita(double valor){
        this.saldo += valor;
    }
    
    void saca (double valor) {
        this.saldo -= valor;
    }
    
    void imprimeExtrato(){
        System.out.println("Saldo: " + this.saldo);
    }
    
    double ConsultaSaldoDisponivel() {
        return this.saldo + this.limite;
    }
}


