/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaobarbearia;

import java.util.ArrayList;

public class GerenciadorBarbearia {

    private ArrayList<Servico> servicos;

    public GerenciadorBarbearia() {
        this.servicos = new ArrayList<>();
    }

    public void registrarServico(Servico s) {
        servicos.add(s);
    }
    
    public void listarAtendimento() {
        if (servicos.isEmpty()) {
            System.out.println("Nenhum atendimento cadastrado.");
            return;
        }
        for (Servico s : servicos) {
            System.out.println(s);
        }
       
    }
    
    public double calcularCustoTotal() {
        double total = 0;
        for (Servico s : servicos) {
            total += s.CalcularPreco(); 
        }
        return total;
    }



}
