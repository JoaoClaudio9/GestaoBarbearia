package gestaobarbearia;

public class CorteBarba extends Servico {

    private double ValorBarba;

    public CorteBarba(double ValorBarba, String cliente, String descricao, double precoBase) {
        super(cliente, descricao, precoBase);
        this.ValorBarba = ValorBarba;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Valor Barba: R$ %.2f | Total: R$ %.2f",
                ValorBarba, CalcularPreco());
    }

    public double getValorBarba() {
        return ValorBarba;
    }

    public void setValorBarba(double ValorBarba) {
        this.ValorBarba = ValorBarba;
    }

    @Override
    public double CalcularPreco() {
        return precoBase + ValorBarba;
    }

}
