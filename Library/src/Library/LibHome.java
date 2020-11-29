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
		setBounds(100, 100, 750, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHomeLabel = new JLabel("Home");
		lblHomeLabel.setFont(new Font("SansSerif", Font.PLAIN, 60));
		lblHomeLabel.setBounds(305, 10, 161, 112);
		contentPane.add(lblHomeLabel);
		
		JPanel panelStudentPanel = new JPanel();
		panelStudentPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibStudent objLib = new LibStudent();
				objLib.setVisible(true);
			}
		});
		panelStudentPanel.setBounds(61, 147, 161, 160);
		contentPane.add(panelStudentPanel);
		panelStudentPanel.setLayout(null);
		
		JLabel lblStudentLabel = new JLabel("Student");
		lblStudentLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentLabel.setBounds(40, 116, 76, 34);
		panelStudentPanel.add(lblStudentLabel);
		
		JPanel panelProfessorPanel = new JPanel();
		panelProfessorPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibProfessor objLib = new LibProfessor();
				objLib.setVisible(true);
			}
		});
		panelProfessorPanel.setLayout(null);
		panelProfessorPanel.setBounds(288, 147, 161, 160);
		contentPane.add(panelProfessorPanel);
		
		JLabel lblProfessor = new JLabel("Professor");
		lblProfessor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProfessor.setBounds(35, 116, 88, 34);
		panelProfessorPanel.add(lblProfessor);
		
		JPanel panelLibrarianPanel = new JPanel();
		panelLibrarianPanel.setLayout(null);
		panelLibrarianPanel.setBounds(523, 147, 161, 160);
		contentPane.add(panelLibrarianPanel);
		
		JLabel lblStudentLabel_1_1 = new JLabel("Librarian");
		lblStudentLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibLibrarian objLib = new LibLibrarian();
				objLib.setVisible(true);
			}
		});
		lblStudentLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentLabel_1_1.setBounds(32, 116, 85, 34);
		panelLibrarianPanel.add(lblStudentLabel_1_1);
		
		JPanel panelAuthorPanel = new JPanel();
		panelAuthorPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibAuthor objLib = new LibAuthor();
				objLib.setVisible(true);
			}
		});
		panelAuthorPanel.setLayout(null);
		panelAuthorPanel.setBounds(288, 343, 161, 160);
		contentPane.add(panelAuthorPanel);
		
		JLabel lblStudentLabel_1_2 = new JLabel("Author");
		lblStudentLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentLabel_1_2.setBounds(46, 116, 70, 34);
		panelAuthorPanel.add(lblStudentLabel_1_2);
		
		JPanel panelMaterialsPanel = new JPanel();
		panelMaterialsPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibMaterial objLib = new LibMaterial();
				objLib.setVisible(true);
			}
		});
		panelMaterialsPanel.setLayout(null);
		panelMaterialsPanel.setBounds(61, 343, 161, 160);
		contentPane.add(panelMaterialsPanel);
		
		JLabel lblMaterials = new JLabel("Materials");
		lblMaterials.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaterials.setBounds(35, 116, 85, 34);
		panelMaterialsPanel.add(lblMaterials);
		
		JPanel panelBSFormPanel = new JPanel();
		panelBSFormPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibStudentBookForm objLib = new LibStudentBookForm();
				objLib.setVisible(true);
			}
		});
		panelBSFormPanel.setLayout(null);
		panelBSFormPanel.setBounds(61, 535, 161, 160);
		contentPane.add(panelBSFormPanel);
		
		JLabel lblStudentLabel_1_3 = new JLabel("Borrowed Students");
		lblStudentLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStudentLabel_1_3.setBounds(10, 103, 141, 30);
		panelBSFormPanel.add(lblStudentLabel_1_3);
		
		JLabel lblBStudentExtensionLabel = new JLabel("Form");
		lblBStudentExtensionLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBStudentExtensionLabel.setBounds(55, 131, 39, 19);
		panelBSFormPanel.add(lblBStudentExtensionLabel);
		
		JPanel panelBPFormPanel = new JPanel();
		panelBPFormPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibProfessorBookForm objLib = new LibProfessorBookForm();
				objLib.setVisible(true);
			}
		});
		panelBPFormPanel.setLayout(null);
		panelBPFormPanel.setBounds(288, 535, 161, 160);
		contentPane.add(panelBPFormPanel);
		
		JLabel lblStudentLabel_1_1_1 = new JLabel("Borrowed Professors");
		lblStudentLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStudentLabel_1_1_1.setBounds(10, 101, 141, 34);
		panelBPFormPanel.add(lblStudentLabel_1_1_1);
		
		JLabel lblBStudentExtensionLabel_1 = new JLabel("Form");
		lblBStudentExtensionLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBStudentExtensionLabel_1.setBounds(57, 131, 39, 19);
		panelBPFormPanel.add(lblBStudentExtensionLabel_1);
		
		JPanel panelMaterialReviewPanel = new JPanel();
		panelMaterialReviewPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibMaterialReview objLib = new LibMaterialReview();
				objLib.setVisible(true);
			}
		});
		panelMaterialReviewPanel.setLayout(null);
		panelMaterialReviewPanel.setBounds(523, 343, 161, 160);
		contentPane.add(panelMaterialReviewPanel);
		
		JLabel lblStudentLabel_1_2_1 = new JLabel("Material Review");
		lblStudentLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentLabel_1_2_1.setBounds(10, 116, 141, 34);
		panelMaterialReviewPanel.add(lblStudentLabel_1_2_1);
		
		JPanel panelSubjectPanel = new JPanel();
		panelSubjectPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibSubject objLib = new LibSubject();
				objLib.setVisible(true);
			}
		});
		panelSubjectPanel.setLayout(null);
		panelSubjectPanel.setBounds(523, 535, 161, 160);
		contentPane.add(panelSubjectPanel);
		
		JLabel lblStudentLabel_1_2_1_1 = new JLabel("Subject");
		lblStudentLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentLabel_1_2_1_1.setBounds(40, 116, 74, 34);
		panelSubjectPanel.add(lblStudentLabel_1_2_1_1);
	}
}
