import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Details extends JFrame {

	private JPanel contentPane;
	JLabel id;
	String id1, name1, email1,phone1,aadhar1,job1,gender1,join,dob1,age1,salary1,past1,skill11,skill12, passwd1, pin1, area1,city1,state1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Details frame = new Details("1","sha");
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
	public Details(String emp_id, String name) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement?characterEncoding=latin1&useConfigs=maxPerformance","root","Shar1234");
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT * FROM employee WHERE emp_id='"+emp_id+"'OR name ='"+name+"';");
			ResultSet r = ps.executeQuery();
		
			if(r.next()) {
			
                id1 = r.getString(1);
				name1 = r.getString(2);
				email1=r.getString(3);
				phone1=r.getString(4);
				aadhar1=r.getString(5);
				job1=r.getString(6);
				gender1=r.getString(7);
				join=r.getString(8);
				dob1=r.getString(9);
				age1=r.getString(10);
				salary1=r.getString(11);
				past1=r.getString(12);
				skill11=r.getString(13);
				skill12=r.getString(14);
				passwd1=r.getString(15);
				pin1=r.getString(16);
				area1=r.getString(17);
				city1=r.getString(18);
				state1=r.getString(19);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 705);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Details :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(31, 26, 282, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(76, 87, 161, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel id = new JLabel(id1);
		id.setFont(new Font("Tahoma", Font.PLAIN, 19));
		id.setBounds(224, 87, 190, 35);
		contentPane.add(id);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(76, 133, 161, 35);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_2.setBounds(76, 179, 161, 35);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone No. :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_3.setBounds(76, 271, 161, 35);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Designation :");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_4.setBounds(76, 317, 161, 35);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Salary :");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_5.setBounds(76, 363, 161, 35);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Password :");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_6.setBounds(76, 409, 161, 35);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Skills :");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_7.setBounds(76, 455, 161, 35);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel emp_name = new JLabel(name1);
		emp_name.setFont(new Font("Tahoma", Font.PLAIN, 19));
		emp_name.setBounds(224, 133, 190, 35);
		contentPane.add(emp_name);
		
		JLabel emp_email = new JLabel(email1);
		emp_email.setFont(new Font("Tahoma", Font.PLAIN, 19));
		emp_email.setBounds(224, 179, 190, 35);
		contentPane.add(emp_email);
		
		JLabel aadhra = new JLabel(aadhar1);
		aadhra.setFont(new Font("Tahoma", Font.PLAIN, 19));
		aadhra.setBounds(224, 225, 190, 35);
		contentPane.add(aadhra);
		
		JLabel phone = new JLabel(phone1);
		phone.setFont(new Font("Tahoma", Font.PLAIN, 19));
		phone.setBounds(224, 271, 190, 35);
		contentPane.add(phone);
		
		JLabel job = new JLabel(job1);
		job.setFont(new Font("Tahoma", Font.PLAIN, 19));
		job.setBounds(224, 317, 190, 35);
		contentPane.add(job);
		
		JLabel salary = new JLabel(salary1);
		salary.setFont(new Font("Tahoma", Font.PLAIN, 19));
		salary.setBounds(224, 363, 190, 35);
		contentPane.add(salary);
		
		JLabel passwd = new JLabel(passwd1);
		passwd.setFont(new Font("Tahoma", Font.PLAIN, 19));
		passwd.setBounds(224, 409, 190, 35);
		contentPane.add(passwd);
		
		JLabel lblNewLabel_1_7_1_1 = new JLabel("Joining Date :");
		lblNewLabel_1_7_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_7_1_1.setBounds(76, 547, 161, 35);
		contentPane.add(lblNewLabel_1_7_1_1);
		
		JLabel lblNewLabel_1_7_1_2 = new JLabel("Past Experience :");
		lblNewLabel_1_7_1_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_7_1_2.setBounds(76, 593, 161, 35);
		contentPane.add(lblNewLabel_1_7_1_2);
		
		JLabel lblNewLabel_1_7_1_4 = new JLabel("Gender :");
		lblNewLabel_1_7_1_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_7_1_4.setBounds(439, 87, 161, 35);
		contentPane.add(lblNewLabel_1_7_1_4);
		
		JLabel emp_gender = new JLabel(gender1);
		emp_gender.setFont(new Font("Tahoma", Font.PLAIN, 19));
		emp_gender.setBounds(563, 87, 201, 35);
		contentPane.add(emp_gender);
		
		JLabel lblNewLabel_1_7_1_4_2 = new JLabel("Date of birth :");
		lblNewLabel_1_7_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_7_1_4_2.setBounds(439, 133, 161, 35);
		contentPane.add(lblNewLabel_1_7_1_4_2);
		
		JLabel lblNewLabel_1_7_1_4_3 = new JLabel("Age :");
		lblNewLabel_1_7_1_4_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_7_1_4_3.setBounds(439, 179, 161, 35);
		contentPane.add(lblNewLabel_1_7_1_4_3);
		
		JLabel lblNewLabel_1_7_1_4_4 = new JLabel("Address :-");
		lblNewLabel_1_7_1_4_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_7_1_4_4.setBounds(439, 225, 161, 35);
		contentPane.add(lblNewLabel_1_7_1_4_4);
		
		JLabel lblNewLabel_1_7_1_4_5 = new JLabel("Locality :");
		lblNewLabel_1_7_1_4_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_7_1_4_5.setBounds(439, 271, 161, 35);
		contentPane.add(lblNewLabel_1_7_1_4_5);
		
		JLabel lblNewLabel_1_7_1_4_6 = new JLabel("City :");
		lblNewLabel_1_7_1_4_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_7_1_4_6.setBounds(439, 317, 161, 35);
		contentPane.add(lblNewLabel_1_7_1_4_6);
		
		JLabel lblNewLabel_1_7_1_4_7 = new JLabel("State :");
		lblNewLabel_1_7_1_4_7.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_7_1_4_7.setBounds(439, 363, 161, 35);
		contentPane.add(lblNewLabel_1_7_1_4_7);
		
		JLabel skill1 = new JLabel(skill11);
		skill1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		skill1.setBounds(224, 455, 190, 35);
		contentPane.add(skill1);
		
		JLabel skill2 = new JLabel(skill12);
		skill2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		skill2.setBounds(224, 501, 190, 35);
		contentPane.add(skill2);
		
		JLabel joining = new JLabel(join);
		joining.setFont(new Font("Tahoma", Font.PLAIN, 19));
		joining.setBounds(224, 547, 190, 35);
		contentPane.add(joining);
		
		JLabel emp_dob = new JLabel(dob1);
		emp_dob.setFont(new Font("Tahoma", Font.PLAIN, 19));
		emp_dob.setBounds(563, 133, 201, 35);
		contentPane.add(emp_dob);
		
		JLabel emp_age = new JLabel(age1);
		emp_age.setFont(new Font("Tahoma", Font.PLAIN, 19));
		emp_age.setBounds(563, 179, 201, 35);
		contentPane.add(emp_age);
		
		JLabel emp_local = new JLabel(area1);
		emp_local.setFont(new Font("Tahoma", Font.PLAIN, 19));
		emp_local.setBounds(563, 271, 201, 35);
		contentPane.add(emp_local);
		
		JLabel emp_city = new JLabel(city1);
		emp_city.setFont(new Font("Tahoma", Font.PLAIN, 19));
		emp_city.setBounds(563, 317, 201, 35);
		contentPane.add(emp_city);
		
		JLabel emp_state = new JLabel(state1);
		emp_state.setFont(new Font("Tahoma", Font.PLAIN, 19));
		emp_state.setBounds(563, 363, 201, 35);
		contentPane.add(emp_state);
		
		JLabel lblNewLabel_1_7_1_4_7_1 = new JLabel("Pin Code :");
		lblNewLabel_1_7_1_4_7_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_7_1_4_7_1.setBounds(439, 409, 161, 35);
		contentPane.add(lblNewLabel_1_7_1_4_7_1);
		
		JLabel emp_pin = new JLabel(pin1);
		emp_pin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		emp_pin.setBounds(563, 409, 201, 35);
		contentPane.add(emp_pin);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Aadhar No. :");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_2_1.setBounds(76, 225, 161, 35);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel past = new JLabel(past1);
		past.setFont(new Font("Tahoma", Font.PLAIN, 19));
		past.setBounds(224, 593, 184, 35);
		contentPane.add(past);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(402, 570, 128, 58);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Sharlene Kumbhar\\Downloads\\employee (1).png"));
		lblNewLabel_2.setBounds(519, 338, 245, 359);
		contentPane.add(lblNewLabel_2);
		
		
	}
}
