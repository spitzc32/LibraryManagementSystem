package Library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JTextPane;

public class LibStudentBookForm extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtIdtextField;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtDateBorrowedtextField;
	private JTextField txtDateReturnedtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibStudentBookForm frame = new LibStudentBookForm();
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
	public LibStudentBookForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 42, 439, 511);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIdLabel = new JLabel("ID");
		lblIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdLabel.setBounds(10, 29, 98, 32);
		panel.add(lblIdLabel);
		
		txtIdtextField = new JTextField();
		txtIdtextField.setBounds(121, 25, 291, 34);
		panel.add(txtIdtextField);
		txtIdtextField.setColumns(10);
		
		JLabel lblStudentIdLabel = new JLabel("Student");
		lblStudentIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStudentIdLabel.setBounds(10, 75, 98, 32);
		panel.add(lblStudentIdLabel);
		
		JLabel lblSubjectIdLabel = new JLabel("Subject");
		lblSubjectIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSubjectIdLabel.setBounds(10, 122, 98, 32);
		panel.add(lblSubjectIdLabel);
		
		JLabel lblLibrarianIdLabel = new JLabel("Librarian");
		lblLibrarianIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLibrarianIdLabel.setBounds(10, 170, 98, 32);
		panel.add(lblLibrarianIdLabel);
		
		JLabel lblMaterialIdLabel = new JLabel("Materials");
		lblMaterialIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaterialIdLabel.setBounds(10, 213, 98, 32);
		panel.add(lblMaterialIdLabel);
		
		JLabel lblAssignedDateReturnLabel = new JLabel("Date to Return");
		lblAssignedDateReturnLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAssignedDateReturnLabel.setBounds(10, 397, 98, 32);
		panel.add(lblAssignedDateReturnLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(121, 397, 291, 34);
		panel.add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 454, 402, 2);
		panel.add(separator);
		
		JCheckBox chckbxisGraduatedCheckBox = new JCheckBox("Due");
		buttonGroup.add(chckbxisGraduatedCheckBox);
		chckbxisGraduatedCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxisGraduatedCheckBox.setBounds(154, 356, 51, 27);
		panel.add(chckbxisGraduatedCheckBox);
		
		JCheckBox chckbxisEnrolledCheckBox = new JCheckBox("Returned");
		buttonGroup.add(chckbxisEnrolledCheckBox);
		chckbxisEnrolledCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxisEnrolledCheckBox.setBounds(258, 356, 85, 27);
		panel.add(chckbxisEnrolledCheckBox);
		
		JButton btnNewButton = new JButton("Save Entry");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(236, 467, 158, 32);
		panel.add(btnNewButton);
		
		JButton btnDiscardChanges = new JButton("Discard Changes");
		btnDiscardChanges.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiscardChanges.setBounds(29, 468, 158, 32);
		panel.add(btnDiscardChanges);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(121, 74, 291, 30);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(121, 121, 291, 30);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(121, 168, 291, 30);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(121, 215, 291, 30);
		panel.add(comboBox_3);
		
		JLabel lblDateBorrowed = new JLabel("Date Borrowed");
		lblDateBorrowed.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDateBorrowed.setBounds(10, 263, 98, 32);
		panel.add(lblDateBorrowed);
		
		txtDateBorrowedtextField = new JTextField();
		txtDateBorrowedtextField.setColumns(10);
		txtDateBorrowedtextField.setBounds(121, 262, 291, 34);
		panel.add(txtDateBorrowedtextField);
		
		JLabel lblDateReturned = new JLabel("Date Returned");
		lblDateReturned.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDateReturned.setBounds(10, 315, 98, 32);
		panel.add(lblDateReturned);
		
		txtDateReturnedtextField = new JTextField();
		txtDateReturnedtextField.setColumns(10);
		txtDateReturnedtextField.setBounds(121, 312, 291, 34);
		panel.add(txtDateReturnedtextField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(459, 42, 527, 511);
		contentPane.add(panel_1);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		panel_1.add(table);
		
		JLabel lblTitleLabel = new JLabel("Student Book Form");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 178, 30);
		contentPane.add(lblTitleLabel);
	}
}
