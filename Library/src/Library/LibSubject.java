package Library;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import executioner.classSubjectExe;
import values.classSubject;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;


public class LibSubject extends JFrame {

	private JPanel contentPane;
	private JTable tblSubjecttable;
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
		
//first panel in 
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 42, 439, 262);
		contentPane.add(panel);
		panel.setLayout(null);
		
// subject title 
		
		JLabel lblTitle1Label = new JLabel("Title*:");
		lblTitle1Label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTitle1Label.setBounds(10, 29, 98, 32);
		panel.add(lblTitle1Label);
		
		txtTitle1textField = new JTextField();
		txtTitle1textField.setColumns(10);
		txtTitle1textField.setBounds(121, 27, 291, 34);
		panel.add(txtTitle1textField);

		
		JLabel lblDescriptionLabel = new JLabel("Description*:");
		lblDescriptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDescriptionLabel.setBounds(10, 71, 98, 32);
		panel.add(lblDescriptionLabel);
		
		txtDescriptiontextField = new JTextField();
		txtDescriptiontextField.setColumns(10);
		txtDescriptiontextField.setBounds(121, 69, 291, 34);
		panel.add(txtDescriptiontextField);
		
		JLabel lblCodeLabel = new JLabel("Code*:");
		lblCodeLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCodeLabel.setBounds(10, 113, 98, 32);
		panel.add(lblCodeLabel);
		
		txtCodetextField = new JTextField();
		txtCodetextField.setColumns(10);
		txtCodetextField.setBounds(121, 111, 291, 34);
		panel.add(txtCodetextField);
		
// save entry button
		
		JButton btnSaveButton = new JButton("Save Entry");
		btnSaveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				classSubject subject = new classSubject();
				if (!txtTitle1textField.getText().equals("")) {
					classSubjectExe.setValues(subject,
							txtTitle1textField.getText(),
							txtDescriptiontextField.getText(),
							txtCodetextField.getText());
					
					
					JOptionPane.showMessageDialog(null, classSubjectExe.exeInsertStatements(subject));
					setVisible(false);
					LibHome frame = new LibHome();
					frame.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Please Enter the required Fields");
				}
			}
		});
		btnSaveButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaveButton.setBounds(242, 190, 158, 32);
		panel.add(btnSaveButton);
		
		JButton btnDiscardChanges = new JButton("Discard Changes");
		btnDiscardChanges.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiscardChanges.setBounds(28, 191, 158, 32);
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
		panel_1.setBounds(459, 42, 527, 262);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_1.add(scrollPane);
		
		tblSubjecttable = new JTable();
		tblSubjecttable.setFillsViewportHeight(true);
		tblSubjecttable.setColumnSelectionAllowed(true);
		tblSubjecttable.setCellSelectionEnabled(true);
		panel_1.add(tblSubjecttable);
		
		// Read Statement
		String[] arrColumnNames = {"Title", "Description", "Code"};
		DefaultTableModel objtableModel = new DefaultTableModel(arrColumnNames, 0);
		objtableModel.addRow(arrColumnNames);
		classSubjectExe.exeReadStatements(objtableModel);
		tblSubjecttable.setModel(objtableModel);
		
		JLabel lblTitleLabel = new JLabel("Subject Entry");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 178, 30);
		contentPane.add(lblTitleLabel);
	}

}