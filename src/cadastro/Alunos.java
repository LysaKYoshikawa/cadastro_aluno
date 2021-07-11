package cadastro;

import auxiliar.Constante;

public class Alunos {


    String nomesDoAlunos;
    String turmasCadastradas;
    float notaPrimeiraAvaliacao;
    float notaSegundaAvaliacao;

    public  Alunos(){
        nomesDoAlunos = "Fantasma";
    }

    public Alunos(String nomesDoAlunos, float notaPrimeiraAvaliacao){
        this();
        this.nomesDoAlunos = nomesDoAlunos;
        this.notaPrimeiraAvaliacao = notaPrimeiraAvaliacao;
    }

    public Alunos(String nomesDoAlunos, float notaPrimeiraAvaliacao, String turmasCadastradas, float notaSegundaAvaliacao){
        this(nomesDoAlunos, notaPrimeiraAvaliacao); //Esse this é o caso de quiser puxaras informações do this de cima ou de outra class
        this.turmasCadastradas = turmasCadastradas;
        this.notaSegundaAvaliacao = notaSegundaAvaliacao;
    }

    private float calcularMedia(){
        return notaPrimeiraAvaliacao + notaSegundaAvaliacao / 2;

    }

    private String getSituacaoDoAluno(float mediaCalculada){
        return mediaCalculada > Constante.MINIMO ? "Aprovado" : "Reprovado";

    }

    void exibir(){
        float mc = calcularMedia();
        System.out.println("Alunos: " + this + " = " + this.calcularMedia() + " [ " + getSituacaoDoAluno(mc) + " ]");
    }



    @Override // esse @ vem para informar que ele é um metodo que estamos sobreescrevendolop7888pppppppppppp5uhyjn9mhmjpj
    public String toString(){
        return "Sou o Aluno" + " " + nomesDoAlunos + " " + "estou na turma" + " " + turmasCadastradas + " " + "Minha primeira avalição eu tirei"
                + " " + notaPrimeiraAvaliacao + " " + "Na segunda avaliação tirei a nota" + " " + notaSegundaAvaliacao;
    }
}
