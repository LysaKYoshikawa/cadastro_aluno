package Dominio;

public class Professor {

    public String nomeDoProfessor;
    public int turmaDoProfessor;
    public  float salarioDoProfessor;
    public boolean posGraduado;
    public String especializacao;

    public Professor(String nomeDoProfessor,int turmaDoProfessor){
        this.nomeDoProfessor=nomeDoProfessor; //esse this é para referenciar que ele é a String da logica.
        // em outras Palavras o THIs esta para representar o a
        this.turmaDoProfessor=turmaDoProfessor;

    }

    public Professor(String nomeDoProfessor,int turmaDoProfessor,float salarioDoProfessor, boolean posGraduado,String especializacao){
        this.nomeDoProfessor=nomeDoProfessor;
        this.turmaDoProfessor=turmaDoProfessor;
        this.salarioDoProfessor=salarioDoProfessor;
        this.posGraduado=posGraduado;
        this.especializacao=especializacao;

    }

    @Override // esse @ vem para informar que ele é um metodo que estamos sobreescrevendo em
    public String toString(){
        return "Sou a Professora" + " " + this.nomeDoProfessor + " " + "estou na turma" + " " + this.turmaDoProfessor + " " + "Pos graduado "
                + " " + this.posGraduado + " " + "no curso de " + " " + this.especializacao + "recebendo o salario no valor de: " + this.salarioDoProfessor;
    }

}
