public abstract class Funcionario{
    String nome;
    double Salario;
    double bonos;
    double descontos;

    public Funcionario(String nome, double Salario, double bonos, double descontos){
        this.nome = nome;
        this.Salario = Salario;
        this.bonos = bonos;
        this.descontos = descontos;
    }
    public double getSalario(){
        return Salario;
    }
    public double getBonos(){
        return bonos;
    }
    public double getDescontos(){
        return descontos;
    }
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + Salario);
        System.out.println("Bonos: " + bonos);
        System.out.println("Descontos: " + descontos);
        System.out.println("Salário líquido: " + calcularSalario());
    }
    public abstract double calcularSalario();
}