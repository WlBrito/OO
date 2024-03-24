/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Objects;
import java.util.Scanner;

public class ContaAPagar {
    private int id;
    private String codBarras;
    private double valor;

    public ContaAPagar() {
        this.id = -1;
        this.codBarras = "";
        this.valor = 0.0;
    }

    public ContaAPagar(int id, String codBarras, double valor) {
        this.id = id;
        this.codBarras = codBarras;
        this.valor = valor;
    }
            
    public void copiar(ContaAPagar outra){
        this.id = outra.getId();
        this.codBarras = outra.getCodBarras();
        this.valor = outra.getValor();    
    }

    public void imprimir() {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "ContaAPagar{" 
                + "id=" + id 
                + ", codBarras=" + codBarras 
                + ", valor=" + valor 
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.codBarras);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
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
        final ContaAPagar other = (ContaAPagar) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        return Objects.equals(this.codBarras, other.codBarras);
    }
    
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the codBarras
     */
    public String getCodBarras() {
        return codBarras;
    }

    /**
     * @param codBarras the codBarras to set
     */
    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
