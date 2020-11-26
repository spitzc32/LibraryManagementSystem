package Library;


import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;


public class LibSubject extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtTitle1textField;
	private JTextField txtDescriptiontextField;
	private JTextField txtCodetextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibSubject frame = new LibSubject();
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
	public LibSubject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1019, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 42, 439, 262);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitle1Label = new JLabel("Title:");
		lblTitle1Label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTitle1Label.setBounds(10, 29, 98, 32);
		panel.add(lblTitle1Label);
		
		txtTitle1textField = new JTextField();
		txtTitle1textField.setColumns(10);
		txtTitle1textField.setBounds(121, 27, 291, 34);
		panel.add(txtTitle1textField);

		
		JLabel lblDescriptionLabel = new JLabel("Description:");
		lblDescriptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDescriptionLabel.setBounds(10, 71, 98, 32);
		panel.add(lblDescriptionLabel);
		
		txtDescriptiontextField = new JTextField();
		txtDescriptiontextField.setColumns(10);
		txtDescriptiontextField.setBounds(121, 69, 291, 34);
		panel.add(txtDescriptiontextField);
		
		JLabel lblCodeLabel = new JLabel("Code:");
		lblCodeLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCodeLabel.setBounds(10, 113, 98, 32);
		panel.add(lblCodeLabel);
		
		txtCodetextField = new JTextField();
		txtCodetextField.setColumns(10);
		txtCodetextField.setBounds(121, 111, 291, 34);
		panel.add(txtCodetextField);
		
		JButton btnNewButton = new JButton("Save Entry");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(242, 190, 158, 32);
		panel.add(btnNewButton);
		
		JButton btnDiscardChanges = new JButton("Discard Changes");
		btnDiscardChanges.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiscardChanges.setBounds(28, 191, 158, 32);
		panel.add(btnDiscardChanges);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(459, 42, 527, 262);
		contentPane.add(panel_1);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		panel_1.add(table);
		
		JLabel lblTitleLabel = new JLabel("Subject Entry");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 178, 30);
		contentPane.add(lblTitleLabel);
	}

}
