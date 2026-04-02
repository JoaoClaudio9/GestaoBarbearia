package gestaobarbearia;

public class CorteBarba extends Servico {

    private double valorBarba;

    public CorteBarba(String cliente, String descricao, double precoBase, double valorBarba) {
        super(cliente, descricao, precoBase);
        this.valorBarba = valorBarba;
    }

    public double getValorBarba() {
        return valorBarba;
    }

    public void setValorBarba(double valorBarba) {
        this.valorBarba = valorBarba;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() - valorBarba;
    }

    @Override
    public String toString() {
        return "[Barba] " + super.toString() +
               String.format(" | Desconto: R$ %.2f | Total: R$ %.2f",
               valorBarba, calcularPreco());
    }
}