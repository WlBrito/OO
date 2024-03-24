/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import controllers.ControladorDeContas;

/**
 *
 * @author wbo
 */
public class Cliente {

    public static int contador = 0;
    private String nome;
    private int idade;
    private String cpf;
    private Conta_Pagar conta;
    private ControladorDeContas controllerContas;
    // public String sexo;
    // public double altura;

    public Cliente() {
        this.nome = "";
        this.idade = 0;
        this.cpf = "";

        //  this.sexo = "";
        // this.altura = 0.0;
        contador++;
    }

    public Cliente(String nome, int idade, String cpf, Conta_Pagar conta) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.conta = conta;
        this.controllerContas = new ControladorDeContas();
        controllerContas.addConta(conta);
        // this.sexo = sexo;
        // this.altura = altura;
        contador++;
    }

    @Override
    public String toString() {
        return "Cliente{" + nome
                + "Idade='" + idade + '\''
                + ", cpf='" + cpf + '\''
                + ", contas a pagar=" + conta.toString()
                + '}';
    }

//    public double getAltura() {
//        return altura;
//    }
    public static int getContador() {
        return contador;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

//    public String getSexo() {
//        return sexo;
//    }
//    public void setAltura(double altura) {
//        this.altura = altura;
//    }
    public static void setContador(int contador) {
        Cliente.contador = contador;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public void setSexo(String sexo) {
//        this.sexo = sexo;
//    }
}
