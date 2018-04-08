package view;

import classes.Veiculo;
import dao.VeiculoDao;
import javax.swing.JOptionPane;

public class BloquearDesbloquearVeiculoIFrame extends javax.swing.JInternalFrame {

    public BloquearDesbloquearVeiculoIFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btnBloquear = new javax.swing.JButton();

        setClosable(true);
        setTitle("Bloquear/Desbloquear Veículo");

        jLabel1.setText("PLACA:");

        btnBloquear.setText("Bloquear / Desbloquear");
        btnBloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloquearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBloquear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBloquear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloquearActionPerformed
        VeiculoDao dao = new VeiculoDao();
        Veiculo veiculo = dao.consultar(txtPlaca.getText());
        if (veiculo != null) {
            if (veiculo.isBloqueado()) {
                dao.desbloquear(txtPlaca.getText());
                JOptionPane.showMessageDialog(null, "Veículo desbloqueado com sucesso!");
            } else if(!veiculo.isBloqueado()){
                dao.bloquear(txtPlaca.getText());
                JOptionPane.showMessageDialog(null, "Veículo bloqueado com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Placa inexistente!");
        }
    }//GEN-LAST:event_btnBloquearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBloquear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
