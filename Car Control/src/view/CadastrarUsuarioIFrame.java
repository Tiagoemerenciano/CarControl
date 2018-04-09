package view;

import controller.UsuarioController;
import model.Usuario;
import dao.UsuarioDao;
import javax.swing.JOptionPane;

public class CadastrarUsuarioIFrame extends javax.swing.JInternalFrame {

    Usuario usuario = new Usuario();

    public CadastrarUsuarioIFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtCargo = new javax.swing.JTextField();
        pnPermissoes = new javax.swing.JPanel();
        pnVeiculo = new javax.swing.JPanel();
        cbCadastrarVeiculo = new javax.swing.JCheckBox();
        cbEntradaSaidaVeiculo = new javax.swing.JCheckBox();
        cbConsultarVeiculo = new javax.swing.JCheckBox();
        cbAlterarVeiculo = new javax.swing.JCheckBox();
        cbHistoricoVeiculo = new javax.swing.JCheckBox();
        cbBloquearVeiculo = new javax.swing.JCheckBox();
        pnPedestre = new javax.swing.JPanel();
        cbCadastrarPedestre = new javax.swing.JCheckBox();
        cbEntradaPedestre = new javax.swing.JCheckBox();
        cbConsultarPedestre = new javax.swing.JCheckBox();
        cbAlterarPedestre = new javax.swing.JCheckBox();
        cbHistoricoPedestre = new javax.swing.JCheckBox();
        cbBloquearPedestre = new javax.swing.JCheckBox();
        pnApartamento = new javax.swing.JPanel();
        cbCadastrarApartamento = new javax.swing.JCheckBox();
        cbConsultarApartamento = new javax.swing.JCheckBox();
        cbAlterarApartamento = new javax.swing.JCheckBox();
        pnUsuario = new javax.swing.JPanel();
        cbCadastrarUsuario = new javax.swing.JCheckBox();
        cbAlterarUsuario = new javax.swing.JCheckBox();
        cbBloquearUsuario = new javax.swing.JCheckBox();
        cbSelecionarTudo = new javax.swing.JCheckBox();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Usuários");

        jLabel1.setText("*Nome:");

        jLabel2.setText("Documento:");

        jLabel3.setText("*Login:");

        jLabel4.setText("*Senha:");

        jLabel5.setText("Cargo:");

