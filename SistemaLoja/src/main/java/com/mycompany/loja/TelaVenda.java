/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loja;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class TelaVenda extends javax.swing.JFrame {

    private List<Cliente> cliente;
    private List<Produto> produto;
    private double totalGeral = 0.0;
    private double custoProdutoAtual = 0.0;
    CadastroProduto cadastroProduto = new CadastroProduto(this);
    private Set<String> tiposDeProdutos = new HashSet<>();
    private Map<String, Double> totalGeralPorCliente = new HashMap<>();
    private Map<String, Integer> estoqueOriginalProduto = new HashMap<>();
    private String clienteSelecionado;

    public TelaVenda() {
        initComponents();
        
    }
    
    public TelaVenda(List<Cliente> cliente, List<Produto> produto) {
        this.cliente = cliente;
        this.produto = produto;
        initComponents();
        preencher_Clientes();
        preencher_Produtos();
        inicializarEstoqueOriginal();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jClienteBox = new javax.swing.JComboBox<>();
        jProdutoBox = new javax.swing.JComboBox<>();
        jQuantidadeText = new javax.swing.JTextField();
        jFinalizaVenda = new javax.swing.JButton();
        jResetarVendaButton = new javax.swing.JButton();
        jTituloLabel = new javax.swing.JLabel();
        jTelaVendaLabel = new javax.swing.JLabel();
        jAdicionarAoTotal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCustoProdutosLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jNomeProdutoBox = new javax.swing.JComboBox<>();
        jCustoTotalCarrinhoLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCPFLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome do Cliente:");

        jLabel2.setText("Tipo de Produto:");

        jLabel3.setText("Quantidade de Itens:");

        jLabel4.setText("Total Geral do Carrinho:");

        jClienteBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jClienteBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClienteBoxActionPerformed(evt);
            }
        });

        jProdutoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jProdutoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProdutoBoxActionPerformed(evt);
            }
        });

        jQuantidadeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuantidadeTextActionPerformed(evt);
            }
        });

        jFinalizaVenda.setText("Finalizar Venda");
        jFinalizaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFinalizaVendaActionPerformed(evt);
            }
        });

        jResetarVendaButton.setText("Resetar Venda");
        jResetarVendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetarVendaButtonActionPerformed(evt);
            }
        });

        jTituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTituloLabel.setText("LOJA DE PRODUTOS ELETRÔNICOS");

        jTelaVendaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTelaVendaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTelaVendaLabel.setText("TELA DE VENDA");

        jAdicionarAoTotal.setText("Adicionar ao Total do Carrinho");
        jAdicionarAoTotal.setToolTipText("");
        jAdicionarAoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdicionarAoTotalActionPerformed(evt);
            }
        });

        jLabel5.setText("Custo dos produtos:");

        jCustoProdutosLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jCustoProdutosLabel.setText("0.0");
        jCustoProdutosLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jCustoProdutosLabelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel6.setText("Produto:");

        jNomeProdutoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jNomeProdutoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeProdutoBoxActionPerformed(evt);
            }
        });

        jCustoTotalCarrinhoLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jCustoTotalCarrinhoLabel.setText("0.0");
        jCustoTotalCarrinhoLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jCustoTotalCarrinhoLabelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel7.setText("CPF do Cliente:");

        jCPFLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jCPFLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jCPFLabelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jResetarVendaButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFinalizaVenda))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jProdutoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jNomeProdutoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jAdicionarAoTotal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCustoProdutosLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jQuantidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCustoTotalCarrinhoLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jTelaVendaLabel)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jClienteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jTituloLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCPFLabel)))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTelaVendaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jClienteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCPFLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jProdutoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jNomeProdutoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jQuantidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCustoProdutosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAdicionarAoTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCustoTotalCarrinhoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFinalizaVenda)
                    .addComponent(jResetarVendaButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFinalizaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFinalizaVendaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_jFinalizaVendaActionPerformed

    private void jAdicionarAoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdicionarAoTotalActionPerformed
        // TODO add your handling code here:
        String custoProdutoStr = jCustoProdutosLabel.getText();

        try {
            double custoProduto = Double.parseDouble(custoProdutoStr);
            if (verificar_Estoque()) {

                // Obtenha a quantidade informada
                double quantidadeInformada = Double.parseDouble(jQuantidadeText.getText());

                // Atualize o estoque do produto
                atualizar_Estoque(quantidadeInformada);

                // Atualize o total geral
                double totalGeralAtualizado = totalGeralPorCliente.getOrDefault(clienteSelecionado, 0.0) + custoProduto;
                totalGeralPorCliente.put(clienteSelecionado, totalGeralAtualizado);
                jCustoTotalCarrinhoLabel.setText(String.valueOf(totalGeralAtualizado));
                jCustoProdutosLabel.setText("0.0");
            } else {
            JOptionPane.showMessageDialog(this, "Estoque esgotado. Não é possível adicionar ao total.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores numéricos válidos.");
        }
        
    }//GEN-LAST:event_jAdicionarAoTotalActionPerformed

    private void jClienteBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClienteBoxActionPerformed
        // TODO add your handling code here:
        atualizar_ClienteSelecionado();
    }//GEN-LAST:event_jClienteBoxActionPerformed

    private void jProdutoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProdutoBoxActionPerformed
        // TODO add your handling code here:
        String tipoProduto = (String) jProdutoBox.getSelectedItem();
        jNomeProdutoBox.removeAllItems();
        for (Produto produto : produto) {
            if (produto.getTipo().equals(tipoProduto)) {
                jNomeProdutoBox.addItem(produto.getNomeProduto());
            }
        }
        
    }//GEN-LAST:event_jProdutoBoxActionPerformed

    private void jQuantidadeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuantidadeTextActionPerformed
        // TODO add your handling code here:
    String nomeProduto = (String) jNomeProdutoBox.getSelectedItem();
    Produto produtoSelecionado = encontrar_Produto(nomeProduto, (String) jProdutoBox.getSelectedItem());

    if (produtoSelecionado != null) {
        try {
            double quantidadeInformada = Double.parseDouble(jQuantidadeText.getText());
            double quantidadeDisponivel = produtoSelecionado.getEstoque();

            if (quantidadeInformada > quantidadeDisponivel) {
                JOptionPane.showMessageDialog(this, "Quantidade informada excede a quantidade disponível em estoque.");
                jQuantidadeText.setText(String.valueOf(quantidadeDisponivel));
            } else {
                double custoProduto = produtoSelecionado.getPreco();
                double custoTotal = quantidadeInformada * custoProduto;

                jCustoProdutosLabel.setText(String.valueOf(custoTotal));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma quantidade válida.");
        }
    }
    
    }//GEN-LAST:event_jQuantidadeTextActionPerformed

    private void jCustoProdutosLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jCustoProdutosLabelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jCustoProdutosLabelAncestorAdded

    private void jResetarVendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetarVendaButtonActionPerformed
        // TODO add your handling code here:
        limpar_tela();
        reiniciar_Estoque();
        
    }//GEN-LAST:event_jResetarVendaButtonActionPerformed

    private void jNomeProdutoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeProdutoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeProdutoBoxActionPerformed

    private void jCustoTotalCarrinhoLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jCustoTotalCarrinhoLabelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jCustoTotalCarrinhoLabelAncestorAdded

    private void jCPFLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jCPFLabelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jCPFLabelAncestorAdded

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
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdicionarAoTotal;
    private javax.swing.JLabel jCPFLabel;
    private javax.swing.JComboBox<String> jClienteBox;
    private javax.swing.JLabel jCustoProdutosLabel;
    private javax.swing.JLabel jCustoTotalCarrinhoLabel;
    private javax.swing.JButton jFinalizaVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jNomeProdutoBox;
    private javax.swing.JComboBox<String> jProdutoBox;
    private javax.swing.JTextField jQuantidadeText;
    private javax.swing.JButton jResetarVendaButton;
    private javax.swing.JLabel jTelaVendaLabel;
    private javax.swing.JLabel jTituloLabel;
    // End of variables declaration//GEN-END:variables

    private void limpar_tela() {
        jQuantidadeText.setText("");
        jCustoProdutosLabel.setText("0.0");
        jCustoTotalCarrinhoLabel.setText("0.0");
    }
    
    private void preencher_Clientes() {
        jClienteBox.removeAllItems();
        
        for (Cliente cliente : cliente) {
            jClienteBox.addItem(cliente.getNome());
        }
    }
    private String buscarCPFPorNomeCliente(String nomeCliente) {
        for (Cliente c : cliente) {
            if (c.getNome().equals(nomeCliente)) {
                return c.getCpf();
            }
        }
        return "";
    }
    
    
    private void atualizar_ClienteSelecionado() {
        clienteSelecionado = (String) jClienteBox.getSelectedItem();

        if (!totalGeralPorCliente.containsKey(clienteSelecionado)) {
            totalGeralPorCliente.put(clienteSelecionado, 0.0);
        }
        jCustoTotalCarrinhoLabel.setText(String.valueOf(totalGeralPorCliente.get(clienteSelecionado)));
        String cpfClienteSelecionado = buscarCPFPorNomeCliente(clienteSelecionado);
        jCPFLabel.setText(cpfClienteSelecionado);
    }


    private void preencher_Produtos() {
        jProdutoBox.removeAllItems();
        for (Produto produto : produto) {
            tiposDeProdutos.add(produto.getTipo());
        }
        for (String tipo : tiposDeProdutos) {
            jProdutoBox.addItem(tipo);
        }
    }

    private Produto encontrar_Produto(String nomeProduto, String tipo) {
        for (Produto produto : produto) {
            if (produto.getNomeProduto().equals(nomeProduto) && produto.getTipo().equals(tipo)) {
                return produto;
            }
        }
        return null;
    }
        private void inicializarEstoqueOriginal() {
        for (Produto produto : produto) {
            estoqueOriginalProduto.put(produto.getNomeProduto(), produto.getEstoque());
        }
    }

    private boolean verificar_Estoque() {
    String nomeProduto = (String) jNomeProdutoBox.getSelectedItem();
    Produto produtoSelecionado = encontrar_Produto(nomeProduto, (String) jProdutoBox.getSelectedItem());

    if (produtoSelecionado != null) {
        try {
            double quantidadeInformada = Double.parseDouble(jQuantidadeText.getText());
            double quantidadeDisponivel = produtoSelecionado.getEstoque();

            if (quantidadeInformada > 0 && quantidadeInformada <= quantidadeDisponivel) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Quantidade informada é inválida ou excede a quantidade disponível em estoque, tente novamente.");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma quantidade válida.");
        }
    }

    return false;
    
    }
    
    private void atualizar_Estoque(double quantidade) {
    String nomeProduto = (String) jNomeProdutoBox.getSelectedItem();
    Produto produtoSelecionado = encontrar_Produto(nomeProduto, (String) jProdutoBox.getSelectedItem());

    if (produtoSelecionado != null) {
        int estoqueAtual = produtoSelecionado.getEstoque();

        if (quantidade <= estoqueAtual) {
            produtoSelecionado.setEstoque(estoqueAtual - (int) quantidade);
        } else {
            JOptionPane.showMessageDialog(this, "Estoque insuficiente. Não é possível adicionar ao total.");
        }
    }
    
    }
    private void reiniciar_Estoque() {
    String nomeProduto = (String) jNomeProdutoBox.getSelectedItem();
    int estoqueDefinido = estoqueOriginalProduto.getOrDefault(nomeProduto, 0);
    Produto produtoSelecionado = encontrar_Produto(nomeProduto, (String) jProdutoBox.getSelectedItem());
    
    if (produtoSelecionado != null) {
        produtoSelecionado.setEstoque(estoqueDefinido);
        JOptionPane.showMessageDialog(this, "Estoque reiniciado para " + estoqueDefinido);
    } else {
        JOptionPane.showMessageDialog(this, "Produto não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    }


}