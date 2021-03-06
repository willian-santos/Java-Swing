/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian Kaminski
 * @since 27/06/2018 - 20:40
 * @version Beta Version 1.0
 */
public class UICadCliente extends javax.swing.JInternalFrame {

    Cliente c = new Cliente();

    /**
     * Creates new form UICadCliente
     */
    public UICadCliente() {
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

        bgFormaPagamento = new javax.swing.ButtonGroup();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbRelatorio = new javax.swing.JButton();
        jlpDados = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlValorTotal = new javax.swing.JLabel();
        jtValorTotal = new javax.swing.JTextField();
        jlPagamento = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jlTelefone = new javax.swing.JLabel();
        jtTelefone = new javax.swing.JTextField();
        jlReceber = new javax.swing.JLabel();
        jlpCheckBox = new javax.swing.JLayeredPane();
        jcEmailsChatos = new javax.swing.JCheckBox();
        jcCartoesAniversario = new javax.swing.JCheckBox();
        jcTelefones = new javax.swing.JCheckBox();
        jcDinheiro = new javax.swing.JCheckBox();
        jrAVista = new javax.swing.JRadioButton();
        jr1x = new javax.swing.JRadioButton();
        jr2x = new javax.swing.JRadioButton();
        jr3x = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Cliente");

        jlpAcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbRelatorio.setText("Relatório");
        jbRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRelatorioActionPerformed(evt);
            }
        });

        jlpAcoes.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbRelatorio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addComponent(jbRelatorio)
                .addContainerGap())
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbLimpar)
                    .addComponent(jbRelatorio))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jlpDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome");

        jlValorTotal.setText("Valor Total");

        jlPagamento.setText("Forma de Pagamento");

        jlEmail.setText("E-mail");

        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });

        jlTelefone.setText("Telefone");

        jlReceber.setText("Deseja receber?");

        jlpCheckBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcEmailsChatos.setText("E-mails Promocionais ");

        jcCartoesAniversario.setText("Cartões de aniversário");

        jcTelefones.setText("Telefonemas sobre novas promoções");

        jcDinheiro.setText("Brindes");

        jlpCheckBox.setLayer(jcEmailsChatos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCheckBox.setLayer(jcCartoesAniversario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCheckBox.setLayer(jcTelefones, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCheckBox.setLayer(jcDinheiro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpCheckBoxLayout = new javax.swing.GroupLayout(jlpCheckBox);
        jlpCheckBox.setLayout(jlpCheckBoxLayout);
        jlpCheckBoxLayout.setHorizontalGroup(
            jlpCheckBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpCheckBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpCheckBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcEmailsChatos)
                    .addComponent(jcCartoesAniversario)
                    .addComponent(jcTelefones)
                    .addComponent(jcDinheiro))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jlpCheckBoxLayout.setVerticalGroup(
            jlpCheckBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpCheckBoxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcEmailsChatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcCartoesAniversario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcTelefones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcDinheiro)
                .addGap(45, 45, 45))
        );

        bgFormaPagamento.add(jrAVista);
        jrAVista.setText("à vista");
        jrAVista.setActionCommand("à vista");

        bgFormaPagamento.add(jr1x);
        jr1x.setText("1x");
        jr1x.setActionCommand("1x");

        bgFormaPagamento.add(jr2x);
        jr2x.setText("2x");
        jr2x.setActionCommand("2x");

        bgFormaPagamento.add(jr3x);
        jr3x.setText("3x");
        jr3x.setActionCommand("3x");

        jlpDados.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlValorTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtValorTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlPagamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlReceber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlpCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrAVista, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jr1x, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jr2x, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jr3x, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlPagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrAVista)
                        .addGap(26, 26, 26)
                        .addComponent(jr1x)
                        .addGap(29, 29, 29)
                        .addComponent(jr2x)
                        .addGap(36, 36, 36)
                        .addComponent(jr3x)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlReceber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlpCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEmail)
                                    .addComponent(jlTelefone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jlpDadosLayout.createSequentialGroup()
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlValorTotal)
                                    .addComponent(jlNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                                    .addComponent(jtNome))))
                        .addGap(21, 21, 21))))
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNome))
                .addGap(34, 34, 34)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorTotal)
                    .addComponent(jtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPagamento)
                    .addComponent(jrAVista)
                    .addComponent(jr1x)
                    .addComponent(jr2x)
                    .addComponent(jr3x))
                .addGap(21, 21, 21)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jlReceber)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jlpCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpDados)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cadastrar() {
        try {

            if (!jtNome.getText().isEmpty()) {
                c.setNome(jtNome.getText());
            } else {
                throw new NumberFormatException(" Preencha o campo: Nome!");
            }
            if (!jtValorTotal.getText().isEmpty()) {
                c.setValorTotal(Double.parseDouble(jtValorTotal.getText()));
            } else {
                throw new NumberFormatException(" Preencha o campo: Valor Total!");
            }
            if (bgFormaPagamento.getSelection() != null) {
                c.setFormaPagamento(bgFormaPagamento.getSelection().getActionCommand());
            } else {
                throw new NumberFormatException(" Preencha a Forma de Pagamento!");
            }
            if (!jtEmail.getText().isEmpty()) {
                c.setEmail(jtEmail.getText());
            } else {
                throw new NumberFormatException(" Preencha o campo: E-mail!");
            }
            if (!jtTelefone.getText().isEmpty()) {
                c.setTelefone(Integer.parseInt(jtTelefone.getText()));
            } else {
                throw new NumberFormatException(" Preencha o campo: Telefone!");
            }
            
            //
            ArrayList<String> receive = new ArrayList<>();
            //
            
            if(jcEmailsChatos.isSelected()){
                receive.add(jcEmailsChatos.getActionCommand());
            }
            if(jcCartoesAniversario.isSelected()){
                receive.add(jcCartoesAniversario.getActionCommand());
            }
            if(jcTelefones.isSelected()){
                receive.add(jcTelefones.getActionCommand());
            }
            if(jcDinheiro.isSelected()){
                receive.add(jcDinheiro.getActionCommand());
            }
            
            c.setReceber(receive);

            JOptionPane.showMessageDialog(rootPane,
                    "Cliente cadastrado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,
                    "Erro! " + e.getMessage());
        } finally {
            System.out.println("Testes feitos com sucesso!");
        }
    }

    private void limpar() {
        jtNome.setText(null);
        jtValorTotal.setText(null);
        jtEmail.setText(null);
        jtTelefone.setText(null);
        jcEmailsChatos.setSelected(false);
        jcDinheiro.setSelected(false);
        jcCartoesAniversario.setSelected(false);
        jcTelefones.setSelected(false);
        bgFormaPagamento.clearSelection();
        jtNome.grabFocus();
    }

    private void mostrarRelatorio() {
        JOptionPane.showMessageDialog(
                this,
                "Relatório: "
                + c.toString());
    }
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        // TODO add your handling code here:
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRelatorioActionPerformed
        // TODO add your handling code here:
        mostrarRelatorio();
    }//GEN-LAST:event_jbRelatorioActionPerformed

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFormaPagamento;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbRelatorio;
    private javax.swing.JCheckBox jcCartoesAniversario;
    private javax.swing.JCheckBox jcDinheiro;
    private javax.swing.JCheckBox jcEmailsChatos;
    private javax.swing.JCheckBox jcTelefones;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPagamento;
    private javax.swing.JLabel jlReceber;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlValorTotal;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpCheckBox;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JRadioButton jr1x;
    private javax.swing.JRadioButton jr2x;
    private javax.swing.JRadioButton jr3x;
    private javax.swing.JRadioButton jrAVista;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtTelefone;
    private javax.swing.JTextField jtValorTotal;
    // End of variables declaration//GEN-END:variables
}
