/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eletrotech;

/**
 *
 * @author Aluno_Manha
 */
public class Senha {
    
    
    private String nome1;
    private String nome2;
    

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }
    
    
    public String getNome2() {
        return nome2;
    }
    
    public void setNome2 (String nome2) {
        this.nome2 = nome2;
    }
    
    public static void main(String[] args) {
        Senha pass = new Senha();
        System.out.println(pass.nome1);
    }
    
}
