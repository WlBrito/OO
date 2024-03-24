/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex04;

import controllers.ControladorPessoas;
import entity.Cliente;
import entity.Conta_Pagar;

/**
 *
 * @author wbo
 */
public class Ex04 {

    public static void main(String[] args) {
        ControladorPessoas controllerP = new ControladorPessoas();
        Conta_Pagar conta1 = new Conta_Pagar(1, "1232323", 70);
        Cliente cliente1 = new Cliente("Zezinho", 21, "23423456", conta1);
        controllerP.addPessoa(cliente1);
        controllerP.listarPessoas();
    }
}
