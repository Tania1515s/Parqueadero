import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
        lblImagen.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Imagenes/Bannerparqueadero.png")));
        lblImagen.setBounds(-189, 0, 1022, 259);
		contentPane.add(lblImagen);
		
		JButton btnUsuarios = new JButton("INGRESO USUARIOS");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				VentanaUsuario frame = new VentanaUsuario();
				frame.setVisible(true);
			}
		});
		btnUsuarios.setBackground(new Color(255, 255, 0));
		btnUsuarios.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnUsuarios.setBounds(247, 285, 185, 50);
		contentPane.add(btnUsuarios);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBackground(new Color(255, 0, 0));
		btnSalir.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnSalir.setBounds(31, 421, 108, 37);
		contentPane.add(btnSalir);
		
		JButton btnAdmin = new JButton("ADMINISTRADOR");
		btnAdmin.setBackground(new Color(255, 128, 64));
		btnAdmin.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnAdmin.setBounds(247, 361, 185, 50);
		contentPane.add(btnAdmin);
	}
}

