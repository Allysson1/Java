/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulamento;

/**
 *
 * @author allysson
 */
class Funcionario {
        private double salario;
        private String nome;
        
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
}

