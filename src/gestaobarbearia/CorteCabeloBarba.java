package gestaobarbearia;

public class CorteCabeloBarba extends Servico {

    private final double valorBarba;

    public CorteCabeloBarba(String cliente, String descricao, double precoBase, double valorBarba) {
        super(cliente, descricao, precoBase);
        this.valorBarba = valorBarba;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() + valorBarba;
    }

    @Override
    public String toString() {
        return "[Corte + Barba] " + super.toString() +
               String.format(" | Barba: R$ %.2f | Total: R$ %.2f",
               valorBarba, calcularPreco());
    }
}