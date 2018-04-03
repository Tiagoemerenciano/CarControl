package view;

import classes.Veiculo;
import dao.VeiculoDao;
import javax.swing.JOptionPane;

public class EntradaSaidaIFrame extends javax.swing.JInternalFrame {

    private final VeiculoDao dao = new VeiculoDao();
    
    public EntradaSaidaIFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btnEntradaSaida = new javax.swing.JButton();
        lblMomento = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Entrada / Saída");

        jLabel1.setText("PLACA:");

        btnEntradaSaida.setText("Entrada / Saída");
        btnEntradaSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEntradaSaida))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblMomento)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntradaSaida))
                .addGap(18, 18, 18)
                .addComponent(lblMomento))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntradaSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaSaidaActionPerformed
        if(txtPlaca.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Placa obrigatória!");
        } else {
            Veiculo veiculo = dao.consultar(txtPlaca.getText());
            if(veiculo.isStatus()){
                dao.saida(veiculo);
            } else {
                dao.entrada(veiculo);
            }
        }
    }//GEN-LAST:event_btnEntradaSaidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntradaSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMomento;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
