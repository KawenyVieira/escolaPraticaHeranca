//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;

/** O codidigo consiste na pratica da teoria pilares POO, Heranca
 * Sera criada uma classe mae e suas filhas, com objetivo de herdar atributos e metodos
 * Implementar conceitos de arvore de herança no codigo
 * Evitando assim reutilização de codigo e melhor implementacao
 * Pessoa->Aluno->Professor->Funcionario (raiz e suas filhas)
 * Aluno->Bolsista/Tecnico (especialização de aluno)*/

public class Main {
    public static void main(String[] args) {
        //Criação de objetos, se necessario crie mais objetos de acordo com a classe desejada
        Aluno       a1 = new Aluno();
        Bolsista    b1 = new Bolsista();
        Professor   p1 = new Professor();
        Funcionario f1 = new Funcionario();
        Visitante   v1 = new Visitante();

        //atribuicoes referente a SuperClasse Pessoa
        a1.setNome("julio");
        b1.setNome("Hermes");
        p1.setNome("Lucio");
        f1.setNome("Marcos");
        v1.setNome("Roger");

        a1.setIdade(20);
        b1.setIdade(20);
        p1.setIdade(40);
        f1.setIdade(35);
        v1.setIdade(55);

        a1.setSexo("M");
        b1.setSexo("M");
        p1.setSexo("M");
        f1.setSexo("M");
        v1.setSexo("M");

        //atribuicoes referente as classes especificas
        a1.setCurso("Inforamatica");
        a1.setMatricula(1111);

        b1.setCurso("Informatica");
        b1.setMatricula(2222);
        b1.setBolsa(50.00f);
        b1.setStatusBolsa(false);

        p1.setSalario(2000);
        p1.setEspecialidade("Java");
        f1.setSetor("Secretaria");
        f1.setTrabalhando(true);

        // Agrupar todos os objetos em uma lista
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(v1);
        pessoas.add(a1);
        pessoas.add(b1);
        pessoas.add(p1);
        pessoas.add(f1);

        //Apresentacao cadastral, como melhoria é indicado o uso de sobreescrita de metodo para que cada
        // informacao seja declarada em sua classe respectivamente, utilizando assim o proximo pila da POO o Polimorfismo

        System.out.println("----------------------- Apresentação Cadastral -----------------------------");
        for (Pessoa p : pessoas) {
            //instanceof, operador que verifica se um objeto é de um tipo específico, evita erros de ClassCastException
            if (p instanceof Bolsista) {
                Bolsista b = (Bolsista) p;
                System.out.println("Bolsista= nome: " + b.getNome() + ", idade: " + b.getIdade() +
                        ", matrícula: " + b.getMatricula() + ", bolsa: " + b.getBolsa()+"%");
            } else if (p instanceof Aluno) {
                Aluno a = (Aluno) p;
                System.out.println("Aluno= nome: " + a.getNome() + ", idade: " + a.getIdade()
                        + ", matrícula:" + a.getMatricula()+ "Nao bolsista");
            } else if (p instanceof Visitante) {
                Visitante v = (Visitante) p;
                System.out.println("Visitante= nome: " + v.getNome() + ", idade: " + v.getIdade());
            } else if (p instanceof Professor) {
                Professor prof = (Professor) p;
                System.out.println("Professor= nome: " + prof.getNome()  + ", idade: " + p.getIdade()
                        + ", especialidade: " + prof.getEspecialidade()+", salario de R$"+ prof.getSalario());
            } else if (p instanceof Funcionario) {
                Funcionario f = (Funcionario) p;
                System.out.println("Funcionário= nome: " + f.getNome() + ", idade: " + f.getIdade()
                        + ", setor: " + f.getSetor());
            }
        }
        System.out.println("------------------------------------------------------------------------------");

        //chamada de metodos especificos
        f1.fazerAniversario();
        a1.cancelarMatricula();
        b1.renovarBolsa();
        p1.receberAumento(585.50f);

    }

}