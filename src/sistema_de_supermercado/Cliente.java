package sistema_de_supermercado;

public class Cliente extends Pessoa{
    private Integer metodoPag;
    private String lista;
    
    public Cliente(String nome, String cel, String birthDate, int cpf, int tipoUser, Integer metodoPag, String lista){
        super.nome = nome;
        super.cel = cel;
        super.birthDate = birthDate;
        super.cpf = cpf;
        super.tipoUser = tipoUser;
        this.metodoPag = metodoPag;
        this.lista = lista;
    }
    public Cliente(){}
    
    public void setMetodoPag(){
        this.metodoPag = metodoPag;
    }    
    public void setLista(){
        this.lista = lista;
    }
    
    public Integer getMetodoPag(){
        return this.metodoPag;
    }
    public String getLista(){
        return this.lista;
    }
}