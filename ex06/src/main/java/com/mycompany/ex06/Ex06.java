/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex06;

import entities.Cliente;

/**
 *
 * @author wbo
 */
public class Ex06 {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.getConta().preencher();
        cliente.imprimir();
        cliente.depositar();
        cliente.imprimir();

    }
}
