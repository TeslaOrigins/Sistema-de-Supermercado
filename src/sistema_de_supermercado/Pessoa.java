package sistema_de_supermercado;

public class Pessoa {
    protected String nome;
    protected String cel;
    protected String birthDate;
    protected int cpf;
    protected int tipoUser;
    
            
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCel(String cel){
        this.cel = cel;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setTipoUser(int tipoUser){
        this.tipoUser = tipoUser;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getCel(){
        return this.cel;
    }
    public String getBirthDate(){
        return this.birthDate;
    }
    public int getCpf(){
        return this.cpf;
    }
    public int getTipoUser(){
        return this.tipoUser;
    }
}