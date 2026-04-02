package gestaobarbearia;

import java.util.ArrayList;

public class GerenciadorBarbearia {

    private final ArrayList<Servico> servicos = new ArrayList<>();

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
            total += s.calcularPreco();
        }

        return total;
    }
}