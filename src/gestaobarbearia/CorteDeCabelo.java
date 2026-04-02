package gestaobarbearia;

public class CorteDeCabelo extends Servico {

    public CorteDeCabelo(String cliente, String descricao, double precoBase) {
        super(cliente, descricao, precoBase);
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase(); // valor fixo
    }

    @Override
    public String toString() {
        return "[Corte de Cabelo] " + super.toString() +
               String.format(" | Total: R$ %.2f", calcularPreco());
    }
}