package view;

import classes.Apartamento;
import classes.Usuario;
import dao.ApartamentoDao;
import dao.UsuarioDao;
import javax.swing.JOptionPane;

public class CadastrarApartamentoIFrame extends javax.swing.JInternalFrame {

    public CadastrarApartamentoIFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNApartamento = new javax.swing.JTextField();
        txtQtdVagas = new javax.swing.JTextField();
        txtQtdVeiculos = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();

        jTextField6.setText("jTextField6");

        setClosable(true);
        setTitle("Cadastro de Apartamentos");

        jLabel1.setText("Número do apartamento:");

        jLabel2.setText("Quantidade de veículos:");

        jLabel3.setText("Quantidade de vagas:");

        txtNApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNApartamentoActionPerformed(evt);
            }
        });

        txtQtdVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdVeiculosActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNApartamento)
                    .addComponent(txtQtdVeiculos)
                    .addComponent(txtQtdVagas)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtQtdVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQtdVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirmar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQtdVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdVeiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdVeiculosActionPerformed

    private void txtNApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNApartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNApartamentoActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String numero;
        int qtdVeiculos;
        int qtdVagas;

        if (txtNApartamento.getText().equals("" )) {
            JOptionPane.showMessageDialog(null, "Número de apartamento obrigatório!", "Dados incompletos!", JOptionPane.WARNING_MESSAGE);
        } else if (txtQtdVeiculos.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Quantidade de veiculos obrigatorio!", "Dados incompletos!", JOptionPane.WARNING_MESSAGE);
        } else if (txtQtdVagas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Quantidade de vagas obrigatorio!", "Dados incompletos!", JOptionPane.WARNING_MESSAGE);
        }

        Apartamento apto = new Apartamento(txtNApartamento.getText(), Integer.parseInt(txtQtdVeiculos.getText()), Integer.parseInt(txtQtdVagas.getText()));

        ApartamentoDao dao = new ApartamentoDao();
        dao.cadastrar(apto);

    }//GEN-LAST:event_btnConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtNApartamento;
    private javax.swing.JTextField txtQtdVagas;
    private javax.swing.JTextField txtQtdVeiculos;
    // End of variables declaration//GEN-END:variables
}
