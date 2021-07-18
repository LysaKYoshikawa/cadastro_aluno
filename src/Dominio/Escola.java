package Dominio;

import auxiliar.Constante;

public class Escola { //nesse caso esta como Alunos mas devido a logica da aula o ideal seria estar como escola e classes filhas como alunos professor e administrativo

//foi colocado public nos campos abaixo "public String nomesDoAlunos;" para ficarem visiveis em outro pacote
    public String nomeDeCadastro;
    public String titulo;
    public String turmasCadastradas;
    public float notaPrimeiraAvaliacao;
    public float notaSegundaAvaliacao;

    public Escola(){
        nomeDeCadastro= "Fantasma";
    }

    public Escola(String nomeDeCadastro, float notaPrimeiraAvaliacao){
        this();
        this.nomeDeCadastro = nomeDeCadastro;
        this.notaPrimeiraAvaliacao = notaPrimeiraAvaliacao;
    }

    public Escola(String nomeDeCadastro, float notaPrimeiraAvaliacao, String titulo, String turmasCadastradas, float notaSegundaAvaliacao){
        this(nomeDeCadastro, notaPrimeiraAvaliacao); //Esse this é o caso de quiser puxaras informações do this de cima ou de outra class
        this.turmasCadastradas = turmasCadastradas;
        this.titulo=titulo;
        this.notaSegundaAvaliacao = notaSegundaAvaliacao;
    }

    private float calcularMedia(){
        return notaPrimeiraAvaliacao + notaSegundaAvaliacao / 2;

    }

    private String getSituacaoDoAluno(float mediaCalculada){
        return mediaCalculada > Constante.MINIMO ? "Aprovado" : "Reprovado";

    }

    public void exibir(){
        float mc = calcularMedia();
        System.out.println("Alunos: " + this + " = " + this.calcularMedia() + " [ " + getSituacaoDoAluno(mc) + " ]");
    }



    @Override // esse @ vem para informar que ele é um metodo que estamos sobreescrevendolop7888pppppppppppp5uhyjn9mhmjpj
    public String toString(){
        return "Sou o Aluno" + " " + nomeDeCadastro + " " + "estou na turma" + " " + turmasCadastradas + " " + "Minha primeira avalição eu tirei"
                + " " + notaPrimeiraAvaliacao + " " + "Na segunda avaliação tirei a nota" + " " + notaSegundaAvaliacao;
    }
}
