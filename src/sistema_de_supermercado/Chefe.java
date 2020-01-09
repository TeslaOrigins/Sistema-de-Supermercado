package sistema_de_supermercado;

public class Chefe extends Pessoa{
    
    public Chefe(String nome, String cel, String birthDate, int cpf, int tipoUser){
        super.nome = nome;
        super.cel = cel;
        super.birthDate = birthDate;
        super.cpf = cpf;
        super.tipoUser = tipoUser;
    }
    public Chefe(){}
    
    public double pagarSalario(){
        
    }
    
    public void contratar(){
        Cliente c = new Cliente();
    }
    
    public void demitir(){
        
    }
}