package Dominio;

import auxiliar.Constante;

public class Professor {

    private String nomeDeCadastro;
    private String titulo;
    private int turmasCadastradas;
    private float avaliacaoDoProfessor;
    private boolean posGraduado;
    private String especializacao;

    public Professor(String nomeDeCadastro,int turmaDoProfessor, String titulo){
        this.nomeDeCadastro=nomeDeCadastro; //esse this é para referenciar que ele é a String da logica.
        // em outras Palavras o THIs esta para representar o a
        this.turmasCadastradas=turmasCadastradas;
        this.titulo=titulo;

    }

    public Professor(String nomeDeCadastro,String titulo, int turmasCadastradas, float avaliacaoDoProfessor, boolean posGraduado, String especializacao){
        this(nomeDeCadastro,turmasCadastradas,titulo);
        //this.nomeDoProfessor=nomeDoProfessor;
        //this.turmaDoProfessor=turmaDoProfessor;
        this.avaliacaoDoProfessor=avaliacaoDoProfessor;
        this.posGraduado=posGraduado;
        this.especializacao=especializacao;

    }

    private float calculadoraComissaoPosGraduado(){
        return posGraduado ? 1500 : 500;
    }

    private float calcularComissaoEspecializacao(){
        return "Projeto".equalsIgnoreCase(especializacao ) ? 2000 : 500;
    }

    private float calcularAvaliacao(){
        return avaliacaoDoProfessor + calculadoraComissaoPosGraduado() + calcularComissaoEspecializacao();
    }

    private String getSituacaoProfessor(float calcularAvaliacao){
        if (calcularAvaliacao > 3500){
            return "Professor qualificado";
        } else if (calcularAvaliacao < 1500){
            return "Professor regular";
        } else {
            return "Professor não qualificado";
        }


    }

    @Override // esse @ vem para informar que ele é um metodo que estamos sobreescrevendo em
    public String toString(){
        float sl = calcularAvaliacao();
        return "Sou a Professora" + " " + this.nomeDeCadastro + " " + "estou na turma" +
                " " + this.turmasCadastradas + " " + "Pos graduado " + " " + this.posGraduado +
                " " + "no curso de " + " " + this.especializacao + " " +
                "recebendo uma avaliação de criterio de professor: " + this.avaliacaoDoProfessor +
                "||" + sl + "(" + getSituacaoProfessor(sl)+ ")";
    }
 // private String especializacao
    //get
    public String getEspecializacao(){
        return this.especializacao;

    }
    //set
    public void setEspecializacao(String especializacao){
        this.especializacao=especializacao;

    }

    public String getTitulo(){
        return this.titulo;

    }
    //set
    public void setTitulo(String titulo){
        this.titulo=titulo;

    }

    //get
    public float getAvaliacaoDoProfessor(){
        return this.avaliacaoDoProfessor;

    }
    //set
    public void setAvaliacaoDoProfessor(float avaliacaoDoProfessor){
        this.avaliacaoDoProfessor=avaliacaoDoProfessor;

    }
    //get
    public Boolean getPosGraducao(){
        return this.posGraduado;

    }
    //set
    public void setPosGraducao(boolean posGraduado){
        this.posGraduado=posGraduado;

    }


}
