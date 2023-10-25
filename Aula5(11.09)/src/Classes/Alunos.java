package Classes;

public class Alunos extends Pessoa{
    int ra;
    Pessoa responsavel;
    double mediaFinal;




    public Alunos(String nome){
        super(nome);
    }

    public Alunos(String nome, int ra, Pessoa responsavel){
        this(nome);
        this.ra = ra;
        this.responsavel = responsavel;
    }

    @Override
    public String getNome() {
        return "Sr. " + super.getNome();
    }

    @Override
    public String toString(){
        return "Meu nome é " + super.getNome();
    }
}
