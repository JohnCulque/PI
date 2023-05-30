/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pi.views;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import com.mycompany.pi.database.DetalhesVendasDAO;
import com.mycompany.pi.database.ProdutosDAO;
import com.mycompany.pi.database.RelatoriosSinteticosDAO;
import com.mycompany.pi.database.VendasDAO;
import com.mycompany.pi.models.DetalhesVendas;

/**
 *
 * @author gustavo
 */
public class RelatorioSintetico extends javax.swing.JFrame {

    /**
     * Creates new form Relatorios
     */
    public RelatorioSintetico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        imprimirRelatorioSinteticoBtn = new javax.swing.JButton();
        dataFinal = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dataInicial = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorioSintetico = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        valorTotalVendasLabel = new javax.swing.JLabel();
        msgValidacao = new javax.swing.JLabel();
        relatorioAnaliticoBtn = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Sintético");
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 261, Short.MAX_VALUE));

        imprimirRelatorioSinteticoBtn.setText("Imprimir");
        imprimirRelatorioSinteticoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirRelatorioSinteticoBtnActionPerformed(evt);
            }
        });

        try {
            dataFinal.setFormatterFactory(
                    new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataFinalKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Data Final : ");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Data Inicial : ");

        try {
            dataInicial.setFormatterFactory(
                    new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataInicialActionPerformed(evt);
            }
        });
        dataInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataInicialKeyReleased(evt);
            }
        });

        tabelaRelatorioSintetico.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Id da Venda", "Data", "Valor da Venda", "CPF do Cliente"
                }));
        jScrollPane1.setViewportView(tabelaRelatorioSintetico);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        relatorioAnaliticoBtn.setText("Detalhes da Venda");
        relatorioAnaliticoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioAnaliticoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(relatorioAnaliticoBtn,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 178,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(valorTotalVendasLabel, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 267,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(imprimirRelatorioSinteticoBtn,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(dataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(124, 124, 124)
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(dataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(msgValidacao, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(dataFinal, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2)
                                                        .addComponent(dataInicial,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(imprimirRelatorioSinteticoBtn,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(msgValidacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(valorTotalVendasLabel)
                                                .addGap(33, 33, 33)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(relatorioAnaliticoBtn,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }// GEN-LAST:event_jButton2ActionPerformed

    private void relatorioAnaliticoBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_relatorioAnaliticoBtnActionPerformed
        int linhaSelecionada = tabelaRelatorioSintetico.getSelectedRow();

        if (linhaSelecionada != -1) {
            int idVenda = Integer.parseInt(tabelaRelatorioSintetico.getValueAt(linhaSelecionada, 0).toString());
            LocalDate dataVenda = LocalDate.parse(tabelaRelatorioSintetico.getValueAt(linhaSelecionada, 1).toString());
            double valorVenda = Double.parseDouble(tabelaRelatorioSintetico.getValueAt(linhaSelecionada, 2).toString());
            String cpfCliente = tabelaRelatorioSintetico.getValueAt(linhaSelecionada, 3).toString();

            // consulta os detalhes da venda
            List<DetalhesVendas> detalhesVendasLista = DetalhesVendasDAO.consultarDetalhesVenda(dataVenda, valorVenda,
                    cpfCliente);

            for (DetalhesVendas detalhesVenda : detalhesVendasLista) {
                String nomeFuncionario = VendasDAO.consultarNomeFuncionario(idVenda);
                int idBrinquedo = detalhesVenda.getIdBrinquedo();
                String nomeBrinquedo = ProdutosDAO.consultarNomeBrinquedo(idBrinquedo);
                int quantidade = detalhesVenda.getQuantidade();

                RelatorioAnalitico relatorioAnalitico = new RelatorioAnalitico(idVenda, nomeFuncionario, nomeBrinquedo, quantidade);
                relatorioAnalitico.setLocationRelativeTo(this);
                relatorioAnalitico.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione a linha da venda que deseja ver os detalhes primeiro.");
        }
    }// GEN-LAST:event_relatorioAnaliticoBtnActionPerformed

    Color vermelho = new Color(255, 128, 128); // vermelho mais claro

    private void msgValidacao(String mensagem) {
        Font globalFont = UIManager.getFont("Label.font");
        int fontSize = 14;
        Font labelFont = new Font(globalFont.getFontName(), globalFont.getStyle(), fontSize);
        msgValidacao.setFont(labelFont);
        msgValidacao.setForeground(vermelho);
        msgValidacao.setText(mensagem);
    }

    private void imprimirRelatorioSinteticoBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_imprimirRelatorioSinteticoBtnActionPerformed
        if (validaDataInicial() && validaDataFinal()) {
            LocalDate dataInicio = LocalDate.parse(dataInicial.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate dataFim = LocalDate.parse(dataFinal.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            double valorTotalVendas = 0.0;

            List<com.mycompany.pi.models.RelatorioSintetico> listaRelatorioSintetico = RelatoriosSinteticosDAO
                    .gerarRelatorioSintetico(dataInicio, dataFim);

            DefaultTableModel model = (DefaultTableModel) tabelaRelatorioSintetico.getModel();
            model.setRowCount(0); // Limpa os dados existentes na tabela

            if (listaRelatorioSintetico.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Não há vendas no período selecionado.");
                valorTotalVendasLabel.setText("Valor total das vendas: R$ 0.00");
            } else {
                for (com.mycompany.pi.models.RelatorioSintetico relatorio : listaRelatorioSintetico) {
                    Object[] row = { relatorio.getIdVenda(), relatorio.getDataVenda(), relatorio.getValorTotal(),
                            relatorio.getCpfCliente() };
                    model.addRow(row);
                    valorTotalVendas += relatorio.getValorTotal();
                    valorTotalVendasLabel
                            .setText("Valor total das vendas: R$" + String.format("%.2f", valorTotalVendas));
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha as datas corretamente para imprimir o relatório.");
        }

    }// GEN-LAST:event_imprimirRelatorioSinteticoBtnActionPerformed

    private void dataInicialActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dataInicialActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_dataInicialActionPerformed

    private boolean validaDataInicial() {
        String data = dataInicial.getText();
        boolean dataInicialOk = false;

        if (data.trim().isEmpty()) {
            dataInicial.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("O campo data inicial não pode ser vazio.");
        } else if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            dataInicial.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("Formato de data inválido. Utilize o formato dd/mm/yyyy.");
        } else {
            dataInicial.setBorder(UIManager.getBorder("TextField.border"));
            msgValidacao("");
            dataInicialOk = true;
        }

        return dataInicialOk;
    }

    private boolean validaDataFinal() {
        String data = dataFinal.getText();
        boolean dataFinalOk = false;

        if (data.trim().isEmpty()) {
            dataFinal.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("O campo data final não pode ser vazio.");
        } else if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            dataFinal.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("Formato de data inválido. Utilize o formato dd/mm/yyyy.");
        } else {
            LocalDate dataInicio = LocalDate.parse(dataInicial.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate dataFim = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            if (dataFim.isBefore(dataInicio)) {
                dataFinal.setBorder(BorderFactory.createLineBorder(vermelho));
                msgValidacao("A data final não pode ser menor que a data inicial.");
            } else {
                dataFinal.setBorder(UIManager.getBorder("TextField.border"));
                msgValidacao("");
                dataFinalOk = true;
            }
        }

        return dataFinalOk;
    }

    private void dataInicialKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_dataInicialKeyReleased
        validaDataInicial();
    }// GEN-LAST:event_dataInicialKeyReleased

    private void dataFinalKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_dataFinalKeyReleased
        validaDataFinal();
    }// GEN-LAST:event_dataFinalKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioSintetico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField dataFinal;
    private javax.swing.JFormattedTextField dataInicial;
    private javax.swing.JButton imprimirRelatorioSinteticoBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msgValidacao;
    private javax.swing.JButton relatorioAnaliticoBtn;
    private javax.swing.JTable tabelaRelatorioSintetico;
    private javax.swing.JLabel valorTotalVendasLabel;
    // End of variables declaration//GEN-END:variables
}
