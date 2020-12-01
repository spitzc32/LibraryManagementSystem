package Library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import executioner.classProfessorBookFormExe;
import executioner.classStudentExe;
import general.classComboItem;
import values.classAssociate_ProfessorMaterialTracker;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LibProfessorBookForm extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtDateBorrowedtextField;
	private JTextField txtDateReturnedtextField;
	private JTextField txtAssignedDatetextField;

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

// Professor id in

		JLabel lblProfessorIdLabel = new JLabel("Professor*");
		lblProfessorIdLabel.setBounds(10, 10, 98, 32);
		lblProfessorIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblProfessorIdLabel);

		JComboBox comboBoxProfessorId = new JComboBox();
		comboBoxProfessorId.setBounds(144, 12, 253, 32);
		panel.add(comboBoxProfessorId);
		classProfessorBookFormExe.funcRetrieveEntityVal("professor", comboBoxProfessorId);

// Professor id out
// Subject id in		

		JLabel lblSubjectIdLabel = new JLabel("Subject*");
		lblSubjectIdLabel.setBounds(10, 56, 98, 32);
		lblSubjectIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblSubjectIdLabel);

		JComboBox comboBoxSubjectId = new JComboBox();
		comboBoxSubjectId.setBounds(144, 58, 253, 32);
		panel.add(comboBoxSubjectId);
		classProfessorBookFormExe.funcRetrieveObjectVal("subject", comboBoxSubjectId);

// Subject id out	
// Librarian id in		

		JLabel lblLibrarianIdLabel = new JLabel("Librarian*");
		lblLibrarianIdLabel.setBounds(10, 98, 98, 32);
		lblLibrarianIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblLibrarianIdLabel);
		
		JComboBox comboBoxLibrarianId = new JComboBox();
		comboBoxLibrarianId.setBounds(144, 100, 253, 32);
		panel.add(comboBoxLibrarianId);
		classProfessorBookFormExe.funcRetrieveEntityVal("librarian", comboBoxLibrarianId);


// Librarian id out
// Material id in		

		JLabel lblMaterialIdLabel = new JLabel("Materials*");
		lblMaterialIdLabel.setBounds(10, 140, 98, 32);
		lblMaterialIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblMaterialIdLabel);

		JComboBox comboBoxMaterialId = new JComboBox();
		comboBoxMaterialId.setBounds(144, 142, 253, 32);
		panel.add(comboBoxMaterialId);
		classProfessorBookFormExe.funcRetrieveObjectVal("materials", comboBoxMaterialId);


// Material id out
// dateBorrowed id in		

		JLabel lblDateBorrowed = new JLabel("Date Borrowed*");
		lblDateBorrowed.setBounds(10, 182, 121, 32);
		lblDateBorrowed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblDateBorrowed);

		txtDateBorrowedtextField = new JTextField();
		txtDateBorrowedtextField.setBounds(144, 184, 253, 32);
		txtDateBorrowedtextField.setColumns(10);
		panel.add(txtDateBorrowedtextField);

// dateBorrowed id out
// dateReturn id in		

		JLabel lblAssignedDateReturnLabel = new JLabel("Date Return*");
		lblAssignedDateReturnLabel.setBounds(10, 224, 121, 32);
		lblAssignedDateReturnLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblAssignedDateReturnLabel);

		txtDateReturnedtextField = new JTextField();
		txtDateReturnedtextField.setBounds(144, 226, 253, 32);
		txtDateReturnedtextField.setColumns(10);
		panel.add(txtDateReturnedtextField);

// dateReturn id out
// Checkbox isDue and isReturned in

		JCheckBox chckbxisDueCheckBox = new JCheckBox("Is this form Due?");
		chckbxisDueCheckBox.setBounds(10, 263, 203, 32);
		buttonGroup.add(chckbxisDueCheckBox);
		chckbxisDueCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(chckbxisDueCheckBox);

		JCheckBox chckbxisReturnedCheckBox = new JCheckBox("Is the Material Returned?");
		chckbxisReturnedCheckBox.setBounds(10, 307, 203, 32);
		buttonGroup.add(chckbxisReturnedCheckBox);
		chckbxisReturnedCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(chckbxisReturnedCheckBox);

