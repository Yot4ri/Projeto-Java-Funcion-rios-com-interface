package view;

import data.Funcionario;
import data.FuncionarioDao;
import javax.swing.JOptionPane;

public class TelaFuncionarios extends javax.swing.JFrame {

    public TelaFuncionarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Matrícula:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Cargo:");

        jLabel4.setText("Salário:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtSalario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtNome))))
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        String matricula;
            matricula = txtMatricula.getText();
            FuncionarioDao dao = new FuncionarioDao();
            boolean status = dao.conectar();
            if(status == true){
                Funcionario funcionario = dao.consultar(matricula);
                System.out.println(dao.consultar(matricula));
                if(funcionario == null){
                    JOptionPane.showMessageDialog(null,"Funcionário não localizado");
                }else{
                    txtNome.setText(funcionario.getNome());
                    txtCargo.setText(funcionario.getCargo());
                    txtSalario.setText(String.valueOf(funcionario.getSalario()));
                    //habilitar botão de exclusão
                    btnExcluir.setEnabled(true);
                }
                dao.desconectar();

            }else{
                JOptionPane.showMessageDialog(null, "Erro de conexão");
            }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        FuncionarioDao dao = new FuncionarioDao();
        boolean status = dao.conectar();
        if(status == false){
            JOptionPane.showMessageDialog(null,"Erro de conexão");
        }else{
            status = dao.excluir(txtMatricula.getText());
            if(status == true){
                //int confirma = JOptionPane.showConfirmDialog(null,"Tem certeza?");
                JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
                
                txtMatricula.setText("");
                txtMatricula.requestFocus();
                txtNome.setText("");
                txtCargo.setText("");
                txtSalario.setText("");
                //desabilitar botão de exclusão
                btnExcluir.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "Erro na exclusão do funcionário!");
            }
            dao.desconectar();
        } 
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Funcionario funcionario = new Funcionario();
        FuncionarioDao dao;
        boolean status;
        int resposta;
        
        funcionario.setMatricula(txtMatricula.getText());
        funcionario.setNome(txtNome.getText());
        funcionario.setCargo(txtCargo.getText());
        funcionario.setSalario(Double.parseDouble(txtSalario.getText()));
        dao = new FuncionarioDao();
        status = dao.conectar();
        if(status == false){
            JOptionPane.showMessageDialog(null,"Erro de conexão");
        }else{
            resposta = dao.atualizar(funcionario);
            System.out.println(funcionario.getMatricula());
            if(resposta == 1){
                JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso");
                //limpar os campos
                txtMatricula.setText("");
                txtNome.setText("");
                txtCargo.setText("");
                txtSalario.setText("");
                //posicionar o cursor para um próximo
                txtMatricula.requestFocus();
            }else if (resposta ==1062){
                JOptionPane.showMessageDialog(null,"Matricula já foi cadastrada");   
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao tentar inserir dados");
            }
            dao.desconectar();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    
        Funcionario funcionario = new Funcionario();
            FuncionarioDao dao = new FuncionarioDao();
            boolean status;
            int resposta;
            
            funcionario.setMatricula(txtMatricula.getText());
            funcionario.setNome(txtNome.getText());
            funcionario.setCargo(txtCargo.getText());
            funcionario.setSalario(Double.parseDouble(txtSalario.getText()));
            
            dao = new FuncionarioDao();
            
            status = dao.conectar();
            if(status == false){
                JOptionPane.showMessageDialog(null,"Erro de conexão");
            }else{
                resposta = dao.salvar(funcionario);
                if(resposta == 1){
                    JOptionPane.showMessageDialog(null,"Dados incluidos com sucesso");
                    
                    //limpar os dados
                    txtMatricula.setText("");
                    txtNome.setText("");
                    txtCargo.setText("");
                    txtSalario.setText("");
                    //posicionar o cursos para um próximo
                    txtMatricula.requestFocus();
                }else if (resposta == 1062){
                    JOptionPane.showMessageDialog(null, "Matrícula já foi cadastrada");
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados");
                }
                dao.desconectar();
            }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
