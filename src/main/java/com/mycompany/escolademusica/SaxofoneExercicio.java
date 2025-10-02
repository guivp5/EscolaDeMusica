/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author guilherme.peixoto
 */
public class SaxofoneExercicio extends InstrumentoMusical {
    private String tipo;
    
    public SaxofoneExercicio (String nome, String material, String tipo) {
        super(nome, material);
        this.tipo = tipo;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando jazz suave no " + nome + " " + tipo + " de SAX...");
        System.out.println("Assoprando uma melodia romantica");
    }
    
    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a embocadura e as chaves do saxofone.");
    }
    
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Embocadura do tipo: " + tipo);
    }
    
    public String getTipo() { return tipo; }
    
}
