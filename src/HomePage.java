import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 631);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton add = new JButton("Add Employee");
		add.setBorder(new LineBorder(new Color(0, 51, 255), 1, true));
		add.setForeground(new Color(0, 0, 0));
		add.setBackground(new Color(255, 255, 255));
		add.setFont(new Font("Tahoma", Font.BOLD, 20));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(e.getSource() != null) {
						dispose();
						AddEmployee ae = new AddEmployee();
						ae.setVisible(true);
					}
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		add.setBounds(51, 482, 166, 54);
		contentPane.add(add);
		
		JButton update = new JButton("Update");
		update.setBorder(new LineBorder(new Color(0, 51, 255), 1, true));
		update.setBackground(new Color(255, 255, 255));
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(e.getSource()!=null) {
						dispose();
						FindEmployee se = new FindEmployee();
						se.setVisible(true);
					}
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		update.setFont(new Font("Tahoma", Font.BOLD, 20));
		update.setBounds(252, 482, 166, 54);
		contentPane.add(update);
		
		JButton remove = new JButton("Remove Employee");
		remove.setBorder(new LineBorder(new Color(0, 51, 255), 1, true));
		remove.setBackground(new Color(255, 255, 255));
		remove.setFont(new Font("Tahoma", Font.BOLD, 20));
		remove.setBounds(455, 482, 166, 54);
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(e.getSource()!=null) {
						dispose();
						RemoveEmployee re = new RemoveEmployee();
						re.setVisible(true);
					}
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		contentPane.add(remove);
		
		JButton search = new JButton("Search");
		search.setBorder(new LineBorder(new Color(0, 51, 255), 1, true));
		search.setBackground(new Color(255, 255, 255));
		search.setFont(new Font("Tahoma", Font.BOLD, 20));
		search.setBounds(657, 482, 166, 54);
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					SearchEmployee se = new SearchEmployee();
					se.setVisible(true);
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}

			

		});
		contentPane.add(search);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sharlene Kumbhar\\Downloads\\new.jpg"));
		lblNewLabel.setBounds(0, -11, 876, 649);
		contentPane.add(lblNewLabel);
	}
}
