/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Scanner;

/**
 *
 * @author wbo
 */
public class Contas {
    private int id;
    private String codConta;
    private double valor;
    private double valorDeposito;

    public Contas() {
        this.id = -1;
        this.codConta = "";
        this.valor = 0.0;
        this.valorDeposito = 0.0;
    }

    public Contas(int id, String codConta, double valor, double valorDeposito) {
        this.id = id;
        this.codConta = codConta;
        this.valor = valor;
        this.valorDeposito = valorDeposito;
    }
    
    
    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\t------------------------\n\n");

        System.out.print("Informe o id:");
        this.setId(leitor.nextInt());

        System.out.print("Informe o código da conta:");
        this.setcodConta(leitor.next());

        System.out.print("Informe o valor da conta:");
        this.setValor(leitor.nextDouble());
                
    }
    
    public void copy(Contas outra){
        this.id = outra.getId();
        this.codConta = outra.getcodConta();
        this.valor = outra.getValor();    
        this.valorDeposito = outra.getValorDeposito();
    }

    public void imprimir() {
        System.out.println("Id:" + this.getId());
        System.out.println("codConta:" + this.getcodConta());
        System.out.println("Valor:" + this.getValor());
    }
    
  public void depositar(double valorDeposito) {
    this.valor += valorDeposito;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcodConta() {
        return codConta;
    }

    public void setcodConta(String codConta) {
        this.codConta = codConta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }
}
