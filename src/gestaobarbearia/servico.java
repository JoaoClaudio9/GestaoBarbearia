package gestaobarbearia;

abstract class Servico {

   protected String cliente;
   protected String descricao;
   protected double precoBase;

    public Servico(String cliente, String descricao, double precoBase) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.precoBase = precoBase;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public abstract double CalcularPreco();

    @Override
    public String toString() {
        return String.format("Cliente: %s | Descrição: %s | Preco Base: R$ %.2f", cliente, descricao, precoBase);
    }

    
    
}
