
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
import java.awt.Color;
import java.awt.SystemColor;

public class LibMaterial extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtMaterialTitletextField;
	private JTextField txtDescriptiontextField;
	private JTextField txtEditiontextField;
	private JTextField txtYearOfPublicationtextField;
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
		
		JLabel lblMaterialTitleLabel = new JLabel("Title");
		lblMaterialTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMaterialTitleLabel.setBounds(10, 29, 98, 32);
		panel.add(lblMaterialTitleLabel);
		
		txtMaterialTitletextField = new JTextField();
		txtMaterialTitletextField.setBounds(121, 27, 291, 34);
		panel.add(txtMaterialTitletextField);
		txtMaterialTitletextField.setColumns(10);
		
		JLabel lblDescriptionLabel = new JLabel("Description");
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
		
		JLabel lblYearOfPublicationLabel = new JLabel("Date of Publication");
		lblYearOfPublicationLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblYearOfPublicationLabel.setBounds(10, 163, 148, 32);
		panel.add(lblYearOfPublicationLabel);
		
		txtYearOfPublicationtextField = new JTextField();
		txtYearOfPublicationtextField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtYearOfPublicationtextField.setForeground(Color.GRAY);
		txtYearOfPublicationtextField.setHorizontalAlignment(SwingConstants.CENTER);
		txtYearOfPublicationtextField.setText("mm/dd/yyyy");
		txtYearOfPublicationtextField.setToolTipText("");
		txtYearOfPublicationtextField.setColumns(10);
		txtYearOfPublicationtextField.setBounds(168, 163, 243, 34);
		panel.add(txtYearOfPublicationtextField);
		
		JLabel lblTypeOfMaterialLabel = new JLabel("Type of Material");
		lblTypeOfMaterialLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTypeOfMaterialLabel.setBounds(10, 206, 131, 32);
		panel.add(lblTypeOfMaterialLabel);
		
		txtTypeOfMaterialtextField = new JTextField();
		txtTypeOfMaterialtextField.setColumns(10);
		txtTypeOfMaterialtextField.setBounds(145, 208, 267, 34);
		panel.add(txtTypeOfMaterialtextField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 454, 402, 2);
		panel.add(separator);
		
		JButton btnNewButton = new JButton("Save Entry");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(236, 467, 158, 32);
		panel.add(btnNewButton);
		
		JButton btnDiscardChanges = new JButton("Discard Changes");
		btnDiscardChanges.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiscardChanges.setBounds(29, 468, 158, 32);
		panel.add(btnDiscardChanges);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(459, 42, 527, 511);
		contentPane.add(panel_1);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		panel_1.add(table);
		
		JLabel lblTitleLabel = new JLabel("Material Entry");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 178, 30);
		contentPane.add(lblTitleLabel);
	}
}
