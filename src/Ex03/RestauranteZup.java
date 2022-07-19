import java.util.ArrayList;
import java.util.Scanner;

public class RestauranteZup {

    Scanner input = new Scanner(System.in);

    String ingrediente;

    ArrayList<Cardapio> listaDePratos = new ArrayList<>();
    ArrayList<Ingrediente> listaDeIngrediente = new ArrayList<>();


    public RestauranteZup() {
        this.listaDePratos.add(new Cardapio("Macarronada"));
        this.listaDeIngrediente.add(new Ingrediente("Macarrão"));
    }



    public void adicionaPrato(){
        System.out.println("Digite o nome do prato");
        String nomePrato = input.nextLine();

        System.out.println("Digite o ingrediente: ");
        ingrediente = input.nextLine();

        this.listaDePratos.add(new Cardapio(nomePrato));
        this.listaDeIngrediente.add(new Ingrediente(ingrediente));
    }

    public void adicionaIngrediente(){

        System.out.println("Digite novo ingrediente");
        ingrediente = input.nextLine();
        this.listaDeIngrediente.add(new Ingrediente(ingrediente));
    }

    public void exibirMenu() {
        System.out.println("Menu");
        for (int i = 0; i < this.listaDePratos.size(); i++) {
            System.out.println("Produto " + this.listaDePratos.get(i).getNomePrato() + " Ingrediente " + this.listaDeIngrediente.get(i).getIngrediente());

        }
    }

    public void excluirPrato() {
        System.out.println("Digite o nome a ser excluido: ");
        String excluir = input.nextLine();

        boolean excluirItem = false;

        for (int i = 0; i < this.listaDePratos.size(); i++) {
            if (this.listaDePratos.get(i).getNomePrato().equals(excluir)) {
                this.listaDePratos.remove(i);
                System.out.println("Item excluido com Sucesso");
                excluirItem = true;
            }
        }
        if (!excluirItem) {
            System.out.println("Valor não encontrado,favor verificar !!! ");
        }

    }





}
