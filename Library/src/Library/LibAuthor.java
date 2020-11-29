package Library;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


import executioner.classAuthorExe;
import values.classAuthor;

public class LibAuthor extends JFrame {
	
	private JPanel contentPane;
	private JTable tblAuthortable;
	private JTextField txtFirstNametextField;
	private JTextField txtLastNametextField;
	private JTextField txtMiddleNametextField;
	private JTextField txtAddresstextField;
	private JTextField txtCitytextField;
	private JTextField txtProvincetextField;
	private JTextField txtCountrytextField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibAuthor frame = new LibAuthor();
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
	public LibAuthor() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 42, 439, 403);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstNameLabel = new JLabel("First Name*");
		lblFirstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFirstNameLabel.setBounds(10, 29, 98, 32);
		panel.add(lblFirstNameLabel);
		
		txtFirstNametextField = new JTextField();
		txtFirstNametextField.setBounds(121, 27, 291, 34);
		panel.add(txtFirstNametextField);
		txtFirstNametextField.setColumns(10);
		
		JLabel lblLastNameLabel = new JLabel("Last Name*");
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
		
		JLabel lblAddressLabel = new JLabel("Address*");
		lblAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAddressLabel.setBounds(10, 155, 98, 32);
		panel.add(lblAddressLabel);
		
		txtAddresstextField = new JTextField();
		txtAddresstextField.setColumns(10);
		txtAddresstextField.setBounds(121, 155, 291, 34);
		panel.add(txtAddresstextField);
		
		JLabel lblCityLabel = new JLabel("City*");
		lblCityLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblCityLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCityLabel.setBounds(10, 201, 98, 32);
		panel.add(lblCityLabel);
		
		txtCitytextField = new JTextField();
		txtCitytextField.setColumns(10);
		txtCitytextField.setBounds(121, 199, 291, 34);
		panel.add(txtCitytextField);
		
		JLabel lblProvinceLabel = new JLabel("Province");
		lblProvinceLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProvinceLabel.setBounds(10, 240, 98, 32);
		panel.add(lblProvinceLabel);
		
		txtProvincetextField = new JTextField();
		txtProvincetextField.setColumns(10);
		txtProvincetextField.setBounds(121, 243, 291, 34);
		panel.add(txtProvincetextField);
		
		JLabel lblCountryLabel = new JLabel("Country*");
		lblCountryLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCountryLabel.setBounds(10, 284, 98, 32);
		panel.add(lblCountryLabel);
		
		txtCountrytextField = new JTextField();
		txtCountrytextField.setColumns(10);
		txtCountrytextField.setBounds(121, 287, 291, 34);
		panel.add(txtCountrytextField);
		
		
		JButton btnSaveButton = new JButton("Save Entry");
		btnSaveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				classAuthor author = new classAuthor();
				try {
					if (!txtFirstNametextField.getText().equals("")) {
						classAuthorExe.setValues(author,
								txtFirstNametextField.getText(),
								txtLastNametextField.getText(),
								txtMiddleNametextField.getText(),
								txtAddresstextField.getText(),
								txtCitytextField.getText(),
								txtProvincetextField.getText(),
								txtCountrytextField.getText());
						
						JOptionPane.showMessageDialog(null, classAuthorExe.exeInsertStatements(author));
					} else {
						JOptionPane.showMessageDialog(null, "Input Required Fields");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSaveButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaveButton.setBounds(234, 354, 158, 32);
		panel.add(btnSaveButton);
		
		JButton btnDiscardChanges = new JButton("Discard Changes");
		btnDiscardChanges.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiscardChanges.setBounds(28, 355, 158, 32);
		panel.add(btnDiscardChanges);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(459, 42, 527, 403);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_1.add(scrollPane);
		
		tblAuthortable = new JTable();
		tblAuthortable.setFillsViewportHeight(true);
		tblAuthortable.setColumnSelectionAllowed(true);
		tblAuthortable.setCellSelectionEnabled(true);
		panel_1.add(tblAuthortable);
		
		// Read Statement
		String[] arrColumnNames = {"id", "FirstName", "LastName", "MiddleName", "StreetAddress", "City", "Province", "Country"};
		DefaultTableModel objtableModel = new DefaultTableModel(arrColumnNames, 0);
		objtableModel.addRow(arrColumnNames);
		classAuthorExe.exeReadStatements(objtableModel);
		tblAuthortable.setModel(objtableModel);
		
		JLabel lblTitleLabel = new JLabel("Author Entry");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 178, 30);
		contentPane.add(lblTitleLabel);
	}

}