        pnPermissoes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Permissões", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        pnVeiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Veículo"));

        cbCadastrarVeiculo.setText("Cadastrar");

        cbEntradaSaidaVeiculo.setText("Entrada / Saída");

        cbConsultarVeiculo.setText("Consultar");

        cbAlterarVeiculo.setText("Alterar");

        cbHistoricoVeiculo.setText("Histórico");

        cbBloquearVeiculo.setText("Bloquear");

        javax.swing.GroupLayout pnVeiculoLayout = new javax.swing.GroupLayout(pnVeiculo);
        pnVeiculo.setLayout(pnVeiculoLayout);
        pnVeiculoLayout.setHorizontalGroup(
            pnVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbCadastrarVeiculo)
            .addComponent(cbEntradaSaidaVeiculo)
            .addComponent(cbConsultarVeiculo)
            .addComponent(cbAlterarVeiculo)
            .addComponent(cbHistoricoVeiculo)
            .addComponent(cbBloquearVeiculo)
        );
        pnVeiculoLayout.setVerticalGroup(
            pnVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVeiculoLayout.createSequentialGroup()
                .addComponent(cbCadastrarVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEntradaSaidaVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbConsultarVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAlterarVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbHistoricoVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBloquearVeiculo))
        );

        pnPedestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedestre"));

        cbCadastrarPedestre.setText("Cadastrar");

        cbEntradaPedestre.setText("Entrada");

        cbConsultarPedestre.setText("Consultar");

        cbAlterarPedestre.setText("Alterar");

        cbHistoricoPedestre.setText("Histórico");

        cbBloquearPedestre.setText("Bloquear");

        javax.swing.GroupLayout pnPedestreLayout = new javax.swing.GroupLayout(pnPedestre);
        pnPedestre.setLayout(pnPedestreLayout);
        pnPedestreLayout.setHorizontalGroup(
            pnPedestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbCadastrarPedestre)
            .addComponent(cbEntradaPedestre)
            .addComponent(cbConsultarPedestre)
            .addComponent(cbAlterarPedestre)
            .addComponent(cbHistoricoPedestre)
            .addComponent(cbBloquearPedestre)
        );
        pnPedestreLayout.setVerticalGroup(
            pnPedestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPedestreLayout.createSequentialGroup()
                .addComponent(cbCadastrarPedestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEntradaPedestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbConsultarPedestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAlterarPedestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbHistoricoPedestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBloquearPedestre))
        );

        pnApartamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Apartamento"));

        cbCadastrarApartamento.setText("Cadastrar");

        cbConsultarApartamento.setText("Consultar");

        cbAlterarApartamento.setText("Alterar");

        javax.swing.GroupLayout pnApartamentoLayout = new javax.swing.GroupLayout(pnApartamento);
        pnApartamento.setLayout(pnApartamentoLayout);
        pnApartamentoLayout.setHorizontalGroup(
            pnApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbCadastrarApartamento)
            .addComponent(cbConsultarApartamento)
            .addComponent(cbAlterarApartamento)
        );
        pnApartamentoLayout.setVerticalGroup(
            pnApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnApartamentoLayout.createSequentialGroup()
                .addComponent(cbCadastrarApartamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbConsultarApartamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAlterarApartamento))
        );

        pnUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        cbCadastrarUsuario.setText("Cadastrar");

        cbAlterarUsuario.setText("Alterar");

        cbBloquearUsuario.setText("Bloquear");

        javax.swing.GroupLayout pnUsuarioLayout = new javax.swing.GroupLayout(pnUsuario);
        pnUsuario.setLayout(pnUsuarioLayout);
        pnUsuarioLayout.setHorizontalGroup(
            pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbCadastrarUsuario)
            .addComponent(cbAlterarUsuario)
            .addComponent(cbBloquearUsuario)
        );
        pnUsuarioLayout.setVerticalGroup(
            pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUsuarioLayout.createSequentialGroup()
                .addComponent(cbCadastrarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAlterarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBloquearUsuario))
        );

        cbSelecionarTudo.setText("Selecionar Tudo");
        cbSelecionarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelecionarTudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPermissoesLayout = new javax.swing.GroupLayout(pnPermissoes);
        pnPermissoes.setLayout(pnPermissoesLayout);
        pnPermissoesLayout.setHorizontalGroup(
            pnPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPermissoesLayout.createSequentialGroup()
                .addComponent(pnVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPedestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPermissoesLayout.createSequentialGroup()
                        .addComponent(pnApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPermissoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbSelecionarTudo))))
        );
        pnPermissoesLayout.setVerticalGroup(
            pnPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPermissoesLayout.createSequentialGroup()
                .addGroup(pnPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPermissoesLayout.createSequentialGroup()
                        .addGroup(pnPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbSelecionarTudo))
                    .addGroup(pnPermissoesLayout.createSequentialGroup()
                        .addGroup(pnPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnPedestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtDocumento)
                            .addComponent(txtLogin)
                            .addComponent(txtSenha)
                            .addComponent(txtCargo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pnPermissoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPermissoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSelecionarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelecionarTudoActionPerformed
        if (cbSelecionarTudo.isSelected()) {
            setSelectedAll(true);
        } else {
            setSelectedAll(false);
        }
    }//GEN-LAST:event_cbSelecionarTudoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtCargo.setText("");
        txtDocumento.setText("");
        txtLogin.setText("");
        txtNome.setText("");
        txtSenha.setText("");
        setSelectedAll(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String documento = null;
        String cargo = null;
        String permissoes = usuario.setPermissoes(cbAlterarApartamento, cbAlterarPedestre, cbAlterarUsuario, cbAlterarVeiculo,
                cbBloquearPedestre, cbBloquearUsuario, cbBloquearVeiculo, cbCadastrarApartamento,
                cbCadastrarPedestre, cbCadastrarUsuario, cbCadastrarVeiculo, cbConsultarApartamento,
                cbConsultarPedestre, cbConsultarVeiculo, cbEntradaPedestre, cbEntradaSaidaVeiculo,
                cbHistoricoPedestre, cbHistoricoVeiculo);

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Obrigatório!", "Dados incompletos!", JOptionPane.WARNING_MESSAGE);
        } else if (txtLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Login Obrigatório!", "Dados incompletos!", JOptionPane.WARNING_MESSAGE);
        } else if (new String(txtSenha.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(null, "Senha Obrigatória!", "Dados incompletos!", JOptionPane.WARNING_MESSAGE);
        }

        if (!txtDocumento.getText().equals("")) {
            documento = txtDocumento.getText();
        }

        if (!txtCargo.getText().equals("")) {
            cargo = txtCargo.getText();
        }
        
        UsuarioController control = new UsuarioController();
        control.cadastrar(txtNome.getText(), documento, txtLogin.getText(), new String(txtSenha.getPassword()), cargo, permissoes);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public void setSelectedAll(boolean status) {
        cbAlterarApartamento.setSelected(status);
        cbAlterarPedestre.setSelected(status);
        cbAlterarUsuario.setSelected(status);
        cbAlterarVeiculo.setSelected(status);
        cbBloquearPedestre.setSelected(status);
        cbBloquearUsuario.setSelected(status);
        cbBloquearVeiculo.setSelected(status);
        cbCadastrarApartamento.setSelected(status);
        cbCadastrarPedestre.setSelected(status);
        cbCadastrarUsuario.setSelected(status);
        cbCadastrarVeiculo.setSelected(status);
        cbConsultarApartamento.setSelected(status);
        cbConsultarPedestre.setSelected(status);
        cbConsultarVeiculo.setSelected(status);
        cbEntradaPedestre.setSelected(status);
        cbEntradaSaidaVeiculo.setSelected(status);
        cbHistoricoPedestre.setSelected(status);
        cbHistoricoVeiculo.setSelected(status);
        cbSelecionarTudo.setSelected(status);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JCheckBox cbAlterarApartamento;
    private javax.swing.JCheckBox cbAlterarPedestre;
    private javax.swing.JCheckBox cbAlterarUsuario;
    private javax.swing.JCheckBox cbAlterarVeiculo;
    private javax.swing.JCheckBox cbBloquearPedestre;
    private javax.swing.JCheckBox cbBloquearUsuario;
    private javax.swing.JCheckBox cbBloquearVeiculo;
    private javax.swing.JCheckBox cbCadastrarApartamento;
    private javax.swing.JCheckBox cbCadastrarPedestre;
    private javax.swing.JCheckBox cbCadastrarUsuario;
    private javax.swing.JCheckBox cbCadastrarVeiculo;
    private javax.swing.JCheckBox cbConsultarApartamento;
    private javax.swing.JCheckBox cbConsultarPedestre;
    private javax.swing.JCheckBox cbConsultarVeiculo;
    private javax.swing.JCheckBox cbEntradaPedestre;
    private javax.swing.JCheckBox cbEntradaSaidaVeiculo;
    private javax.swing.JCheckBox cbHistoricoPedestre;
    private javax.swing.JCheckBox cbHistoricoVeiculo;
    private javax.swing.JCheckBox cbSelecionarTudo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnApartamento;
    private javax.swing.JPanel pnPedestre;
    private javax.swing.JPanel pnPermissoes;
    private javax.swing.JPanel pnUsuario;
    private javax.swing.JPanel pnVeiculo;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
