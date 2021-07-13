package cadastro;

import Dominio.Professor;

public class ProfessorTeste {

    public static void main(String[] args) {

        Professor profe = new Professor("Monalysa",210);

        profe.setEspecializacao("Projetos");
        profe.setSalarioDoProfessor(19890);
        profe.setPosGraducao(false);
        System.out.println("Especialização" + profe.getEspecializacao());
        System.out.println("Salario" + profe.getSalarioDoProfessor());
        System.out.println("Pos Graduacao" + profe.getPosGraducao());

        System.out.println(profe);

        Professor profx = new Professor("Tiago", 210, 1250,true,"ghdgjd");
        System.out.println(profx);
    }


}
