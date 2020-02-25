package sistema_de_supermercado;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo
 */
public class Produto {

    private int codBarras;
    private String nome;
    private double preço;
    private int qtd;
    private double subtotal;

    public Produto() {
    }

    public Produto(int codBarras, String nome, double preço, int qtd, double subtotal) {
        this.codBarras = codBarras;
        this.nome = nome;
        this.preço = preço;
        this.qtd = qtd;
        this.subtotal = subtotal;
    }

    public Produto(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Produto(int cod, String text, double pre, int qd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getSubtotal() {
        return (preço * qtd);
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String cadastrarEst() {
        try {                                                   //Famoso TryCatch, caso dê erro na execução
            FileWriter fw = new FileWriter("Estoque.txt", true); //Recebe o objeto que é o Estoque e escreve no arquivo
            PrintWriter pw = new PrintWriter(fw);               //Quase a mesma coisa, vai entender
            pw.println(this.codBarras + ";" + this.nome + ";" + this.preço + ";" + this.qtd); //Escreve cada um em cada um
            pw.flush();                                       //Grava o conteúdo do buffer no destino
            pw.close();                                      //Fecha o fluxo permanente e libera recursos
            fw.close();

        } catch (IOException ex) {    //serve para tratar as exceçoes(erros)  
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Produto Cadastrado";
    }
    // Formatar o double preço recebido
    public static String priceComDecimal(Double price) {
        DecimalFormat formatter = new DecimalFormat("###,###,###.00");
        return formatter.format(price);
    }
    // Preço sem formatação
    public static String priceSemDecimal(Double price) {
        DecimalFormat formatter = new DecimalFormat("###,###,###.##");
        return formatter.format(price);
    }
    // Retorno com pontos de formatação
    public static String priceToString(Double price) {
        String toShow = priceSemDecimal(price);
        if (toShow.indexOf(".") > 0) {
            return priceComDecimal(price);
        } else {
            return priceSemDecimal(price);
        }
    }
}
