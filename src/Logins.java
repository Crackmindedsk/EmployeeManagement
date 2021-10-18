import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;

public class Logins extends JFrame {

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
					Logins frame = new Logins();
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
	public Logins() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 627);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
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
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBorder(new LineBorder(new Color(0, 51, 255), 1, true));
		btnNewButton.setBackground(new Color(255, 255, 255));
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement?characterEncoding=latin1&useConfigs=maxPerformance","root","Shar1234");
					PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT * FROM user WHERE user_name=? AND password=?");
					ps.setString(1, user.getText());
					ps.setString(2, passwd.getText());
					ResultSet x = (ResultSet) ps.executeQuery();
					if(x.next()) {
						JOptionPane.showMessageDialog(btnNewButton, "You are logined.");
						dispose();
						HomePage hp = new HomePage();
						hp.setVisible(true);
						
					}else {
						JOptionPane.showMessageDialog(btnNewButton, "Incorrect credentials");
					}
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setBounds(41, 509, 156, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sharlene Kumbhar\\Downloads\\user.png"));
		lblNewLabel_1.setBounds(89, 0, 262, 269);
		contentPane.add(lblNewLabel_1);
		
		JButton btnRegistration = new JButton("Registration");
		btnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Registration r = new Registration();
				r.setVisible(true);
			}
		});
		btnRegistration.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegistration.setBorder(new LineBorder(new Color(0, 51, 255), 1, true));
		btnRegistration.setBackground(Color.WHITE);
		btnRegistration.setBounds(225, 509, 156, 50);
		contentPane.add(btnRegistration);
		
		passwd = new JPasswordField();
		passwd.setBorder(null);
		passwd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwd.setBounds(41, 396, 340, 50);
		contentPane.add(passwd);
	}
}
