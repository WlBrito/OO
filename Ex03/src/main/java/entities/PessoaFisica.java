/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jose
 */
public class PessoaFisica {
    private String nome;
    private int idade;
    private String cpf;
    private List<ContaAPagar> listaContas;

    public PessoaFisica() {
        this.nome = "";
        this.idade = 0;
        this.cpf = "";
        this.listaContas = new ArrayList<>();
    }

    public PessoaFisica(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        
        this.listaContas = new ArrayList<>();
    }
    
    public double contabilizaDividaTotal(){
        double total = 0.0;
        for(ContaAPagar conta : this.listaContas){
            total += conta.getValor();
        }
        return total;
    }
    
    public void addContaAPagar(ContaAPagar novaConta){
        this.listaContas.add(novaConta);
    }
    
    public void removerContaAPagar(int idConta){
        for(ContaAPagar conta: this.listaContas){
            if(conta.getId() == idConta)
                this.listaContas.remove(conta);
        }
    }
    

    /**
     * Esta função temos que fazer a impressao de conta por conta. 
     * Para exercicitar é interessante, entretanto é mais profissional fazer por meio
     * toString() que economizamos códigos desnecessários.
     * 
     */
    public void imprimir() {
        System.out.println("------------------------");
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
        System.out.println("CPF:" + this.cpf);
        
        for(ContaAPagar conta_i : this.getListaContas()){
            conta_i.imprimir();
        }
        System.out.println("------------------------");
        
    }
    
    public void copiar(PessoaFisica outra) {
        this.nome = outra.getNome();
        this.idade = outra.getIdade();
        this.cpf = outra.getCpf();
        
        //vamos passar conta por conta copiando da outra para esta
        this.listaContas = new ArrayList<>();
        for(ContaAPagar outraConta_i: outra.getListaContas()){
            ContaAPagar nova = new ContaAPagar();
            nova.copiar(outraConta_i);
            this.listaContas.add(nova);
        }
    }

    @Override
    public String toString() {
        return "PessoaFisica{" 
                + " nome=" + nome 
                + ", idade=" + idade 
                + ", cpf=" + cpf 
                + ", listaContas=" + listaContas 
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoaFisica other = (PessoaFisica) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.listaContas, other.listaContas);
    }

    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the listaContas
     */
    public List<ContaAPagar> getListaContas() {
        return listaContas;
    }
    
    
    
    
}



