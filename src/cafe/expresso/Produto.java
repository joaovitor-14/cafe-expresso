package cafe.expresso;

public class Produto {
    private String nome;
    private double precoUnitario;

    public Produto(String nome, double precoUnitario) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio.");
        }
        if (precoUnitario <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

}