/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entity.Conta_Pagar;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wbo
 */
public class ControladorDeContas {

    private List<Conta_Pagar> listaDeContas;

    public ControladorDeContas() {
        this.listaDeContas = new ArrayList<>();
    }

    public void addConta(Conta_Pagar conta) {
        listaDeContas.add(conta);
        System.out.println("Conta cadastrada com sucesso");
    }

    public void dellConta(int idConta) {
        listaDeContas.remove(idConta);
        System.out.println("Conta removida com sucesso");
    }

    public void listarContas() {
        for (Conta_Pagar conta : listaDeContas) {
            System.out.println(conta.toString());
        }
    }

    public Conta_Pagar buscarConta(int idConta) {
        for (Conta_Pagar conta : listaDeContas) {
            if (conta.getIdConta() == idConta) {
                return conta;
            }
        }
        return null;
    }
}
