package Interface_sistema_de_supermercado;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sistema_de_supermercado.Pessoa;
import Controller.Controle_Cadastro;
import sistema_de_supermercado.CriptografaSenha;
import sistema_de_supermercado.TipoUsuario;

/**
 *
 * @author Natalo Santos
 */
public class Tela_Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Cadastro
     */
    public Tela_Cadastro() {
        initComponents();
        this.setLocationRelativeTo(null); //ela no centro
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

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        T2_Cabeçalho = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        T1_Nome = new javax.swing.JLabel();
        T1_telefone = new javax.swing.JLabel();
        T1_CPF = new javax.swing.JLabel();
        T2_login = new javax.swing.JLabel();
        T2_Senha = new javax.swing.JLabel();
        C1_Nome = new javax.swing.JTextField();
        C1_telefone = new javax.swing.JFormattedTextField();
        C1_CPF = new javax.swing.JFormattedTextField();
        C2_Login = new javax.swing.JTextField();
        C2_Senha = new javax.swing.JPasswordField();
        T1_Cargo = new javax.swing.JLabel();
        C1_Cargo = new javax.swing.JTextField();
        T1_nvl_acesso = new javax.swing.JLabel();
        CB_NVL_ACESSO = new javax.swing.JComboBox<>();
        Bttn1_Cancelar = new javax.swing.JButton();
        Bttn1_Cadastrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));

        T1_Nome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T1_Nome.setForeground(new java.awt.Color(255, 255, 255));
        T1_Nome.setText("Nome:");

        T1_telefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T1_telefone.setForeground(new java.awt.Color(255, 255, 255));
        T1_telefone.setText("Telefone:");

        T1_CPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T1_CPF.setForeground(new java.awt.Color(255, 255, 255));
        T1_CPF.setText("CPF:");

        T2_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T2_login.setForeground(new java.awt.Color(255, 255, 255));
        T2_login.setText("Login:");

        T2_Senha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T2_Senha.setForeground(new java.awt.Color(255, 255, 255));
        T2_Senha.setText("Senha:");

        C1_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1_NomeActionPerformed(evt);
            }
        });

        try {
            C1_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        C1_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1_telefoneActionPerformed(evt);
            }
        });

        try {
            C1_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        C1_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1_CPFActionPerformed(evt);
            }
        });

        C2_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2_LoginActionPerformed(evt);
            }
        });

        C2_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2_SenhaActionPerformed(evt);
            }
        });

        T1_Cargo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T1_Cargo.setForeground(new java.awt.Color(255, 255, 255));
        T1_Cargo.setText("Cargo:");

        C1_Cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1_CargoActionPerformed(evt);
            }
        });

        T1_nvl_acesso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T1_nvl_acesso.setForeground(new java.awt.Color(255, 255, 255));
        T1_nvl_acesso.setText("Nível de acesso:");

        CB_NVL_ACESSO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CB_NVL_ACESSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_NVL_ACESSOActionPerformed(evt);
            }
        });

        Bttn1_Cancelar.setBackground(new java.awt.Color(102, 0, 0));
        Bttn1_Cancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bttn1_Cancelar.setText("Cancelar");
        Bttn1_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn1_CancelarActionPerformed(evt);
            }
        });

        Bttn1_Cadastrar.setBackground(new java.awt.Color(0, 102, 0));
        Bttn1_Cadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bttn1_Cadastrar.setText("Cadastrar");
        Bttn1_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn1_CadastrarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO FUNCIONÁRIOS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(174, 174, 174))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T1_telefone)
                            .addComponent(T1_Nome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(T1_CPF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(T2_Senha)
                                .addComponent(T2_login)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(C2_Login, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C1_telefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C1_CPF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C1_Nome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C2_Senha))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(T1_Cargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C1_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(T1_nvl_acesso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CB_NVL_ACESSO, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Bttn1_Cadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(Bttn1_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T1_Nome)
                    .addComponent(C1_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T1_Cargo)
                    .addComponent(C1_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T1_telefone)
                    .addComponent(C1_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T1_nvl_acesso)
                    .addComponent(CB_NVL_ACESSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T1_CPF)
                    .addComponent(C1_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T2_login)
                    .addComponent(C2_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T2_Senha)
                    .addComponent(C2_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bttn1_Cancelar)
                    .addComponent(Bttn1_Cadastrar))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(T2_Cabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T2_Cabeçalho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bttn1_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn1_CadastrarActionPerformed

        Pessoa cadastro = new Pessoa();
        cadastro.setNome(C1_Nome.getText());
        cadastro.setCel(C1_telefone.getText());
        cadastro.setCpf(C1_CPF.getText());
        cadastro.setLogin(C2_Login.getText());
        cadastro.setSenha(CriptografaSenha.encryptPasswd(String.valueOf(C2_Senha.getPassword()), CriptografaSenha.SECRET_KEY));
        cadastro.setTipoUser(TipoUsuario.USUARIO_FUNCIONARIO);

        JOptionPane.showMessageDialog(null, cadastro.Salvar_arq());
    }//GEN-LAST:event_Bttn1_CadastrarActionPerformed

    private void Bttn1_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn1_CancelarActionPerformed
        Tela_Login Tela_L = new Tela_Login(); //chama a tela de cadastro
        Tela_L.setVisible(true);             // serve para mostrar o Jframe na tela
        Tela_L.setLocationRelativeTo(null);     // tela no centro
        Tela_L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();        //fecha a tela após o click
    }//GEN-LAST:event_Bttn1_CancelarActionPerformed

    private void C2_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2_SenhaActionPerformed

    private void C2_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2_LoginActionPerformed

    private void C1_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1_CPFActionPerformed

    private void C1_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1_telefoneActionPerformed

    private void C1_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1_NomeActionPerformed

    private void CB_NVL_ACESSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_NVL_ACESSOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_NVL_ACESSOActionPerformed

    private void C1_CargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1_CargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1_CargoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bttn1_Cadastrar;
    private javax.swing.JButton Bttn1_Cancelar;
    private javax.swing.JFormattedTextField C1_CPF;
    private javax.swing.JTextField C1_Cargo;
    private javax.swing.JTextField C1_Nome;
    private javax.swing.JFormattedTextField C1_telefone;
    private javax.swing.JTextField C2_Login;
    private javax.swing.JPasswordField C2_Senha;
    private javax.swing.JComboBox<String> CB_NVL_ACESSO;
    private javax.swing.JLabel T1_CPF;
    private javax.swing.JLabel T1_Cargo;
    private javax.swing.JLabel T1_Nome;
    private javax.swing.JLabel T1_nvl_acesso;
    private javax.swing.JLabel T1_telefone;
    private javax.swing.JLabel T2_Cabeçalho;
    private javax.swing.JLabel T2_Senha;
    private javax.swing.JLabel T2_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
