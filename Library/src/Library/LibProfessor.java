package Library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import executioner.classProfessorExe;
import values.classProfessor;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LibProfessor extends JFrame {

	private JPanel contentPane;
	private JTable tblProfessortable;
	private JTextField txtFirstNametextField;
	private JTextField txtLastNametextField;
	private JTextField txtMiddleNametextField;
	private JTextField txtWebmailtextField;
	private JTextField txtDateOfBirthtextField;
	private JTextField txtAddresstextField;
	private JTextField txtCitytextField;
	private JTextField txtProvincetextField;
	private JTextField txtCoursetextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibProfessor frame = new LibProfessor();
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
	public LibProfessor() {
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
		
		Choice choice = new Choice();
		choice.setBounds(287, 385, 125, 20);
		panel.add(choice);
		
		choice.addItem("Day");
		choice.addItem("Noon");
		choice.addItem("Night");
		
		String Shift = choice.getItem(choice.getSelectedIndex());
		
		JCheckBox chckbxisWorkingCheckBox = new JCheckBox("Working");
		chckbxisWorkingCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxisWorkingCheckBox.setBounds(58, 383, 135, 21);
		panel.add(chckbxisWorkingCheckBox);
		
		JCheckBox chckbxisActiveCheckBox = new JCheckBox("Active");
		buttonGroup.add(chckbxisActiveCheckBox);
		chckbxisActiveCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxisActiveCheckBox.setBounds(58, 407, 135, 21);
		panel.add(chckbxisActiveCheckBox);
		
		JCheckBox chckbxisResignedCheckBox_1 = new JCheckBox("Resigned");
		buttonGroup.add(chckbxisResignedCheckBox_1);
		chckbxisResignedCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxisResignedCheckBox_1.setBounds(58, 431, 135, 21);
		panel.add(chckbxisResignedCheckBox_1);
		
		JLabel lblFirstNameLabel = new JLabel("First Name");
		lblFirstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFirstNameLabel.setBounds(10, 29, 98, 32);
		panel.add(lblFirstNameLabel);
		
		txtFirstNametextField = new JTextField();
		txtFirstNametextField.setBounds(121, 27, 291, 34);
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
		lblCityLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCityLabel.setBounds(10, 338, 98, 32);
		panel.add(lblCityLabel);
		
		txtCitytextField = new JTextField();
		txtCitytextField.setColumns(10);
		txtCitytextField.setBounds(58, 340, 135, 30);
		panel.add(txtCitytextField);
		
		JLabel lblProvinceLabel = new JLabel("Province");
		lblProvinceLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProvinceLabel.setBounds(213, 338, 98, 32);
		panel.add(lblProvinceLabel);
		
		txtProvincetextField = new JTextField();
		txtProvincetextField.setColumns(10);
		txtProvincetextField.setBounds(287, 340, 125, 30);
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
		separator.setBounds(10, 332, 402, 2);
		panel.add(separator);
		
		JButton btnNewButton = new JButton("Save Entry");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					classProfessor professor = new classProfessor();
					Date date = new SimpleDateFormat("dd/MM/yyyy").parse(txtDateOfBirthtextField.getText());
					java.sql.Date sql = new java.sql.Date(date.getTime());
					int isWorking = chckbxisWorkingCheckBox.isSelected() ? 1 : 0;
					int isActive = chckbxisActiveCheckBox.isSelected() ? 1 : 0;
					int isResigned = chckbxisResignedCheckBox_1.isSelected() ? 1 : 0;
					
					classProfessorExe.setValues(professor,
							txtFirstNametextField.getText(),
							txtLastNametextField.getText(),
							txtMiddleNametextField.getText(),
							txtWebmailtextField.getText(),
							sql,
							txtAddresstextField.getText(),
							txtCitytextField.getText(),
							txtProvincetextField.getText(),
							txtCoursetextField.getText(),
							isWorking,
							Shift,
							isActive,
							isResigned);
					
					JOptionPane.showMessageDialog(null, classProfessorExe.exeInsertStatements(professor));
					
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
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
		
		JLabel lblShift = new JLabel("Shift");
		lblShift.setBounds(213, 380, 98, 32);
		panel.add(lblShift);
		lblShift.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(459, 42, 527, 511);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_1.add(scrollPane);
		
		tblProfessortable = new JTable();
		tblProfessortable.setFillsViewportHeight(true);
		tblProfessortable.setColumnSelectionAllowed(true);
		tblProfessortable.setCellSelectionEnabled(true);
		panel_1.add(tblProfessortable);
		
		// Read Statement
		String[] arrColumnNames = {"id", "FirstName", "LastName", "MiddleName", "Webmail", "DateOfBirth", "StreetAddress", "City", "Province", "Course", "isWorking", "Shift", "isActive", "isResigned"};
		DefaultTableModel objtableModel = new DefaultTableModel(arrColumnNames, 0);
		objtableModel.addRow(arrColumnNames);
		classProfessorExe.exeReadStatements(objtableModel);
		tblProfessortable.setModel(objtableModel);
		
		JLabel lblTitleLabel = new JLabel("Professor Entry");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 178, 30);
		contentPane.add(lblTitleLabel);
		
	}
}