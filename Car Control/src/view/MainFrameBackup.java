package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Usuario;
import dao.UsuarioDao;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class MainFrameBackup extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPane;
    private JTextField txtLogin;
    private JPasswordField txtSenha;

    /**
     * Launch the application.
     *
     * @param args
     */
    
    /*public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MainFrameBackup frame = new MainFrameBackup();
                frame.setVisible(true);
                frame.setVisible(true);
                frame.setResizable(false);
            } catch (Exception e) {
            }
        });
    }*/

    /**
     * Create the frame.
     */
    public MainFrameBackup() {
        setTitle("Car Control");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JMenuBar menuBar = new JMenuBar();

        JMenu mnVeiculo = new JMenu("Ve\u00EDculo");
        menuBar.add(mnVeiculo);

        JMenuItem mntmCadastrarVeiculo = new JMenuItem("Cadastrar");
        mnVeiculo.add(mntmCadastrarVeiculo);

        JMenuItem mntmEntradaSaidaVeiculo = new JMenuItem("Entrada / Sa\u00EDda");
        mnVeiculo.add(mntmEntradaSaidaVeiculo);

        JMenuItem mntmConsultarVeiculo = new JMenuItem("Consultar");
        mnVeiculo.add(mntmConsultarVeiculo);

        JMenuItem mntmAlterarVeiculo = new JMenuItem("Alterar");
        mnVeiculo.add(mntmAlterarVeiculo);

        JMenuItem mntmHistoricoVeiculo = new JMenuItem("Hist\u00F3rico");
        mnVeiculo.add(mntmHistoricoVeiculo);

        JMenuItem mntmBloquearVeiculo = new JMenuItem("Bloquear");
        mnVeiculo.add(mntmBloquearVeiculo);

        JMenu mnPedestre = new JMenu("Pedestre");
        menuBar.add(mnPedestre);

        JMenuItem mntmCadastrarPedestre = new JMenuItem("Cadastrar");
        mnPedestre.add(mntmCadastrarPedestre);

        JMenuItem mntmEntradaPedestre = new JMenuItem("Entrada");
        mnPedestre.add(mntmEntradaPedestre);

        JMenuItem mntmAlterarPedestre = new JMenuItem("Alterar");
        mnPedestre.add(mntmAlterarPedestre);

        JMenuItem mntmConsultarPedestre = new JMenuItem("Consultar");
        mnPedestre.add(mntmConsultarPedestre);

        JMenuItem mntmHistoricoPedestre = new JMenuItem("Hist\u00F3rico");
        mnPedestre.add(mntmHistoricoPedestre);

        JMenuItem mntmBloquearPedestre = new JMenuItem("Bloquear");
        mnPedestre.add(mntmBloquearPedestre);

        JMenu mnApartamento = new JMenu("Apartamento");
        menuBar.add(mnApartamento);

        JMenuItem mntmCadastrarApartamento = new JMenuItem("Cadastrar");
        mnApartamento.add(mntmCadastrarApartamento);

        JMenuItem mntmConsultarApartamento = new JMenuItem("Consultar");
        mnApartamento.add(mntmConsultarApartamento);

        JMenuItem mntmAlterarApartamento = new JMenuItem("Alterar");
        mnApartamento.add(mntmAlterarApartamento);

        JMenu mnUsuario = new JMenu("Usu\u00E1rio");
        menuBar.add(mnUsuario);

        JMenuItem mntmCadastrarUsuario = new JMenuItem("Cadastrar");
        mnUsuario.add(mntmCadastrarUsuario);

        JMenuItem mntmAlterarUsuario = new JMenuItem("Alterar");
        mnUsuario.add(mntmAlterarUsuario);

        JMenuItem mntmBloquearUsuario = new JMenuItem("Bloquear");
        mnUsuario.add(mntmBloquearUsuario);

        JMenuItem mntmAlterarSenhaUsuario = new JMenuItem("Alterar Senha");
        mnUsuario.add(mntmAlterarSenhaUsuario);

        JMenuItem mntmTrocarUsuario = new JMenuItem("Trocar Usu\u00E1rio");
        mnUsuario.add(mntmTrocarUsuario);

        JMenu mnSobre = new JMenu("Sobre");
        menuBar.add(mnSobre);

        JMenuItem mntmDesenvolvedores = new JMenuItem("Desenvolvedores");
        mnSobre.add(mntmDesenvolvedores);

        JMenuItem mntmVersao = new JMenuItem("Vers\u00E3o");
        mnSobre.add(mntmVersao);

        JLabel lblUsuario = new JLabel("");
        lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
        lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));

        JLabel lblCargo = new JLabel("");
        lblCargo.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCargo.setFont(new Font("Tahoma", Font.PLAIN, 14));

        JDesktopPane desktopPane = new JDesktopPane();
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
                                        .addComponent(menuBar, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                                        .addComponent(desktopPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 578, GroupLayout.PREFERRED_SIZE))
                                .addGap(8)
                                .addComponent(lblUsuario)
                                .addGap(220)
                                .addComponent(lblCargo)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addPreferredGap(ComponentPlacement.RELATED, 532, Short.MAX_VALUE)
                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                                        .addComponent(lblUsuario)
                                                        .addComponent(lblCargo))
                                                .addGap(0))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 521, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );

        JInternalFrame loginFrame = new JInternalFrame("Login");
        loginFrame.setBounds(151, 153, 281, 131);
        desktopPane.add(loginFrame);
        loginFrame.setVisible(true);
        loginFrame.getContentPane().setLayout(null);

        JLabel lblLogin = new JLabel("Login:");
        lblLogin.setBounds(10, 14, 46, 14);
        loginFrame.getContentPane().add(lblLogin);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(10, 39, 46, 14);
        loginFrame.getContentPane().add(lblSenha);

        txtLogin = new JTextField();
        txtLogin.setBounds(51, 11, 200, 20);
        loginFrame.getContentPane().add(txtLogin);
        txtLogin.setColumns(10);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(51, 36, 200, 20);
        loginFrame.getContentPane().add(txtSenha);

        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(129, 67, 122, 23);
        loginFrame.getContentPane().add(btnConfirmar);

        btnConfirmar.addActionListener((ActionEvent e) -> {
            UsuarioDao dao = new UsuarioDao();
            Usuario user = dao.logar(txtLogin.getText(), new String(txtSenha.getPassword()));
            
            // Caso a fun��o dao.logar retorne um usu�rio
            if (user != null) {
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
                        mntmConsultarApartamento, mntmAlterarApartamento, mntmCadastrarUsuario, mntmAlterarUsuario,
                        mntmBloquearUsuario);
                lblUsuario.setText("Usu�rio: " + user.getNome());
                lblCargo.setText("Cargo: " + user.getCargo());
                
                // Fecha a tela de login
                loginFrame.dispose();
            } else {
                // Caso a fun��o dao.logar retorne null
                JOptionPane.showMessageDialog(null, "Dados inv�lidos!");
            }
        });

        //Bloquear menu antes de logar
        bloquearMenu(mnVeiculo, mnPedestre, mnApartamento, mnUsuario);

        mntmCadastrarUsuario.addActionListener((ActionEvent e) -> {
        });

        mntmTrocarUsuario.addActionListener((ActionEvent e) -> {
            bloquearMenu(mnVeiculo, mnPedestre, mnApartamento, mnUsuario);
            lblUsuario.setText("");
            lblCargo.setText("");
            txtLogin.setText("");
            txtSenha.setText("");
            loginFrame.setVisible(true);
        });

        contentPane.setLayout(gl_contentPane);
    }

    private void checarPermissoes(String permissoes, JMenuItem mntmCadastrarVeiculo, JMenuItem mntmEntradaSaidaVeiculo,
            JMenuItem mntmConsultarVeiculo, JMenuItem mntmAlterarVeiculo, JMenuItem mntmHistoricoVeiculo, JMenuItem mntmBloquearVeiculo,
            JMenuItem mntmCadastrarPedestre, JMenuItem mntmEntradaPedestre, JMenuItem mntmAlterarPedestre, JMenuItem mntmConsultarPedestre,
            JMenuItem mntmHistoricoPedestre, JMenuItem mntmBloquearPedestre, JMenuItem mntmCadastrarApartamento,
            JMenuItem mntmConsultarApartamento, JMenuItem mntmAlterarApartamento, JMenuItem mntmCadastrarUsuario, JMenuItem mntmAlterarUsuario,
            JMenuItem mntmBloquearUsuario) {
        char[] perm = permissoes.toCharArray();

        // Se = 0, permiss�o bloqueada. 
        // Se = 1, permiss�o liberada.
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
        if (perm[17] == '0') {
            mntmBloquearUsuario.setEnabled(false);
        } else {
            mntmBloquearUsuario.setEnabled(true);
        }
    }

    private void bloquearMenu(JMenu mnVeiculo, JMenu mnPedestre, JMenu mnApartamento, JMenu mnUsuario) {
        mnVeiculo.setEnabled(false);
        mnPedestre.setEnabled(false);
        mnApartamento.setEnabled(false);
        mnUsuario.setEnabled(false);
    }
}
