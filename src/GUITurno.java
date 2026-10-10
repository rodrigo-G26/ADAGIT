import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.TreeSet;
import java.awt.event.ActionEvent;

public class GUITurno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Nombre;
	private JTextField textField_Apellido;
	DefaultListModel<Persona> agenda = new DefaultListModel<>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITurno frame = new GUITurno();
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
	public GUITurno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 461);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("Agendar");
		
		
		JButton btnNewButton_1 = new JButton("Buscar");
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar ");
		menuBar.add(btnNewButton_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(361, 30, 292, 345);
		contentPane.add(list);
		
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 62, 44, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 94, 44, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setBounds(10, 104, 44, 12);
		contentPane.add(lblNewLabel_2);
		
		textField_Nombre = new JTextField();
		textField_Nombre.setBounds(64, 59, 128, 18);
		contentPane.add(textField_Nombre);
		textField_Nombre.setColumns(10);
		
		textField_Apellido = new JTextField();
		textField_Apellido.setBounds(64, 101, 128, 18);
		contentPane.add(textField_Apellido);
		textField_Apellido.setColumns(10);
		
		JComboBox comboBox_Fecha = new JComboBox();
		comboBox_Fecha.setBounds(64, 149, 128, 20);
		contentPane.add(comboBox_Fecha);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha");
		lblNewLabel_3.setBounds(10, 153, 44, 12);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hora");
		lblNewLabel_4.setBounds(10, 193, 44, 12);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_Hora = new JComboBox();
		comboBox_Hora.setBounds(64, 189, 128, 20);
		contentPane.add(comboBox_Hora);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String nombre = textField_Nombre.getText();
				String apellido = textField_Apellido.getText();
				
				Persona p = new Persona(nombre, apellido);
				agenda.addElement(p);
				
				textField_Nombre.setText("");
				textField_Apellido.setText("");
		
				
			}
		});
		menuBar.add(btnNewButton);
		
		
		list.setModel(agenda); //yo agregue

	}
}
