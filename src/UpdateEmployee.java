import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Enumeration;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.mysql.jdbc.PreparedStatement;
import com.toedter.calendar.JDateChooser;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;



public class UpdateEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField empid;
	private JTextField email;
	private JTextField aadhar;
	private JDateChooser dob;
	private JTextField salary;
	private JTextField skill1;
	private JTextField password;
	private JTextField locality;
	private JTextField name;
	private JTextField phone;
	private JTextField job;
	private JDateChooser joining;
	private JTextField age;
	private JTextField past;
	private JTextField skill2;
	private JTextField pin;
	private JTextField city;
	private JComboBox state;
	private JRadioButton male;
	private JRadioButton female;
	private JRadioButton other;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateEmployee frame = new UpdateEmployee("191");
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
	public UpdateEmployee(String id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1059, 780);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee ID :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(74, 86, 137, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(74, 136, 137, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Aadhar No. :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(74, 186, 137, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(74, 236, 137, 39);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date of birth :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(74, 286, 137, 39);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Salary :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(74, 336, 137, 39);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Name :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(559, 86, 137, 39);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Phone No. :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(559, 136, 137, 39);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Designation :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(559, 186, 137, 39);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblJoiningDate = new JLabel("Joining date :");
		lblJoiningDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblJoiningDate.setBounds(559, 236, 137, 39);
		contentPane.add(lblJoiningDate);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAge.setBounds(559, 286, 137, 39);
		contentPane.add(lblAge);
		
		JLabel lblPastExperience = new JLabel("Past Experience :");
		lblPastExperience.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPastExperience.setBounds(559, 336, 154, 39);
		contentPane.add(lblPastExperience);
		
		JLabel lblSkills = new JLabel("Skills :");
		lblSkills.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSkills.setBounds(74, 386, 137, 39);
		contentPane.add(lblSkills);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(74, 436, 137, 39);
		contentPane.add(lblPassword);
		
		JLabel lblPinCode = new JLabel("Pin Code :");
		lblPinCode.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPinCode.setBounds(559, 436, 137, 39);
		contentPane.add(lblPinCode);
		
		JLabel lblLocality = new JLabel("Locality :");
		lblLocality.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLocality.setBounds(74, 486, 137, 39);
		contentPane.add(lblLocality);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCity.setBounds(559, 486, 137, 39);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State :");
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblState.setBounds(74, 536, 137, 39);
		contentPane.add(lblState);
		
		empid = new JTextField();
		empid.setBorder(null);
		empid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		empid.setBounds(210, 86, 255, 39);
		contentPane.add(empid);
		empid.setColumns(10);
		
		email = new JTextField();
		email.setBorder(null);
		email.setFont(new Font("Tahoma", Font.PLAIN, 20));
		email.setColumns(10);
		email.setBounds(210, 136, 255, 39);
		contentPane.add(email);
		
		aadhar = new JTextField();
		aadhar.setBorder(null);
		aadhar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		aadhar.setColumns(10);
		aadhar.setBounds(210, 186, 255, 39);
		contentPane.add(aadhar);
		
		dob = new JDateChooser();
		dob.getCalendarButton().setAlignmentX(Component.CENTER_ALIGNMENT);
		dob.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dob.setBounds(210, 286, 255, 39);
		dob.setDateFormatString("yyyy-MM-dd");
		dob.setFont(new Font("Tahoma",Font.PLAIN,20));
		contentPane.add(dob);
		
		salary = new JTextField();
		salary.setBorder(null);
		salary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		salary.setColumns(10);
		salary.setBounds(210, 336, 255, 39);
		contentPane.add(salary);
		
		skill1 = new JTextField();
		skill1.setBorder(null);
		skill1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		skill1.setColumns(10);
		skill1.setBounds(210, 386, 255, 39);
		contentPane.add(skill1);
		
		password = new JTextField();
		password.setBorder(null);
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password.setColumns(10);
		password.setBounds(210, 436, 255, 39);
		contentPane.add(password);
		
		locality = new JTextField();
		locality.setBorder(null);
		locality.setFont(new Font("Tahoma", Font.PLAIN, 20));
		locality.setColumns(10);
		locality.setBounds(210, 486, 255, 39);
		contentPane.add(locality);
		
		name = new JTextField();
		name.setBorder(null);
		name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		name.setColumns(10);
		name.setBounds(723, 86, 255, 39);
		contentPane.add(name);
		
		phone = new JTextField();
		phone.setBorder(null);
		phone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		phone.setColumns(10);
		phone.setBounds(723, 136, 255, 39);
		contentPane.add(phone);
		
		job = new JTextField();
		job.setBorder(null);
		job.setFont(new Font("Tahoma", Font.PLAIN, 20));
		job.setColumns(10);
		job.setBounds(723, 186, 255, 39);
		contentPane.add(job);
		
		joining = new JDateChooser();
		joining.getCalendarButton().setBounds(203, 0, 52, 39);
		joining.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		joining.setBounds(723, 240, 255, 39);
		joining.setDateFormatString("yyyy-MM-dd");
		joining.setFont(new Font("Tahoma",Font.PLAIN,20));
		contentPane.add(joining);
		
		age = new JTextField();
		age.setBorder(null);
		age.setFont(new Font("Tahoma", Font.PLAIN, 20));
		age.setColumns(10);
		age.setBounds(723, 286, 255, 39);
		contentPane.add(age);
		
		past = new JTextField();
		past.setBorder(null);
		past.setFont(new Font("Tahoma", Font.PLAIN, 20));
		past.setColumns(10);
		past.setBounds(723, 336, 255, 39);
		contentPane.add(past);
		
		skill2 = new JTextField();
		skill2.setBorder(null);
		skill2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		skill2.setColumns(10);
		skill2.setBounds(723, 386, 255, 39);
		contentPane.add(skill2);
		
		pin = new JTextField();
		pin.setBorder(null);
		pin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pin.setColumns(10);
		pin.setBounds(723, 436, 255, 39);
		contentPane.add(pin);
		
		city = new JTextField();
		city.setBorder(null);
		city.setFont(new Font("Tahoma", Font.PLAIN, 20));
		city.setColumns(10);
		city.setBounds(723, 486, 255, 39);
		contentPane.add(city);
		
		JLabel lblNewLabel_9 = new JLabel("Update Employee in the System");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_9.setBounds(210, 11, 646, 54);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(new LineBorder(new Color(255, 51, 0), 1, true));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement?characterEncoding=latin1&useConfigs=maxPerformance","root","Shar1234");
					PreparedStatement ps = (PreparedStatement) conn.prepareStatement("update employee set emp_id=?,name=?,email=?,phone=?,aadhar=?,job=?,gender=?,joining=?,dob=?,age=?,salary=?,past=?,skill1=?,skill2=?, passwd=?, pin=?,area=?,city=?,state=? where emp_id='"+id+"';");
					Enumeration<AbstractButton> bg = buttonGroup.getElements();
					ps.setString(1, empid.getText());
					ps.setString(2, name.getText());
					ps.setString(3, email.getText());
					ps.setString(4, phone.getText());
					ps.setString(5,aadhar.getText());
					ps.setString(6, job.getText());
					while(bg.hasMoreElements()) {
						JRadioButton jrd = (JRadioButton) bg.nextElement();
						if(jrd.isSelected()) {
							ps.setString(7, jrd.getText());
						}
					}
//					ps.setString(7, gender.getText());
					DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					ps.setString(8, df.format(joining.getDate()));
					ps.setString(9, df.format(dob.getDate()));
					ps.setString(10, age.getText());
					ps.setString(11, salary.getText());
					ps.setString(12, past.getText());
					ps.setString(13,skill1.getText());
					ps.setString(14, skill2.getText());
					ps.setString(15, password.getText());
					ps.setString(16, pin.getText());
					ps.setString(17, locality.getText());
					ps.setString(18, city.getText());
					ps.setString(19, String.valueOf(state.getSelectedItem()));
					int x = ps.executeUpdate();
					if(x>0) {
						JOptionPane.showMessageDialog(btnNewButton, "Updated successfully");
						dispose();
						HomePage hp = new HomePage();
						hp.setVisible(true);
						
					}else {
						JOptionPane.showMessageDialog(btnNewButton, "Please fill the form properly");
					}
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setBounds(318, 615, 154, 39);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(255, 255, 255));
		btnCancel.setBorder(new LineBorder(new Color(255, 51, 0), 1, true));
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancel.setBounds(645, 615, 154, 39);
		btnCancel.addActionListener(new ActionListener() {
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
		contentPane.add(btnCancel);
		male = new JRadioButton("Male");
		male.setSelected(true);
		buttonGroup.add(male);
		male.setBackground(new Color(255, 255, 204));
		male.setFont(new Font("Tahoma", Font.PLAIN, 20));
		male.setBounds(210, 237, 72, 39);
		contentPane.add(male);
		
		female = new JRadioButton("Female");
		buttonGroup.add(female);
		female.setBackground(new Color(255, 255, 204));
		female.setFont(new Font("Tahoma", Font.PLAIN, 20));
		female.setBounds(288, 236, 95, 39);
		contentPane.add(female);
		
		other = new JRadioButton("Other");
		buttonGroup.add(other);
		other.setFont(new Font("Tahoma", Font.PLAIN, 20));
		other.setBackground(new Color(255, 255, 204));
		other.setBounds(385, 236, 89, 39);
		contentPane.add(other);
		
		state = new JComboBox();
		state.setFont(new Font("Tahoma", Font.PLAIN, 20));
		state.setModel(new DefaultComboBoxModel(new String[] {"Andhra Pradesh", "Andaman and Nicobar Island", "Arunachal Pradesh", "Assam", "Bihar", "Chandigarh", "Chattisgarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Lakshadweep", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Pondicherry", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telegana", "Tripura", "Uttar Pradesh", "Uttarkhand", "West Bengal"}));
		state.setBounds(210, 540, 255, 39);
		contentPane.add(state);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Sharlene Kumbhar\\Downloads\\team (3).png"));
		lblNewLabel_10.setBounds(328, 251, 579, 476);
		contentPane.add(lblNewLabel_10);
		showData(id);
		
	}

	private void showData(String id) {
		// TODO Auto-generated method stub
		 try{
	        	Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement?characterEncoding=latin1&useConfigs=maxPerformance","root","Shar1234");
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT * FROM employee where emp_id='"+id+"';");
	            ResultSet rs = ps.executeQuery();
	            Enumeration<AbstractButton> bg = buttonGroup.getElements();
	            int i=0;
	            if(rs.next()){
	            	
	            	i=1;
	            	DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
	                empid.setText(rs.getString(1));
	                name.setText(rs.getString(2));
	                email.setText(rs.getString(3));
	                phone.setText(rs.getString(4));
	                aadhar.setText(rs.getString(5));
	                job.setText(rs.getString(6));
	                if("Male".equals(rs.getString(7))) {
	                	male.setSelected(true);
	                }else if("Female".equals(rs.getString(7))) {
	                	female.setSelected(true);
	                }else if("Other".equals(rs.getString(7))) {
	                	other.setSelected(true);
	                }else {
	                	male.setSelected(false);
	                	female.setSelected(false);
	                	other.setSelected(false);
	                }

	               
	                ((JTextField)joining.getDateEditor().getUiComponent()).setText(rs.getString(8));
	           
	                ((JTextField)dob.getDateEditor().getUiComponent()).setText(rs.getString(9));
	                dob.setToolTipText(rs.getString(9));
	                age.setText(rs.getString(10));
	                salary.setText(rs.getString(11));
	                past.setText(rs.getString(12));
	                skill1.setText(rs.getString(13));
	                skill2.setText(rs.getString(14));
	                password.setText(rs.getString(15));
	                pin.setText(rs.getString(16));
	                locality.setText(rs.getString(17));
	                city.setText(rs.getString(18));
	                state.setSelectedItem(rs.getString(19));
//	                state.setToolTipText(rs.getString(19));
	            }
	            if(i==0) {
	                JOptionPane.showMessageDialog(this,"Id not found");
	                dispose();
	                FindEmployee fe = new FindEmployee();
	                fe.setVisible(true);
	            }
	        }catch(Exception ex){
	        	System.out.println(ex);
	        }
		
	}
}
