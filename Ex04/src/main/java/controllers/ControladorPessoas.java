/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entity.Conta_Pagar;
import entity.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wbo
 */
public class ControladorPessoas {
    
       private List<Cliente> listaDePessoas;
       
    public ControladorPessoas(){
        this.listaDePessoas= new ArrayList<>();
    }
    public void addPessoa(Cliente cliente){
        listaDePessoas.add(cliente);
        System.out.println("Cliente cadastrada com sucesso");
    }
    public void dellPessoa(String cpf){
        listaDePessoas.remove(cpf);
        System.out.println("Conta removida com sucesso");
    }
    public void listarPessoas(){
        for(Cliente clientes:listaDePessoas)
            System.out.println(clientes.toString());
    }
    public Cliente buscarConta(String cpf){
        for(Cliente cliente:listaDePessoas)
            if(cliente.getCpf() == cpf)
                return cliente;
        return null;
    }
}
