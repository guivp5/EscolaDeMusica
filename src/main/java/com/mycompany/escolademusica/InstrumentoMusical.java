package com.mycompany.escolademusica;

public abstract class InstrumentoMusical {
    protected String nome;
    protected String material;
    
    /**
     *
     * @param nome
     * @param material
     */
    public InstrumentoMusical(String nome, String material) {
        this.nome = nome;
        this.material = material;
    }
    
    public abstract void tocar();
    
    public void afinar() {
        System.out.println("Afinando o " + nome + "...");
    }
    
    public void mostrarInformacoes() {
        System.out.println("Instrumentos: " + nome);
        System.out.println("Material: " + material);
    }
    
    public String getNome() { return nome; }
    public String getMaterial() { return material; }
}
