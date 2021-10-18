import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.ImageIcon;
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

public class RemoveEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JLabel name, phone, email,lblNewLabel_3_4,lblNewLabel_3,lblNewLabel_3_2;
	private JButton btnRemove, btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveEmployee frame = new RemoveEmployee();
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
	public RemoveEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 766);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		JButton cancel = new JButton("Back");
		cancel.setBorder(new LineBorder(new Color(255, 51, 0), 1, true));
		cancel.setBackground(new Color(255, 255, 255));
		cancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cancel.setBounds(321, 355, 155, 47);
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
		id.setBounds(321, 207, 198, 41);
		contentPane.add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Employee ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(321, 173, 128, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\T.Y_Btech\\officer (3).png"));
		lblNewLabel_1.setBounds(28, 91, 426, 253);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Remove Employee");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(158, 26, 288, 47);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Name :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(66, 442, 147, 41);
		contentPane.add(lblNewLabel_3);
		
		name = new JLabel("");
		name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		name.setBounds(223, 442, 147, 41);
		contentPane.add(name);
		
		lblNewLabel_3_2 = new JLabel("Phone No. :");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(66, 494, 147, 41);
		contentPane.add(lblNewLabel_3_2);
		
		phone = new JLabel("");
		phone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		phone.setBounds(223, 494, 147, 41);
		contentPane.add(phone);

		
		lblNewLabel_3_4 = new JLabel("Email :");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_4.setBounds(66, 546, 147, 41);
		contentPane.add(lblNewLabel_3_4);
		
		email = new JLabel("");
		email.setFont(new Font("Tahoma", Font.PLAIN, 20));
		email.setBounds(223, 546, 271, 41);
		contentPane.add(email);
		
		btnRemove = new JButton("Remove");
		btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRemove.setBorder(new LineBorder(new Color(255, 51, 0), 1, true));
		btnRemove.setBackground(Color.WHITE);
		btnRemove.setBounds(122, 613, 155, 47);
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement?characterEncoding=latin1&useConfigs=maxPerformance","root","Shar1234");
					PreparedStatement ps = (PreparedStatement) conn.prepareStatement("DELETE FROM employee WHERE emp_id=?");
					ps.setString(1, id.getText());
					int x = ps.executeUpdate();
					if(x>0) {
						JOptionPane.showMessageDialog(btnRemove, "Employee data removed.");
						name.setVisible(false);
						phone.setVisible(false);
						email.setVisible(false);
						lblNewLabel_3.setVisible(false);
						lblNewLabel_3_2.setVisible(false);
						lblNewLabel_3_4.setVisible(false);
						btnRemove.setVisible(false);
						btnCancel.setVisible(false);
						dispose();
						HomePage hp = new HomePage();
						hp.setVisible(true);
						
					}else {
						JOptionPane.showMessageDialog(btnRemove, "Employee ID does not exist.");
					}
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		contentPane.add(btnRemove);
		
		JButton search = new JButton("Search");
		search.setBorder(new LineBorder(new Color(255, 51, 0), 1, true));
		search.setBackground(new Color(255, 255, 255));
		search.setFont(new Font("Tahoma", Font.PLAIN, 20));
		search.setBounds(122, 355, 155, 47);
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement?characterEncoding=latin1&useConfigs=maxPerformance","root","Shar1234");
					PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT name, phone, email FROM employee WHERE emp_id=?; ");
					ps.setString(1, id.getText());
					ResultSet x = (ResultSet) ps.executeQuery();
					int i=0;
					if(x.next()) {
						
						lblNewLabel_3.setVisible(true);
						lblNewLabel_3_2.setVisible(true);
						lblNewLabel_3_4.setVisible(true);
						btnRemove.setVisible(true);
						btnCancel.setVisible(true);
						i=0;
						name.setText(x.getString(1));
						phone.setText(x.getString(2));
						email.setText(x.getString(3));
						
					}else {
						JOptionPane.showMessageDialog(search, "Employee ID does not exist.");
					}
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(search);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBorder(new LineBorder(new Color(255, 51, 0), 1, true));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(321, 613, 155, 47);
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
		
		
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3_2.setVisible(false);
		lblNewLabel_3_4.setVisible(false);
		btnRemove.setVisible(false);
		btnCancel.setVisible(false);
		
		
		
	}

}
