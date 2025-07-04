
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class VentanaUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textTelefono;
	private JTextField textPlaca;

	

	/**
	 * Create the frame.
	 */
	public VentanaUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 340);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistrarEspacio = new JLabel("Registrar Espacio");
		lblRegistrarEspacio.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrarEspacio.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblRegistrarEspacio.setBounds(126, 0, 219, 45);
		contentPane.add(lblRegistrarEspacio);
		
		JLabel lblDatos = new JLabel("Datos Personales");
		lblDatos.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 12));
		lblDatos.setBounds(41, 53, 105, 13);
		contentPane.add(lblDatos);
		
		JLabel lblNombre = new JLabel("Nombre Completo:");
		lblNombre.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		lblNombre.setBounds(41, 76, 98, 13);
		contentPane.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		lblTelefono.setBounds(41, 99, 98, 13);
		contentPane.add(lblTelefono);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		lblPlaca.setBounds(41, 171, 98, 13);
		contentPane.add(lblPlaca);
		
		JLabel lblDatosVeh = new JLabel("Datos del vehiculo");
		lblDatosVeh.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 12));
		lblDatosVeh.setBounds(41, 148, 105, 13);
		contentPane.add(lblDatosVeh);
		
		JLabel lblTipoVeh = new JLabel("Tipo del Vehiculo:");
		lblTipoVeh.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		lblTipoVeh.setBounds(41, 194, 98, 13);
		contentPane.add(lblTipoVeh);
		
		textNombre = new JTextField();
		textNombre.setBounds(168, 73, 192, 19);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(168, 96, 148, 19);
		contentPane.add(textTelefono);
		
		textPlaca = new JTextField();
		textPlaca.setColumns(10);
		textPlaca.setBounds(168, 168, 105, 19);
		contentPane.add(textPlaca);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Carro", "Camioneta", "Moto"}));
		comboBoxTipo.setBounds(168, 190, 105, 21);
		contentPane.add(comboBoxTipo);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tw Cen MT", Font.BOLD, 12));
		btnRegistrar.setBackground(new Color(0, 255, 0));
		btnRegistrar.setBounds(194, 248, 105, 30);
		contentPane.add(btnRegistrar);
	}
}
