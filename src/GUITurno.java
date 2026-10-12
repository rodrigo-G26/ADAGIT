import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
		
		SpinnerDateModel fechas = new SpinnerDateModel(new Date(),null,null, Calendar.DAY_OF_MONTH); //Spinner fecha
		SpinnerDateModel horas = new SpinnerDateModel(new Date(), null, null, Calendar.MINUTE); //Spinner hora
		
		
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
		
		JLabel lblNewLabel_3 = new JLabel("Fecha");
		lblNewLabel_3.setBounds(10, 153, 44, 12);
		contentPane.add(lblNewLabel_3);
		
		JSpinner spinner = new JSpinner(fechas); //Spinner fecha
		spinner.setBounds(64, 153, 120, 20);
		contentPane.add(spinner);
		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "dd/MM/yyyy");
		spinner.setEditor(editor);
		
		JLabel lblNewLabel_4 = new JLabel("Hora");
		lblNewLabel_4.setBounds(10, 193, 44, 12);
		contentPane.add(lblNewLabel_4);
		
		JSpinner spinnerH = new JSpinner(horas); //Spinner hora
		spinnerH.setBounds(64, 189, 120, 20);
		contentPane.add(spinnerH);
		JSpinner.DateEditor editorH = new JSpinner.DateEditor(spinnerH, "HH:mm");
		spinnerH.setEditor(editorH);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String nombre = textField_Nombre.getText();
				String apellido = textField_Apellido.getText();
				
				Date FS = (Date)spinner.getValue(); //Spinner fecha
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				String fecha = formato.format(FS); //guardamos la fecha
				
				Date HS = (Date) spinnerH.getValue();//Spinner hora
				SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
				String hora = formatoHora.format(HS);// guardamos la hora
				
				Persona p = new Persona(nombre, apellido, fecha, hora);
				agenda.addElement(p);
				
				textField_Nombre.setText("");
				textField_Apellido.setText("");
		
				
			}
		});
		menuBar.add(btnNewButton);
		
		
		list.setModel(agenda);

	}
}
