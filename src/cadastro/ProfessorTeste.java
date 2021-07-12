package cadastro;

import Dominio.Professor;

public class ProfessorTeste {

    public static void main(String[] args) {

        Professor prof = new Professor();

        prof.nomeDoProfessor = "Monalysa";
        prof.especializacao = "Gestão de Projetos";
        prof.salarioDoProfessor = 19890;
        prof.turmaDoProfessor = 210;
        prof.posGraduado= false;

        System.out.println(prof);
    }
}
