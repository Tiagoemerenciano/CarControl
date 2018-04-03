package view;

import classes.Usuario;
import conexao.Connect;
import dao.UsuarioDao;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AlterarUsuarioIFrame extends javax.swing.JInternalFrame {

    final private UsuarioDao dao = new UsuarioDao();
    private Usuario usuario = new Usuario();
    private int userId;

    public AlterarUsuarioIFrame() {
        initComponents();
        preencherTabela();
        selecionarUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        cbBloqueado = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Alteração de Usuário");

        jLabel5.setText("Cargo:");

        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });

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

        cbBloqueado.setText("Bloqueado");

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
                        .addComponent(pnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPermissoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSelecionarTudo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbBloqueado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        pnPermissoesLayout.setVerticalGroup(
            pnPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPermissoesLayout.createSequentialGroup()
                .addGroup(pnPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbBloqueado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSelecionarTudo))
            .addGroup(pnPermissoesLayout.createSequentialGroup()
                .addGroup(pnPermissoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPedestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jLabel1.setText("*Nome:");

        jLabel2.setText("Documento:");

        jLabel3.setText("*Login:");

        jLabel4.setText("*Senha:");

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Documento", "Login", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUsuarios.setColumnSelectionAllowed(true);
        tbUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbUsuarios);
        tbUsuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCargo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnPermissoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(pnPermissoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
    }//GEN-LAST:event_txtCargoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        String documento = null;
        String cargo = null;
        Boolean bloqueado;
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

        bloqueado = cbBloqueado.isSelected();

        Usuario user = new Usuario(userId, txtNome.getText(), documento, bloqueado, txtLogin.getText(), new String(txtSenha.getPassword()), cargo, permissoes);

        dao.alterarUsuario(user);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void preencherTabela() {
        ResultSet rs = dao.listarUsuarios();
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Object[] colunas = new Object[4];
        colunas[0] = "Nome";
        colunas[1] = "Doc.";
        colunas[2] = "Login";
        colunas[3] = "Cargo";
        model.setColumnIdentifiers(colunas);

        String[] linhas = new String[4];

        try {
            while (rs.next()) {
                linhas[0] = rs.getString("nome");
                linhas[1] = rs.getString("documento");
                linhas[2] = rs.getString("login");
                linhas[3] = rs.getString("cargo");
                model.addRow(linhas);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AlterarUsuarioIFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.closeConnection(null, null, rs);
        }

        tbUsuarios.setModel(model);
    }

    private void selecionarUsuario() {
        tbUsuarios.addMouseListener(new MouseAdapter() {
            private int linha;

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    linha = tbUsuarios.getSelectedRow();
                    System.out.println(String.valueOf(tbUsuarios.getValueAt(linha, 2)));
                    Usuario usuario = dao.consultarUsuario(String.valueOf(tbUsuarios.getValueAt(linha, 2)));
                    userId = usuario.getId();
                    txtNome.setText(usuario.getNome());
                    txtDocumento.setText(usuario.getDocumento());
                    txtLogin.setText(usuario.getLogin());
                    txtCargo.setText(usuario.getCargo());
                    txtSenha.setText(usuario.getSenha());
                    cbBloqueado.setSelected(usuario.isBloqueado());
                    recuperarPermissoes(usuario.getPermissoes(), cbAlterarApartamento, cbAlterarPedestre, cbAlterarUsuario, cbAlterarVeiculo,
                            cbBloquearPedestre, cbBloquearUsuario, cbBloquearVeiculo, cbCadastrarApartamento,
                            cbCadastrarPedestre, cbCadastrarUsuario, cbCadastrarVeiculo, cbConsultarApartamento,
                            cbConsultarPedestre, cbConsultarVeiculo, cbEntradaPedestre, cbEntradaSaidaVeiculo,
                            cbHistoricoPedestre, cbHistoricoVeiculo);
                }
            }
        });
    }

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

    public void recuperarPermissoes(String permissoes, JCheckBox cbAlterarApartamento, JCheckBox cbAlterarPedestre, JCheckBox cbAlterarUsuario, JCheckBox cbAlterarVeiculo,
            JCheckBox cbBloquearPedestre, JCheckBox cbBloquearUsuario, JCheckBox cbBloquearVeiculo, JCheckBox cbCadastrarApartamento,
            JCheckBox cbCadastrarPedestre, JCheckBox cbCadastrarUsuario, JCheckBox cbCadastrarVeiculo, JCheckBox cbConsultarApartamento,
            JCheckBox cbConsultarPedestre, JCheckBox cbConsultarVeiculo, JCheckBox cbEntradaPedestre, JCheckBox cbEntradaSaidaVeiculo,
            JCheckBox cbHistoricoPedestre, JCheckBox cbHistoricoVeiculo) {
        char[] perm = permissoes.toCharArray();

        if (perm[0] == '0') {
            cbCadastrarVeiculo.setSelected(false);
        } else {
            cbCadastrarVeiculo.setSelected(true);
        }
        if (perm[1] == '0') {
            cbEntradaSaidaVeiculo.setSelected(false);
        } else {
            cbEntradaSaidaVeiculo.setSelected(true);
        }
        if (perm[2] == '0') {
            cbConsultarVeiculo.setSelected(false);
        } else {
            cbConsultarVeiculo.setSelected(true);
        }
        if (perm[3] == '0') {
            cbAlterarVeiculo.setSelected(false);
        } else {
            cbAlterarVeiculo.setSelected(true);
        }
        if (perm[4] == '0') {
            cbHistoricoVeiculo.setSelected(false);
        } else {
            cbHistoricoVeiculo.setSelected(true);
        }
        if (perm[5] == '0') {
            cbBloquearVeiculo.setSelected(false);
        } else {
            cbBloquearVeiculo.setSelected(true);
        }
        if (perm[6] == '0') {
            cbCadastrarPedestre.setSelected(false);
        } else {
            cbCadastrarPedestre.setSelected(true);
        }
        if (perm[7] == '0') {
            cbEntradaPedestre.setSelected(false);
        } else {
            cbEntradaPedestre.setSelected(true);
        }
        if (perm[8] == '0') {
            cbConsultarPedestre.setSelected(false);
        } else {
            cbConsultarPedestre.setSelected(true);
        }
        if (perm[9] == '0') {
            cbAlterarPedestre.setSelected(false);
        } else {
            cbAlterarPedestre.setSelected(true);
        }
        if (perm[10] == '0') {
            cbHistoricoPedestre.setSelected(false);
        } else {
            cbHistoricoPedestre.setSelected(true);
        }
        if (perm[11] == '0') {
            cbBloquearPedestre.setSelected(false);
        } else {
            cbBloquearPedestre.setSelected(true);
        }
        if (perm[12] == '0') {
            cbCadastrarApartamento.setSelected(false);
        } else {
            cbCadastrarApartamento.setSelected(true);
        }
        if (perm[13] == '0') {
            cbConsultarApartamento.setSelected(false);
        } else {
            cbConsultarApartamento.setSelected(true);
        }
        if (perm[14] == '0') {
            cbAlterarApartamento.setSelected(false);
        } else {
            cbAlterarApartamento.setSelected(true);
        }
        if (perm[15] == '0') {
            cbCadastrarUsuario.setSelected(false);
        } else {
            cbCadastrarUsuario.setSelected(true);
        }
        if (perm[16] == '0') {
            cbAlterarUsuario.setSelected(false);
        } else {
            cbAlterarUsuario.setSelected(true);
        }
        if (perm[17] == '0') {
            cbBloquearUsuario.setSelected(false);
        } else {
            cbBloquearUsuario.setSelected(true);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JCheckBox cbAlterarApartamento;
    private javax.swing.JCheckBox cbAlterarPedestre;
    private javax.swing.JCheckBox cbAlterarUsuario;
    private javax.swing.JCheckBox cbAlterarVeiculo;
    private javax.swing.JCheckBox cbBloqueado;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnApartamento;
    private javax.swing.JPanel pnPedestre;
    private javax.swing.JPanel pnPermissoes;
    private javax.swing.JPanel pnUsuario;
    private javax.swing.JPanel pnVeiculo;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
