import java.util.Scanner;

public class MainDeposito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DepositoZup r1 = new DepositoZup();

        boolean opcao = true;


        while (opcao == true) {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Para adicionar novo Produto e Preço");
            System.out.println("2 - Para Consultar os Produtos ");
            System.out.println("3 - Para excluir algum Produto");
            System.out.println("4 - Sair do programa");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    Scanner repetirCadastro = new Scanner(System.in);
                    boolean continuarAdicionando = true;

                    while (continuarAdicionando) {
                        r1.adicionarProduto();
                        System.out.println("Deseja adicionar mais Ingredientes? S / N");
                        String cadastrar = repetirCadastro.next();
                        if (cadastrar.equalsIgnoreCase("S")) {
                            continuarAdicionando = false;
                        }
                    }
                    break;
                case 2:
                    r1.exibirTodos();
                    break;
                case 3:
                    Scanner repetirExclusao = new Scanner(System.in);
                    boolean continuarExcluindo = true;
                    while (continuarExcluindo) {
                        r1.excluirItem();
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
