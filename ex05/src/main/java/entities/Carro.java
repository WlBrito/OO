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
public class Carro {

    private String modelo;
    private int ano;
    private String cor;

    public Carro() {
        this.modelo = "";
        this.ano = 0;
        this.cor = "";
    }

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void copiar(Carro outro) {
        this.ano = outro.getAno();
        this.modelo = outro.getModelo();
        this.cor = outro.getCor();
    }
    
    public void buzinar(){
        System.out.println("BiBiBi");
    }
    
    public void abrirPorta(boolean isOpen){
        if(isOpen)
            System.out.println("O motorista abriu a porta");
        else
            System.out.println("As portas estão fechadas");
    }
    
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.modelo);
        hash = 37 * hash + this.ano;
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
        final Carro other = (Carro) obj;
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.cor, other.cor);
    }
    
    
    public String toString(){
        return "Carro{" + "'modelo:" + modelo + "' 'ano:" + ano + "' 'cor:" + cor + "'}";
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

}
