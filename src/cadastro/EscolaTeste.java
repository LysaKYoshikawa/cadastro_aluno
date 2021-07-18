package cadastro;

import Dominio.Escola;

public class EscolaTeste {

    public static void main(String[] args){

        //Alunos aluno = null;

        Escola al1 = new Escola(); // nome de uma classe entre parenteses ela é um construtor

        //al1.nomeDeCadastro = "Naruto";
        al1.titulo = "Aluno";
        al1.turmasCadastradas = "210";
        al1.notaPrimeiraAvaliacao = 10;
        al1.notaSegundaAvaliacao = 5;
        //System.out.println(al1);
        al1.exibir();

        Escola al2 = new Escola(); // nome de uma classe entre parenteses ela é um construtor

        al2.nomeDeCadastro = "Hinata";
        al2.titulo="Aluna";
        al2.turmasCadastradas = "210";
        al2.notaPrimeiraAvaliacao = 10;
        al2.notaSegundaAvaliacao = 5;
        //System.out.println(al2);
        al2.exibir();

        Escola al3 = new Escola("sasuke", 10, "Aluno", "210", 5); // nome de uma classe entre parenteses ela é um construtor

        al3.nomeDeCadastro = "Sasuke";
        al3.titulo="Aluno";
        al3.turmasCadastradas = "210";
        al3.notaPrimeiraAvaliacao = 10;
        al3.notaSegundaAvaliacao = 5;
        //System.out.println(al3);
        al3.exibir();
    }
}
