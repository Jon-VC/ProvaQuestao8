import java.util.Scanner;

public class Metodos {

    //Cadastra quantidade de entradas, usuario e salario
    public static void Cadastrar() {
        System.out.println("Quantos funcionários deseja cadastrar?");
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        int i = 0;
        int contador;
        while (i != numero) {
            contador = i + 1;
            Scanner c = new Scanner(System.in);
            Scanner e = new Scanner(System.in);
            System.out.println("Insira o nome do " + contador + "º funcionário que deseja cadastrar:");
            String funcionario = c.nextLine();
            Pessoa.funcionarios.add(i, funcionario);
            System.out.println("Insira o salário do funcionário:");
            double salario = e.nextDouble();
            while(salario < 0){
                System.out.println("Salario invalido! Tente novamente:");
                salario = e.nextDouble();
            }
            Pessoa.salarios.add(i, salario);
            i++;
        }
    }

    //Imprime na tela a folha final com os dados
    public static void folha() {
        for (int i = 0; i < Pessoa.funcionarios.size(); i++){
            System.out.println("Funcionário: " + Pessoa.funcionarios.get(i));
            System.out.println("Salário: " + Pessoa.salarios.get(i));
            calculoVarianca(i);
        }
    }

    //faz os calculos do abono\disconto e o salario liquido do funcionario
    private static void calculoVarianca(int i) {
        double abono;
        double desconto;
        double liquido;
        if(Pessoa.salarios.get(i) <= 1000){
            abono = Pessoa.salarios.get(i) * 0.20;
            liquido = Pessoa.salarios.get(i) + abono;
            System.out.println("Abono: " + abono);
            System.out.println("Salário líquido: " + liquido);
        }else if (Pessoa.salarios.get(i) > 1000 && Pessoa.salarios.get(i) <= 2000){
            abono = Pessoa.salarios.get(i) * 0.10;
            liquido = Pessoa.salarios.get(i) + abono;
            System.out.println("Abono: " + abono);
            System.out.println("Salário líquido: " + liquido);
        }else{
            desconto = Pessoa.salarios.get(i) * 0.10;
            liquido = Pessoa.salarios.get(i) - desconto;
            System.out.println("Desconto: " + desconto);
            System.out.println("Salário líquido: " + liquido);
        }
        System.out.println("---------------------------");
    }
}
