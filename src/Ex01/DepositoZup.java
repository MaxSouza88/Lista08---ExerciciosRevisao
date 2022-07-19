import java.util.ArrayList;
import java.util.Scanner;

public class DepositoZup {

    Scanner input = new Scanner(System.in);

    ArrayList<Produtos> listaDeProdutos = new ArrayList<>();

    public DepositoZup() {
        this.listaDeProdutos.add(new Produtos("Coca Cola", "8,00"));
        this.listaDeProdutos.add(new Produtos("Fanta Laranja", "6.00"));
        this.listaDeProdutos.add(new Produtos("Fanta Uva", "6.00"));
        this.listaDeProdutos.add(new Produtos("Xereta Maçã", "5.00"));

    }

    public void adicionarProduto() {

        System.out.println("Digite o nome do Produto");
        String Produto = input.nextLine();

        System.out.println("Digite o preço do Produto");
        String preco = input.next();

        System.out.println("O Produto adicionado foi " + Produto + " preço " + preco);

        this.listaDeProdutos.add(new Produtos(Produto, preco));

    }

    public void exibirTodos() {
        System.out.println("Menu");
        for (int i = 0; i < this.listaDeProdutos.size(); i++) {
            System.out.println("Produto " + this.listaDeProdutos.get(i).getNome() + " Preço " + this.listaDeProdutos.get(i).getPreco());

        }
    }

    public void excluirItem() {
        System.out.println("Digite o nome a ser excluido: ");
        String excluir = input.nextLine();

        boolean excluirItem = false;

        for (int i = 0; i < this.listaDeProdutos.size(); i++) {
            if (this.listaDeProdutos.get(i).getNome().equals(excluir)) {
                this.listaDeProdutos.remove(i);
                System.out.println("Item excluido com Sucesso");
                excluirItem = true;
            }
        }
        if (!excluirItem) {
            System.out.println("Valor não encontrado,favor verificar !!! ");
        }

    }

}
