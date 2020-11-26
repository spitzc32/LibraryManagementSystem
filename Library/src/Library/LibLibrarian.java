package Library;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class LibLibrarian extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtFirstNametextField;
	private JTextField txtLastNametextField;
	private JTextField txtMiddleNametextField;
	private JTextField txtWebmailtextField;
	private JTextField txtDateOfBirthtextField;
	private JTextField txtAddresstextField;
	private JTextField txtCitytextField;
	private JTextField txtProvincetextField;
	private JTextField txtShifttextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibLibrarian frame = new LibLibrarian();
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
	public LibLibrarian() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1011, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//first pannel
		
		JPanel panel = new JPanel();
		panel.setBounds(11, 42, 439, 535);
		contentPane.add(panel);
		panel.setLayout(null);
		
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
		lblAddressLabel.setBounds(10, 243, 98, 32);
		panel.add(lblAddressLabel);
		
		txtAddresstextField = new JTextField();
		txtAddresstextField.setColumns(10);
		txtAddresstextField.setBounds(121, 243, 291, 34);
		panel.add(txtAddresstextField);
		
		JLabel lblCityLabel = new JLabel("City");
		lblCityLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblCityLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCityLabel.setBounds(30, 285, 98, 32);
		panel.add(lblCityLabel);
		
		txtCitytextField = new JTextField();
		txtCitytextField.setColumns(10);
		txtCitytextField.setBounds(30, 327, 170, 34);
		panel.add(txtCitytextField);
		
		JLabel lblProvinceLabel = new JLabel("Province");
		lblProvinceLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProvinceLabel.setBounds(244, 285, 98, 32);
		panel.add(lblProvinceLabel);
		
		txtProvincetextField = new JTextField();
		txtProvincetextField.setColumns(10);
		txtProvincetextField.setBounds(244, 327, 170, 34);
		panel.add(txtProvincetextField);
		
//separator
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 371, 419, 2);
		panel.add(separator);
		
		
		JLabel lblShiftLabel = new JLabel("Shift:");
		lblShiftLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblShiftLabel.setBounds(46, 389, 98, 32);
		panel.add(lblShiftLabel);
		
		Choice choice = new Choice();
		choice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		choice.setBounds(110, 389, 191, 43);
		panel.add(choice);
		
        choice.addItem("Day");
        choice.addItem("Noon");
        choice.addItem("Night");

		JCheckBox chckbxisActiveCheckBox = new JCheckBox("Are you a still Active?");
		chckbxisActiveCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxisActiveCheckBox.setBounds(115, 434, 171, 21);
		panel.add(chckbxisActiveCheckBox);

	
		
		JRadioButton rdbtnWorkingButton = new JRadioButton("currently working?");
		buttonGroup.add(rdbtnWorkingButton);
		rdbtnWorkingButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnWorkingButton.setBounds(242, 457, 170, 21);
		panel.add(rdbtnWorkingButton);
		
		JRadioButton rdbtnResignedButton = new JRadioButton("currently resigned?");
		buttonGroup.add(rdbtnResignedButton	);
		rdbtnResignedButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnResignedButton.setBounds(10, 457, 157, 21);
		panel.add(rdbtnResignedButton);
		
	
	
		JButton btnNewButton = new JButton("Save Entry");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(242, 493, 158, 32);
		panel.add(btnNewButton);
		
		JButton btnDiscardChanges = new JButton("Discard Changes");
		btnDiscardChanges.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiscardChanges.setBounds(30, 493, 158, 32);
		panel.add(btnDiscardChanges);

// 2nd pannel
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(460, 42, 527, 535);
		contentPane.add(panel_1);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		panel_1.add(table);

// title 
		
		JLabel lblTitleLabel = new JLabel("Librarian Entry");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 178, 30);
		contentPane.add(lblTitleLabel);
	}
}
