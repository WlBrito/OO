/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Objects;

/**
 *
 * @author wbo
 */
public class Motorista {

    private String nomeMotora;
    private Carro carro;

    public Motorista() {
        this.nomeMotora = "";
        this.carro = new Carro();
    }
    
    public Motorista(String nome, Carro carro){
        this.nomeMotora = nome;
        this.carro = carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setNomeMotora(String nomeMotora) {
        this.nomeMotora = nomeMotora;
    }

    public String getNomeMotora() {
        return nomeMotora;
    }

    public String toString() {
        return "Motorista{" + "nome=" + getNomeMotora()
                + ", carro=" + carro
                + '}';
    }
 
     public void dirigir() {
        System.out.println("Dirigindo o carro " + carro.getModelo());
        carro.buzinar();
    }
     public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.getNomeMotora());
        hash = 97 * hash + Objects.hashCode(this.carro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Motorista other = (Motorista) obj;
        if (!Objects.equals(this.nomeMotora, other.nomeMotora)) {
            return false;
        }
        return Objects.equals(this.carro, other.carro);
    }


}
