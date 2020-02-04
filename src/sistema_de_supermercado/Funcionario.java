package sistema_de_supermercado;

/**
 *
 * @author Matheus Lourenço
 */
public class Funcionario extends Pessoa{
    private double salario;
    private int codFunc;
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setCodFunc(int codFunc){
        this.codFunc = codFunc;
    }
    
    public double getSalario(){
        return this.salario;
    }
    public int getCodFunc(){
        return this.codFunc;
    }
}