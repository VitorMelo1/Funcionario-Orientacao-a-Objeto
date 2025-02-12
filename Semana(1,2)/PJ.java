public class PJ extends Funcionario {
    // public PJ(String nome, double salario, double bonus, double desconto) {
    //     super(nome, salario, bonus, desconto);
    // }

    // public double calcularSalario() {
    //     return getSalario() + getBonus();
    // }
    public PJ(String nome, double salario, double bonos, double descontos){
        super(nome, salario, bonos, descontos);
    }
    public double calcularSalario(){
        return getSalario() + getBonos();
    }
}   