// Checkbox isDue and isReturned out
// DateReturned in

		JLabel lblDateReturned = new JLabel("Assigned Date*");
		lblDateReturned.setBounds(10, 356, 121, 32);
		lblDateReturned.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblDateReturned);

		txtAssignedDatetextField = new JTextField();
		txtAssignedDatetextField.setBounds(144, 356, 253, 32);
		txtAssignedDatetextField.setColumns(10);
		panel.add(txtAssignedDatetextField);

// DateReturned Out

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 398, 403, 10);
		panel.add(separator);

// Checkbox Save Entry and Discard Changes in

		JButton btnNewButton = new JButton("Save Entry");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					classAssociate_ProfessorMaterialTracker professor = new classAssociate_ProfessorMaterialTracker();
					Object professorId = comboBoxProfessorId.getSelectedItem();
					Object subjectId = comboBoxSubjectId.getSelectedItem();
					Object librarianId = comboBoxLibrarianId.getSelectedItem();
					Object materialId = comboBoxMaterialId.getSelectedItem();
					
					int isDue = chckbxisDueCheckBox.isSelected() ? 1 : 0;
					int isReturned = chckbxisReturnedCheckBox.isSelected() ? 1 : 0;
					
					boolean boolIsFilled = ((classComboItem)professorId).getValue() > 0 && ((classComboItem)subjectId).getValue() > 0 &&
							   ((classComboItem)librarianId).getValue() > 0 && ((classComboItem)materialId).getValue() > 0 &&
							   !txtDateBorrowedtextField.getText().equals("") && !txtDateReturnedtextField.getText().equals("") && 
							   !txtDateReturnedtextField.getText().equals("");
					
					if (boolIsFilled) {
						Date dateBorrowed = new SimpleDateFormat("dd/MM/yyyy").parse(txtDateBorrowedtextField.getText());
						java.sql.Date sqldateBorrowed = new java.sql.Date(dateBorrowed.getTime());
						
						Date dateReturned = new SimpleDateFormat("dd/MM/yyyy").parse(txtDateReturnedtextField.getText());
						java.sql.Date sqldateReturned = new java.sql.Date(dateReturned.getTime());
						
						Date assignedDateReturn = new SimpleDateFormat("dd/MM/yyyy").parse(txtDateReturnedtextField.getText());
						java.sql.Date sqlassignedDateReturn = new java.sql.Date(assignedDateReturn.getTime());
						
						
						classProfessorBookFormExe.setValues(professor,
								((classComboItem)professorId).getValue(),
								((classComboItem)subjectId).getValue(),
								((classComboItem)librarianId).getValue(),
								((classComboItem)materialId).getValue(),
								sqldateBorrowed,
								sqldateReturned,
								isDue,
								isReturned,
								sqlassignedDateReturn
								);
						
						JOptionPane.showMessageDialog(null, classProfessorBookFormExe.exeInsertStatements(professor));
						setVisible(false);
						LibHome frame = new LibHome();
						frame.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Please enter Required Fields");
					}
				}  catch (ParseException e2) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Please Format Date this way. (dd/mm/yyyy)");
					e2.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(225, 418, 158, 32);
		panel.add(btnNewButton);

		JButton btnDiscardChanges = new JButton("Discard Changes");
		btnDiscardChanges.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiscardChanges.setBounds(35, 418, 158, 32);
		panel.add(btnDiscardChanges);
		
		btnDiscardChanges.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Sucessfully Discarded Changes.");
				LibHome objLib = new LibHome();
				objLib.setVisible(true);
			}
		});

// title Professor Book Form

		JLabel lblTitleLabel = new JLabel("Professor Book Form");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 364, 30);
		contentPane.add(lblTitleLabel, BorderLayout.NORTH);

// Checkbox Save Entry and Discard Changes out

// Second Panel

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(459, 42, 455, 467);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		panel_1.add(table);
		
		String[] arrColumnNames = {"id", "Subject", "Librarian", "Professor", "Material", "DateBorrowed", "DateReturned", "is Due?", "Returned?", "AssignedDateReturn"};
		DefaultTableModel objtableModel = new DefaultTableModel(arrColumnNames, 0);
		objtableModel.addRow(arrColumnNames);
		classProfessorBookFormExe.exeReadStatements(objtableModel);
		table.setModel(objtableModel);

	}

}
