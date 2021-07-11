package cadastro;

import java.util.Scanner;

public class Cadastro {

    //private static String nomeDoAluno;
    private static String[] nomesDoAlunos;
    private static String[] turmasCadastradas;
    private static float[] notaPrimeiraAvaliacao;
    private static float[] notaSegundaAvaliacao;
    //private static float[] mediaFinal;
    //private static float[] situacaoDoAluno;

    //private static boolean sairdoPrograma;

    private static int index;

    private static final int QTDE = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        nomesDoAlunos = new String[QTDE];
        turmasCadastradas = new String[QTDE];
        notaPrimeiraAvaliacao = new float[QTDE];
        notaSegundaAvaliacao = new float[QTDE];
        //mediaFinal = new float[QTDE];
        //situacaoDoAluno = new float[QTDE];

        String opcao = null;



        do {
            System.out.println("[1] Registrar as notas de um novo aluno.");
            System.out.println("[2] Consultar boletim de um aluno.");
            System.out.println("[3] Consultar notas da turma.");
            System.out.println("[4] Sair");

            System.out.println("Informe a opção desejada: ");
            opcao = in.next();

            switch (opcao) {
            case "1":
                if(index < QTDE){
                    System.out.println("Nome do Aluno: ");
                    nomesDoAlunos[index] = in.next();
                    System.out.println("Turma cadastrada: ");
                    turmasCadastradas[index] = in.next();
                    System.out.println("Nota da AV1: ");
                    notaPrimeiraAvaliacao[index] = in.nextFloat();
                    System.out.println("Nota da AV2: ");
                    notaSegundaAvaliacao[index] = in.nextFloat();

                    //index++;

                    System.out.println("Aluno cadastrato no codigo: " + (index++));
                }else{
                    System.out.println("Acabou as vagas para cadastro!");
                }


                break;
            case "2":
                System.out.println("Informe o codigo do Aluno: ");
                int pos = in.nextInt();

                if(pos >= 0 && pos < index){
                    imprimir(pos);
                }else{
                    System.out.println("Aluno não encontrato, por favor verifique o codigo informado ");
                }


                break;
            case "3":
                imprimir();

                break;
            default:
                System.out.println("Finalizando Sistema !!!");
                break;
        }

        System.out.println("Opção: " + opcao);

        }while(!opcao.equals("4"));

        exibirRelatorio();


        in.close();

         System.out.println("Ate mais tenha um otimo dia !!!");
    }


    private static float calcularMediaNotas(){
        float soma = 0;

        for(int i = 0; i < index; i++){
            soma = soma + calcularMedia(i);
        }

        return soma / index;
    }
    private static void exibirRelatorio(){
        int qtde = index;
        float media = calcularMediaNotas();
        System.out.println("Relatório: ");
        System.out.println("Quantidade de alunos: " + qtde);
        System.out.println("Media de notas dos alunos: " + media);
    }


    private static void imprimir() {
        System.out.println("Notas do Aluno selecionado: ");
        for(int i = 0; i < index; i++){
            imprimir(i);
        }

    }

    private static void imprimir(int posicao){
        System.out.printf("%d Nome do Aluno: %s     Nota da Primeira Prova: %.2f\n     Nota da Segunda Prova: %.2f\n =    Media final: %.2f (%s)\n",
               posicao + 1,
                nomesDoAlunos[posicao],
                notaPrimeiraAvaliacao[posicao],
                notaSegundaAvaliacao[posicao],
                calcularMedia(posicao),
                getSituacaoDoAluno(posicao)
        );
    }

    private static float calcularMedia(int posicao) {
        return (notaPrimeiraAvaliacao[posicao] + notaSegundaAvaliacao[posicao]) / 2;

    }

   private static String getSituacaoDoAluno(int posicao){
       String situacao = null;
        if (calcularMedia(posicao) < 4){
            return "reprovado";
        } else if (calcularMedia(posicao) > 4 &&  calcularMedia(posicao) < 7){
            return "Prova final";
        } else {
            return "Aprovado";
        }
   }
}
