/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pi.views;

import com.mycompany.pi.database.ProdutosDAO;
import com.mycompany.pi.utils.Categoria;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author igor
 */
public class AlteraProduto extends javax.swing.JFrame {
    /**
     * Creates new form AlteraProduto
     */
    public AlteraProduto() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdAlterar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        salvarAlteracaoBrinquedo = new javax.swing.JButton();
        txtEstoqueAlterar = new javax.swing.JTextField();
        txtNomeAlterar = new javax.swing.JTextField();
        opcoesCategoriasAlterar = new javax.swing.JComboBox<>();
        txtValorUnitarioAlterar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoAlterar = new javax.swing.JTextArea();
        msgValidacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Produto");
        setResizable(false);

        jLabel1.setText("Id:");

        jLabel2.setText("Estoque:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Categoria:");

        jLabel5.setText("Valor unitário:");

        jLabel6.setText("Descrição:");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        salvarAlteracaoBrinquedo.setText("Salvar");
        salvarAlteracaoBrinquedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarAlteracaoBrinquedoActionPerformed(evt);
            }
        });

        txtEstoqueAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEstoqueAlterarKeyReleased(evt);
            }
        });

        txtNomeAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeAlterarKeyReleased(evt);
            }
        });

        opcoesCategoriasAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DE_1_A_2_ANOS", "DE_3_A_4_ANOS", "DE_5_A_7_ANOS", "DE_8_A_10_ANOS", "DE_11_A_12_ANOS" }));

        txtValorUnitarioAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorUnitarioAlterarKeyReleased(evt);
            }
        });

        txtDescricaoAlterar.setColumns(20);
        txtDescricaoAlterar.setRows(5);
        txtDescricaoAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescricaoAlterarKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescricaoAlterar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarAlteracaoBrinquedo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(msgValidacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(opcoesCategoriasAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(txtIdAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtEstoqueAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorUnitarioAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(opcoesCategoriasAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEstoqueAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValorUnitarioAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgValidacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarAlteracaoBrinquedo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    Color vermelho = new Color(255, 128, 128); // vermelho mais claro
    private void msgValidacao(String mensagem) {
        Font globalFont = UIManager.getFont("Label.font");
        int fontSize = 14;
        Font labelFont = new Font(globalFont.getFontName(), globalFont.getStyle(), fontSize);
        msgValidacao.setFont(labelFont);
        msgValidacao.setForeground(vermelho);
        msgValidacao.setText(mensagem);
    }
    
    private boolean validaEstoqueAlteracao() {
        String estoqueAlteracao = txtEstoqueAlterar.getText();
        Pattern regex = Pattern.compile("^[a-zA-Z\\s]+$");
        Matcher matcher = regex.matcher(estoqueAlteracao);
        boolean estoqueAlteracaoOk = false;

        if(estoqueAlteracao.isEmpty()) {
            txtEstoqueAlterar.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("O campo estoque necessita ser maior que 5 caracteres.");
        } else if (matcher.matches()) {
            txtEstoqueAlterar.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("Digite apenas números.");
        } else {
            txtEstoqueAlterar.setBorder(UIManager.getBorder("TextField.border"));
            estoqueAlteracaoOk = true;
            msgValidacao("");
        }

        return estoqueAlteracaoOk;
    }

    private boolean validaNomeAlteracao() {
        String nomeAlteracao = txtNomeAlterar.getText();
        Pattern regex = Pattern.compile("^[\\p{L}\\s]+$"); // regex para verificar que o campo só tenha string
        Matcher matcher = regex.matcher(nomeAlteracao);
        boolean nomeAlteracaoOk = false;

        if (nomeAlteracao.isEmpty()) {
            txtNomeAlterar.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("O campo nome necessita ser maior que 5 caracteres.");
        } else if (!matcher.matches()) {
            txtNomeAlterar.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("Símbolos ou números não são permitidos.");
        } else {
            txtNomeAlterar.setBorder(UIManager.getBorder("TextField.border"));
            nomeAlteracaoOk = true;
            msgValidacao("");
        }

        return nomeAlteracaoOk;
    }

    private boolean validaValorUnitarioAlteracao() {
        String valorAlteracao = txtValorUnitarioAlterar.getText();
        Pattern regex = Pattern.compile("^[a-zA-Z\\s]+$");
        Matcher matcher = regex.matcher(valorAlteracao);
        boolean valorUnitarioAlteracaoOk = false;

        if (valorAlteracao.isEmpty()) {
            txtValorUnitarioAlterar.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("O campo valor unitário não pode ser vazio.");
        } else if (matcher.matches()) {
            txtValorUnitarioAlterar.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("Digite apenas números.");
        } else {
            txtValorUnitarioAlterar.setBorder(UIManager.getBorder("TextField.border"));
            valorUnitarioAlteracaoOk = true;
            msgValidacao("");
        }

        return valorUnitarioAlteracaoOk;
    }

    private boolean validaDescricaoAlteracao() {
        String descricaoAlteracao = txtDescricaoAlterar.getText();
        int limiteCaracteres = 100;
        boolean descricaoAlteracaoOk = false;

        if (descricaoAlteracao.trim().isEmpty()) {
            txtDescricaoAlterar.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("O campo descricão não pode ser vazio.");
        } else if (descricaoAlteracao.length() > limiteCaracteres) {
            txtDescricaoAlterar.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("O campo descrição necessita ser no máximo 100 caracteres.");
        } else {
            txtDescricaoAlterar.setBorder(UIManager.getBorder("TextField.border"));
            msgValidacao("");
            descricaoAlteracaoOk = true;
        }

        return descricaoAlteracaoOk;
    }

    private void salvarAlteracaoBrinquedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarAlteracaoBrinquedoActionPerformed
        try {
            int id_brinquedo = Integer.parseInt(txtIdAlterar.getText());
            int estoque = Integer.parseInt(txtEstoqueAlterar.getText());
            String nome = txtNomeAlterar.getText();
            String categoriaSelecionada = (String) opcoesCategoriasAlterar.getSelectedItem();
            Double valor_unitario = Double.parseDouble(txtValorUnitarioAlterar.getText());
            String descricao = txtDescricaoAlterar.getText();
            
            if (validaNomeAlteracao() && validaEstoqueAlteracao() && validaValorUnitarioAlteracao() && validaDescricaoAlteracao()){
                ProdutosDAO dao = new ProdutosDAO();
                dao.alteraBrinquedo(id_brinquedo, estoque, nome, categoriaSelecionada, valor_unitario, descricao, evt);
            } else {
                JOptionPane.showMessageDialog(this,
                "Por favor, preencha todos os campos corretamente!", "Erro",
                JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, insira valores numéricos válidos para o estoque e valor unitário.", "Erro",
                    JOptionPane.ERROR_MESSAGE); // trata caso haja erro na conversão de String para int
        }
    }//GEN-LAST:event_salvarAlteracaoBrinquedoActionPerformed

    private void txtEstoqueAlterarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstoqueAlterarKeyReleased
        validaEstoqueAlteracao();
    }//GEN-LAST:event_txtEstoqueAlterarKeyReleased

    private void txtNomeAlterarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeAlterarKeyReleased
        validaNomeAlteracao();
    }//GEN-LAST:event_txtNomeAlterarKeyReleased

    private void txtValorUnitarioAlterarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnitarioAlterarKeyReleased
        validaValorUnitarioAlteracao();
    }//GEN-LAST:event_txtValorUnitarioAlterarKeyReleased

    private void txtDescricaoAlterarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoAlterarKeyReleased
        validaDescricaoAlteracao();
    }//GEN-LAST:event_txtDescricaoAlterarKeyReleased

    public JComboBox<String> getComboBoxCategoria() {
        return opcoesCategoriasAlterar;
    }
    
    public JTextField getTxtIdAlterar() {
        return txtIdAlterar;
    }
    
    public void setTxtIdAlterar(String valor) {
        txtIdAlterar.setText(valor);
    }
    
    public void setTxtEstoqueAlterar(String valor) {
        txtEstoqueAlterar.setText(valor);
    }

    public void setTxtNomeAlterar(String valor) {
        txtNomeAlterar.setText(valor);
    }
    
    public void setTxtValorUnitarioAlterar(String valor) {
        txtValorUnitarioAlterar.setText(valor);
    }

    public void setTxtDescricaoAlterar(String valor) {
        txtDescricaoAlterar.setText(valor);
    }
    
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
            java.util.logging.Logger.getLogger(AlteraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlteraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlteraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlteraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlteraProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msgValidacao;
    private javax.swing.JComboBox<String> opcoesCategoriasAlterar;
    private javax.swing.JButton salvarAlteracaoBrinquedo;
    private javax.swing.JTextArea txtDescricaoAlterar;
    private javax.swing.JTextField txtEstoqueAlterar;
    private javax.swing.JTextField txtIdAlterar;
    private javax.swing.JTextField txtNomeAlterar;
    private javax.swing.JTextField txtValorUnitarioAlterar;
    // End of variables declaration//GEN-END:variables
}
