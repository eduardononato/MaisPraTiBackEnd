/*
Exercício 1 — Encapsulamento (Classe Produto)
Implemente a classe Produto com atributos privados nome, preco e
quantidadeEmEstoque. Forneça getters e setters com validações: preco e
quantidadeEmEstoque não podem ser negativos e nome não pode ser nulo ou
vazio. Lance IllegalArgumentException em casos inválidos. Demonstre o uso
        criando instâncias, alterando valores válidos e tentando atribuições inválidas.
*/

package produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        setNome(nome);
        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + String.format("%.2f", preco) + ", Quantidade em Estoque: " + quantidadeEmEstoque;
    }
}