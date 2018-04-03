package view;

import classes.Apartamento;
import dao.ApartamentoDao;
import javax.swing.JOptionPane;

public class ConsultarApartamentoIFrame extends javax.swing.JInternalFrame {

    public ConsultarApartamentoIFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNApartametno = new javax.swing.JLabel();
        txtNApartamento = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblVagas = new javax.swing.JLabel();
        lblVeiculos = new javax.swing.JLabel();

        txtNApartametno.setText("APARTAMENTO: ");

        txtNApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNApartamentoActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade de vagas:");

        jLabel3.setText("Quantidade de veiculos:");

        lblVagas.setText(" ");

        lblVeiculos.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtNApartametno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnConsultar))
                    .addComponent(lblVagas)
                    .addComponent(lblVeiculos))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNApartametno)
                    .addComponent(txtNApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVagas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblVeiculos))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNApartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNApartamentoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (txtNApartamento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Numero de apartamento obrigatorio!");
        } else {
            ApartamentoDao dao = new ApartamentoDao();
            Apartamento apto = dao.consultarApartamento(txtNApartamento.getText());
            lblVagas.setText(Integer.toString(apto.getQtdVagas()));
            lblVeiculos.setText(Integer.toString(apto.getQtdVeiculos()));
        }

    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblVagas;
    private javax.swing.JLabel lblVeiculos;
    private javax.swing.JTextField txtNApartamento;
    private javax.swing.JLabel txtNApartametno;
    // End of variables declaration//GEN-END:variables
}
