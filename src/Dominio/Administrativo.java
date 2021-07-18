package Dominio;

public class Administrativo {

    //private String nomeDoProfessor;
    //private int turmaDoProfessor;
    //private float avaliacaoDoProfessor;
    //private boolean posGraduado;
    //private String especializacao;

    private String nomeDeCadastro;
    private String titulo;
    private int turmasCadastradas;
    private float notaDeAtendimento;
    private float notaDeAgilidade;
    private float notaDePrestativa;

    //get
    public String getNomeDeCadastro(){
        return this.nomeDeCadastro;

    }
    //set
    public void setNomeDeCadastro(String nomeDeCadastro){
        this.nomeDeCadastro=nomeDeCadastro;

    }

    //get
    public String getTutilo(){
        return this.titulo;

    }
    //set
    public void setTitulo(String titulo){
        this.titulo=titulo;

    }


    //get
    public int getTurmasCadastradas(){
        return this.turmasCadastradas;

    }
    //set
    public void setTurmasCadastradas(int turmasCadastradas){
        this.turmasCadastradas=turmasCadastradas;

    }

    //get
    public float getNotaDeAtendimento(){
        return this.notaDeAtendimento;

    }
    //set
    public void setNotaDeAtendimento(float notaDeAtendimento){
        this.notaDeAtendimento=notaDeAtendimento;

    }

    //get
    public float getNotaDeAgilidade(){
        return this.notaDeAgilidade;

    }
    //set
    public void setNotaDeAgilidade(float notaDeAgilidade){
        this.notaDeAgilidade=notaDeAgilidade;

    }

    //get
    public float getNotaDePrestativa(){
        return this.notaDePrestativa;

    }
    //set
    public void setNotaDePrestativa(float notaDePrestativa){
        this.notaDePrestativa=notaDePrestativa;

    }




}
