package Library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import executioner.classStudentBookFormExe;
import executioner.classStudentExe;
import general.classComboItem;
import values.classAssociate_StudentMaterialTracker;
import values.classStudent;

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

public class LibStudentBookForm extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtAssignedDatetextField;
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

		JLabel lblStudentIdLabel = new JLabel("Student*");
		lblStudentIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStudentIdLabel.setBounds(10, 29, 98, 32);
		panel.add(lblStudentIdLabel);

		JLabel lblSubjectIdLabel = new JLabel("Subject*");
		lblSubjectIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSubjectIdLabel.setBounds(10, 72, 98, 32);
		panel.add(lblSubjectIdLabel);

		JLabel lblLibrarianIdLabel = new JLabel("Librarian*");
		lblLibrarianIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLibrarianIdLabel.setBounds(10, 120, 98, 32);
		panel.add(lblLibrarianIdLabel);

		JLabel lblMaterialIdLabel = new JLabel("Materials*");
		lblMaterialIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaterialIdLabel.setBounds(10, 163, 98, 32);
		panel.add(lblMaterialIdLabel);

		JLabel lblAssignedDateReturnLabel = new JLabel("Assigned Date*");
		lblAssignedDateReturnLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAssignedDateReturnLabel.setBounds(10, 397, 98, 32);
		panel.add(lblAssignedDateReturnLabel);

		txtAssignedDatetextField = new JTextField();
		txtAssignedDatetextField.setColumns(10);
		txtAssignedDatetextField.setBounds(121, 397, 291, 34);
		panel.add(txtAssignedDatetextField);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 454, 402, 2);
		panel.add(separator);

		JCheckBox chckbxisDueCheckBox = new JCheckBox("Is this form Due?");
		buttonGroup.add(chckbxisDueCheckBox);
		chckbxisDueCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxisDueCheckBox.setBounds(10, 305, 189, 27);
		panel.add(chckbxisDueCheckBox);

		JCheckBox chckbxisReturnedCheckBox = new JCheckBox("Is the material Returned?");
		buttonGroup.add(chckbxisReturnedCheckBox);
		chckbxisReturnedCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxisReturnedCheckBox.setBounds(10, 344, 207, 27);
		panel.add(chckbxisReturnedCheckBox);

		JComboBox cmbStudentcomboBox = new JComboBox();
		cmbStudentcomboBox.setBounds(121, 28, 291, 30);
		panel.add(cmbStudentcomboBox);
		classStudentBookFormExe.funcRetrieveEntityVal("student", cmbStudentcomboBox);

		JComboBox cmbSubjectcomboBox = new JComboBox();
		cmbSubjectcomboBox.setBounds(121, 71, 291, 30);
		panel.add(cmbSubjectcomboBox);
		classStudentBookFormExe.funcRetrieveObjectVal("subject", cmbSubjectcomboBox);

		JComboBox cmbLibrariancomboBox = new JComboBox();
		cmbLibrariancomboBox.setBounds(121, 118, 291, 30);
		panel.add(cmbLibrariancomboBox);
		classStudentBookFormExe.funcRetrieveEntityVal("librarian", cmbLibrariancomboBox);

		JComboBox cmbMaterialscomboBox = new JComboBox();
		cmbMaterialscomboBox.setBounds(121, 165, 291, 30);
		panel.add(cmbMaterialscomboBox);
		classStudentBookFormExe.funcRetrieveObjectVal("materials", cmbMaterialscomboBox);

		JLabel lblDateBorrowed = new JLabel("Date Borrowed*");
		lblDateBorrowed.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDateBorrowed.setBounds(10, 213, 98, 32);
		panel.add(lblDateBorrowed);

		txtDateBorrowedtextField = new JTextField();
		txtDateBorrowedtextField.setColumns(10);
		txtDateBorrowedtextField.setBounds(121, 212, 291, 34);
		panel.add(txtDateBorrowedtextField);

		JLabel lblDateReturned = new JLabel("Date Returned*");
		lblDateReturned.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateReturned.setBounds(10, 265, 98, 32);
		panel.add(lblDateReturned);

		txtDateReturnedtextField = new JTextField();
		txtDateReturnedtextField.setColumns(10);
		txtDateReturnedtextField.setBounds(121, 262, 291, 34);
		panel.add(txtDateReturnedtextField);
		
		JButton btnNewButton = new JButton("Save Entry");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					classAssociate_StudentMaterialTracker student = new classAssociate_StudentMaterialTracker();
					Object studentId = cmbStudentcomboBox.getSelectedItem();
					Object subjectId = cmbSubjectcomboBox.getSelectedItem();
					Object librarianId = cmbLibrariancomboBox.getSelectedItem();
					Object materialId = cmbMaterialscomboBox.getSelectedItem();
					
					int isDue = chckbxisDueCheckBox.isSelected() ? 1 : 0;
					int isReturned = chckbxisReturnedCheckBox.isSelected() ? 1 : 0;
					
					boolean boolIsFilled = ((classComboItem)studentId).getValue() > 0 && ((classComboItem)subjectId).getValue() > 0 &&
							   ((classComboItem)librarianId).getValue() > 0 && ((classComboItem)materialId).getValue() > 0 &&
							   !txtDateBorrowedtextField.getText().equals("") && !txtDateReturnedtextField.getText().equals("") && 
							   !txtDateReturnedtextField.getText().equals("");
					
					if (boolIsFilled) {
						Date dateBorrowed = new SimpleDateFormat("dd/MM/yyyy").parse(txtDateBorrowedtextField.getText());
						java.sql.Date sqldateBorrowed = new java.sql.Date(dateBorrowed.getTime());
						
						Date dateReturned = new SimpleDateFormat("dd/MM/yyyy").parse(txtDateReturnedtextField.getText());
						java.sql.Date sqldateReturned = new java.sql.Date(dateReturned.getTime());
						
						Date assignedDateReturn = new SimpleDateFormat("dd/MM/yyyy").parse(txtAssignedDatetextField.getText());
						java.sql.Date sqlassignedDateReturn = new java.sql.Date(assignedDateReturn.getTime());
						
						
						classStudentBookFormExe.setValues(student,
								((classComboItem)studentId).getValue(),
								((classComboItem)subjectId).getValue(),
								((classComboItem)librarianId).getValue(),
								((classComboItem)materialId).getValue(),
								sqldateBorrowed,
								sqldateReturned,
								isDue,
								isReturned,
								sqlassignedDateReturn
								);
						
						JOptionPane.showMessageDialog(null, classStudentBookFormExe.exeInsertStatements(student));
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
		btnNewButton.setBounds(236, 467, 158, 32);
		panel.add(btnNewButton);

		JButton btnDiscardChanges = new JButton("Discard Changes");
		btnDiscardChanges.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiscardChanges.setBounds(29, 468, 158, 32);
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


		JPanel panel_1 = new JPanel();
		panel_1.setBounds(459, 42, 515, 511);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		panel_1.add(table);
		
		String[] arrColumnNames = {"id", "Subject", "Librarian", "Student", "Material", "DateBorrowed", "DateReturned", "is Due?", "Returned?", "AssignedDateReturn"};
		DefaultTableModel objtableModel = new DefaultTableModel(arrColumnNames, 0);
		objtableModel.addRow(arrColumnNames);
		classStudentBookFormExe.exeReadStatements(objtableModel);
		table.setModel(objtableModel);

		JLabel lblTitleLabel = new JLabel("Student Book Form");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 178, 30);
		contentPane.add(lblTitleLabel);
	}
}