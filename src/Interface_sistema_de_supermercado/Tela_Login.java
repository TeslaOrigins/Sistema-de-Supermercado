package Interface_sistema_de_supermercado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistema_de_supermercado.CriptografaSenha;
import sistema_de_supermercado.TipoUsuario;

/**
 *
 * @author Natalo Santos
 */
public class Tela_Login extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Login
     */
    public Tela_Login() {
        initComponents();
        this.setLocationRelativeTo(null); //tela no centro
        setResizable(false); //bloqueia o maximizar 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        T1_Login = new javax.swing.JLabel();
        C1_LOGIN = new javax.swing.JTextField();
        C1_SENHA = new javax.swing.JPasswordField();
        Bttn1_Entrar = new javax.swing.JButton();
        Bttn1_Cadastrar = new javax.swing.JButton();
        T1_N_SuperM = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        T1_Login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T1_Login.setForeground(new java.awt.Color(255, 255, 255));

        C1_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1_LOGINActionPerformed(evt);
            }
        });

        C1_SENHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1_SENHAActionPerformed(evt);
            }
        });

        Bttn1_Entrar.setBackground(new java.awt.Color(51, 51, 51));
        Bttn1_Entrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bttn1_Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Bttn1_Entrar.setText("Entrar");
        Bttn1_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn1_EntrarActionPerformed(evt);
            }
        });

        Bttn1_Cadastrar.setBackground(new java.awt.Color(51, 51, 51));
        Bttn1_Cadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bttn1_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Bttn1_Cadastrar.setText("Cadastrar Funcionário");
        Bttn1_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn1_CadastrarActionPerformed(evt);
            }
        });

        T1_N_SuperM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        T1_N_SuperM.setForeground(new java.awt.Color(255, 255, 255));
        T1_N_SuperM.setText("       SUPERMERCADO  DO TEAM STI");

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AUTENTICAÇÃO DE USUÁRIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon_login.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon_password (2).png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Bttn1_Entrar)
                            .addGap(18, 18, 18)
                            .addComponent(Bttn1_Cadastrar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(274, 274, 274)
                            .addComponent(T1_Login))
                        .addComponent(C1_SENHA)
                        .addComponent(C1_LOGIN))
                    .addComponent(T1_N_SuperM, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(T1_N_SuperM, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(T1_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C1_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C1_SENHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bttn1_Entrar)
                    .addComponent(Bttn1_Cadastrar))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bttn1_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn1_CadastrarActionPerformed
        Tela_Cadastro Tela_C;
        Tela_C = new Tela_Cadastro();
        Tela_C.setVisible(true);
        Tela_C.setLocationRelativeTo(null);
        Tela_C.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_Bttn1_CadastrarActionPerformed

    private void Bttn1_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn1_EntrarActionPerformed
        File cadastro = new File("Cadastro.txt");
        int tipo = 0;
        boolean achou = false;
        String login = C1_LOGIN.getText().trim();
        String senha = CriptografaSenha.encryptPasswd(String.valueOf(C1_SENHA.getPassword()), CriptografaSenha.SECRET_KEY); //usa valueOf pq o campo é senha é um char, e queremos o text.

        try {
            Scanner in = new Scanner(new File("Cadastro.txt"));
            while (in.hasNextLine()) {
                String s = in.nextLine();
                String[] sArray = s.split(";");
                String tipoUser = sArray[5];

                if (login.equals(sArray[3]) && senha.equals(sArray[4])) {
                    if(tipoUser.equals(TipoUsuario.usuarioFuncionarioToString())){
                        tipo = TipoUsuario.USUARIO_FUNCIONARIO_INT;
                    } else if(tipoUser.equals(TipoUsuario.usuarioGerenteToString())){
                        tipo = TipoUsuario.USUARIO_GERENTE_INT;
                    } else if(tipoUser.equals(TipoUsuario.usuarioChefeToString())){
                        tipo = TipoUsuario.USUARIO_CHEFE_INT;
                    }
                }
            }
            switch(tipo){
                case TipoUsuario.USUARIO_FUNCIONARIO_INT:
                JOptionPane.showMessageDialog(null, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                Tela_Interna_Funcionario Tela_IF = new Tela_Interna_Funcionario(); //chama a tela interna funcionario
                Tela_IF.setVisible(true);                  // serve para mostrar o Jframe na tela
                Tela_IF.setLocationRelativeTo(null);       // tela no centro
                Tela_IF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                this.dispose();                           //fecha a tela após o click
                break;
                case TipoUsuario.USUARIO_GERENTE_INT:
                JOptionPane.showMessageDialog(null, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                Tela_Interna_Gerente Tela_IG = new Tela_Interna_Gerente(); //chama a tela interna gerente
                Tela_IG.setVisible(true);                  // serve para mostrar o Jframe na tela
                Tela_IG.setLocationRelativeTo(null);       // tela no centro
                Tela_IG.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                this.dispose();
                break;
                case TipoUsuario.USUARIO_CHEFE_INT:
                JOptionPane.showMessageDialog(null, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                Tela_Busca Tela_B = new Tela_Busca(); //chama a tela interna Chefe
                Tela_B.setVisible(true);                  // serve para mostrar o Jframe na tela
                Tela_B.setLocationRelativeTo(null);       // tela no centro
                Tela_B.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                this.dispose();
                break;
                default:
                JOptionPane.showMessageDialog(null, "senha/login incorreto", "erro", JOptionPane.ERROR_MESSAGE);
            }

            in.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "User Database Not Found", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Bttn1_EntrarActionPerformed

    private void C1_SENHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1_SENHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1_SENHAActionPerformed

    private void C1_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1_LOGINActionPerformed

    }//GEN-LAST:event_C1_LOGINActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bttn1_Cadastrar;
    private javax.swing.JButton Bttn1_Entrar;
    private javax.swing.JTextField C1_LOGIN;
    private javax.swing.JPasswordField C1_SENHA;
    private javax.swing.JLabel T1_Login;
    private javax.swing.JLabel T1_N_SuperM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
