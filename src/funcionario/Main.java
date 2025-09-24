/*
Exercício 3 — Herança (Hierarquia de Funcionários)
Crie a classe base Funcionario com protected String nome e protected
BigDecimal salario (com getters). Crie Gerente e Desenvolvedor que
sobrescrevem calcularBonus(): 20% do salário para gerente e 10% para
desenvolvedor. Garanta que salários sejam positivos. Em um programa, coloque
diferentes funcionários em uma coleção do tipo List<Funcionario> e exiba o bônus
de cada um.
*/

package funcionario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Gandalf", new BigDecimal("99999.00"));
        Funcionario desenvolvedor = new Desenvolvedor("Frodo", new BigDecimal("1000.00"));

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gerente);
        funcionarios.add(desenvolvedor);

        System.out.println("--- Relatório de Bônus dos Funcionários ---");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Cargo: " + funcionario.getClass().getSimpleName()); // Exibe a classe do objeto
            System.out.println("Salário: R$" + funcionario.getSalario());
            System.out.println("Bônus: R$" + funcionario.calcularBonus());
            System.out.println("----------------------------------------");
        }
    }
}