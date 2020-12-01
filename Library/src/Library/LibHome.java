package Library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Library.LibStudent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class LibHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibHome frame = new LibHome();
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
	public LibHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHomeLabel = new JLabel("Home");
		lblHomeLabel.setFont(new Font("SansSerif", Font.PLAIN, 60));
		lblHomeLabel.setBounds(305, 10, 161, 112);
		contentPane.add(lblHomeLabel);
		
//student in
		//panel
		JPanel panelStudentPanel = new JPanel();
		panelStudentPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panelStudentPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibStudent objLib = new LibStudent();
				objLib.setVisible(true);
			}
		});
		panelStudentPanel.setBounds(61, 147, 161, 186);
		contentPane.add(panelStudentPanel);
		panelStudentPanel.setLayout(null);
		
		//img
		JLabel lblStudentImgLabel = new JLabel("");
		Image stdImage = new ImageIcon(this.getClass().getResource("/student100px.png")).getImage();
		lblStudentImgLabel.setIcon(new ImageIcon(stdImage));
		lblStudentImgLabel.setBounds(27, 19, 106, 130);
		panelStudentPanel.add(lblStudentImgLabel);
		
		//label
		JLabel lblStudentLabel = new JLabel(" Student");
		lblStudentLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentLabel.setBounds(37, 153, 84, 23);
		panelStudentPanel.add(lblStudentLabel);
		
		
//professor in
		//panel
		JPanel panelProfessorPanel = new JPanel();
		panelProfessorPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panelProfessorPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibProfessor objLib = new LibProfessor();
				objLib.setVisible(true);
			}
		});
		panelProfessorPanel.setBounds(288, 147, 161, 186);
		contentPane.add(panelProfessorPanel);
		panelProfessorPanel.setLayout(null);
		
		//img
		JLabel lblProfessorImgLabel = new JLabel("");
		Image profImage = new ImageIcon(this.getClass().getResource("/professor100px.png")).getImage();
		lblProfessorImgLabel.setIcon(new ImageIcon(profImage));
		lblProfessorImgLabel.setBounds(31, 22, 106, 130);
		panelProfessorPanel.add(lblProfessorImgLabel);
		
		//label
		JLabel lblProfessorLabel = new JLabel("Professor");
		lblProfessorLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProfessorLabel.setBounds(41, 152, 87, 24);
		panelProfessorPanel.add(lblProfessorLabel);
		
//librarian in
		//panel
		JPanel panelLibrarianPanel = new JPanel();
		panelLibrarianPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panelLibrarianPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibLibrarian objLib = new LibLibrarian();
				objLib.setVisible(true);
			}
		});
		panelLibrarianPanel.setBounds(523, 147, 161, 186);
		contentPane.add(panelLibrarianPanel);
		panelLibrarianPanel.setLayout(null);
		
		//img
		JLabel lblLibrarianImgLabel = new JLabel("");
		Image libImage = new ImageIcon(this.getClass().getResource("/librarian100px.png")).getImage();
		lblLibrarianImgLabel.setIcon(new ImageIcon(libImage));
		lblLibrarianImgLabel.setBounds(29, 21, 109, 131);
		panelLibrarianPanel.add(lblLibrarianImgLabel);
		
		//label
		JLabel lblLibrarianLabel = new JLabel("Librarian");
		lblLibrarianLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLibrarianLabel.setBounds(39, 149, 85, 27);
		panelLibrarianPanel.add(lblLibrarianLabel);
		
// librarian out 
//material in
		//label
		JPanel panelMaterialsPanel = new JPanel();
		panelMaterialsPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panelMaterialsPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibMaterial objLib = new LibMaterial();
				objLib.setVisible(true);
			}
		});
		panelMaterialsPanel.setBounds(61, 343, 161, 182);
		contentPane.add(panelMaterialsPanel);
		panelMaterialsPanel.setLayout(null);
		
		//img
		JLabel lblMaterialsImgLabel = new JLabel("");
		Image matImage = new ImageIcon(this.getClass().getResource("/materials100px.png")).getImage();
		lblMaterialsImgLabel.setIcon(new ImageIcon(matImage));
		lblMaterialsImgLabel.setBounds(26, 20, 112, 109);
		panelMaterialsPanel.add(lblMaterialsImgLabel);
		
		JLabel lblMaterialLabel = new JLabel("Material");
		lblMaterialLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaterialLabel.setBounds(41, 153, 89, 19);
		panelMaterialsPanel.add(lblMaterialLabel);

//materials out
// author in
		//panel
		JPanel panelAuthorPanel = new JPanel();
		panelAuthorPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panelAuthorPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					setVisible(false);
					LibAuthor objLib = new LibAuthor();
					objLib.setVisible(true);
				}
			});
		panelAuthorPanel.setLayout(null);
		panelAuthorPanel.setBounds(288, 343, 161, 182);
		contentPane.add(panelAuthorPanel);
				
		//img
		JLabel lblAuthorLabel = new JLabel("");
		Image autImage = new ImageIcon(this.getClass().getResource("/author100px.png")).getImage();
		lblAuthorLabel.setIcon(new ImageIcon(autImage));
		lblAuthorLabel.setBounds(28, 20, 112, 111);
		panelAuthorPanel.add(lblAuthorLabel);
		
		JLabel lblMaterialLabel_1 = new JLabel("Author");
		lblMaterialLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaterialLabel_1.setBounds(51, 153, 89, 19);
		panelAuthorPanel.add(lblMaterialLabel_1);
				
