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
    private double preco;
    private int qtd;
    private double subtotal;
    private String totPagamento; //Criado para fazer exportação do Pagamento total

    public Produto() {
    }

    public Produto(int codBarras, String nome, double preco, int qtd, double subtotal) {
        this.codBarras = codBarras;
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        this.subtotal = subtotal;
    }

    public Produto(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Produto(int cod, String text, double pre, int qd) {
        this.codBarras = cod;
        this.nome = text;
        this.preco = pre;
        this.qtd = qd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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
        return (preco * qtd);
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getTotPagamento() {
        return totPagamento;
    }

    public void setTotPagamento(String totPagamento) {
        this.totPagamento = totPagamento;
    }

    public String cadastrarEst() {
        try {                                                   //Famoso TryCatch, caso dê erro na execução
            FileWriter fw = new FileWriter("Estoque.txt", true); //Recebe o objeto que é o Estoque e escreve no arquivo
            PrintWriter pw = new PrintWriter(fw);               //Quase a mesma coisa, vai entender
            pw.println(this.codBarras + ";" + this.nome + ";" + this.preco + ";" + this.qtd); //Escreve cada um em cada um
            pw.flush();                                       //Grava o conteúdo do buffer no destino
            pw.close();                                      //Fecha o fluxo permanente e libera recursos
            fw.close();

        } catch (IOException ex) {    //serve para tratar as exceçoes(erros)  
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Produto Cadastrado";
    }
    
    public String removerEst(Integer compara) throws IOException {
        try{                                                   //tenta executar o codigo e indica que possa ocorrer um exceçaõ(erro)
            Scanner in = new Scanner(new File("Estoque.txt")); //Construtor que recebe o obejeto do tipo cadastro.txt,escreve diretamente no arquivo se ele existir e acrescenta .
            FileWriter fw = new FileWriter ("ARQUIVO-tmp",true);
            StringBuilder arq = new StringBuilder();
            String s;
            while(in.hasNextLine()){
                s = in.nextLine();
                String[] sArray = s.split(";");
                
                if(Integer.parseInt(sArray[0]) != compara){
                    arq.append(s);
                    arq.append('\n');
                }                
            }
            fw.write(arq.toString());
            fw.flush();                                       // envia todos os dados naquele momento, obriga a escrever os dados no disco
            fw.close();                                       // fecha o fluxo e libera todos os recursos do sistema associados a ele.
            
            new File("Estoque.txt").delete();
            new File("ARQUIVO-tmp").renameTo(new File("Estoque.txt"));   
        }catch (IOException ex){    //serve para tratar as exceçoes(erros)  
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return "Removido com sucesso";
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
