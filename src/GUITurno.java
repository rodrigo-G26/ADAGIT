import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.TreeSet;
import java.awt.event.ActionEvent;

public class GUITurno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;

	DefaultListModel<Persona> modelo1 = new DefaultListModel<>();
	
	
	private JList<Persona> list1;
	
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					
				
			}
		});
		menuBar.add(btnNewButton);
		
	
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String busqueda =JOptionPane.showInputDialog(null, "Nombre del paciente");
				if (busqueda == null) return;
				int cantidad = 0;
				list1.clearSelection();

		        for (int i = 0; i < modelo1.size(); i++) {
		            if (modelo1.getElementAt(i).getNombre().equalsIgnoreCase(busqueda)) {
		                list1.addSelectionInterval(i,i);
		                cantidad++;	

		            }
		        } 
		        if (cantidad == 0) {
		        	JOptionPane.showMessageDialog(null, "No se encontró");
		        }else {
		        	JOptionPane.showMessageDialog(null, "Coincidencias: " + cantidad);
		        }
		        
		        
			}
		});
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar ");
		menuBar.add(btnNewButton_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 62, 65, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 94, 44, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setBounds(10, 104, 65, 12);
		contentPane.add(lblNewLabel_2);
		
		textNombre = new JTextField();
		textNombre.setBounds(128, 59, 128, 18);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(128, 94, 128, 18);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(128, 149, 128, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha");
		lblNewLabel_3.setBounds(10, 153, 65, 12);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hora");
		lblNewLabel_4.setBounds(10, 193, 65, 12);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(128, 189, 128, 20);
		contentPane.add(comboBox_1);
		
		
		 list1 = new JList<>();
		list1.setBounds(316, 30, 337, 345);
		list1.setModel(modelo1);
		contentPane.add(list1);
		
		
	

	}
}
