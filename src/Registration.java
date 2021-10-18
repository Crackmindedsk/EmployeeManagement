import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import javax.swing.JPasswordField;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField passwd;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user = new JTextField();
		user.setBorder(null);
		user.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user.setBounds(41, 297, 340, 50);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(41, 260, 156, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(41, 359, 156, 26);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Registration");
		btnNewButton.setBorder(new LineBorder(new Color(0, 51, 255), 1, true));
		btnNewButton.setBackground(new Color(255, 255, 255));
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement?characterEncoding=latin1&useConfigs=maxPerformance","root","Shar1234");
					PreparedStatement ps = (PreparedStatement) conn.prepareStatement("INSERT INTO user VALUES(?,?);");
					ps.setString(1, user.getText());
					ps.setString(2, passwd.getText());
					int x = ps.executeUpdate();
					if(x>0) {
						JOptionPane.showMessageDialog(btnNewButton, "User Registered.");
						dispose();
						Logins l = new Logins();
						l.setVisible(true);
						
					}else {
						JOptionPane.showMessageDialog(btnNewButton, "Incorrect credentials");
					}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Please enter Username and password.");
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setBounds(41, 510, 156, 50);
		contentPane.add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Logins l =  new Logins();
				l.setVisible(true);			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBorder(new LineBorder(new Color(0, 51, 255), 1, true));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBounds(225, 510, 156, 50);
		contentPane.add(btnLogin);
		
		passwd = new JPasswordField();
		passwd.setBorder(null);
		passwd.setBounds(41, 396, 340, 50);
		contentPane.add(passwd);
		
	}
}
