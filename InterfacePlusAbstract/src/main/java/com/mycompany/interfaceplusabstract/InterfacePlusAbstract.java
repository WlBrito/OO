package com.mycompany.interfaceplusabstract;

import Enttities.Carro;
import Enttities.Moto;
import Enttities.Veiculo;

/**
 *
 * @author wbo
 */


//A interface veiculo que calcula o preço está implementada na classe abstrata de veiculo, que por sua vez é herdada
//pelos demais. O polimorfismo é utilizado ao longo da main.
public class InterfacePlusAbstract {

    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        aceleraOsTrem(moto);
        aceleraOsTrem(carro);
        calculaOsTrem(moto);
        calculaOsTrem(carro);
    }

    static void aceleraOsTrem(Veiculo veiculo) {
        veiculo.acelerar();
    }

    static void calculaOsTrem(Veiculo veiculo) {
        double preco = veiculo.calcula_valor();
        System.out.println("O preço desse veiculo e: " + preco);
    }
}
