package sistema_de_supermercado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus Lourenço
 */
public class Pessoa {
    protected String nome;
    protected String cel;
    protected String birthDate;
    protected String cpf;
    protected int tipoUser;
    protected String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    protected String senha;
    
            
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCel(String cel){
        this.cel = cel;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    public void setCpf(String cpf){
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
    public String getCpf(){
        return this.cpf;
    }
    public int getTipoUser(){
        return this.tipoUser;
    }    
    public String cadastrarArq(){
        try{                                                   //tenta executar o codigo e indica que possa ocorrer um exceçaõ(erro)
          FileWriter fw= new FileWriter ("Cadastro.txt",true); //Construtor que recebe o obejeto do tipo cadastro.txt,escreve diretamente no arquivo se ele existir e acrescenta .
           PrintWriter pw= new PrintWriter(fw);               //é praticamente a mesma coisa que o filleWriter so que melhor.
           pw.println(this.nome+";"+this.cel+";"+this.cpf+";"+this.login+";"+this.senha+";"+this.tipoUser);
           pw.flush();                                       // envia todos os dados naquele momento, obriga a escrever os dados no disco
           pw.close();                                      // fecha o fluxo e libera todos os recursos do sistema associados a ele.
           fw.close();                                      // fecha o fluxo e libera todos os recursos do sistema associados a ele.
            
        }catch (IOException ex){    //serve para tratar as exceçoes(erros)  
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE,null,ex);
        }
       return "Salvo com sucesso";
    }
    
    public static String alterarArq(String palavraAntiga, String palavraNova) throws IOException {
        String arquivo = "Perguntas.txt";
        String arquivoTmp = "ARQUIVO-tmp";

        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoTmp));
        BufferedReader reader = new BufferedReader(new FileReader(arquivo));

        String linha;
        while ((linha = reader.readLine()) != null) {
            if (linha.contains(palavraAntiga)) {
                linha = linha.replace(palavraAntiga, palavraNova);
            }
            writer.write(linha + ";");
        }
        writer.write("\n");
        
        writer.close();
        reader.close();

        new File(arquivo).delete();
        new File(arquivoTmp).renameTo(new File(arquivo));
        
        return "Alterado com sucesso";
    }
    
}