package gestaobarbearia;

public class CorteDeCabelo extends Servico {
    
    double ValorFixo;

    public CorteDeCabelo(String cliente, String descricao, double precoBase, double ValorFixo) {
        super(cliente, descricao, precoBase);
        this.ValorFixo = ValorFixo;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Valor Fixo: R$ %.2f | Total: R$ %.2f",
                ValorFixo, CalcularPreco());
    }
    
    public double getValorFixo() {
        return ValorFixo;
    }

    public void setValorFixo(double ValorFixo) {
        this.ValorFixo = ValorFixo;
    }

    @Override
    public double CalcularPreco() {
       return precoBase + ValorFixo;
    }
 
    
    
}
