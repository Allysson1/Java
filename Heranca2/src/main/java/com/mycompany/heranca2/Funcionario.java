/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca2;

/**
 *
 * @author alunofatec
 * 
 * 
 * códigos referentes a métodos de Herança
 */
class Funcionario {
    private String nome;
    private double salario;
    
    
        public double calculaBonificacao(){
            return this.salario * 0.1;
        }
        
        public double getSalario(){
            return this.salario;
        }
        
        public String getNome() {
            return this.nome;
        }
        
        public void setSalario (double salario) {
            this.salario = salario;
        }
        
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public void MostraDados(){
            System.out.println("Nome: " + this.nome);
            System.out.println("Salario: "+ this.salario);
            System.out.println("Bonificação: "+ this.calculaBonificacao());
            
        }
        
        
        
        
    
}
