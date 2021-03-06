package Interface_sistema_de_supermercado;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sistema_de_supermercado.Pessoa;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import sistema_de_supermercado.CriptografaSenha;
import sistema_de_supermercado.TipoUsuario;
import sistema_de_supermercado.ValidarCPF;

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
        Bttn1_Alterar.setVisible(false);
        C1_Cargo.setVisible(false);
        T1_Cargo.setVisible(false);
    }

    public void alteraFuncionario(String funcionario) throws FileNotFoundException, Exception {
        Scanner in = new Scanner(new File("Cadastro.txt"));

        while (in.hasNextLine()) {
            String s = in.nextLine();
            String[] sArray = s.split(";");

            if (funcionario.equals(sArray[0])) {
                C1_Nome.setText(funcionario);
                C1_telefone.setText(sArray[1]);
                C1_CPF.setText(sArray[2]);
                C2_Login.setText(sArray[3]);
                C2_Senha.setText(CriptografaSenha.decryptPasswd(sArray[4]));
                C1_Cargo.addItem(sArray[5]);
                loginAlterar = sArray[3];
            }
        }        
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        Bttn1_Cancelar = new javax.swing.JButton();
        Bttn1_Cadastrar = new javax.swing.JButton();
        Bttn1_Alterar = new javax.swing.JButton();
        T1_Cargo = new javax.swing.JLabel();
        C1_Cargo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel5.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO FUNCIONÁRIOS");
        jLabel1.setVerifyInputWhenFocusTarget(false);

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

        Bttn1_Cancelar.setBackground(new java.awt.Color(192, 57, 43));
        Bttn1_Cancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bttn1_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Bttn1_Cancelar.setText("Cancelar");
        Bttn1_Cancelar.setMaximumSize(new java.awt.Dimension(98, 35));
        Bttn1_Cancelar.setMinimumSize(new java.awt.Dimension(98, 35));
        Bttn1_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn1_CancelarActionPerformed(evt);
            }
        });

        Bttn1_Cadastrar.setBackground(new java.awt.Color(0, 102, 0));
        Bttn1_Cadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bttn1_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Bttn1_Cadastrar.setText("Cadastrar");
        Bttn1_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn1_CadastrarActionPerformed(evt);
            }
        });

        Bttn1_Alterar.setBackground(new java.awt.Color(248, 148, 6));
        Bttn1_Alterar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bttn1_Alterar.setForeground(new java.awt.Color(255, 255, 255));
        Bttn1_Alterar.setText("Alterar");
        Bttn1_Alterar.setMaximumSize(new java.awt.Dimension(98, 35));
        Bttn1_Alterar.setMinimumSize(new java.awt.Dimension(98, 35));
        Bttn1_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn1_AlterarActionPerformed(evt);
            }
        });

        T1_Cargo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        T1_Cargo.setForeground(new java.awt.Color(240, 240, 240));
        T1_Cargo.setText("Selecione seu cargo:");

        C1_Cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selecione---", "Funcionário", "Gerente", "Chefe" }));
        C1_Cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1_CargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(T1_Nome))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(T1_telefone)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(T2_login)
                            .addComponent(T1_CPF)
                            .addComponent(T2_Senha))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Bttn1_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bttn1_Cadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(Bttn1_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(C1_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(C2_Login, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C1_telefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                .addComponent(C2_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(C1_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(T1_Cargo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C1_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(178, Short.MAX_VALUE)
                        .addComponent(T2_Senha))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(C1_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(T1_Cargo)
                                .addComponent(C1_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(T1_Nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T1_telefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(C1_telefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C1_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T1_CPF))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C2_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T2_login))
                        .addGap(18, 18, 18)
                        .addComponent(C2_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bttn1_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bttn1_Cadastrar)
                    .addComponent(Bttn1_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private void limpar_Campos() {
        C1_Nome.setText(null);
        C1_telefone.setText(null);
        C1_CPF.setText(null);
        C2_Login.setText(null);
        C2_Senha.setText(null);

    }


    private void Bttn1_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn1_CadastrarActionPerformed
        Pessoa cadastro = new Pessoa();
        try {
            cadastro.setNome(C1_Nome.getText());
            cadastro.setCel(C1_telefone.getText());
            cadastro.setCpf(C1_CPF.getText());
            cadastro.setLogin(C2_Login.getText());
            cadastro.setSenha(CriptografaSenha.encryptPasswd(String.valueOf(C2_Senha.getPassword())));
            cadastro.setTipoUser(TipoUsuario.USUARIO_FUNCIONARIO_INT);
        } catch (Exception ex) {
            Logger.getLogger(Tela_Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        String cpf = cadastro.getCpf();
        
        ValidarCPF pf = new ValidarCPF(cpf);
        
        if (C1_Nome.getText().isEmpty() || C1_telefone.getText().isEmpty() || C1_CPF.getText().isEmpty() || C2_Login.getText().isEmpty() || String.valueOf(C2_Senha.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE); //validação de campos
        } else if(pf.isCPF()) {
            JOptionPane.showMessageDialog(null, cadastro.cadastrarArq());
        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido", "erro", JOptionPane.ERROR_MESSAGE);
        }
        limpar_Campos(); // método que limpa todos os campos após click cadastro
        
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

    private void Bttn1_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn1_AlterarActionPerformed
        try {
            Scanner in = new Scanner(new File("Cadastro.txt"));
            Pessoa cadastro = new Pessoa();

            cadastro.setNome(C1_Nome.getText());
            cadastro.setCel(C1_telefone.getText());
            cadastro.setCpf(C1_CPF.getText());
            cadastro.setLogin(C2_Login.getText());
            cadastro.setSenha(CriptografaSenha.encryptPasswd(String.valueOf(C2_Senha.getPassword())));
            cadastro.setTipoUser(TipoUsuario.textUsuarioInt(C1_Cargo.getSelectedItem().toString()));
            cadastro.alterarArq(loginAlterar);

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        } catch (IOException ex) {
            Logger.getLogger(Tela_Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception ex) {
            Logger.getLogger(Tela_Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Bttn1_AlterarActionPerformed

    private void C1_CargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1_CargoActionPerformed
      if(C1_Cargo.getSelectedItem().equals("---Selecione--")){
          JOptionPane.showMessageDialog(null,"Escolha uma das opções abaixo","erro",JOptionPane.ERROR_MESSAGE);
      }


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
    private javax.swing.JButton Bttn1_Alterar;
    private javax.swing.JButton Bttn1_Cadastrar;
    private javax.swing.JButton Bttn1_Cancelar;
    private javax.swing.JFormattedTextField C1_CPF;
    private javax.swing.JComboBox<String> C1_Cargo;
    private javax.swing.JTextField C1_Nome;
    private javax.swing.JFormattedTextField C1_telefone;
    private javax.swing.JTextField C2_Login;
    private javax.swing.JPasswordField C2_Senha;
    private javax.swing.JLabel T1_CPF;
    private javax.swing.JLabel T1_Cargo;
    private javax.swing.JLabel T1_Nome;
    private javax.swing.JLabel T1_telefone;
    private javax.swing.JLabel T2_Senha;
    private javax.swing.JLabel T2_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
    private String loginAlterar;

    public javax.swing.JButton getBttn1_Cadastrar() {
        return this.Bttn1_Cadastrar;
    }

    public javax.swing.JButton getBttn1_Alterar() {
        return this.Bttn1_Alterar;
    }

    public javax.swing.JLabel getJLabel1() {
        return this.jLabel1;
    }

    public javax.swing.JLabel getT1_Cargo() {
        return this.T1_Cargo;
    }

    public JComboBox<String> getC1_Cargo(){
        return this.C1_Cargo;
    }

    public javax.swing.JPasswordField getC2_Senha() {
        return this.C2_Senha;
    }
}
