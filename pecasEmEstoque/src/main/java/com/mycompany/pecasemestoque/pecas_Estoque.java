/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pecasemestoque;

/**
 *
 * @author allysson
 */
class pecas_Estoque {
    
    private String nomePeca;
    private int pecasJaEmEstoque = 100;
    
        
        public String getNomePeca() {
            return this.nomePeca;
        }
        
        public void setNomePeca(String nomePeca){
            this.nomePeca = nomePeca;
        }
        
        
        public void removerPeca(int quantidade){
            System.out.println("Nome: " + this.nomePeca);
            System.out.println("Quantidade removida: "+ quantidade);
            int estoque = this.pecasJaEmEstoque - quantidade;
            System.out.println("Quantidade em estoque: " + estoque);
        }
        
         public void adicionarPeca(int quantidade){
             
            System.out.println("Nome: " + this.nomePeca);
            System.out.println("Quantidade adicionada: "+ quantidade);
            int estoque = this.pecasJaEmEstoque + quantidade;
            System.out.println("Quantidade em estoque: " + estoque);  
        }
         
        
       
        
       /* public void confereEstoque (){
        if (this. > 100){
    
            System.out.println("Nome: " + this.nomePeca);
            System.out.println("Quantidade adicionada: "+ this.quantidade);
            int estoque = this.pecasJaEmEstoque + quantidade;
            System.out.println("Quantidade em estoque: " + estoque);           
        }
        
        else {
             System.out.println("Nome: " + this.nomePeca);
            System.out.println("Quantidade removida: "+ this.quantidade);
            int estoque = this.pecasJaEmEstoque - quantidade;
            System.out.println("Quantidade em estoque: " + estoque);
    
        }
        }*/
    
}