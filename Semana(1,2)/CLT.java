public class CLT extends Funcionario {
    public CLT(String nome, double salario, double bonos, double descontos){
        super(nome, salario, bonos, descontos);
    }
    public double calcularSalario(){
        return getSalario() + getBonos() ;
    }
}