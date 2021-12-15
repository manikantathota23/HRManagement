package com.manage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Authentic extends JFrame {

	private JPanel contentPane;
	private JTextField uname;
	private JPasswordField passwd;
	private CheckDB db = new CheckDB();
	private String url = "jdbc:postgresql://localhost/hr";
    private String user = null;
    private String password = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentic frame = new Authentic();
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
	public Authentic() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Subjects\\project\\Application\\H R Management\\src\\icon.png"));
		setTitle("H R Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(64, 224, 208));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Configure database(beta)");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Help");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        String url = "https://github.com/MANIKANTATHOTA23/HRManagement";
			        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
			    } catch (java.io.IOException ee) {
			        System.out.println(ee.getMessage());
			    }
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_2.setSelectedIcon(null);
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Login Pannel", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 69, 0)));
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(592, 306, 350, 200);
		contentPane.add(panel);
		panel.setLayout(null);
		
		uname = new JTextField();
		uname.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		uname.setToolTipText("Username");
		uname.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		uname.setBounds(75, 45, 200, 30);
		panel.add(uname);
		uname.setColumns(10);
		
		passwd = new JPasswordField();
		passwd.setToolTipText("Password");
		passwd.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		passwd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwd.setBounds(75, 103, 200, 30);
		panel.add(passwd);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					user = db.getuname();
					password = db.getpasswd();
					Connection conn = null;
		            try {
		                conn = DriverManager.getConnection(url, user, password);
		                Statement st = conn.createStatement();
		                String b = new String(passwd.getPassword());
		                String a = uname.getText();
		                String s = String.format("Select * from employee where empid='%s' and fname = '%s'",b,a);
		                ResultSet rs = st.executeQuery(s);
		                if (rs.next()) {
		                	Application app = new Application(b);
		                	app.frmHrManagement.setVisible(true);
		                	dispose();
		                }
		                else{
		                	JOptionPane.showMessageDialog(null, "Invalid credentials","Try again!",JOptionPane.OK_OPTION);
		                }
		            }
		            catch (Exception ee) {
		            	JOptionPane.showMessageDialog(null, "Error occored in database","Warning",JOptionPane.WARNING_MESSAGE);
		            }
				}
				catch(Exception ee1) {
					JOptionPane.showMessageDialog(null, "Make sure you configured\r\nFile->Configure Database","Configure Database",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(new Color(253, 245, 230));
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnNewButton.setToolTipText("Log In");
		btnNewButton.setBounds(135, 150, 80, 30);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_1.setBounds(75, 31, 65, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(75, 90, 65, 13);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Subjects\\project\\Application\\H R Management\\src\\login.jpg"));
		lblNewLabel.setBounds(0, 0, 986, 541);
		contentPane.add(lblNewLabel);
	}
}