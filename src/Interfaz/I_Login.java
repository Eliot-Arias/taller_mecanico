package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.M_usuario;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class I_Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					I_Login frame = new I_Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public I_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 514, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INGRESO");
		lblNewLabel.setBounds(170, 0, 210, 61);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 46));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 75, 514, 275);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 75, 168, 28);
		panel_1.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuario.setBounds(10, 39, 168, 28);
		panel_1.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContraseña.setBounds(10, 122, 168, 28);
		panel_1.add(lblContraseña);
		
		JButton btnNewButton = new JButton("Iniciar Seción");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M_usuario usuario = new M_usuario();
				usuario.setNombreUsuario(txtUsuario.getText());
				usuario.setContraseña(txtContraseña.getPassword());
				usuario.ingesar(usuario);
				//System.out.println(txtUsuario.getText());
				//System.out.println(txtContraseña.getPassword());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(10, 198, 168, 28);
		panel_1.add(btnNewButton);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(10, 160, 168, 28);
		panel_1.add(txtContraseña);
	}
}
