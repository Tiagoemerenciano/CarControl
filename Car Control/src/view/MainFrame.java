package view;

import conexao.Connect;
import controller.UsuarioController;
import model.Usuario;
import dao.UsuarioDao;
import java.sql.Connection;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    public static Usuario usuarioLogado;
    public static Connection con = Connect.getConnection();

    public MainFrame() {
        initComponents();
        bloquearMenu(mnVeiculo, mnPedestre, mnApartamento, mnUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        loginIFrame = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnAcessar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnVeiculo = new javax.swing.JMenu();
        mntmCadastrarVeiculo = new javax.swing.JMenuItem();
        mntmEntradaSaidaVeiculo = new javax.swing.JMenuItem();
        mntmConsultarVeiculo = new javax.swing.JMenuItem();
        mntmAlterarVeiculo = new javax.swing.JMenuItem();
        mntmHistoricoVeiculo = new javax.swing.JMenuItem();
        mntmBloquearVeiculo = new javax.swing.JMenuItem();
        mnPedestre = new javax.swing.JMenu();
        mntmCadastrarPedestre = new javax.swing.JMenuItem();
        mntmEntradaPedestre = new javax.swing.JMenuItem();
        mntmConsultarPedestre = new javax.swing.JMenuItem();
        mntmAlterarPedestre = new javax.swing.JMenuItem();
        mntmHistoricoPedestre = new javax.swing.JMenuItem();
        mntmBloquearPedestre = new javax.swing.JMenuItem();
        mnApartamento = new javax.swing.JMenu();
        mntmCadastrarApartamento = new javax.swing.JMenuItem();
        mntmConsultarApartamento = new javax.swing.JMenuItem();
        mntmAlterarApartamento = new javax.swing.JMenuItem();
        mnUsuario = new javax.swing.JMenu();
        mntmCadastrarUsuario = new javax.swing.JMenuItem();
        mntmAlterarUsuario = new javax.swing.JMenuItem();
        mntmAlterarSenhaUsuario = new javax.swing.JMenuItem();
        mntmTrocarUsuario = new javax.swing.JMenuItem();
        mnSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Control");

        desktop.setBackground(new java.awt.Color(51, 51, 51));

        loginIFrame.setTitle("Acesso");
        loginIFrame.setAutoscrolls(true);
        loginIFrame.setVisible(true);

        jLabel1.setText("Login:");

        jLabel2.setText("Senha:");

        btnAcessar.setText("Acessar");
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginIFrameLayout = new javax.swing.GroupLayout(loginIFrame.getContentPane());
        loginIFrame.getContentPane().setLayout(loginIFrameLayout);
        loginIFrameLayout.setHorizontalGroup(
            loginIFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginIFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginIFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginIFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLogin)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginIFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAcessar)
                .addContainerGap())
        );
        loginIFrameLayout.setVerticalGroup(
            loginIFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginIFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginIFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginIFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAcessar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));

        lblCargo.setForeground(new java.awt.Color(255, 255, 255));

        desktop.setLayer(loginIFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(lblCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsuario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCargo)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addGap(0, 348, Short.MAX_VALUE)
                .addComponent(loginIFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsuario))
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(loginIFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                        .addComponent(lblCargo)))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorderPainted(false);

        mnVeiculo.setText("Veículo");

        mntmCadastrarVeiculo.setText("Cadastrar");
        mntmCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmCadastrarVeiculoActionPerformed(evt);
            }
        });
        mnVeiculo.add(mntmCadastrarVeiculo);

        mntmEntradaSaidaVeiculo.setText("Entrada / Saída");
        mntmEntradaSaidaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmEntradaSaidaVeiculoActionPerformed(evt);
            }
        });
        mnVeiculo.add(mntmEntradaSaidaVeiculo);

        mntmConsultarVeiculo.setText("Consultar");
        mntmConsultarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmConsultarVeiculoActionPerformed(evt);
            }
        });
        mnVeiculo.add(mntmConsultarVeiculo);

        mntmAlterarVeiculo.setText("Alterar");
        mntmAlterarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmAlterarVeiculoActionPerformed(evt);
            }
        });
        mnVeiculo.add(mntmAlterarVeiculo);

        mntmHistoricoVeiculo.setText("Histórico");
        mntmHistoricoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmHistoricoVeiculoActionPerformed(evt);
            }
        });
        mnVeiculo.add(mntmHistoricoVeiculo);

        mntmBloquearVeiculo.setText("Bloquear / Desbloquear");
        mntmBloquearVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmBloquearVeiculoActionPerformed(evt);
            }
        });
        mnVeiculo.add(mntmBloquearVeiculo);

        jMenuBar1.add(mnVeiculo);

        mnPedestre.setText("Pedestre");

        mntmCadastrarPedestre.setText("Cadastrar");
        mnPedestre.add(mntmCadastrarPedestre);

        mntmEntradaPedestre.setText("Entrada");
        mnPedestre.add(mntmEntradaPedestre);

        mntmConsultarPedestre.setText("Consultar");
        mnPedestre.add(mntmConsultarPedestre);

        mntmAlterarPedestre.setText("Alterar");
        mnPedestre.add(mntmAlterarPedestre);

        mntmHistoricoPedestre.setText("Histórico");
        mnPedestre.add(mntmHistoricoPedestre);

        mntmBloquearPedestre.setText("Bloquear");
        mnPedestre.add(mntmBloquearPedestre);

        jMenuBar1.add(mnPedestre);

        mnApartamento.setText("Apartamento");

        mntmCadastrarApartamento.setText("Cadastrar");
        mntmCadastrarApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmCadastrarApartamentoActionPerformed(evt);
            }
        });
        mnApartamento.add(mntmCadastrarApartamento);

        mntmConsultarApartamento.setText("Consultar");
        mntmConsultarApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmConsultarApartamentoActionPerformed(evt);
            }
        });
        mnApartamento.add(mntmConsultarApartamento);

        mntmAlterarApartamento.setText("Alterar");
        mnApartamento.add(mntmAlterarApartamento);

        jMenuBar1.add(mnApartamento);

        mnUsuario.setText("Usuário");

        mntmCadastrarUsuario.setText("Cadastrar");
        mntmCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmCadastrarUsuarioActionPerformed(evt);
            }
        });
        mnUsuario.add(mntmCadastrarUsuario);

        mntmAlterarUsuario.setText("Alterar");
        mntmAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmAlterarUsuarioActionPerformed(evt);
            }
        });
        mnUsuario.add(mntmAlterarUsuario);

        mntmAlterarSenhaUsuario.setText("Alterar Senha");
        mntmAlterarSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmAlterarSenhaUsuarioActionPerformed(evt);
            }
        });
        mnUsuario.add(mntmAlterarSenhaUsuario);

        mntmTrocarUsuario.setText("Trocar Usuário");
        mntmTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmTrocarUsuarioActionPerformed(evt);
            }
        });
        mnUsuario.add(mntmTrocarUsuario);

        jMenuBar1.add(mnUsuario);

        mnSobre.setText("Sobre");
        jMenuBar1.add(mnSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        setBounds(0, 0, 916, 660);
    }// </editor-fold>//GEN-END:initComponents

    private void mntmCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmCadastrarVeiculoActionPerformed
        CadastrarVeiculoIFrame cadastrarVeiculo = new CadastrarVeiculoIFrame();
        desktop.add(cadastrarVeiculo);
        cadastrarVeiculo.setVisible(true);
    }//GEN-LAST:event_mntmCadastrarVeiculoActionPerformed

    private void mntmEntradaSaidaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmEntradaSaidaVeiculoActionPerformed
        EntradaSaidaIFrame entradaSaida = new EntradaSaidaIFrame();
        desktop.add(entradaSaida);
        entradaSaida.setVisible(true);
    }//GEN-LAST:event_mntmEntradaSaidaVeiculoActionPerformed

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        UsuarioController control = new UsuarioController();
        Usuario user = control.logar(txtLogin.getText(), new String(txtSenha.getPassword()));

        // Caso a função dao.logar retorne um usuário
        if (user != null) {
            if (user.isBloqueado()) {
                JOptionPane.showMessageDialog(null, "Usuário bloqueado!");
            } else {
                usuarioLogado = user;
                // Desbloqueia os menus principais
                mnVeiculo.setEnabled(true);
                mnPedestre.setEnabled(true);
                mnApartamento.setEnabled(true);
                mnUsuario.setEnabled(true);
                mnSobre.setEnabled(true);
                mntmTrocarUsuario.setEnabled(true);
                mntmAlterarSenhaUsuario.setEnabled(true);

                // Desbloqueia opções de acordo com a permissão de cada usuário
                checarPermissoes(user.getPermissoes(), mntmCadastrarVeiculo, mntmEntradaSaidaVeiculo,
                        mntmConsultarVeiculo, mntmAlterarVeiculo, mntmHistoricoVeiculo, mntmBloquearVeiculo,
                        mntmCadastrarPedestre, mntmEntradaPedestre, mntmAlterarPedestre, mntmConsultarPedestre,
                        mntmHistoricoPedestre, mntmBloquearPedestre, mntmCadastrarApartamento,
                        mntmConsultarApartamento, mntmAlterarApartamento, mntmCadastrarUsuario, mntmAlterarUsuario);
                lblUsuario.setText("Usuário: " + user.getNome());
                lblCargo.setText("Cargo: " + user.getCargo());

                // Fecha a tela de login
                loginIFrame.setVisible(false);
            }
        } else {
            // Caso a função dao.logar retorne null
            JOptionPane.showMessageDialog(null, "Dados inválidos!");
        }
    }//GEN-LAST:event_btnAcessarActionPerformed

    private void mntmTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmTrocarUsuarioActionPerformed
        bloquearMenu(mnVeiculo, mnPedestre, mnApartamento, mnUsuario);
        lblUsuario.setText("");
        lblCargo.setText("");
        txtLogin.setText("");
        txtSenha.setText("");
        loginIFrame.setVisible(true);
    }//GEN-LAST:event_mntmTrocarUsuarioActionPerformed

    private void mntmCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmCadastrarUsuarioActionPerformed
        CadastrarUsuarioIFrame cadastrarUsuario = new CadastrarUsuarioIFrame();
        desktop.add(cadastrarUsuario);
        cadastrarUsuario.setVisible(true);
    }//GEN-LAST:event_mntmCadastrarUsuarioActionPerformed

    private void mntmAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmAlterarUsuarioActionPerformed
        AlterarUsuarioIFrame alterarUsuario = new AlterarUsuarioIFrame();
        desktop.add(alterarUsuario);
        alterarUsuario.setVisible(true);
    }//GEN-LAST:event_mntmAlterarUsuarioActionPerformed

    private void mntmAlterarSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmAlterarSenhaUsuarioActionPerformed
        AlterarSenhaIFrame alterarSenha = new AlterarSenhaIFrame();
        desktop.add(alterarSenha);
        alterarSenha.setVisible(true);
    }//GEN-LAST:event_mntmAlterarSenhaUsuarioActionPerformed

    private void mntmConsultarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmConsultarVeiculoActionPerformed
        ConsultarVeiculoIFrame consultarVeiculo = new ConsultarVeiculoIFrame();
        desktop.add(consultarVeiculo);
        consultarVeiculo.setVisible(true);
    }//GEN-LAST:event_mntmConsultarVeiculoActionPerformed

    private void mntmBloquearVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmBloquearVeiculoActionPerformed
        BloquearDesbloquearVeiculoIFrame bloquearVeiculo = new BloquearDesbloquearVeiculoIFrame();
        desktop.add(bloquearVeiculo);
        bloquearVeiculo.setVisible(true);
    }//GEN-LAST:event_mntmBloquearVeiculoActionPerformed

    private void mntmCadastrarApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmCadastrarApartamentoActionPerformed
        CadastrarApartamentoIFrame cadastrarApartamento = new CadastrarApartamentoIFrame();
        desktop.add(cadastrarApartamento);
        cadastrarApartamento.setVisible(true);
    }//GEN-LAST:event_mntmCadastrarApartamentoActionPerformed

    private void mntmConsultarApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmConsultarApartamentoActionPerformed
        ConsultarApartamentoIFrame consultarApartamento = new ConsultarApartamentoIFrame();
        desktop.add(consultarApartamento);
        consultarApartamento.setVisible(true);
    }//GEN-LAST:event_mntmConsultarApartamentoActionPerformed
    private void mntmAlterarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmAlterarVeiculoActionPerformed
        AlterarVeiculoIFrame alterarVeiculo = new AlterarVeiculoIFrame();
        desktop.add(alterarVeiculo);
        alterarVeiculo.setVisible(true);
    }//GEN-LAST:event_mntmAlterarVeiculoActionPerformed

    private void mntmHistoricoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmHistoricoVeiculoActionPerformed
        HistoricoVeiculoIFrame historicoEntrada = new HistoricoVeiculoIFrame();
        desktop.add(historicoEntrada);
        historicoEntrada.setVisible(true);
    }//GEN-LAST:event_mntmHistoricoVeiculoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    private void checarPermissoes(String permissoes, JMenuItem mntmCadastrarVeiculo, JMenuItem mntmEntradaSaidaVeiculo,
            JMenuItem mntmConsultarVeiculo, JMenuItem mntmAlterarVeiculo, JMenuItem mntmHistoricoVeiculo, JMenuItem mntmBloquearVeiculo,
            JMenuItem mntmCadastrarPedestre, JMenuItem mntmEntradaPedestre, JMenuItem mntmAlterarPedestre, JMenuItem mntmConsultarPedestre,
            JMenuItem mntmHistoricoPedestre, JMenuItem mntmBloquearPedestre, JMenuItem mntmCadastrarApartamento,
            JMenuItem mntmConsultarApartamento, JMenuItem mntmAlterarApartamento, JMenuItem mntmCadastrarUsuario, JMenuItem mntmAlterarUsuario) {
        char[] perm = permissoes.toCharArray();

        // Se = 0, permissão bloqueada. 
        // Se = 1, permissão liberada.
        if (perm[0] == '0') {
            mntmCadastrarVeiculo.setEnabled(false);
        } else {
            mntmCadastrarVeiculo.setEnabled(true);
        }
        if (perm[1] == '0') {
            mntmEntradaSaidaVeiculo.setEnabled(false);
        } else {
            mntmEntradaSaidaVeiculo.setEnabled(true);
        }
        if (perm[2] == '0') {
            mntmConsultarVeiculo.setEnabled(false);
        } else {
            mntmConsultarVeiculo.setEnabled(true);
        }
        if (perm[3] == '0') {
            mntmAlterarVeiculo.setEnabled(false);
        } else {
            mntmAlterarVeiculo.setEnabled(true);
        }
        if (perm[4] == '0') {
            mntmHistoricoVeiculo.setEnabled(false);
        } else {
            mntmHistoricoVeiculo.setEnabled(true);
        }
        if (perm[5] == '0') {
            mntmBloquearVeiculo.setEnabled(false);
        } else {
            mntmBloquearVeiculo.setEnabled(true);
        }
        if (perm[6] == '0') {
            mntmCadastrarPedestre.setEnabled(false);
        } else {
            mntmCadastrarPedestre.setEnabled(true);
        }
        if (perm[7] == '0') {
            mntmEntradaPedestre.setEnabled(false);
        } else {
            mntmEntradaPedestre.setEnabled(true);
        }
        if (perm[8] == '0') {
            mntmAlterarPedestre.setEnabled(false);
        } else {
            mntmAlterarPedestre.setEnabled(true);
        }
        if (perm[9] == '0') {
            mntmConsultarPedestre.setEnabled(false);
        } else {
            mntmConsultarPedestre.setEnabled(true);
        }
        if (perm[10] == '0') {
            mntmHistoricoPedestre.setEnabled(false);
        } else {
            mntmHistoricoPedestre.setEnabled(true);
        }
        if (perm[11] == '0') {
            mntmBloquearPedestre.setEnabled(false);
        } else {
            mntmBloquearPedestre.setEnabled(true);
        }
        if (perm[12] == '0') {
            mntmCadastrarApartamento.setEnabled(false);
        } else {
            mntmCadastrarApartamento.setEnabled(true);
        }
        if (perm[13] == '0') {
            mntmConsultarApartamento.setEnabled(false);
        } else {
            mntmConsultarApartamento.setEnabled(true);
        }
        if (perm[14] == '0') {
            mntmAlterarApartamento.setEnabled(false);
        } else {
            mntmAlterarVeiculo.setEnabled(true);
        }
        if (perm[15] == '0') {
            mntmCadastrarUsuario.setEnabled(false);
        } else {
            mntmCadastrarUsuario.setEnabled(true);
        }
        if (perm[16] == '0') {
            mntmAlterarUsuario.setEnabled(false);
        } else {
            mntmAlterarUsuario.setEnabled(true);
        }
    }

    private void bloquearMenu(JMenu mnVeiculo, JMenu mnPedestre, JMenu mnApartamento, JMenu mnUsuario) {
        mnVeiculo.setEnabled(false);
        mnPedestre.setEnabled(false);
        mnApartamento.setEnabled(false);
        mnUsuario.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JInternalFrame loginIFrame;
    private javax.swing.JMenu mnApartamento;
    private javax.swing.JMenu mnPedestre;
    private javax.swing.JMenu mnSobre;
    private javax.swing.JMenu mnUsuario;
    private javax.swing.JMenu mnVeiculo;
    private javax.swing.JMenuItem mntmAlterarApartamento;
    private javax.swing.JMenuItem mntmAlterarPedestre;
    private javax.swing.JMenuItem mntmAlterarSenhaUsuario;
    private javax.swing.JMenuItem mntmAlterarUsuario;
    private javax.swing.JMenuItem mntmAlterarVeiculo;
    private javax.swing.JMenuItem mntmBloquearPedestre;
    private javax.swing.JMenuItem mntmBloquearVeiculo;
    private javax.swing.JMenuItem mntmCadastrarApartamento;
    private javax.swing.JMenuItem mntmCadastrarPedestre;
    private javax.swing.JMenuItem mntmCadastrarUsuario;
    private javax.swing.JMenuItem mntmCadastrarVeiculo;
    private javax.swing.JMenuItem mntmConsultarApartamento;
    private javax.swing.JMenuItem mntmConsultarPedestre;
    private javax.swing.JMenuItem mntmConsultarVeiculo;
    private javax.swing.JMenuItem mntmEntradaPedestre;
    private javax.swing.JMenuItem mntmEntradaSaidaVeiculo;
    private javax.swing.JMenuItem mntmHistoricoPedestre;
    private javax.swing.JMenuItem mntmHistoricoVeiculo;
    private javax.swing.JMenuItem mntmTrocarUsuario;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
