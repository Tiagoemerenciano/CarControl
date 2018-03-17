package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JDialog;


public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
			        frame.setVisible(true);
			        frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu mnVeiculo = new JMenu("Ve\u00EDculo");
		menuBar.add(mnVeiculo);
		mnVeiculo.setEnabled(false);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mnVeiculo.add(mntmCadastrar);
		
		JMenuItem mntmEntradaSada = new JMenuItem("Entrada / Sa\u00EDda");
		mnVeiculo.add(mntmEntradaSada);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mnVeiculo.add(mntmConsultar);
		
		JMenuItem mntmAlterar = new JMenuItem("Alterar");
		mnVeiculo.add(mntmAlterar);
		
		JMenuItem mntmHistoricoVeiculo = new JMenuItem("Hist\u00F3rico");
		mnVeiculo.add(mntmHistoricoVeiculo);
		
		JMenuItem mntmBloquear = new JMenuItem("Bloquear");
		mnVeiculo.add(mntmBloquear);
		
		JMenu mnPedestre = new JMenu("Pedestre");
		menuBar.add(mnPedestre);
		mnPedestre.setEnabled(false);
		
		JMenuItem mntmCadastrar_1 = new JMenuItem("Cadastrar");
		mnPedestre.add(mntmCadastrar_1);
		
		JMenuItem mntmEntrada = new JMenuItem("Entrada");
		mnPedestre.add(mntmEntrada);
		
		JMenuItem mntmAlterar_1 = new JMenuItem("Alterar");
		mnPedestre.add(mntmAlterar_1);
		
		JMenuItem mntmConsultar_1 = new JMenuItem("Consultar");
		mnPedestre.add(mntmConsultar_1);
		
		JMenuItem mntmHistoricoPedestre = new JMenuItem("Hist\u00F3rico");
		mnPedestre.add(mntmHistoricoPedestre);
		
		JMenuItem mntmBloquear_1 = new JMenuItem("Bloquear");
		mnPedestre.add(mntmBloquear_1);
		
		JMenu mnApartamento = new JMenu("Apartamento");
		menuBar.add(mnApartamento);
		mnApartamento.setEnabled(false);
		
		JMenuItem mntmCadastrarApartamento = new JMenuItem("Cadastrar");
		mnApartamento.add(mntmCadastrarApartamento);
		
		JMenuItem mntmConsultar_2 = new JMenuItem("Consultar");
		mnApartamento.add(mntmConsultar_2);
		
		JMenuItem mntmAlterarApartamento = new JMenuItem("Alterar");
		mnApartamento.add(mntmAlterarApartamento);
		
		JMenu mnUsuario = new JMenu("Usu\u00E1rio");
		menuBar.add(mnUsuario);
		mnUsuario.setEnabled(false);
		
		JMenuItem mntmCadastrarUsuario = new JMenuItem("Cadastrar");
		mnUsuario.add(mntmCadastrarUsuario);
		
		JMenuItem mntmAlterarUsuario = new JMenuItem("Alterar");
		mnUsuario.add(mntmAlterarUsuario);
		
		JMenuItem mntmBloquearUsuario = new JMenuItem("Bloquear");
		mnUsuario.add(mntmBloquearUsuario);
		
		JMenuItem mntmAlterarSenha = new JMenuItem("Alterar Senha");
		mnUsuario.add(mntmAlterarSenha);
		
		JMenuItem mntmTrocarUsurio = new JMenuItem("Trocar Usu\u00E1rio");
		mnUsuario.add(mntmTrocarUsurio);
		
		JMenu mnSobre = new JMenu("Sobre");
		menuBar.add(mnSobre);
		mnSobre.setEnabled(false);
		
		JMenuItem mntmDesenvolvedores = new JMenuItem("Desenvolvedores");
		mnSobre.add(mntmDesenvolvedores);
		
		JMenuItem mntmVerso = new JMenuItem("Vers\u00E3o");
		mnSobre.add(mntmVerso);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setVisible(true);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(menuBar, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(59)
					.addComponent(internalFrame, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addComponent(internalFrame, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		internalFrame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(79, 135, 46, 14);
		internalFrame.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(79, 160, 46, 14);
		internalFrame.getContentPane().add(lblSenha);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(120, 132, 200, 20);
		internalFrame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(120, 157, 200, 20);
		internalFrame.getContentPane().add(txtSenha);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(198, 188, 122, 23);
		internalFrame.getContentPane().add(btnConfirmar);
		btnConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtLogin.getText().equals("")) {
					JOptionPane.showMessageDialog(getContentPane(),
						    "Digite o login!");
				} else if (String.valueOf(txtSenha.getPassword()).equals("")) {
					JOptionPane.showMessageDialog(getContentPane(),
						    "Digite a senha!");
				} else if(txtLogin.getText().equals("admin") && String.valueOf(txtSenha.getPassword()).equals("123456")) {
					internalFrame.dispose();
					mnVeiculo.setEnabled(true);
					mnPedestre.setEnabled(true);
					mnApartamento.setEnabled(true);
					mnUsuario.setEnabled(true);
					mnSobre.setEnabled(true);
				} else if (txtLogin.getText().equals("usuario") && String.valueOf(txtSenha.getPassword()).equals("123456")) {
					internalFrame.dispose();
					mnVeiculo.setEnabled(true);
					mntmHistoricoVeiculo.setEnabled(false);
					
					mnPedestre.setEnabled(true);
					mntmHistoricoPedestre.setEnabled(false);
					
					mnApartamento.setEnabled(true);
					mntmCadastrarApartamento.setEnabled(false);
					mntmAlterarApartamento.setEnabled(false);
					
					mnUsuario.setEnabled(true);
					mntmCadastrarUsuario.setEnabled(false);
					mntmAlterarUsuario.setEnabled(false);
					mntmBloquearUsuario.setEnabled(false);
					
					mnSobre.setEnabled(true);					
				} else {
					JOptionPane.showMessageDialog(getContentPane(),
						    "Dados inválidos!");
				}
			}
		});
		contentPane.setLayout(gl_contentPane);
	}
}