//author out	
//material review
		//panel
		JPanel panelMaterialReviewPanel = new JPanel();
		panelMaterialReviewPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panelMaterialReviewPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibMaterialReview objLib = new LibMaterialReview();
				objLib.setVisible(true);
			}
		});
		panelMaterialReviewPanel.setLayout(null);
		panelMaterialReviewPanel.setBounds(523, 343, 161, 182);
		contentPane.add(panelMaterialReviewPanel);
				
		//img
		JLabel lblMaterialReviewImgLabel = new JLabel("");
		Image MVImage = new ImageIcon(this.getClass().getResource("/review100px.png")).getImage();
		lblMaterialReviewImgLabel.setIcon(new ImageIcon(MVImage));
		lblMaterialReviewImgLabel.setBounds(26, 28, 106, 108);
		panelMaterialReviewPanel.add(lblMaterialReviewImgLabel);
		
		//label
		JLabel lblMaterialReviewLabel = new JLabel("Material Review");
		lblMaterialReviewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaterialReviewLabel.setBounds(10, 153, 141, 19);
		panelMaterialReviewPanel.add(lblMaterialReviewLabel);
			
//material review out		
//borrowed students in
		//panel
		JPanel panelBSFormPanel = new JPanel();
		panelBSFormPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panelBSFormPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibStudentBookForm objLib = new LibStudentBookForm();
				objLib.setVisible(true);
			}
		});
		panelBSFormPanel.setLayout(null);
		panelBSFormPanel.setBounds(61, 535, 161, 182);
		contentPane.add(panelBSFormPanel);
		
		//img
		JLabel lblBSImgLabel = new JLabel("");
		Image BSImage = new ImageIcon(this.getClass().getResource("/student_edit100px.png")).getImage();
		lblBSImgLabel.setIcon(new ImageIcon(BSImage));
		lblBSImgLabel.setBounds(28, 20, 112, 124);
		panelBSFormPanel.add(lblBSImgLabel);
		
		//label1
		JLabel lblSBLabel = new JLabel(" Student Borrow");
		lblSBLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSBLabel.setBounds(21, 134, 130, 23);
		panelBSFormPanel.add(lblSBLabel);
		
		//label2
		JLabel lblSBFormLabel = new JLabel(" Form");
		lblSBFormLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSBFormLabel.setBounds(57, 154, 51, 23);
		panelBSFormPanel.add(lblSBFormLabel);
		
//borrowed students out
//borrowered professor in
		//panel
		JPanel panelBPFormPanel = new JPanel();
		panelBPFormPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panelBPFormPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibProfessorBookForm objLib = new LibProfessorBookForm();
				objLib.setVisible(true);
			}
		});
		panelBPFormPanel.setLayout(null);
		panelBPFormPanel.setBounds(288, 535, 161, 182);
		contentPane.add(panelBPFormPanel);
	
		//img
		JLabel lblBPImgLabel = new JLabel("");
		Image BPImage = new ImageIcon(this.getClass().getResource("/professor_edit100px.png")).getImage();
		lblBPImgLabel.setIcon(new ImageIcon(BPImage));
		lblBPImgLabel.setBounds(33, 26, 105, 113);
		panelBPFormPanel.add(lblBPImgLabel);
		
		JLabel lblPBLabel = new JLabel(" Professor Borrow");
		lblPBLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPBLabel.setBounds(10, 132, 141, 23);
		panelBPFormPanel.add(lblPBLabel);
		
		JLabel lblSPFormLabel = new JLabel(" Form");
		lblSPFormLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSPFormLabel.setBounds(53, 149, 51, 23);
		panelBPFormPanel.add(lblSPFormLabel);
		
//borrowed profesor out
//subject in
		
		JPanel panelSubjectPanel = new JPanel();
		panelSubjectPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panelSubjectPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibSubject objLib = new LibSubject();
				objLib.setVisible(true);
			}
		});
		panelSubjectPanel.setLayout(null);
		panelSubjectPanel.setBounds(523, 535, 161, 182);
		contentPane.add(panelSubjectPanel);
		
		JLabel lblSubjectImgLabel = new JLabel("");
		Image subImage = new ImageIcon(this.getClass().getResource("/subject100px.png")).getImage();
		lblSubjectImgLabel.setIcon(new ImageIcon(subImage));
		lblSubjectImgLabel.setBounds(29, 20, 122, 127);
		panelSubjectPanel.add(lblSubjectImgLabel);
		
		JLabel lblSubjectLabel = new JLabel("  Subject");
		lblSubjectLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubjectLabel.setBounds(35, 153, 104, 19);
		panelSubjectPanel.add(lblSubjectLabel);
//subject out
	}
}
