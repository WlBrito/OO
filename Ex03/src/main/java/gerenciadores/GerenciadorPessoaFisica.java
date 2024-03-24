/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadores;

/**
 *
 * @author wbo
 */
import entities.ContaAPagar;
import entities.PessoaFisica;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorPessoaFisica {
    private List<PessoaFisica> listaPessoas;
    

    public GerenciadorPessoaFisica() {
        listaPessoas = new ArrayList<>();       
    }

    public void inserirPessoa(PessoaFisica pessoaFisica) {
        listaPessoas.add(pessoaFisica);
        System.out.println("Inserção feita com sucesso!");
    }

    public void removerPessoa(String nomePessoa) {
        for (PessoaFisica pessoaFisica: listaPessoas) {
            if (pessoaFisica.getNome().equals(nomePessoa)) {
                listaPessoas.remove(pessoaFisica);
                
                System.out.println("Remoção realizada com sucesso!");
                break; // Assumindo que só há uma pessoa com esse nome                
            }
        }
    }

    public void inserirContaEmPessoa(String nomeProcurado, ContaAPagar novaConta) {
        boolean encontrou = false;

        for (PessoaFisica pf : listaPessoas) {
            if (pf.getNome().equals(nomeProcurado)) {
                encontrou = true;
                
                pf.getListaContas().add(novaConta);
                break; // Assumindo que só há uma pessoa com esse nome
            }
        }

        if (!encontrou) {
            System.out.println("Não existe ninguém com este nome.");
        }
    }

    public PessoaFisica pesquisarPessoaPorCPF(String cpfProcurado) {       
        for (PessoaFisica pessoa : listaPessoas) {
            if (pessoa.getCpf().equals(cpfProcurado)) {
               return pessoa;
            }
        }
        return null;
    }

    public PessoaFisica pesquisarPessoaPorNome(String nomeProcurado) {
        for (PessoaFisica pessoa : listaPessoas) {
            if (pessoa.getNome().equals(nomeProcurado)) {
               return pessoa;
            }
        }
        return null;
    }

    public PessoaFisica pessoaComMaiorDevedor() {
        double maiorDivida = 0;
        PessoaFisica pessoaMaiorDivida = new PessoaFisica();

        for (PessoaFisica pessoaFisica : listaPessoas) {
            double total  = pessoaFisica.contabilizaDividaTotal();
            
            if(total > maiorDivida){
                maiorDivida = total;
               // pessoaMaiorDivida = pessoaFisica;
                pessoaMaiorDivida.copiar(pessoaFisica);
            }           
        }
        return pessoaMaiorDivida;
    }

    public double totalDevido() {
        double totalDividas = 0.0;

        for (PessoaFisica pessoaFisica : listaPessoas) {
            totalDividas += pessoaFisica.contabilizaDividaTotal();
        }
        return totalDividas;
    }
}


