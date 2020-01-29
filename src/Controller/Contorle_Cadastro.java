/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema_de_supermercado.Pessoa;

/**
 *
 * @author Natalo Santos
 */
public class Contorle_Cadastro {
    /*public String Salvar_arq(){
        try{                                                   //tenta executar o codigo e indica que possa ocorrer um exceçaõ(erro)
          FileWriter fw= new FileWriter ("Cadastro.txt",true); //Construtor que recebe o obejeto do tipo cadastro.txt,escreve diretamente no arquivo se ele existir e acrescenta .
           PrintWriter pw= new PrintWriter(fw);               //é praticamente a mesma coisa que o filleWriter so que melhor.
           pw.println("Nome:"+this.nome+";"+"Telefone:"+this.cel+";"+"CPF:"+this.cpf+";"+this.login+";"+this.senha);
           pw.flush();                                       // envia todos os dados naquele momento, obriga a escrever os dados no disco
           pw.close();                                      // fecha o fluxo e libera todos os recursos do sistema associados a ele.
           fw.close();                                      // fecha o fluxo e libera todos os recursos do sistema associados a ele.
            
        }catch (IOException ex){    //serve para tratar as exceçoes(erros)  
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE,null,ex);
        }
       return "Salvo com sucesso";
    } */
    
    
}
