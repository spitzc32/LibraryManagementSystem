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
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibProfessorBookForm extends JFrame {

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
					LibProfessorBookForm frame = new LibProfessorBookForm();
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
	public LibProfessorBookForm() {

// main frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

// First Panel

		JPanel panel = new JPanel();
		panel.setBounds(10, 42, 439, 467);
		contentPane.add(panel);
		panel.setLayout(null);

// Id in 

		JLabel lblIdLabel = new JLabel("ID");
		lblIdLabel.setBounds(10, 31, 98, 32);
		lblIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblIdLabel);

		txtIdtextField = new JTextField();
		txtIdtextField.setBounds(144, 31, 253, 32);
		panel.add(txtIdtextField);
		txtIdtextField.setColumns(10);

// Id out
// Professor id in

		JLabel lblProfessorIdLabel = new JLabel("Professor");
		lblProfessorIdLabel.setBounds(10, 71, 98, 32);
		lblProfessorIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblProfessorIdLabel);

		JComboBox comboBoxProfessorId = new JComboBox();
		comboBoxProfessorId.setBounds(144, 73, 253, 32);
		panel.add(comboBoxProfessorId);

// Professor id out
// Subject id in		

		JLabel lblSubjectIdLabel = new JLabel("Subject");
		lblSubjectIdLabel.setBounds(10, 111, 98, 32);
		lblSubjectIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblSubjectIdLabel);

		JComboBox comboBoxSubjectId = new JComboBox();
		comboBoxSubjectId.setBounds(144, 114, 253, 32);
		panel.add(comboBoxSubjectId);

// Subject id out	
// Librarian id in		

		JLabel lblLibrarianIdLabel = new JLabel("Librarian");
		lblLibrarianIdLabel.setBounds(10, 151, 98, 32);
		lblLibrarianIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblLibrarianIdLabel);

		JComboBox comboBoxLibrarianId = new JComboBox();
		comboBoxLibrarianId.setBounds(144, 154, 253, 32);
		panel.add(comboBoxLibrarianId);

// Librarian id out
// Material id in		

		JLabel lblMaterialIdLabel = new JLabel("Materials");
		lblMaterialIdLabel.setBounds(10, 193, 98, 32);
		lblMaterialIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblMaterialIdLabel);

		JComboBox comboBoxMaterialId = new JComboBox();
		comboBoxMaterialId.setBounds(144, 196, 253, 32);
		panel.add(comboBoxMaterialId);

// Material id out
// dateBorrowed id in		

		JLabel lblDateBorrowed = new JLabel("Date Borrowed");
		lblDateBorrowed.setBounds(10, 238, 121, 32);
		lblDateBorrowed.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblDateBorrowed);

		txtDateBorrowedtextField = new JTextField();
		txtDateBorrowedtextField.setBounds(144, 238, 253, 32);
		txtDateBorrowedtextField.setColumns(10);
		panel.add(txtDateBorrowedtextField);

// dateBorrowed id out
// dateReturn id in		

		JLabel lblAssignedDateReturnLabel = new JLabel("Date to Return");
		lblAssignedDateReturnLabel.setBounds(10, 280, 121, 32);
		lblAssignedDateReturnLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblAssignedDateReturnLabel);

		textField = new JTextField();
		textField.setBounds(144, 280, 253, 32);
		textField.setColumns(10);
		panel.add(textField);

// dateReturn id out
// Checkbox isDue and isReturned in

		JCheckBox chckbxisGraduatedCheckBox = new JCheckBox("Due");
		chckbxisGraduatedCheckBox.setBounds(56, 318, 121, 32);
		buttonGroup.add(chckbxisGraduatedCheckBox);
		chckbxisGraduatedCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(chckbxisGraduatedCheckBox);

		JCheckBox chckbxisEnrolledCheckBox = new JCheckBox("Returned");
		chckbxisEnrolledCheckBox.setBounds(200, 318, 121, 32);
		buttonGroup.add(chckbxisEnrolledCheckBox);
		chckbxisEnrolledCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(chckbxisEnrolledCheckBox);

// Checkbox isDue and isReturned out
// DateReturned in

		JLabel lblDateReturned = new JLabel("Date Returned");
		lblDateReturned.setBounds(10, 356, 121, 32);
		lblDateReturned.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblDateReturned);

		txtDateReturnedtextField = new JTextField();
		txtDateReturnedtextField.setBounds(144, 356, 253, 32);
		txtDateReturnedtextField.setColumns(10);
		panel.add(txtDateReturnedtextField);

// DateReturned Out

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 398, 403, 10);
		panel.add(separator);

// Checkbox Save Entry and Discard Changes in

		JButton btnNewButton = new JButton("Save Entry");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(225, 418, 158, 32);
		panel.add(btnNewButton);

		JButton btnDiscardChanges = new JButton("Discard Changes");
		btnDiscardChanges.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiscardChanges.setBounds(35, 418, 158, 32);
		panel.add(btnDiscardChanges);


// title Professor Book Form

		JLabel lblTitleLabel = new JLabel("Professor Book Form");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 364, 30);
		contentPane.add(lblTitleLabel, BorderLayout.NORTH);

// Checkbox Save Entry and Discard Changes out

// Second Panel

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(475, 42, 439, 467);
		contentPane.add(panel_1);

		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		panel_1.add(table);
	}

}