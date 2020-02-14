package sistema_de_supermercado;

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

    public Produto() {}

    public Produto(int codBarras, String nome, double preço,  int qtd, double subtotal) {
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
        return (preço*qtd);
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

}
