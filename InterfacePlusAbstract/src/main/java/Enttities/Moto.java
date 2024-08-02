/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enttities;

import Interfaces.IVeiculo;

/**
 *
 * @author wbo
 */
public class Moto extends Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Ram dam dam dam pa pa pa");
    }
    @Override
    public double calcula_valor(){
        double preco_moto = 5000;
        return preco_moto;
    }
}
