package gestaobarbearia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            GerenciadorBarbearia gerenciador = new GerenciadorBarbearia();
            
            int opcao;
            
            do {
                System.out.println("\n===== BARBEARIA =====");
                System.out.println("1 - Corte de Cabelo");
                System.out.println("2 - Barba");
                System.out.println("3 - Corte + Barba");
                System.out.println("4 - Listar Atendimentos");
                System.out.println("5 - Faturamento Total");
                System.out.println("6 - Sair");
                System.out.print("Escolha: ");
                
                opcao = sc.nextInt();
                sc.nextLine();
                
                switch (opcao) {
                    
                    case 1 -> {
                        System.out.print("Cliente: ");
                        String c1ienteCabelo = sc.nextLine();
                        
                        System.out.print("Descrição: ");
                        String descricaoCabelo = sc.nextLine();
                        
                        gerenciador.registrarServico(
                                new CorteDeCabelo(c1ienteCabelo, descricaoCabelo, 30.0)
                        );
                    }
                        
                    case 2 -> {
                        System.out.print("Cliente: ");
                        String clienteBarba = sc.nextLine();
                        
                        System.out.print("Descrição: ");
                        String descricaoBarba = sc.nextLine();
                        
                        gerenciador.registrarServico(
                                new CorteBarba(clienteBarba, descricaoBarba, 30.0, 5.0)
                        );
                    }
                        
                    case 3 -> {
                        System.out.print("Cliente: ");
                        String clienteAmbos = sc.nextLine();
                        
                        System.out.print("Descrição: ");
                        String descricaoAmbos = sc.nextLine();
                        
                        gerenciador.registrarServico(
                                new CorteCabeloBarba(clienteAmbos, descricaoAmbos, 30.0, 10.0)
                        );
                    }
                        
                    case 4 -> gerenciador.listarAtendimento();
                        
                    case 5 -> System.out.println("Faturamento total: R$ "
                                + gerenciador.calcularCustoTotal());
                        
                    case 6 -> System.out.println("Saindo...");
                        
                    default -> System.out.println("Opção inválida!");
                }
                
            } while (opcao != 6);
        }
    }
}
