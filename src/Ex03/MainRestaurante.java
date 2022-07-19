import java.util.Scanner;

public class MainRestaurante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        RestauranteZup r1 = new RestauranteZup();

        boolean opcao = true;

        while (opcao == true) {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Para adicionar novo Prato e Ingrediente");
            System.out.println("2 - Para exibir o menu ");
            System.out.println("3 - Para excluir Prato");
            System.out.println("4 - Sair do programa");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    Scanner repetirIngrediente= new Scanner(System.in);

                    boolean adicionarIngrediente = true;

                    while (adicionarIngrediente) {
                        r1.adicionaPrato();

                        System.out.println("Deseja adicionar mais ingredientes? S / N");
                        String cadastrar = repetirIngrediente.next();

                        if (cadastrar.equalsIgnoreCase("S")) {
                            r1.adicionaIngrediente();
                        }else {
                            adicionarIngrediente = false;
                        }
                    }
                    break;
                case 2:
                    r1.exibirMenu();
                    break;
                case 3:
                    Scanner repetirExclusao = new Scanner(System.in);
                    boolean continuarExcluindo = true;
                    while (continuarExcluindo) {
                        r1.excluirPrato();
                        System.out.println("Deseja excluir mais intens? S / N");
                        String excluir = repetirExclusao.next();
                        if (excluir.equalsIgnoreCase("n")) {
                            continuarExcluindo = false;
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

