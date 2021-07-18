package cadastro;

import Dominio.Professor;

public class ProfessorTeste {

    public static void main(String[] args) {

        Professor profe = new Professor("Monalysa",210,"Professor");

        profe.setEspecializacao("Projetos");
        profe.setTitulo("Professor");
        profe.setAvaliacaoDoProfessor(19890);
        profe.setPosGraducao(false);
        System.out.println("Especialização" + profe.getEspecializacao());
        System.out.println("Titulo" + profe.getTitulo());
        System.out.println("Salario" + profe.getAvaliacaoDoProfessor());
        System.out.println("Pos Graduacao" + profe.getPosGraducao());

        System.out.println(profe);

        Professor profx = new Professor("Tiago","Professor", 210, 1250,true,"ghdgjd");
        System.out.println(profx);
    }


}
