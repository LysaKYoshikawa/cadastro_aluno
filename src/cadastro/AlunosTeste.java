package cadastro;

public class AlunosTeste {

    public static void main(String[] args){

        //Alunos aluno = null;

        Alunos al1 = new Alunos(); // nome de uma classe entre parenteses ela é um construtor

        //al1.nomesDoAlunos = "Naruto";
        al1.turmasCadastradas = "210";
        al1.notaPrimeiraAvaliacao = 10;
        al1.notaSegundaAvaliacao = 5;
        //System.out.println(al1);
        al1.exibir();

        Alunos al2 = new Alunos(); // nome de uma classe entre parenteses ela é um construtor

        al2.nomesDoAlunos = "Hinata";
        al2.turmasCadastradas = "210";
        al2.notaPrimeiraAvaliacao = 10;
        al2.notaSegundaAvaliacao = 5;
        //System.out.println(al2);
        al2.exibir();
        Alunos al3 = new Alunos("sasuke", 10, "210", 5); // nome de uma classe entre parenteses ela é um construtor

        al3.nomesDoAlunos = "Sasuke";
        al3.turmasCadastradas = "210";
        al3.notaPrimeiraAvaliacao = 10;
        al3.notaSegundaAvaliacao = 5;
        //System.out.println(al3);
        al3.exibir();
    }
}
