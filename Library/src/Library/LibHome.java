package Library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Library.LibStudent;

public class LibHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibHome frame = new LibHome();
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
	public LibHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHomeLabel = new JLabel("Home");
		lblHomeLabel.setFont(new Font("SansSerif", Font.PLAIN, 60));
		lblHomeLabel.setBounds(406, 10, 161, 112);
		contentPane.add(lblHomeLabel);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LibStudent objLib = new LibStudent();
				objLib.setVisible(true);
			}
		});
		panel.setBounds(61, 147, 161, 160);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentLabel = new JLabel("Student");
		lblStudentLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentLabel.setBounds(40, 116, 76, 34);
		panel.add(lblStudentLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(288, 147, 161, 160);
		contentPane.add(panel_1);
		
		JLabel lblProfessor = new JLabel("Professor");
		lblProfessor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProfessor.setBounds(35, 116, 88, 34);
		panel_1.add(lblProfessor);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(523, 147, 161, 160);
		contentPane.add(panel_1_1);
		
		JLabel lblStudentLabel_1_1 = new JLabel("Librarian");
		lblStudentLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentLabel_1_1.setBounds(32, 116, 85, 34);
		panel_1_1.add(lblStudentLabel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(753, 147, 161, 160);
		contentPane.add(panel_1_2);
		
		JLabel lblStudentLabel_1_2 = new JLabel("Author");
		lblStudentLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentLabel_1_2.setBounds(46, 116, 70, 34);
		panel_1_2.add(lblStudentLabel_1_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(61, 343, 161, 160);
		contentPane.add(panel_2);
		
		JLabel lblMaterials = new JLabel("Materials");
		lblMaterials.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaterials.setBounds(35, 116, 85, 34);
		panel_2.add(lblMaterials);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(288, 343, 161, 160);
		contentPane.add(panel_1_3);
		
		JLabel lblStudentLabel_1_3 = new JLabel("Borrowed Students");
		lblStudentLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStudentLabel_1_3.setBounds(10, 116, 141, 34);
		panel_1_3.add(lblStudentLabel_1_3);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(523, 343, 161, 160);
		contentPane.add(panel_1_1_1);
		
		JLabel lblStudentLabel_1_1_1 = new JLabel("Borrowed Professors");
		lblStudentLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStudentLabel_1_1_1.setBounds(10, 116, 141, 34);
		panel_1_1_1.add(lblStudentLabel_1_1_1);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBounds(753, 343, 161, 160);
		contentPane.add(panel_1_2_1);
		
		JLabel lblStudentLabel_1_2_1 = new JLabel("Material Review");
		lblStudentLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentLabel_1_2_1.setBounds(10, 116, 141, 34);
		panel_1_2_1.add(lblStudentLabel_1_2_1);
	}
}
