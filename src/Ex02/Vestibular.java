import java.util.ArrayList;
import java.util.Scanner;

public class Vestibular {

    Scanner input = new Scanner(System.in);

    ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastroAluno() {
        System.out.println("Digite o numero de matrícula do Aluno");
        String mat1 = input.next();

        System.out.println("Digite a nota do Aluno");
        String not1 = input.next();

        this.alunos.add(new Aluno(mat1, not1));
    }

    public void exibeCadastros() {
        System.out.println("Menu");
        for (int i = 0; i < this.alunos.size(); i++) {
            System.out.println("Matricula cadastrada " + this.alunos.get(i).getMatricula() + " Nota do Aluno " + this.alunos.get(i).getNota());

        }
    }
    public void excluirItem() {

        boolean excluirItem = false;

        System.out.println("Digite a matricula a ser excluido: ");
        String removerMatricula = input.nextLine();

        for (int i = 0; i < this.alunos.size(); i++) {
            if (this.alunos.get(i).getMatricula().equals(removerMatricula)) {
                this.alunos.remove(i);
                System.out.println("Item excluido com Sucesso");
                excluirItem = true;
            }
        }
        if (!excluirItem) {
            System.out.println("Matricula não encontrada,favor verificar !!! ");
        }

    }
}
