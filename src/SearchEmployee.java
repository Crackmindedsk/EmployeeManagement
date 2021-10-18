import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class SearchEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchEmployee frame = new SearchEmployee();
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
	public SearchEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 381);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton search = new JButton("Search");
		search.setBorder(new LineBorder(new Color(255, 51, 0), 1, true));
		search.setBackground(new Color(255, 255, 255));
		search.setFont(new Font("Tahoma", Font.PLAIN, 20));
		search.setBounds(123, 266, 155, 47);
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement?characterEncoding=latin1&useConfigs=maxPerformance","root","Shar1234");
					PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT * FROM employee WHERE emp_id=? OR name=?");
					ps.setString(1, id.getText());
					ps.setString(2, textField.getText());
					ResultSet x = (ResultSet) ps.executeQuery();
					if(x.next()) {
						dispose();
						Details d = new Details(id.getText(),textField.getText());
						d.setVisible(true);
						
					}else {
						JOptionPane.showMessageDialog(search, "ID does not exist.");
					}
				}catch(Exception e1) {
					System.out.println(e1);
				}
//				try {
//					if(e.getSource() != null) {
//						dispose();
//						Details dt = new Details(id.getText(),textField.getText());
//						dt.setVisible(true);
//					}
//				}catch(Exception e1) {
//					System.out.println(e1);
//				}
			}
		});
		contentPane.add(search);
		
		JButton cancel = new JButton("Cancel");
		cancel.setBorder(new LineBorder(new Color(255, 51, 0), 1, true));
		cancel.setBackground(new Color(255, 255, 255));
		cancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cancel.setBounds(321, 266, 155, 47);
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(e.getSource() != null) {
						dispose();
						HomePage hp = new HomePage();
						hp.setVisible(true);
					}
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		contentPane.add(cancel);
		
		id = new JTextField();
		id.setBorder(null);
		id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		id.setBounds(350, 73, 198, 41);
		contentPane.add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Employee ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(350, 39, 128, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\T.Y_Btech\\officer (3).png"));
		lblNewLabel_1.setBounds(55, 11, 256, 259);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmployeeName.setBounds(350, 137, 128, 23);
		contentPane.add(lblEmployeeName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(350, 171, 198, 41);
		contentPane.add(textField);
	}
}
