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
public class Cliente {
    private String nome;
    private Contas conta;

    public Cliente() {
        this.nome = "";
        this.conta = new Contas();
    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("------------Informe os dados------------\n\n");
        System.out.println("Nome: ");
        this.setNome(leitor.next());
        this.conta.preencher();
    }

    public void imprimir() {
        System.out.println("------------Impressão de dados------------\n\n");
        System.out.println("Nome: " + this.getNome());
        this.conta.imprimir();
    }

    public void depositar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor a ser depositado: ");
        double deposito = leitor.nextDouble();
        this.conta.depositar(deposito);
    }

    public void setConta(Contas conta) {
        this.conta = conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contas getConta() {
        return this.conta;
    }

    public String getNome() {
        return nome;
    }
}
