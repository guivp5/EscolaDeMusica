/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escolademusica;

/**
 *
 * @author guilherme.peixoto
 */
public class EscolaDeMusica {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandartCharsets.UTF_8));
        System.out.println("Iniciar a orquestra!");
        
        InstrumentoMusical[] banda = new InstrumentoMusical[4];
        
        banda[0] = new ViolaoExercicio("Violão clássico", "madeira", 6);
        banda[1] = new SaxofoneExercicio("Saxofonde de Jazz", "Metal", "alto");
        banda[2] = new PianoExercicio("Piano de Cauda", "madeira e metal", 88);
        banda[3] = new BateriaExercicio("Bateria Acústica", "Madeira e Metal", 5);

        EscolaDeMusica em = new EscolaDeMusica();
        
        em.apresentar (banda);          
    }
    
    public void apresentar(InstrumentoMusical[] banda) {
        System.out.println("=== A ORQUESTRA VAI COMEÇAR ===\n");
        
        System.out.println("--- Afinação dos Instrumentos ---\n");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.afinar();
        }
        
        System.out.println("--- Instrumentos começaram a tocar ---\n");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.tocar();
        }
        
        System.out.println(" ----- Mostrando informações dos instrumentos ----- ");
        for (int i = 0; i < banda.length; i++) {
            System.out.println("Instrumento musical " + (i + 1) + " : ");
            banda[i].mostrarInformacoes();
            banda[i].tocar();
            System.out.println("");
        }
    }   
}
