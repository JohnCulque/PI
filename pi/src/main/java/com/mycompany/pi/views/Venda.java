/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pi.views;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.mycompany.pi.Sessao.Sessao;
import com.mycompany.pi.database.FuncionariosDAO;
import com.mycompany.pi.database.ProdutosDAO;
import com.mycompany.pi.database.VendasDAO;
import com.mycompany.pi.models.Carrinho;

/**
 *
 * @author igor
 */
public class Venda extends javax.swing.JFrame {
    private List<Carrinho> carrinho;
    private double precoTotalDoCarrinho;

    public void setPrecoTotalDoCarrinho(double precoTotalDoCarrinho) {
        this.precoTotalDoCarrinho = precoTotalDoCarrinho;
    }
    
    /**
     * Creates new form Venda
     */
    public Venda() {
        initComponents();
        carrinho = new ArrayList<Carrinho>();
        removeLinhasVazias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adcCarrinhoBtn = new javax.swing.JButton();
        quantidadeComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        msgValidacao = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        produtoComboBox = new javax.swing.JComboBox<>();
        efetuarVendaBtn = new javax.swing.JButton();
        limpaCarrinhoBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        precoTotalLabel = new javax.swing.JLabel();
        deletarLinhaProdutoBtn = new javax.swing.JButton();
        alterarQuantidadeProdutoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Efetuar Venda");
        setResizable(false);
        setSize(new java.awt.Dimension(689, 350));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("CPF do Cliente:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Produto:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Quantidade:");

        adcCarrinhoBtn.setText("Adicionar ao carrinho +");
        adcCarrinhoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcCarrinhoBtnActionPerformed(evt);
            }
        });

        quantidadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null },
                        { null, null, null, null, null },
                        { null, null, null, null, null },
                        { null, null, null, null, null }
                },
                new String[] {
                        "CPF do Cliente", "Produto", "Valor Unitário", "Quantidade", "Preço Total por Produto"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.Byte.class,
                    java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaCarrinho);

        try {
            txtCPF.setFormatterFactory(
                    new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCPFKeyReleased(evt);
            }
        });

        produtoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bola de Futebol",
                "Boneca de Pano", "Carrinho de Controle Remoto", "Jogo de Tabuleiro", "Quebra-Cabeça",
                "Kit de Ferramentas de Brinquedo", "Bicicleta", "Mesa de Pebolim", "Cubo Mágico", "Pista de Carrinhos",
                "Instrumento Musical", "Trenzinho de Madeira", "Lego ", "Patins", "Kit de Artesanato", "Jogo de Xadrez",
                "Carro de Controle Remoto", "Jogo de Memória", "Jogo de Dardos", "Palymobil", "Mesa de Air Hockey",
                "Piano Eletrônico", "Patins Azul", "Lego Technic", "Mini Game" }));

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(adcCarrinhoBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(quantidadeComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(msgValidacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(produtoComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(jLayeredPane1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                .addGap(49, 49, 49)
                                .addGroup(jLayeredPane1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCPF)
                                        .addComponent(produtoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                .addGap(46, 46, 46)
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addComponent(quantidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 68, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                jLayeredPane1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jLayeredPane1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(adcCarrinhoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 513,
                                                        Short.MAX_VALUE)
                                                .addComponent(msgValidacao, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(184, 184, 184)));
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jLayeredPane1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))
                                        .addGap(31, 31, 31)
                                        .addGroup(jLayeredPane1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(quantidadeComboBox,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(produtoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(msgValidacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(adcCarrinhoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231,
                                                Short.MAX_VALUE)));

        efetuarVendaBtn.setText("Efetuar Venda");
        efetuarVendaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efetuarVendaBtnActionPerformed(evt);
            }
        });

        limpaCarrinhoBtn.setBackground(new java.awt.Color(51, 51, 51));
        limpaCarrinhoBtn.setText("Limpar Carrinho");
        limpaCarrinhoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpaCarrinhoBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Preço Total:");

        deletarLinhaProdutoBtn.setBackground(new java.awt.Color(255, 51, 51));
        deletarLinhaProdutoBtn.setText("Excluir");
        deletarLinhaProdutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarLinhaProdutoBtnActionPerformed(evt);
            }
        });

        alterarQuantidadeProdutoBtn.setText("Alterar Quantidade");
        alterarQuantidadeProdutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarQuantidadeProdutoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLayeredPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(limpaCarrinhoBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deletarLinhaProdutoBtn,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 178,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(alterarQuantidadeProdutoBtn,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 178,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(precoTotalLabel,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addComponent(efetuarVendaBtn,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(precoTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(limpaCarrinhoBtn, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(deletarLinhaProdutoBtn,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(efetuarVendaBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(alterarQuantidadeProdutoBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Color vermelho = new Color(255, 128, 128); // vermelho mais claro

    private void msgValidacao(String mensagem) {
        Font globalFont = UIManager.getFont("Label.font");
        int fontSize = 14;
        Font labelFont = new Font(globalFont.getFontName(), globalFont.getStyle(), fontSize);
        msgValidacao.setFont(labelFont);
        msgValidacao.setForeground(vermelho);
        msgValidacao.setText(mensagem);
    }

    // limpa as linhas vazias da tabela carrinhos
    private void removeLinhasVazias() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaCarrinho.getModel();
        int rowCount = modelo.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            boolean linhaVazia = true;

            for (int j = 0; j < modelo.getColumnCount(); j++) {
                Object valor = modelo.getValueAt(i, j);

                if (valor != null && !valor.toString().isEmpty()) {
                    linhaVazia = false;
                    break;
                }
            }

            if (linhaVazia) {
                modelo.removeRow(i);
            }
        }
    }

    private boolean validaCpf() {
        String CPF = txtCPF.getText();
        Pattern regex = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
        Matcher matcher = regex.matcher(CPF);
        boolean cpfOk = false;

        if (CPF.isEmpty()) {
            txtCPF.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("O campo CPF não pode estar vazio!");
        } else if (!matcher.matches()) {
            txtCPF.setBorder(BorderFactory.createLineBorder(vermelho));
            msgValidacao("Somente números são válidos no campo de CPF!");
        } else {
            txtCPF.setBorder(UIManager.getBorder("TextField.border"));
            cpfOk = true;
            msgValidacao("");
        }

        return cpfOk;
    }

    private void txtCPFKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtCPFKeyReleased
        validaCpf();
    }// GEN-LAST:event_txtCPFKeyReleased

    private void adcCarrinhoBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adcCarrinhoBtnActionPerformed
        String cpfCliente = txtCPF.getText();
        String produto = (String) produtoComboBox.getSelectedItem();
        int quantidade = Integer.parseInt((String) quantidadeComboBox.getSelectedItem());

        double precoProduto = ProdutosDAO.obterPrecoProduto(produto);

        double precoTotal = precoProduto * quantidade;

        Carrinho item = new Carrinho(cpfCliente, produto, precoProduto, quantidade, precoTotal);

        if (validaCpf()) {
            carrinho.add(item);

            // define o modelo da tabela e centraliza as colunas
            DefaultTableModel modelo = (DefaultTableModel) tabelaCarrinho.getModel();
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setVerticalAlignment(SwingConstants.CENTER);

            int colCount = tabelaCarrinho.getColumnCount();
            for (int i = 0; i < colCount; i++) {
                tabelaCarrinho.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
            modelo.setRowCount(0); // limpa a tabela

            double precoTotalCarrinho = 0.0;
            for (Carrinho i : carrinho) {
                Object[] row = { i.getCpfCliente(), i.getProduto(), i.getPreco(), i.getQuantidade(),
                        i.getPrecoTotal() };
                precoTotalCarrinho += i.getPrecoTotal();
                modelo.addRow(row);
            }
            DecimalFormat decimalFormat = new DecimalFormat("#.00"); // dois digitos depois da vírgula
            String precoTotalFormatado = decimalFormat.format(precoTotalCarrinho);
            precoTotalDoCarrinho = precoTotalCarrinho;
            precoTotalLabel.setText("R$" + String.valueOf(precoTotalFormatado));
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos corretamente!");
        }
    }// GEN-LAST:event_adcCarrinhoBtnActionPerformed

    private void limpaCarrinhoBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_limpaCarrinhoBtnActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja limpar o carrinho ?",
                "Confirmação", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            carrinho.clear(); // limpa lista

            // limpa a tabela
            DefaultTableModel modelo = (DefaultTableModel) tabelaCarrinho.getModel();
            modelo.setRowCount(0);

            // limpa o preço total
            precoTotalLabel.setText("R$0.00");
        }
    }// GEN-LAST:event_limpaCarrinhoBtnActionPerformed

    private void deletarLinhaProdutoBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deletarLinhaProdutoBtnActionPerformed
        int linhaSelecionada = tabelaCarrinho.getSelectedRow();
        if (linhaSelecionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tabelaCarrinho.getModel();
            String produto = (String) modelo.getValueAt(linhaSelecionada, 1);

            int resposta = JOptionPane.showConfirmDialog(this,
                    "Tem certeza que deseja excluir o produto '" + produto + "' do carrinho ?",
                    "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                modelo.removeRow(linhaSelecionada);

                // remove o produto da lista
                Carrinho produtoRemovido = carrinho.get(linhaSelecionada);
                carrinho.remove(produtoRemovido);

                // atualiza o preço total do carrinho
                double precoTotalCarrinho = 0.0;
                for (Carrinho item : carrinho) {
                    precoTotalCarrinho += item.getPrecoTotal();
                }
                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                String precoTotalFormatado = decimalFormat.format(precoTotalCarrinho);
                precoTotalLabel.setText("R$" + precoTotalFormatado);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Por favor, selecione a linha com o produto que deseja excluir do carrinho primeiro.");
        }
    }// GEN-LAST:event_deletarLinhaProdutoBtnActionPerformed

    private void alterarQuantidadeProdutoBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_alterarQuantidadeProdutoBtnActionPerformed
        int linhaSelecionada = tabelaCarrinho.getSelectedRow();
        if (linhaSelecionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tabelaCarrinho.getModel();
            String produto = (String) modelo.getValueAt(linhaSelecionada, 1);
            int quantidadeAtual = (int) modelo.getValueAt(linhaSelecionada, 3);

            // opções de quantidade
            JComboBox<Integer> quantidadeComboBox = new JComboBox<>();
            for (int i = 1; i <= 10; i++) {
                quantidadeComboBox.addItem(i);
            }
            quantidadeComboBox.setSelectedItem(quantidadeAtual);

            // cria um JOptionPane personalizado com o JComboBox
            Object[] mensagem = {
                    "Selecione a nova quantidade para o produto '" + produto + "':", quantidadeComboBox
            };
            int opcao = JOptionPane.showOptionDialog(this, mensagem, "Alterar Quantidade", JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, null, null);

            if (opcao == JOptionPane.OK_OPTION) {
                int novaQuantidade = (int) quantidadeComboBox.getSelectedItem();

                // atualiza a quantidade na tabela
                modelo.setValueAt(novaQuantidade, linhaSelecionada, 3);

                // atualiza o preço total do produto
                double precoProduto = (double) modelo.getValueAt(linhaSelecionada, 2);
                double novoPrecoTotal = precoProduto * novaQuantidade;
                modelo.setValueAt(novoPrecoTotal, linhaSelecionada, 4);

                // atualiza o preço total do carrinho
                double precoTotalCarrinho = 0.0;
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    double precoTotalProduto = (double) modelo.getValueAt(i, 4);
                    precoTotalCarrinho += precoTotalProduto;
                }
                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                String precoTotalFormatado = decimalFormat.format(precoTotalCarrinho);
                precoTotalLabel.setText("R$" + precoTotalFormatado);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione a linha com o produto que deseja alterar a quantidade no carrinho primeiro.");
        }
    }// GEN-LAST:event_alterarQuantidadeProdutoBtnActionPerformed

    private void efetuarVendaBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_efetuarVendaBtnActionPerformed
        String nomeFuncionario = Sessao.getNomeFuncionario();
        if (nomeFuncionario != null) {
            // Aqui você pode inserir a lógica para salvar as informações da venda no banco de dados,
            // juntamente com o nome do funcionário
    
            System.out.println("Venda efetuada pelo funcionário: " + nomeFuncionario);
        } else {
            System.out.println("Nome do funcionário não definido.");
        }
    }// GEN-LAST:event_efetuarVendaBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Venda venda = new Venda();
                venda.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adcCarrinhoBtn;
    private javax.swing.JButton alterarQuantidadeProdutoBtn;
    private javax.swing.JButton deletarLinhaProdutoBtn;
    private javax.swing.JButton efetuarVendaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpaCarrinhoBtn;
    private javax.swing.JLabel msgValidacao;
    private javax.swing.JLabel precoTotalLabel;
    private javax.swing.JComboBox<String> produtoComboBox;
    private javax.swing.JComboBox<String> quantidadeComboBox;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JFormattedTextField txtCPF;
    // End of variables declaration//GEN-END:variables
}
