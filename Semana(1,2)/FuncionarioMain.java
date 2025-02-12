import java.util.Scanner;

public class FuncionarioMain {
    public static void main(String[] args) {
        double desconto = 0.0;
        boolean funcionarioCLT = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o tipo de funcionário (CLT ou PJ): ");
        String tipoFuncionario = scanner.nextLine().toUpperCase();
        System.out.print("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();

        if (tipoFuncionario.equals("CLT")) {
            System.out.print("Digite o valor do desconto: ");
             desconto = scanner.nextDouble();
             funcionarioCLT = true;
        }else if (!tipoFuncionario.equals("CLT") && !tipoFuncionario.equals("PJ")) {
            System.out.println("Tipo de funcionário inválido. Por favor, digite CLT ou PJ.");
            scanner.close();
            return;
        }

        System.out.print("Digite o valor do bônus: ");
        double bonus = scanner.nextDouble();
        scanner.close();

        if (funcionarioCLT) {
            Funcionario clt = new CLT(nome, salarioBase, bonus, desconto);
            clt.imprimir();
        } else {
            Funcionario pj = new PJ(nome, salarioBase, bonus, 0.0);
            pj.imprimir();
            
        }


    }
}