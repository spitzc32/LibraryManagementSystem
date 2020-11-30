
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
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import executioner.classMaterialsExe;
import values.classMaterials;

public class LibMaterial extends JFrame {

	private JPanel contentPane;
	private JTable tblMaterialtable;
	private JTextField txtMaterialTitletextField;
	private JTextField txtDescriptiontextField;
	private JTextField txtEditiontextField;
	private JTextField txtYearOfPublicationtextField;
	private JTextField txtDatePublishedtextField;
	private JTextField txtTypeOfMaterialtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibMaterial frame = new LibMaterial();
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
	public LibMaterial() {
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
		
		JLabel lblMaterialTitleLabel = new JLabel("Title *");
		lblMaterialTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMaterialTitleLabel.setBounds(10, 29, 98, 32);
		panel.add(lblMaterialTitleLabel);
		
		txtMaterialTitletextField = new JTextField();
		txtMaterialTitletextField.setBounds(121, 27, 291, 34);
		panel.add(txtMaterialTitletextField);
		txtMaterialTitletextField.setColumns(10);
		
		JLabel lblDescriptionLabel = new JLabel("Description *");
		lblDescriptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDescriptionLabel.setBounds(10, 75, 98, 32);
		panel.add(lblDescriptionLabel);
		
		txtDescriptiontextField = new JTextField();
		txtDescriptiontextField.setColumns(10);
		txtDescriptiontextField.setBounds(121, 73, 291, 34);
		panel.add(txtDescriptiontextField);
		
		JLabel lblEditionLabel = new JLabel("Edition");
		lblEditionLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEditionLabel.setBounds(10, 120, 98, 32);
		panel.add(lblEditionLabel);
		
		txtEditiontextField = new JTextField();
		txtEditiontextField.setColumns(10);
		txtEditiontextField.setBounds(121, 118, 291, 34);
		panel.add(txtEditiontextField);
		
		JLabel lblYearOfPublicationLabel = new JLabel("Year of Publication *");
		lblYearOfPublicationLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblYearOfPublicationLabel.setBounds(10, 166, 148, 32);
		panel.add(lblYearOfPublicationLabel);
		
		txtYearOfPublicationtextField = new JTextField();
		txtYearOfPublicationtextField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtYearOfPublicationtextField.setForeground(Color.BLACK);
		txtYearOfPublicationtextField.setHorizontalAlignment(SwingConstants.CENTER);
		txtYearOfPublicationtextField.setToolTipText("");
		txtYearOfPublicationtextField.setColumns(10);
		txtYearOfPublicationtextField.setBounds(168, 166, 243, 34);
		panel.add(txtYearOfPublicationtextField);
		
		JLabel lblDatePublished = new JLabel("Date Published *");
		lblDatePublished.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDatePublished.setBounds(10, 214, 148, 32);
		panel.add(lblDatePublished);
		
		txtDatePublishedtextField = new JTextField();
		txtDatePublishedtextField.setToolTipText("");
		txtDatePublishedtextField.setHorizontalAlignment(SwingConstants.CENTER);
		txtDatePublishedtextField.setForeground(Color.BLACK);
		txtDatePublishedtextField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDatePublishedtextField.setColumns(10);
		txtDatePublishedtextField.setBounds(168, 214, 243, 34);
		panel.add(txtDatePublishedtextField);
		
		JLabel lblTypeOfMaterialLabel = new JLabel("Type of Material *");
		lblTypeOfMaterialLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTypeOfMaterialLabel.setBounds(10, 261, 131, 32);
		panel.add(lblTypeOfMaterialLabel);
		
		JComboBox cmbTypeOfMaterialcomboBox = new JComboBox();
		cmbTypeOfMaterialcomboBox.setBounds(145, 261, 267, 34);
		panel.add(cmbTypeOfMaterialcomboBox);
		
		cmbTypeOfMaterialcomboBox.addItem("");
		cmbTypeOfMaterialcomboBox.addItem("Book");
		cmbTypeOfMaterialcomboBox.addItem("ResearchPaper");
		cmbTypeOfMaterialcomboBox.addItem("Thesis");
		cmbTypeOfMaterialcomboBox.addItem("Newspaper");
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 454, 402, 2);
		panel.add(separator);
		
		JButton btnNewButton = new JButton("Save Entry");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Save statement
				try {
					classMaterials material = new classMaterials();
					if (!txtYearOfPublicationtextField.getText().equals("") && !txtDatePublishedtextField.getText().equals("")) {
						Date YearOfPublication = new SimpleDateFormat("yyyy").parse(txtYearOfPublicationtextField.getText());
						java.sql.Date yop = new java.sql.Date(YearOfPublication.getTime());
						Date DatePublished = new SimpleDateFormat("dd/MM").parse(txtDatePublishedtextField.getText());
						java.sql.Date dp = new java.sql.Date(DatePublished.getTime());
	
						
						classMaterialsExe.setValues(material,
								txtMaterialTitletextField.getText(),
								txtDescriptiontextField.getText(),
								txtEditiontextField.getText(),
								yop,
								dp,
								cmbTypeOfMaterialcomboBox.getSelectedItem().toString()
								);
						
						JOptionPane.showMessageDialog(null, classMaterialsExe.exeInsertStatements(material));
						setVisible(false);
						LibHome frame = new LibHome();
						frame.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Please Fill up all required fields.");
					}
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
		
		tblMaterialtable = new JTable();
		tblMaterialtable.setFillsViewportHeight(true);
		tblMaterialtable.setColumnSelectionAllowed(true);
		tblMaterialtable.setCellSelectionEnabled(true);
		panel_1.add(tblMaterialtable);
		
		// Read Statement
		String[] arrColumnNames = {"id", "Title", "Description", "Edition", "Year of Publication", "Date Published", "Type of Material"};
		DefaultTableModel objtableModel = new DefaultTableModel(arrColumnNames, 0);
		objtableModel.addRow(arrColumnNames);
		classMaterialsExe.exeReadStatements(objtableModel);
		tblMaterialtable.setModel(objtableModel);
		
		JLabel lblTitleLabel = new JLabel("Material Entry");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 178, 30);
		contentPane.add(lblTitleLabel);
	}
}
