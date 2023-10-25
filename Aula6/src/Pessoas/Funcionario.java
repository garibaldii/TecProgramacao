package Pessoas;

public abstract class Funcionario extends Pessoa {
    protected float salarioBase;

    public Funcionario(String nome, String genero, int idade, float salarioBase) {
        super(nome, genero, idade);
        this.salarioBase = salarioBase;
    }

    public abstract double calculaSalario();

    @Override
    
    public String getNome() {

        if (super.getGenero().equals("masculino")) {

            return "Sr. " + super.nome;

        } else {
            return "Sra. " + super.nome;
        }

    }
    
    public float getSalarioBase(){
        return salarioBase;
    }
    

    public float setSalarioBase(float salarioBase){
        this.salarioBase = salarioBase;

        return salarioBase;
    }



    public void registrarPonto() {
    };// Acessar o BD e registrar o horário //

    

}
