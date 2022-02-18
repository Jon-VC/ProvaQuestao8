import java.util.Scanner;

public class Metodos {

    public static void Cadastrar() {
        System.out.println("Quantos funcionários deseja cadastrar?");
        Scanner func = new Scanner(System.in);
        int numero = func.nextInt();
        int i = 0;
        while (i != numero) {
            System.out.println("Insira o nome do funcionário que deseja cadastrar:");
            String funcionario = func.nextLine();
            Pessoa.funcionarios.add(i, funcionario);
            i++;
        }
    }
}
