/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author guilherme.peixoto
 */
public class PianoExercicio extends InstrumentoMusical {
    private int numeroTeclas;
    
    public PianoExercicio (String nome, String material, int teclas) {
        super(nome, material);
        this.numeroTeclas = numeroTeclas;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando música clássica no " + nome + " " + numeroTeclas + " ");
        System.out.println("Apertando as teclas suavemente");
    }
    
    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensão das cordas do piano");
    }
    
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Numero de teclas: " + numeroTeclas);
    }
    
    public int getNumeroTeclas() { return numeroTeclas; }
    
}
