/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex05;

import entities.Carro;
import entities.Motorista;
import java.util.Scanner;

/**
 *
 * @author wbo
 */
public class Ex05 {

    public static void main(String[] args) {
       Carro meuCarro = new Carro("Fusca", 1970, "verde");

        Motorista motorista = new Motorista();
        motorista.setNomeMotora("Jose Rui");
        motorista.setCarro(meuCarro);

        motorista.dirigir();
        System.out.println(motorista.toString());
       
    }
    
    public static Carro criarPreencherCarro(Scanner scanner) {
        System.out.println("------ Preenchendo os dados do Carro -----");

        System.out.print("Modelo:");
        String modelo = scanner.next();

        System.out.print("Ano de fabricacao:");
        int ano = scanner.nextInt();

        System.out.print("Cor:");
        String cor = scanner.next();
        
        Carro carro = new Carro(modelo, ano, cor);
        return carro;
    }   
    
    public static Motorista criarPreencherMotorista(Scanner scanner) {
        System.out.println("------ Preenchendo o motorista -----");

        System.out.print("Nome:");
        String nome = scanner.next();
        
        Carro carro = criarPreencherCarro(scanner);
        
        Motorista motora = new Motorista(nome, carro);
        return motora;
    }
}
