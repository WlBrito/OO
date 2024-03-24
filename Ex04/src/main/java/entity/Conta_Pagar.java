/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author wbo
 */
public class Conta_Pagar {
     private int idConta;
    private String codigoBarras;
    private double valor;
    
    public Conta_Pagar (){
        this.codigoBarras = "";
        this.idConta = 0;
        this.valor = 0.0;
    }
    
    public Conta_Pagar (int idConta, String codigoBarras, double valor){
        this.codigoBarras = codigoBarras;
        this.idConta = idConta;
        this.valor = valor;
    }

    public String toString() {
        return "Conta_Pagar{" 
                + "id=" + idConta 
                + ", codBarras=" + codigoBarras 
                + ", valor=" + valor 
                + '}';
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public int getIdConta() {
        return idConta;
    }

    public double getValor() {
        return valor;
    }
}
