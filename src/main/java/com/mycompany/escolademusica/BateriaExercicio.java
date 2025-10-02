/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author guilherme.peixoto
 */
public class BateriaExercicio extends InstrumentoMusical {
    private int numeroPecas;
    
    public BateriaExercicio (String nome, String material, int teclas) {
        super(nome, material);
        this.numeroPecas = numeroPecas;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando rock na " + nome + " com " + numeroPecas + " número de peças.");
        System.out.println("Batendo nos tambores loucamente");
    }
    
    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando o aperto das peças da bateria.");
    }
    
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Numero de peças da bateria: " + numeroPecas);
    }
    
    public int getNumeroPecas() { return numeroPecas; }
}
