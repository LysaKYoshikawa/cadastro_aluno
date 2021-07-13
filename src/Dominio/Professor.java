package Dominio;

import auxiliar.Constante;

public class Professor {

    private String nomeDoProfessor;
    private int turmaDoProfessor;
    private float salarioDoProfessor;
    private boolean posGraduado;
    private String especializacao;

    public Professor(String nomeDoProfessor,int turmaDoProfessor){
        this.nomeDoProfessor=nomeDoProfessor; //esse this é para referenciar que ele é a String da logica.
        // em outras Palavras o THIs esta para representar o a
        this.turmaDoProfessor=turmaDoProfessor;

    }

    public Professor(String nomeDoProfessor, int turmaDoProfessor, float salarioDoProfessor, boolean posGraduado, String especializacao){
        this(nomeDoProfessor,turmaDoProfessor);
        //this.nomeDoProfessor=nomeDoProfessor;
        //this.turmaDoProfessor=turmaDoProfessor;
        this.salarioDoProfessor=salarioDoProfessor;
        this.posGraduado=posGraduado;
        this.especializacao=especializacao;

    }

    private float calculadoraComissaoPosGraduado(){
        return posGraduado ? 1500 : 500;
    }

    private float calcularComissaoEspecializacao(){
        return "Projeto".equalsIgnoreCase(especializacao ) ? 2000 : 500;
    }

    private float calcularSalario(){
        return salarioDoProfessor + calculadoraComissaoPosGraduado() + calcularComissaoEspecializacao();
    }

    private String getSituacaoProfessor(float calcularSalario){
        if (calcularSalario > 3500){
            return "Professor qualificado";
        } else if (calcularSalario < 1500){
            return "Professor regular";
        } else {
            return "Professor não qualificado";
        }


    }

    @Override // esse @ vem para informar que ele é um metodo que estamos sobreescrevendo em
    public String toString(){
        float sl = calcularSalario();
        return "Sou a Professora" + " " + this.nomeDoProfessor + " " + "estou na turma" +
                " " + this.turmaDoProfessor + " " + "Pos graduado " + " " + this.posGraduado +
                " " + "no curso de " + " " + this.especializacao + " " +
                "recebendo o salario no valor de: " + this.salarioDoProfessor +
                "||" + sl + "(" + getSituacaoProfessor(sl)+ ")";
    }
 // private String especializacao
    //get
    public String getEspecializacao(){
        return this.especializacao;

    }
    //set
    public void setEspecializacao(String projetos){
        this.especializacao=especializacao;

    }
    
    //get
    public float getSalarioDoProfessor(){
        return this.salarioDoProfessor;

    }
    //set
    public void setSalarioDoProfessor(float salarioDoProfessor){
        this.salarioDoProfessor=salarioDoProfessor;

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
