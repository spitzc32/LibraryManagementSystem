package Library;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date; 

//import exe
import executioner.classStudentExe;

//import value handler
import values.classStudent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class LibStudent extends JFrame {

	private JPanel contentPane;
	private JTable tblStudenttable;
	private JTextField txtFirstNametextField;
	private JTextField txtLastNametextField;
	private JTextField txtMiddleNametextField;
	private JTextField txtWebmailtextField;
	private JTextField txtDateOfBirthtextField;
	private JTextField txtAddresstextField;
	private JTextField txtCitytextField;
	private JTextField txtProvincetextField;
	private JTextField txtCoursetextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibStudent frame = new LibStudent();
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
	public LibStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 42, 439, 511);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstNameLabel = new JLabel("First Name");
		lblFirstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFirstNameLabel.setBounds(10, 29, 98, 32);
		panel.add(lblFirstNameLabel);
		
		txtFirstNametextField = new JTextField();
		txtFirstNametextField.setBounds(118, 29, 291, 30);
		panel.add(txtFirstNametextField);
		txtFirstNametextField.setColumns(10);
		
		JLabel lblLastNameLabel = new JLabel("Last Name");
		lblLastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLastNameLabel.setBounds(10, 71, 98, 32);
		panel.add(lblLastNameLabel);
		
		txtLastNametextField = new JTextField();
		txtLastNametextField.setColumns(10);
		txtLastNametextField.setBounds(121, 69, 291, 34);
		panel.add(txtLastNametextField);
		
		JLabel lblMiddleNameLabel = new JLabel("Middle Name");
		lblMiddleNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMiddleNameLabel.setBounds(10, 113, 98, 32);
		panel.add(lblMiddleNameLabel);
		
		txtMiddleNametextField = new JTextField();
		txtMiddleNametextField.setColumns(10);
		txtMiddleNametextField.setBounds(121, 111, 291, 34);
		panel.add(txtMiddleNametextField);
		
		JLabel lblWebmailLabel = new JLabel("Webmail");
		lblWebmailLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblWebmailLabel.setBounds(10, 157, 98, 32);
		panel.add(lblWebmailLabel);
		
		txtWebmailtextField = new JTextField();
		txtWebmailtextField.setColumns(10);
		txtWebmailtextField.setBounds(121, 155, 291, 34);
		panel.add(txtWebmailtextField);
		
		JLabel lblDateOfBirthLabel = new JLabel("Date Of Birth");
		lblDateOfBirthLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDateOfBirthLabel.setBounds(10, 201, 98, 32);
		panel.add(lblDateOfBirthLabel);
		
		txtDateOfBirthtextField = new JTextField();
		txtDateOfBirthtextField.setColumns(10);
		txtDateOfBirthtextField.setBounds(121, 199, 291, 34);
		panel.add(txtDateOfBirthtextField);
		
		JLabel lblAddressLabel = new JLabel("Address");
		lblAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAddressLabel.setBounds(10, 289, 98, 32);
		panel.add(lblAddressLabel);
		
		txtAddresstextField = new JTextField();
		txtAddresstextField.setColumns(10);
		txtAddresstextField.setBounds(121, 287, 291, 34);
		panel.add(txtAddresstextField);
		
		JLabel lblCityLabel = new JLabel("City");
		lblCityLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblCityLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCityLabel.setBounds(10, 354, 98, 32);
		panel.add(lblCityLabel);
		
		txtCitytextField = new JTextField();
		txtCitytextField.setColumns(10);
		txtCitytextField.setBounds(86, 352, 146, 34);
		panel.add(txtCitytextField);
		
		JLabel lblProvinceLabel = new JLabel("Province");
		lblProvinceLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProvinceLabel.setBounds(10, 398, 98, 32);
		panel.add(lblProvinceLabel);
		
		txtProvincetextField = new JTextField();
		txtProvincetextField.setColumns(10);
		txtProvincetextField.setBounds(86, 396, 146, 34);
		panel.add(txtProvincetextField);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCourse.setBounds(10, 245, 98, 32);
		panel.add(lblCourse);
		
		txtCoursetextField = new JTextField();
		txtCoursetextField.setColumns(10);
		txtCoursetextField.setBounds(121, 243, 291, 34);
		panel.add(txtCoursetextField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 340, 402, 2);
		panel.add(separator);
		
		JCheckBox chckbxisGraduatedCheckBox = new JCheckBox("Are you a graduate?");
		chckbxisGraduatedCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxisGraduatedCheckBox.setBounds(249, 361, 171, 21);
		panel.add(chckbxisGraduatedCheckBox);
		
		JCheckBox chckbxisEnrolledCheckBox = new JCheckBox("currently enrolled?");
		chckbxisEnrolledCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxisEnrolledCheckBox.setBounds(249, 398, 184, 21);
		panel.add(chckbxisEnrolledCheckBox);
		
		JButton btnSaveButton = new JButton("Save Entry");
		btnSaveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Save statement
				try {
					classStudent student = new classStudent();
					Date date = new SimpleDateFormat("dd/MM/yyyy").parse(txtDateOfBirthtextField.getText());
					java.sql.Date sql = new java.sql.Date(date.getTime());
					int isGraduated = chckbxisGraduatedCheckBox.isSelected() ? 1 : 0;
					int isEnrolled = chckbxisEnrolledCheckBox.isSelected() ? 1 : 0;
					
					classStudentExe.setValues(student,
							txtFirstNametextField.getText(),
							txtLastNametextField.getText(),
							txtMiddleNametextField.getText(),
							txtWebmailtextField.getText(),
							sql,
							txtAddresstextField.getText(),
							txtCitytextField.getText(),
							txtProvincetextField.getText(),
							txtCoursetextField.getText(),
							isGraduated,
							isEnrolled);
					
					JOptionPane.showMessageDialog(null, classStudentExe.exeInsertStatements(student));
					
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSaveButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaveButton.setBounds(236, 467, 158, 32);
		panel.add(btnSaveButton);
		 
		JButton btnDiscardChangesButton = new JButton("Discard Changes");
		btnDiscardChangesButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiscardChangesButton.setBounds(29, 468, 158, 32);
		panel.add(btnDiscardChangesButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(459, 42, 617, 511);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_1.add(scrollPane);
		
		tblStudenttable = new JTable();
		tblStudenttable.setFillsViewportHeight(true);
		tblStudenttable.setColumnSelectionAllowed(true);
		tblStudenttable.setCellSelectionEnabled(true);
		panel_1.add(tblStudenttable);
		
		// Read Statement
		String[] arrColumnNames = {"id", "FirstName", "LastName", "MiddleName", "Webmail", "DateOfBirth", "StreetAddress", "City", "Province", "Course", "isGraduated", "isEnrolled"};
		DefaultTableModel objtableModel = new DefaultTableModel(arrColumnNames, 0);
		objtableModel.addRow(arrColumnNames);
		classStudentExe.exeReadStatements(objtableModel);
		tblStudenttable.setModel(objtableModel);
		
		JLabel lblTitleLabel = new JLabel("Student Entry");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 178, 30);
		contentPane.add(lblTitleLabel);
	}
}
