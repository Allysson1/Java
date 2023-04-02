/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca2;

/**
 *
 * @author alunofatec
 */
 class Gerente extends Funcionario{
     private String usuario;
     private String senha;
     
     
     //exemplo de método reescrito
     public double calculaBonificacao(){
         return this.getSalario() * 0.6 + 100;
     }
     
     public String getUsuario(){
         return this.usuario;
     }
     
     public void setUsuario(String usuario){
         this.usuario = usuario;
     } 
     
     public String getSenha(){
         return this.senha;
     }
     
     public void setSenha(String senha){
         this.senha = senha;
         
     }
     
    
}
