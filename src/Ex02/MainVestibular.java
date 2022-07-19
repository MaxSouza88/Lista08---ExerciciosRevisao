import java.util.Scanner;

public class MainVestibular {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Vestibular v1 = new Vestibular();

        boolean opcao = true;

        while (opcao == true) {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Para adicionar nova Matricula e Nota do Aluno");
            System.out.println("2 - Para Consultar Matrículas cadastradas ");
            System.out.println("3 - Para excluir Matrícula");
            System.out.println("4 - Sair do programa");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    Scanner repetirCadastro = new Scanner(System.in);

                    boolean addAluno = true;

                    while (addAluno) {
                        v1.cadastroAluno();
                        System.out.println("Deseja repetir operação? S / N");
                        String cadastrar = repetirCadastro.next();
                        if (cadastrar.equalsIgnoreCase("n")) {
                            addAluno = false;
                        }
                    }
                    break;
                case 2:
                    v1.exibeCadastros();
                    break;
                case 3:
                    Scanner excluirMatricula = new Scanner(System.in);

                    boolean excluiMatric = true;

                    while (excluiMatric) {
                        v1.excluirItem();
                        System.out.println("Deseja excluir mais intens? S / N");
                        String excluiMat = excluirMatricula.next();
                        if (excluiMat.equalsIgnoreCase("n")) {
                            excluiMatric = false;
                        }
                    }
                    break;

                case 4:
                    opcao = false;
                    break;
                default:
                    System.out.println("Opção Inválida");

            }
        }
    }


}
