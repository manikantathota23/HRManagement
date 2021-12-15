package com.manage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.*;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Application {

    JFrame frmHrManagement;
    private JTextField txtWillBeGiven;
    private JTextField efname;
    private JTextField elname;
    private JTextField empph;
    private JTextField empcity;
    private JTextField empmail;
    private JTextField emppost;
    private JTextField empsalary;
    private final ButtonGroup empgender = new ButtonGroup();
    private JTextField uartid;
    private JTextField uartfname;
    private JTextField uartlname;
    private JTextField uartphno;
    private JTextField uarttrain;
    private JTextField uartmail;
    private JTextField uartzip;
    private JLabel lblNewLabel_1;
    private JLayeredPane layeredPane;
    private JPanel Know;
    private JPanel updateEmployee;
    private JPanel addEmployee;
    private JLabel lblNewLabel_1_5_4;
    private JLabel lblNewLabel_1_5_5;
    private JLabel lblNewLabel_1_5_6;
    private JLabel lblNewLabel_1_5_7;
    private JLabel lblNewLabel_1_5_21;
    private JLabel lblNewLabel_1_5_22;
    private JLabel lblNewLabel_1_5_23;
    private JLabel lblNewLabel_1_5_24;
    private JLabel lblNewLabel_1_1;
    private JLabel lblNewLabel_1_2;
    private JLabel lblNewLabel_1_3;
    private JLabel lblNewLabel_1_4;
    private JTextField sempid;
    private JTable table;
    private JTextField rememp;
    private JTextField q1;
    private JTextField q2;
    private JTextField q3;
    private JTextField q4;
    private JTextField q5;
    private JPanel take_test;
    private JPanel test;
    private JTextField trained;
    private JComboBox edobd;
    private JComboBox edobm;
    private JComboBox edoby;
    private JComboBox ejy;
    private JComboBox ejm;
    private JComboBox ejd;
    private JTextField empqualify;
    private JTextField emptrain;
    private JComboBox empdep;
    private JComboBox empdepid;
    private JTextField uartcity;
    private JTextField uartqua;
    private JRadioButton uartmale;
    private JRadioButton uartfemale;
    private JRadioButton uartother;
    private final ButtonGroup uartgender = new ButtonGroup();
    private JComboBox uartdobd;
    private JComboBox uartdoby;
    private JComboBox uartdobm;
    private JComboBox uartdjd;
    private JComboBox uartdjm;
    private JComboBox uartdjy;
    private JComboBox uartdepid;
    private JComboBox uartdep;
    private JComboBox uartrole;
    private JLabel empcount;
    private JLabel mc;
    private JLabel adc;
    private JLabel ac;
    private JLabel qc;
    private JLabel cc;
    private JLabel pc;
    private JTable remEmp;
    private JLabel score1;
    private JLabel score2;

    String mainid = null;
    private JTextField promobox;
    private JPanel promotion;
    private JTextField promos;
    private JButton rempanel;
    private JButton update;
    private JButton add;
    private JTextField syearemp;
    private JLabel train;
    private JLabel addtrain;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Application window = new Application("E001");
                    window.frmHrManagement.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Application(String a) {
        initialize();
        setProfile(a);
        mainid = a;
        switchPannel(Know);

    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmHrManagement = new JFrame();
        frmHrManagement.setTitle("HR Management");
        frmHrManagement.setResizable(false);
        frmHrManagement.setBounds(100, 100, 1300, 700);
        frmHrManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmHrManagement.getContentPane().setLayout(null);
        frmHrManagement.setIconImage(Toolkit.getDefaultToolkit()
                .getImage("D:\\Subjects\\project\\Application\\H R Management\\src\\icon.png"));

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 128, 128));
        panel.setBounds(0, 0, 234, 642);
        frmHrManagement.getContentPane().add(panel);
        panel.setLayout(null);

        lblNewLabel_1 = new JLabel("Name");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1.setBounds(21, 214, 145, 42);
        panel.add(lblNewLabel_1);

        lblNewLabel_1_1 = new JLabel("E-mail");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1_1.setBounds(21, 272, 145, 42);
        panel.add(lblNewLabel_1_1);

        lblNewLabel_1_2 = new JLabel("Ph.No");
        lblNewLabel_1_2.setForeground(Color.WHITE);
        lblNewLabel_1_2.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1_2.setBounds(21, 324, 145, 42);
        panel.add(lblNewLabel_1_2);

        lblNewLabel_1_3 = new JLabel("Department");
        lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_1_3.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1_3.setBounds(21, 379, 145, 42);
        panel.add(lblNewLabel_1_3);

        lblNewLabel_1_4 = new JLabel("Address");
        lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_1_4.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1_4.setBounds(21, 431, 145, 42);
        panel.add(lblNewLabel_1_4);

        JButton btnNewButton_4 = new JButton("Know More");
        btnNewButton_4.setSelectedIcon(null);
        btnNewButton_4.setIcon(new ImageIcon("D:\\Subjects\\project\\Application\\H R Management\\src\\Logo.png"));
        btnNewButton_4.setForeground(new Color(0, 0, 255));
        btnNewButton_4.setBackground(new Color(0, 128, 128));
        btnNewButton_4.setFont(new Font("Segoe UI", Font.BOLD, 19));
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPannel(Know);
            }
        });
        btnNewButton_4.setBounds(52, 56, 124, 128);
        panel.add(btnNewButton_4);

        JButton promo = new JButton("Promotion");
        promo.setSelectedIcon(null);
        promo.setIcon(new ImageIcon("D:\\Subjects\\project\\Application\\H R Management\\src\\dd.png"));
        promo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPannel(promotion);
            }
        });
        promo.setBounds(68, 522, 85, 74);
        panel.add(promo);

        layeredPane = new JLayeredPane();
        layeredPane.setBounds(233, 52, 1053, 590);
        frmHrManagement.getContentPane().add(layeredPane);

        JPanel remove = new JPanel();
        remove.setBackground(new Color(102, 205, 170));
        remove.setBounds(0, 0, 1053, 590);
        layeredPane.add(remove);
        remove.setLayout(null);

        JLabel lblNewLabel_3_1 = new JLabel("Enter employee Id");
        lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblNewLabel_3_1.setBounds(171, 47, 192, 39);
        remove.add(lblNewLabel_3_1);

        rememp = new JTextField();
        rememp.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        rememp.setBackground(new Color(224, 255, 255));
        rememp.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                remEmp.setModel(getDetails.removeData("employee", rememp.getText()));
            }
        });
        rememp.setColumns(10);
        rememp.setBounds(365, 47, 192, 40);
        remove.add(rememp);

        JButton btnNewButton_1_1 = new JButton("Get Data");
        btnNewButton_1_1.setBackground(new Color(255, 222, 173));
        btnNewButton_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        btnNewButton_1_1.setBounds(624, 47, 128, 39);
        remove.add(btnNewButton_1_1);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(10, 170, 1033, 410);
        remove.add(scrollPane_1);

        remEmp = new JTable();
        remEmp.setBackground(new Color(224, 255, 255));
        scrollPane_1.setViewportView(remEmp);

        JButton btnNewButton_1_1_1 = new JButton("Remove");
        btnNewButton_1_1_1.setBackground(new Color(255, 222, 173));
        btnNewButton_1_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Add.removeid("employee", rememp.getText());
            }
        });
        btnNewButton_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        btnNewButton_1_1_1.setBounds(798, 47, 128, 39);
        remove.add(btnNewButton_1_1_1);

        JPanel query = new JPanel();
        query.setBounds(0, 0, 1053, 590);
        layeredPane.add(query);
        query.setLayout(null);

        JLabel lblNewLabel_4 = new JLabel("Queries ID");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_4.setBounds(608, 119, 135, 40);
        query.add(lblNewLabel_4);

        JTextArea queans = new JTextArea();
        queans.setEditable(false);
        queans.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
        queans.setBackground(new Color(224, 255, 255));
        queans.setBounds(24, 311, 1002, 250);
        query.add(queans);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(175, 238, 238));
        panel_2.setBorder(
                new TitledBorder(null, "Select Query ID", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
        panel_2.setBounds(24, 23, 527, 278);
        query.add(panel_2);
        panel_2.setLayout(null);

        JLabel lblNewLabel_18 = new JLabel("1.What is company ethics");
        lblNewLabel_18.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 17));
        lblNewLabel_18.setBounds(10, 27, 515, 39);
        panel_2.add(lblNewLabel_18);

        JLabel lblNewLabel_18_1 = new JLabel("2.Where can we apply for promotion?");
        lblNewLabel_18_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 17));
        lblNewLabel_18_1.setBounds(10, 64, 515, 39);
        panel_2.add(lblNewLabel_18_1);

        JLabel lblNewLabel_18_2 = new JLabel("3.Whom can we contact regarding the change/update a detail?");
        lblNewLabel_18_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 17));
        lblNewLabel_18_2.setBounds(10, 104, 515, 39);
        panel_2.add(lblNewLabel_18_2);

        JLabel lblNewLabel_18_3 = new JLabel("4.Cannot find my training details whom I should contact?");
        lblNewLabel_18_3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 17));
        lblNewLabel_18_3.setBounds(10, 141, 515, 39);
        panel_2.add(lblNewLabel_18_3);

        JLabel lblNewLabel_18_4 = new JLabel("5.How many times will we get free time to go canteen");
        lblNewLabel_18_4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 17));
        lblNewLabel_18_4.setBounds(10, 178, 515, 39);
        panel_2.add(lblNewLabel_18_4);

        JLabel lblNewLabel_18_5 = new JLabel("6.What is the Star Rating");
        lblNewLabel_18_5.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 17));
        lblNewLabel_18_5.setBounds(10, 218, 515, 39);
        panel_2.add(lblNewLabel_18_5);

        JComboBox quebox = new JComboBox();
        quebox.setBackground(new Color(255, 222, 173));
        quebox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(quebox.getSelectedItem() + "");
                Connection co = Add.getcon();
                if (!(quebox.getSelectedItem() + "").startsWith("-")) {

                    try {
                        Statement st = co.createStatement();
                        ResultSet r = st.executeQuery(
                                String.format("select * from query where id = '%s'", quebox.getSelectedItem() + ""));
                        r.next();
                        queans.setText(r.getString("ans"));
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        System.out.println(e1.getMessage());
                    }
                }
            }
        });
        quebox.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "1", "2", "3", "4", "5", "6" }));
        quebox.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
        quebox.setBounds(753, 116, 127, 47);
        query.add(quebox);

        JLabel lblNewLabel_20 = new JLabel("New label");
        lblNewLabel_20.setIcon(new ImageIcon("D:\\Subjects\\project\\Application\\H R Management\\src\\side.gif"));
        lblNewLabel_20.setBounds(0, 0, 1053, 590);
        query.add(lblNewLabel_20);

        promotion = new JPanel();
        promotion.setForeground(new Color(0, 0, 0));
        promotion.setBackground(new Color(102, 205, 170));
        promotion.setBounds(0, 0, 1053, 590);
        layeredPane.add(promotion);
        promotion.setLayout(null);

        promobox = new JTextField();
        promobox.setBackground(new Color(224, 255, 255));
        promobox.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        promobox.setBounds(343, 336, 167, 42);
        promotion.add(promobox);
        promobox.setColumns(10);

        JLabel lblNewLabel_13 = new JLabel("Apply for promotion");
        lblNewLabel_13.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 19));
        lblNewLabel_13.setBounds(123, 336, 210, 42);
        promotion.add(lblNewLabel_13);

        JButton btnNewButton_7 = new JButton("Apply");
        btnNewButton_7.setForeground(new Color(0, 0, 0));
        btnNewButton_7.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
        btnNewButton_7.setBackground(new Color(255, 222, 173));
        btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Connection con = Add.getcon();
                try {
                    Statement promo = con.createStatement();
                    String s = String.format("Update promotions set promo = '%s' where id = '%s'",
                            promobox.getText().trim(), mainid);
                    promo.executeUpdate(s);
                    JOptionPane.showMessageDialog(null, "Your promotion request now is in queue", "Promotion",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    System.out.println(e1.getMessage());
                }

            }
        });
        btnNewButton_7.setBounds(539, 336, 161, 42);
        promotion.add(btnNewButton_7);

        promos = new JTextField();
        promos.setBackground(new Color(224, 255, 255));
        promos.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        promos.setEditable(false);
        promos.setColumns(10);
        promos.setBounds(343, 439, 167, 42);
        promotion.add(promos);

        JButton btnNewButton_7_1 = new JButton("Get your promotion status");
        btnNewButton_7_1.setForeground(new Color(0, 0, 0));
        btnNewButton_7_1.setBackground(new Color(255, 222, 173));
        btnNewButton_7_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
        btnNewButton_7_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Connection con = Add.getcon();
                try {
                    Statement promo = con.createStatement();
                    String s = String.format("select adm from promotions  where id = '%s'", mainid);
                    ResultSet r = promo.executeQuery(s);
                    r.next();
                    promos.setText(r.getString("adm"));
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    System.out.println(e1.getMessage());
                }
            }
        });
        btnNewButton_7_1.setBounds(539, 439, 287, 42);
        promotion.add(btnNewButton_7_1);

        JLabel lblNewLabel_5 = new JLabel("New label");
        lblNewLabel_5.setIcon(new ImageIcon("D:\\Subjects\\project\\Application\\H R Management\\src\\gifs.gif"));
        lblNewLabel_5.setBounds(312, 36, 394, 220);
        promotion.add(lblNewLabel_5);

        take_test = new JPanel();
        take_test.setBounds(0, 0, 1058, 590);
        layeredPane.add(take_test);
        take_test.setLayout(null);

        JButton btnNewButton_3 = new JButton("TakeTest");
        btnNewButton_3.setBackground(new Color(255, 222, 173));
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPannel(test);
            }
        });
        btnNewButton_3.setBounds(819, 416, 138, 52);
        btnNewButton_3.setFont(new Font("Segoe UI", Font.BOLD, 19));
        take_test.add(btnNewButton_3);

        JLabel lblNewLabel_12 = new JLabel("Test One");
        lblNewLabel_12.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblNewLabel_12.setBounds(37, 71, 118, 52);
        take_test.add(lblNewLabel_12);

        JLabel lblNewLabel_12_1 = new JLabel("Test Two");
        lblNewLabel_12_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblNewLabel_12_1.setBounds(37, 173, 118, 52);
        take_test.add(lblNewLabel_12_1);

        score1 = new JLabel("Score");
        score1.setFont(new Font("Segoe UI", Font.BOLD, 18));
        score1.setBounds(208, 79, 144, 44);
        take_test.add(score1);

        score2 = new JLabel("Score");
        score2.setFont(new Font("Segoe UI", Font.BOLD, 18));
        score2.setBounds(208, 173, 144, 44);
        take_test.add(score2);

        JLabel label = new JLabel("New label");
        label.setIcon(new ImageIcon("D:\\Subjects\\project\\Application\\H R Management\\src\\test (1).jpg"));
        label.setBounds(0, 0, 1058, 590);
        take_test.add(label);

        test = new JPanel();
        test.setBackground(new Color(102, 205, 170));
        test.setLayout(null);
        test.setBounds(0, 0, 1053, 590);
        layeredPane.add(test);

        JLabel lblNewLabel_7 = new JLabel("1. What are your Future Goals as an Employee?");
        lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblNewLabel_7.setBounds(22, 23, 862, 45);
        test.add(lblNewLabel_7);

        q1 = new JTextField();
        q1.setColumns(10);
        q1.setBounds(22, 68, 1008, 45);
        test.add(q1);

        JLabel lblNewLabel_8 = new JLabel("2. Why do you Want to Work For our Company?");
        lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblNewLabel_8.setBounds(22, 112, 862, 45);
        test.add(lblNewLabel_8);

        q2 = new JTextField();
        q2.setColumns(10);
        q2.setBounds(22, 162, 1008, 45);
        test.add(q2);

        JLabel lblNewLabel_9 = new JLabel(
                "3. What do you see as a trend that will change Human resources in the Next 5 years?");
        lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblNewLabel_9.setBounds(22, 208, 862, 45);
        test.add(lblNewLabel_9);

        q3 = new JTextField();
        q3.setColumns(10);
        q3.setBounds(22, 252, 1008, 45);
        test.add(q3);

        JLabel lblNewLabel_10 = new JLabel("4. What do you like most About working in Human Resources ?");
        lblNewLabel_10.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblNewLabel_10.setBounds(22, 301, 862, 45);
        test.add(lblNewLabel_10);

        q4 = new JTextField();
        q4.setColumns(10);
        q4.setBounds(20, 343, 1010, 45);
        test.add(q4);

        JLabel lblNewLabel_11 = new JLabel("5. What is Something we could improve as a Company ?");
        lblNewLabel_11.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblNewLabel_11.setBounds(22, 391, 862, 45);
        test.add(lblNewLabel_11);

        q5 = new JTextField();
        q5.setHorizontalAlignment(SwingConstants.LEFT);
        q5.setColumns(10);
        q5.setBounds(22, 433, 1008, 92);
        test.add(q5);

        JButton btnNewButton_5 = new JButton("Submit");
        btnNewButton_5.setBackground(new Color(255, 222, 173));
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Add.ans(mainid, q1.getText().trim(), q2.getText().trim(), q3.getText().trim(), q4.getText().trim(),
                        q5.getText().trim());
            }
        });
        btnNewButton_5.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnNewButton_5.setBounds(450, 535, 118, 37);
        test.add(btnNewButton_5);
        Know = new JPanel();
        Know.setBounds(0, 0, 1053, 590);
        layeredPane.add(Know);
        Know.setLayout(null);

        JLabel lblNewLabel_1_5 = new JLabel("Name");
        lblNewLabel_1_5.setForeground(Color.BLACK);
        lblNewLabel_1_5.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblNewLabel_1_5.setBounds(87, 50, 145, 42);
        Know.add(lblNewLabel_1_5);

        JLabel lblNewLabel_1_5_1 = new JLabel("E-Mail");
        lblNewLabel_1_5_1.setForeground(Color.BLACK);
        lblNewLabel_1_5_1.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblNewLabel_1_5_1.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_1.setBounds(87, 102, 145, 42);
        Know.add(lblNewLabel_1_5_1);

        JLabel lblNewLabel_1_5_2 = new JLabel("Department");
        lblNewLabel_1_5_2.setForeground(Color.BLACK);
        lblNewLabel_1_5_2.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblNewLabel_1_5_2.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_2.setBounds(87, 162, 145, 42);
        Know.add(lblNewLabel_1_5_2);

        JLabel lblNewLabel_1_5_3 = new JLabel("Role");
        lblNewLabel_1_5_3.setForeground(Color.BLACK);
        lblNewLabel_1_5_3.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblNewLabel_1_5_3.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_3.setBounds(87, 214, 145, 42);
        Know.add(lblNewLabel_1_5_3);

        JLabel lblNewLabel_1_5_11 = new JLabel("Dept Id");
        lblNewLabel_1_5_11.setForeground(Color.BLACK);
        lblNewLabel_1_5_11.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblNewLabel_1_5_11.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_11.setBounds(87, 274, 145, 42);
        Know.add(lblNewLabel_1_5_11);

        JLabel lblNewLabel_1_5_12 = new JLabel("Qualification");
        lblNewLabel_1_5_12.setForeground(Color.BLACK);
        lblNewLabel_1_5_12.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblNewLabel_1_5_12.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_12.setBounds(87, 334, 145, 42);
        Know.add(lblNewLabel_1_5_12);

        JLabel lblNewLabel_1_5_13 = new JLabel("Date Joined");
        lblNewLabel_1_5_13.setForeground(Color.BLACK);
        lblNewLabel_1_5_13.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblNewLabel_1_5_13.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_13.setBounds(87, 394, 145, 42);
        Know.add(lblNewLabel_1_5_13);

        JLabel lblNewLabel_1_5_14 = new JLabel("Salary");
        lblNewLabel_1_5_14.setForeground(Color.BLACK);
        lblNewLabel_1_5_14.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblNewLabel_1_5_14.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_14.setBounds(87, 454, 145, 42);
        Know.add(lblNewLabel_1_5_14);

        lblNewLabel_1_5_4 = new JLabel("Id");
        lblNewLabel_1_5_4.setForeground(Color.BLACK);
        lblNewLabel_1_5_4.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1_5_4.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_4.setBounds(269, 50, 350, 42);
        Know.add(lblNewLabel_1_5_4);

        lblNewLabel_1_5_5 = new JLabel("--/--/--");
        lblNewLabel_1_5_5.setForeground(Color.BLACK);
        lblNewLabel_1_5_5.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1_5_5.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_5.setBounds(269, 102, 350, 42);
        Know.add(lblNewLabel_1_5_5);

        lblNewLabel_1_5_6 = new JLabel("M/F/O");
        lblNewLabel_1_5_6.setForeground(Color.BLACK);
        lblNewLabel_1_5_6.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1_5_6.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_6.setBounds(269, 162, 350, 42);
        Know.add(lblNewLabel_1_5_6);

        lblNewLabel_1_5_7 = new JLabel("Admin/Emp");
        lblNewLabel_1_5_7.setForeground(Color.BLACK);
        lblNewLabel_1_5_7.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1_5_7.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_7.setBounds(269, 214, 350, 42);
        Know.add(lblNewLabel_1_5_7);

        lblNewLabel_1_5_21 = new JLabel("M/F/O");
        lblNewLabel_1_5_21.setForeground(Color.BLACK);
        lblNewLabel_1_5_21.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1_5_21.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_21.setBounds(269, 274, 350, 42);
        Know.add(lblNewLabel_1_5_21);

        lblNewLabel_1_5_22 = new JLabel("M/F/O");
        lblNewLabel_1_5_22.setForeground(Color.BLACK);
        lblNewLabel_1_5_22.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1_5_22.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_22.setBounds(269, 334, 350, 42);
        Know.add(lblNewLabel_1_5_22);

        lblNewLabel_1_5_23 = new JLabel("M/F/O");
        lblNewLabel_1_5_23.setForeground(Color.BLACK);
        lblNewLabel_1_5_23.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1_5_23.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_23.setBounds(269, 394, 350, 42);
        Know.add(lblNewLabel_1_5_23);

        lblNewLabel_1_5_24 = new JLabel("M/F/O");
        lblNewLabel_1_5_24.setForeground(Color.BLACK);
        lblNewLabel_1_5_24.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblNewLabel_1_5_24.setBackground(new Color(147, 112, 219));
        lblNewLabel_1_5_24.setBounds(269, 454, 350, 42);
        Know.add(lblNewLabel_1_5_24);

        JLabel lblNewLabel_2 = new JLabel("page");
        lblNewLabel_2.setIcon(new ImageIcon("D:\\Subjects\\project\\Application\\H R Management\\src\\Main.png"));
        lblNewLabel_2.setBounds(0, 0, 1053, 590);
        Know.add(lblNewLabel_2);

        updateEmployee = new JPanel();
        updateEmployee.setBackground(new Color(102, 205, 170));
        updateEmployee.setBounds(0, 0, 1053, 590);
        layeredPane.add(updateEmployee);
        updateEmployee.setLayout(null);

        JLabel uartidlabel = new JLabel("Emp Id");
        uartidlabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        uartidlabel.setBounds(10, 19, 112, 43);
        updateEmployee.add(uartidlabel);

        uartid = new JTextField();
        uartid.setBackground(new Color(224, 255, 255));
        uartid.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                ResultSet artdetails = getDetails.getArtist(uartid.getText().trim());
                try {
                    artdetails.next();
                    uartfname.setText(artdetails.getString("fname"));
                    uartlname.setText(artdetails.getString("lname"));
                    uartcity.setText(artdetails.getString("city"));
                    uartphno.setText(artdetails.getString("phno"));
                    uartmail.setText(artdetails.getString("emailid"));
                    uartzip.setText(artdetails.getString("zipcode"));
                    uarttrain.setText(artdetails.getString("training"));
                    uartqua.setText(artdetails.getString("qualification"));
                    String gen = artdetails.getString("gender");
                    if (gen.equals("Male") || gen.equals("M")) {
                        uartmale.doClick();
                    } else if (gen.equals("Female") || gen.equals("F")) {
                        uartfemale.doClick();
                    } else if (gen.equals("Other")) {
                        uartother.doClick();
                    } else {
                        JOptionPane.showMessageDialog(null, "Gender error", "Gender", JOptionPane.WARNING_MESSAGE);
                    }
                    String rol = artdetails.getString("role");
                    if (rol.startsWith("E") || rol.startsWith("e")) {
                        uartrole.setSelectedIndex(1);
                    } else if (rol.startsWith("A") || rol.startsWith("a")) {
                        uartrole.setSelectedIndex(2);
                    }
                    String dep = artdetails.getString("dept");
                    if (dep.startsWith("Marketing")) {
                        uartdep.setSelectedIndex(1);
                    } else if (dep.startsWith("Administration")) {
                        uartdep.setSelectedIndex(2);
                    } else if (dep.startsWith("Programming")) {
                        uartdep.setSelectedIndex(3);
                    } else if (dep.startsWith("QualityManagement")) {
                        uartdep.setSelectedIndex(4);
                    } else if (dep.startsWith("Accounting")) {
                        uartdep.setSelectedIndex(5);
                    } else if (dep.startsWith("Computer Science")) {
                        uartdep.setSelectedIndex(6);
                    }
                    String depid = artdetails.getString("dept_id");
                    if (depid.startsWith("D001")) {
                        uartdepid.setSelectedIndex(1);
                    } else if (depid.startsWith("D002")) {
                        uartdepid.setSelectedIndex(2);
                    } else if (depid.startsWith("D003")) {
                        uartdepid.setSelectedIndex(3);
                    } else if (depid.startsWith("D004")) {
                        uartdepid.setSelectedIndex(4);
                    } else if (depid.startsWith("D005")) {
                        uartdepid.setSelectedIndex(5);
                    } else if (depid.startsWith("D006")) {
                        uartdepid.setSelectedIndex(6);
                    }
                    String dob = artdetails.getString("dob");
                    String[] doba = dob.split("-");
                    uartdobd.setSelectedIndex(Integer.parseInt(doba[2]));
                    uartdobm.setSelectedIndex(Integer.parseInt(doba[1]));
                    uartdoby.setSelectedIndex((Integer.parseInt(doba[0]) - 1949));
                    String dj = artdetails.getString("datejoined");
                    String[] dja = dj.split("-");
                    uartdjd.setSelectedIndex(Integer.parseInt(dja[2]));
                    uartdjm.setSelectedIndex(Integer.parseInt(dja[1]));
                    uartdjy.setSelectedIndex((Integer.parseInt(dja[0]) - 1949));
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, "Result set is null", "Data retrive error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        });
        uartid.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        uartid.setColumns(10);
        uartid.setBounds(114, 25, 121, 36);
        updateEmployee.add(uartid);

        JLabel art_id_2_3_1 = new JLabel("Last Name");
        art_id_2_3_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_2_3_1.setBounds(408, 80, 146, 43);
        updateEmployee.add(art_id_2_3_1);

        uartfname = new JTextField();
        uartfname.setBackground(new Color(224, 255, 255));
        uartfname.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        uartfname.setColumns(10);
        uartfname.setBounds(114, 87, 261, 43);
        updateEmployee.add(uartfname);

        uartlname = new JTextField();
        uartlname.setBackground(new Color(224, 255, 255));
        uartlname.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        uartlname.setColumns(10);
        uartlname.setBounds(564, 80, 208, 43);
        updateEmployee.add(uartlname);

        uartmale = new JRadioButton("Male");
        uartmale.setBackground(new Color(102, 205, 170));
        uartgender.add(uartmale);
        uartmale.setActionCommand("Male");
        uartmale.setFont(new Font("Tahoma", Font.PLAIN, 20));
        uartmale.setBounds(114, 152, 80, 36);
        updateEmployee.add(uartmale);

        uartfemale = new JRadioButton("Female");
        uartfemale.setBackground(new Color(102, 205, 170));
        uartfemale.setActionCommand("Female");
        uartgender.add(uartfemale);
        uartfemale.setFont(new Font("Tahoma", Font.PLAIN, 20));
        uartfemale.setBounds(199, 152, 96, 36);
        updateEmployee.add(uartfemale);

        uartother = new JRadioButton("Other");
        uartother.setBackground(new Color(102, 205, 170));
        uartother.setActionCommand("Other");
        uartgender.add(uartother);
        uartother.setFont(new Font("Tahoma", Font.PLAIN, 20));
        uartother.setBounds(308, 152, 121, 36);
        updateEmployee.add(uartother);

        uartphno = new JTextField();
        uartphno.setBackground(new Color(224, 255, 255));
        uartphno.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        uartphno.setColumns(10);
        uartphno.setBounds(132, 384, 190, 43);
        updateEmployee.add(uartphno);

        uarttrain = new JTextField();
        uarttrain.setBackground(new Color(224, 255, 255));
        uarttrain.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        uarttrain.setColumns(10);
        uarttrain.setBounds(454, 384, 190, 43);
        updateEmployee.add(uarttrain);

        JLabel art_id_4_1_7_1 = new JLabel("DD:");
        art_id_4_1_7_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_1_7_1.setBounds(163, 210, 55, 43);
        updateEmployee.add(art_id_4_1_7_1);

        JLabel art_id_4_1_1_5_1 = new JLabel("M:");
        art_id_4_1_1_5_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_1_1_5_1.setBounds(357, 210, 55, 43);
        updateEmployee.add(art_id_4_1_1_5_1);

        JLabel art_id_4_1_2_5_1 = new JLabel("YYYY:");
        art_id_4_1_2_5_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_1_2_5_1.setBounds(534, 201, 80, 43);
        updateEmployee.add(art_id_4_1_2_5_1);

        uartrole = new JComboBox();
        uartrole.setBackground(new Color(175, 238, 238));
        uartrole.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "Employee", "Admin" }));
        uartrole.setToolTipText("");
        uartrole.setFont(new Font("Dialog", Font.BOLD, 18));
        uartrole.setBounds(392, 16, 112, 36);
        updateEmployee.add(uartrole);

        JButton btnNewButton_1_4_2 = new JButton("Update Database");
        btnNewButton_1_4_2.setBackground(new Color(255, 222, 173));
        btnNewButton_1_4_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Update.updateArtist(uartid.getText(), uartfname.getText(), uartlname.getText(),
                        uartrole.getSelectedItem() + "", uartgender.getSelection().getActionCommand(),
                        uartdoby.getSelectedItem() + "/" + uartdobm.getSelectedItem() + "/"
                                + uartdobd.getSelectedItem(),
                        uartdjy.getSelectedItem() + "/" + uartdjm.getSelectedItem() + "/" + uartdjd.getSelectedItem(),
                        uartmail.getText(), uartphno.getText(), uartcity.getText(),
                        uartzip.getText(), uartqua.getText(), uarttrain.getText(), uartdep.getSelectedItem() + "",
                        uartdepid.getSelectedItem() + "");

            }
        });
        btnNewButton_1_4_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnNewButton_1_4_2.setBounds(772, 476, 218, 55);
        updateEmployee.add(btnNewButton_1_4_2);

        uartmail = new JTextField();
        uartmail.setBackground(new Color(224, 255, 255));
        uartmail.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        uartmail.setColumns(10);
        uartmail.setBounds(132, 333, 349, 36);
        updateEmployee.add(uartmail);

        uartdobm = new JComboBox();
        uartdobm.setBackground(new Color(175, 238, 238));
        uartdobm.setModel(new DefaultComboBoxModel(
                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        uartdobm.setToolTipText("Month");
        uartdobm.setFont(new Font("Dialog", Font.BOLD, 18));
        uartdobm.setBounds(402, 210, 112, 36);
        updateEmployee.add(uartdobm);

        uartdobd = new JComboBox();
        uartdobd.setBackground(new Color(175, 238, 238));
        uartdobd.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30", "31" }));
        uartdobd.setToolTipText("Day");
        uartdobd.setFont(new Font("Dialog", Font.BOLD, 18));
        uartdobd.setBounds(232, 210, 112, 36);
        updateEmployee.add(uartdobd);

        uartzip = new JTextField();
        uartzip.setBackground(new Color(224, 255, 255));
        uartzip.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        uartzip.setColumns(10);
        uartzip.setBounds(132, 455, 190, 43);
        updateEmployee.add(uartzip);

        JLabel art_id_4_1_4_3_1 = new JLabel("DD:");
        art_id_4_1_4_3_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_1_4_3_1.setBounds(163, 263, 55, 43);
        updateEmployee.add(art_id_4_1_4_3_1);

        uartdjd = new JComboBox();
        uartdjd.setBackground(new Color(175, 238, 238));
        uartdjd.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30", "31" }));
        uartdjd.setToolTipText("Day");
        uartdjd.setFont(new Font("Dialog", Font.BOLD, 18));
        uartdjd.setBounds(232, 268, 112, 36);
        updateEmployee.add(uartdjd);

        JLabel art_id_4_1_1_2_3_1 = new JLabel("M:");
        art_id_4_1_1_2_3_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_1_1_2_3_1.setBounds(357, 263, 55, 43);
        updateEmployee.add(art_id_4_1_1_2_3_1);

        uartdjm = new JComboBox();
        uartdjm.setBackground(new Color(175, 238, 238));
        uartdjm.setModel(new DefaultComboBoxModel(
                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        uartdjm.setToolTipText("Month");
        uartdjm.setFont(new Font("Dialog", Font.BOLD, 18));
        uartdjm.setBounds(402, 268, 112, 36);
        updateEmployee.add(uartdjm);

        JLabel uartdjylabel = new JLabel("YYYY:");
        uartdjylabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        uartdjylabel.setBounds(534, 258, 80, 43);
        updateEmployee.add(uartdjylabel);

        JLabel art_id_11_1_1 = new JLabel("Fname");
        art_id_11_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_11_1_1.setBounds(10, 87, 112, 43);
        updateEmployee.add(art_id_11_1_1);

        JLabel art_id_11_1_2 = new JLabel("Gender");
        art_id_11_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_11_1_2.setBounds(10, 147, 112, 43);
        updateEmployee.add(art_id_11_1_2);

        JLabel art_id_11_1_3 = new JLabel("DOB");
        art_id_11_1_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_11_1_3.setBounds(10, 210, 112, 43);
        updateEmployee.add(art_id_11_1_3);

        JLabel art_id_11_1_4 = new JLabel("DateJoin");
        art_id_11_1_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_11_1_4.setBounds(10, 263, 112, 43);
        updateEmployee.add(art_id_11_1_4);

        JLabel art_id_11_1_5 = new JLabel("Email");
        art_id_11_1_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_11_1_5.setBounds(10, 331, 112, 43);
        updateEmployee.add(art_id_11_1_5);

        JLabel art_id_11_1_5_1 = new JLabel("Mob No");
        art_id_11_1_5_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_11_1_5_1.setBounds(10, 387, 112, 43);
        updateEmployee.add(art_id_11_1_5_1);

        JLabel art_id_11_1_5_2 = new JLabel("Zip Code");
        art_id_11_1_5_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_11_1_5_2.setBounds(10, 455, 112, 43);
        updateEmployee.add(art_id_11_1_5_2);

        JLabel art_id_11_1_5_4 = new JLabel("Training");
        art_id_11_1_5_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_11_1_5_4.setBounds(332, 384, 112, 43);
        updateEmployee.add(art_id_11_1_5_4);

        JLabel labelrole = new JLabel("Role");
        labelrole.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        labelrole.setBounds(267, 17, 112, 43);
        updateEmployee.add(labelrole);

        JLabel art_id_11_1_5_6 = new JLabel("Dept Id");
        art_id_11_1_5_6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_11_1_5_6.setBounds(332, 452, 112, 43);
        updateEmployee.add(art_id_11_1_5_6);

        JLabel art_id_11_1_5_7 = new JLabel("Department");
        art_id_11_1_5_7.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_11_1_5_7.setBounds(10, 513, 146, 43);
        updateEmployee.add(art_id_11_1_5_7);

        JLabel art_id_11_1_5_8 = new JLabel("City");
        art_id_11_1_5_8.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_11_1_5_8.setBounds(511, 323, 86, 43);
        updateEmployee.add(art_id_11_1_5_8);

        uartcity = new JTextField();
        uartcity.setBackground(new Color(224, 255, 255));
        uartcity.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        uartcity.setColumns(10);
        uartcity.setBounds(587, 323, 208, 43);
        updateEmployee.add(uartcity);

        JLabel art_id_11_1_5_8_1 = new JLabel("Qualification");
        art_id_11_1_5_8_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_11_1_5_8_1.setBounds(442, 145, 162, 43);
        updateEmployee.add(art_id_11_1_5_8_1);

        uartqua = new JTextField();
        uartqua.setBackground(new Color(224, 255, 255));
        uartqua.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        uartqua.setColumns(10);
        uartqua.setBounds(615, 147, 208, 43);
        updateEmployee.add(uartqua);

        uartdepid = new JComboBox();
        uartdepid.setBackground(new Color(175, 238, 238));
        uartdepid.setModel(new DefaultComboBoxModel(
                new String[] { "--Select--", "D001", "D002", "D003", "D004", "D005", "D006" }));
        uartdepid.setFont(new Font("Dialog", Font.BOLD, 18));
        uartdepid.setBounds(454, 456, 146, 38);
        updateEmployee.add(uartdepid);

        uartdep = new JComboBox();
        uartdep.setBackground(new Color(175, 238, 238));
        uartdep.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "Marketing", "Administration",
                "Programming", "QualityManagement", "Accounting", "Computer Science" }));
        uartdep.setFont(new Font("Dialog", Font.BOLD, 18));
        uartdep.setBounds(190, 515, 208, 43);
        updateEmployee.add(uartdep);

        uartdoby = new JComboBox();
        uartdoby.setBackground(new Color(175, 238, 238));
        uartdoby.setFont(new Font("Dialog", Font.BOLD, 18));
        uartdoby.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967",
                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980",
                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993",
                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
                "2020", "2021" }));
        uartdoby.setBounds(613, 209, 137, 35);
        updateEmployee.add(uartdoby);

        uartdjy = new JComboBox();
        uartdjy.setBackground(new Color(175, 238, 238));
        uartdjy.setFont(new Font("Dialog", Font.BOLD, 18));
        uartdjy.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967",
                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980",
                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993",
                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
                "2020", "2021" }));
        uartdjy.setBounds(613, 263, 137, 35);
        updateEmployee.add(uartdjy);

        addEmployee = new JPanel();
        addEmployee.setBackground(new Color(102, 205, 170));
        addEmployee.setLayout(null);
        addEmployee.setBounds(0, 0, 1053, 590);
        layeredPane.add(addEmployee);

        JLabel empid = new JLabel("Emp ID");
        empid.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        empid.setBounds(10, 14, 146, 43);
        addEmployee.add(empid);

        txtWillBeGiven = new JTextField();
        txtWillBeGiven.setBackground(new Color(240, 255, 255));
        txtWillBeGiven.setEditable(false);
        txtWillBeGiven.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtWillBeGiven.setText("Will be given by System");
        txtWillBeGiven.setColumns(10);
        txtWillBeGiven.setBounds(129, 21, 190, 36);
        addEmployee.add(txtWillBeGiven);

        JLabel art_id_1_2 = new JLabel("First Name");
        art_id_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_1_2.setBounds(10, 67, 146, 43);
        addEmployee.add(art_id_1_2);

        JLabel art_id_2_2 = new JLabel("Last Name");
        art_id_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_2_2.setBounds(433, 70, 146, 43);
        addEmployee.add(art_id_2_2);

        JLabel art_id_3_2 = new JLabel("Gender");
        art_id_3_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_3_2.setBounds(10, 120, 146, 43);
        addEmployee.add(art_id_3_2);

        JLabel art_id_4_4 = new JLabel("DOB");
        art_id_4_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_4.setBounds(10, 191, 146, 43);
        addEmployee.add(art_id_4_4);

        JLabel art_id_5_2 = new JLabel("E-Mail");
        art_id_5_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_5_2.setBounds(10, 309, 146, 43);
        addEmployee.add(art_id_5_2);

        JLabel art_id_6_4 = new JLabel("Mob No.");
        art_id_6_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_6_4.setBounds(10, 383, 146, 43);
        addEmployee.add(art_id_6_4);

        efname = new JTextField();
        efname.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        efname.setBackground(new Color(224, 255, 255));
        efname.setColumns(10);
        efname.setBounds(162, 77, 261, 36);
        addEmployee.add(efname);

        elname = new JTextField();
        elname.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        elname.setBackground(new Color(224, 255, 255));
        elname.setColumns(10);
        elname.setBounds(589, 77, 208, 36);
        addEmployee.add(elname);

        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Male");
        rdbtnNewRadioButton_2.setSelected(true);
        rdbtnNewRadioButton_2.setActionCommand("Male");
        empgender.add(rdbtnNewRadioButton_2);
        rdbtnNewRadioButton_2.setOpaque(false);
        rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rdbtnNewRadioButton_2.setBounds(162, 125, 112, 36);
        addEmployee.add(rdbtnNewRadioButton_2);

        JRadioButton rdbtnMale_2 = new JRadioButton("Female");
        rdbtnMale_2.setBackground(new Color(102, 205, 170));
        rdbtnNewRadioButton_2.setSelected(true);
        rdbtnNewRadioButton_2.setActionCommand("Male");
        empgender.add(rdbtnNewRadioButton_2);
        rdbtnNewRadioButton_2.setOpaque(false);
        rdbtnMale_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rdbtnMale_2.setBounds(276, 125, 121, 36);
        addEmployee.add(rdbtnMale_2);

        JRadioButton rdbtnNewRadioButton_1_1_2 = new JRadioButton("Othor");
        rdbtnNewRadioButton_1_1_2.setBackground(new Color(102, 205, 170));
        rdbtnNewRadioButton_2.setSelected(true);
        rdbtnNewRadioButton_2.setActionCommand("Male");
        empgender.add(rdbtnNewRadioButton_2);
        rdbtnNewRadioButton_2.setOpaque(false);
        rdbtnNewRadioButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rdbtnNewRadioButton_1_1_2.setBounds(416, 127, 121, 36);
        addEmployee.add(rdbtnNewRadioButton_1_1_2);

        empph = new JTextField();
        empph.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        empph.setBackground(new Color(224, 255, 255));
        empph.setColumns(10);
        empph.setBounds(141, 393, 190, 36);
        addEmployee.add(empph);

        JLabel art_id_6_1_2 = new JLabel("City ");
        art_id_6_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_6_1_2.setBounds(588, 312, 105, 43);
        addEmployee.add(art_id_6_1_2);

        empcity = new JTextField();
        empcity.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        empcity.setBackground(new Color(224, 255, 255));
        empcity.setColumns(10);
        empcity.setBounds(712, 319, 190, 36);
        addEmployee.add(empcity);

        JLabel art_id_4_1_5 = new JLabel("DD:");
        art_id_4_1_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_1_5.setBounds(193, 191, 55, 43);
        addEmployee.add(art_id_4_1_5);

        JLabel art_id_4_1_1_3 = new JLabel("M:");
        art_id_4_1_1_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_1_1_3.setBounds(387, 191, 55, 43);
        addEmployee.add(art_id_4_1_1_3);

        JLabel art_id_4_1_2_3 = new JLabel("YYYY:");
        art_id_4_1_2_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_1_2_3.setBounds(578, 191, 80, 43);
        addEmployee.add(art_id_4_1_2_3);

        JComboBox emprole = new JComboBox();
        emprole.setBackground(new Color(240, 255, 255));
        emprole.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "Employee", "Admin" }));
        emprole.setToolTipText("");
        emprole.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        emprole.setBounds(453, 21, 112, 36);
        addEmployee.add(emprole);

        JLabel art_id_7_1 = new JLabel("Role");
        art_id_7_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_7_1.setBounds(358, 14, 70, 43);
        addEmployee.add(art_id_7_1);

        JButton btnNewButton_1_2 = new JButton("Add to Database");
        btnNewButton_1_2.setBackground(new Color(255, 222, 173));
        btnNewButton_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e465) {
                Add.addEmployee(efname.getText(), elname.getText(), emprole.getSelectedItem() + "",
                        empgender.getSelection().getActionCommand(),
                        edoby.getSelectedItem() + "/" + edobm.getSelectedItem() + "/" + edobd.getSelectedItem(),
                        ejy.getSelectedItem() + "/" + ejm.getSelectedItem() + "/" + ejd.getSelectedItem(),
                        empmail.getText(), empph.getText(), empcity.getText(), emppost.getText(), empsalary.getText(),
                        empqualify.getText(), empdep.getSelectedItem() + "", empdepid.getSelectedItem() + "",
                        emptrain.getText());
                System.out.println(
                        (edoby.getSelectedItem() + "/" + edobm.getSelectedItem() + "/" + edobd.getSelectedItem())
                                .replace('/', '-'));
            }
        });
        btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnNewButton_1_2.setBounds(805, 472, 218, 55);
        addEmployee.add(btnNewButton_1_2);

        empmail = new JTextField();
        empmail.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        empmail.setBackground(new Color(224, 255, 255));
        empmail.setColumns(10);
        empmail.setBounds(118, 319, 419, 36);
        addEmployee.add(empmail);

        edobm = new JComboBox();
        edobm.setBackground(new Color(240, 255, 255));
        edobm.setModel(new DefaultComboBoxModel(
                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        edobm.setToolTipText("");
        edobm.setFont(new Font("Roboto", Font.PLAIN, 20));
        edobm.setBounds(439, 191, 112, 36);
        addEmployee.add(edobm);

        edobd = new JComboBox();
        edobd.setBackground(new Color(240, 255, 255));
        edobd.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30", "31" }));
        edobd.setToolTipText("");
        edobd.setFont(new Font("Roboto", Font.PLAIN, 20));
        edobd.setBounds(264, 191, 112, 36);
        addEmployee.add(edobd);

        JLabel art_id_6_2_2 = new JLabel("Zip Code:");
        art_id_6_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_6_2_2.setBounds(10, 450, 146, 43);
        addEmployee.add(art_id_6_2_2);

        emppost = new JTextField();
        emppost.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        emppost.setBackground(new Color(224, 255, 255));
        emppost.setColumns(10);
        emppost.setBounds(141, 460, 190, 36);
        addEmployee.add(emppost);

        JLabel art_id_4_3_2 = new JLabel("Joined Date");
        art_id_4_3_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_3_2.setBounds(10, 256, 146, 43);
        addEmployee.add(art_id_4_3_2);

        JLabel art_id_4_1_4_2 = new JLabel("DD:");
        art_id_4_1_4_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_1_4_2.setBounds(193, 256, 55, 43);
        addEmployee.add(art_id_4_1_4_2);

        ejd = new JComboBox();
        ejd.setBackground(new Color(240, 255, 255));
        ejd.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
                "27", "28", "29", "30", "31" }));
        ejd.setToolTipText("");
        ejd.setFont(new Font("Roboto", Font.PLAIN, 20));
        ejd.setBounds(264, 256, 112, 36);
        addEmployee.add(ejd);

        JLabel art_id_4_1_1_2_2 = new JLabel("M:");
        art_id_4_1_1_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_1_1_2_2.setBounds(387, 256, 55, 43);
        addEmployee.add(art_id_4_1_1_2_2);

        ejm = new JComboBox();
        ejm.setBackground(new Color(240, 255, 255));
        ejm.setModel(new DefaultComboBoxModel(
                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        ejm.setToolTipText("");
        ejm.setFont(new Font("Roboto", Font.PLAIN, 20));
        ejm.setBounds(439, 256, 112, 36);
        addEmployee.add(ejm);

        JLabel art_id_4_1_2_2_2 = new JLabel("YYYY:");
        art_id_4_1_2_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_4_1_2_2_2.setBounds(578, 256, 80, 43);
        addEmployee.add(art_id_4_1_2_2_2);

        JLabel art_id_6_2_2_1 = new JLabel("Salary");
        art_id_6_2_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
        art_id_6_2_2_1.setBounds(10, 503, 146, 43);
        addEmployee.add(art_id_6_2_2_1);

        empsalary = new JTextField();
        empsalary.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        empsalary.setBackground(new Color(224, 255, 255));
        empsalary.setColumns(10);
        empsalary.setBounds(141, 513, 190, 36);
        addEmployee.add(empsalary);

        edoby = new JComboBox();
        edoby.setBackground(new Color(240, 255, 255));
        edoby.setFont(new Font("Segoe UI", Font.PLAIN, 19));
        edoby.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967",
                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980",
                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993",
                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
                "2020", "2021" }));
        edoby.setBounds(668, 191, 121, 36);
        addEmployee.add(edoby);

        ejy = new JComboBox();
        ejy.setBackground(new Color(240, 255, 255));
        ejy.setFont(new Font("Segoe UI", Font.PLAIN, 19));
        ejy.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967",
                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980",
                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993",
                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
                "2020", "2021" }));
        ejy.setBounds(668, 260, 121, 36);
        addEmployee.add(ejy);

        JLabel lblNewLabel = new JLabel("Qualification");
        lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
        lblNewLabel.setBounds(543, 123, 150, 40);
        addEmployee.add(lblNewLabel);

        empqualify = new JTextField();
        empqualify.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        empqualify.setBackground(new Color(224, 255, 255));
        empqualify.setColumns(10);
        empqualify.setBounds(712, 123, 230, 34);
        addEmployee.add(empqualify);

        JLabel lblNewLabel_14 = new JLabel("Dept ID");
        lblNewLabel_14.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
        lblNewLabel_14.setBounds(351, 386, 130, 40);
        addEmployee.add(lblNewLabel_14);

        JLabel lblNewLabel_15 = new JLabel("Department");
        lblNewLabel_15.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
        lblNewLabel_15.setBounds(351, 453, 130, 40);
        addEmployee.add(lblNewLabel_15);

        JLabel lblNewLabel_16 = new JLabel("Training");
        lblNewLabel_16.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
        lblNewLabel_16.setBounds(351, 506, 130, 40);
        addEmployee.add(lblNewLabel_16);

        emptrain = new JTextField();
        emptrain.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        emptrain.setBackground(new Color(224, 255, 255));
        emptrain.setColumns(10);
        emptrain.setBounds(487, 512, 230, 34);
        addEmployee.add(emptrain);

        empdepid = new JComboBox();
        empdepid.setBackground(new Color(240, 255, 255));
        empdepid.setModel(new DefaultComboBoxModel(
                new String[] { "--Select--", "D001", "D002", "D003", "D004", "D005", "D006" }));
        empdepid.setToolTipText("");
        empdepid.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
        empdepid.setBounds(491, 383, 163, 36);
        addEmployee.add(empdepid);

        empdep = new JComboBox();
        empdep.setBackground(new Color(240, 255, 255));
        empdep.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "Marketing", "Administration",
                "Programming", "QualityManagemnt", "Accounting", "Computer Science" }));
        empdep.setToolTipText("");
        empdep.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
        empdep.setBounds(491, 455, 163, 36);
        addEmployee.add(empdep);

        JPanel Search = new JPanel();
        Search.setBackground(new Color(102, 205, 170));
        Search.setBounds(0, 0, 1053, 590);
        layeredPane.add(Search);
        Search.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("Search by Id");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblNewLabel_3.setBounds(21, 22, 192, 39);
        Search.add(lblNewLabel_3);

        sempid = new JTextField();
        sempid.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        sempid.setBackground(new Color(224, 255, 255));
        sempid.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                table.setModel(getDetails.removeData("employee", sempid.getText()));
            }
        });
        sempid.setBounds(215, 22, 192, 40);
        Search.add(sempid);
        sempid.setColumns(10);

        JButton btnNewButton_1 = new JButton("Get Data");
        btnNewButton_1.setBackground(new Color(255, 222, 173));
        btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        btnNewButton_1.setBounds(890, 22, 128, 39);
        Search.add(btnNewButton_1);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(21, 226, 1022, 354);
        Search.add(scrollPane);

        table = new JTable();
        table.setBackground(new Color(224, 255, 255));
        table.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        { null, "", "" },
                },
                new String[] {
                        "Emp Name", "Emp Salary", "Emp Id"
                }) {
            Class[] columnTypes = new Class[] {
                    String.class, Object.class, Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }

            boolean[] columnEditables = new boolean[] {
                    false, true, true
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table.getColumnModel().getColumn(0).setResizable(false);
        scrollPane.setViewportView(table);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(102, 205, 170));
        panel_1.setBounds(21, 91, 1022, 102);
        Search.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_17 = new JLabel("Total Employees");
        lblNewLabel_17.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
        lblNewLabel_17.setBounds(20, 10, 165, 34);
        panel_1.add(lblNewLabel_17);

        JLabel lblNewLabel_17_1 = new JLabel("Marketing Dept.");
        lblNewLabel_17_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
        lblNewLabel_17_1.setBounds(195, 10, 165, 34);
        panel_1.add(lblNewLabel_17_1);

        JLabel lblNewLabel_17_2 = new JLabel("Admi Dept.");
        lblNewLabel_17_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
        lblNewLabel_17_2.setBounds(370, 10, 112, 34);
        panel_1.add(lblNewLabel_17_2);

        JLabel lblNewLabel_17_3 = new JLabel("Acco Dept.");
        lblNewLabel_17_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
        lblNewLabel_17_3.setBounds(492, 10, 112, 34);
        panel_1.add(lblNewLabel_17_3);

        JLabel lblNewLabel_17_3_1 = new JLabel("QualityDept.");
        lblNewLabel_17_3_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
        lblNewLabel_17_3_1.setBounds(614, 10, 112, 34);
        panel_1.add(lblNewLabel_17_3_1);

        JLabel lblNewLabel_17_3_2 = new JLabel("Comp Dept.");
        lblNewLabel_17_3_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
        lblNewLabel_17_3_2.setBounds(748, 10, 112, 34);
        panel_1.add(lblNewLabel_17_3_2);

        JLabel lblNewLabel_17_3_3 = new JLabel("Prog Dept.");
        lblNewLabel_17_3_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
        lblNewLabel_17_3_3.setBounds(885, 10, 112, 34);
        panel_1.add(lblNewLabel_17_3_3);

        empcount = new JLabel("N/A");
        empcount.setHorizontalAlignment(SwingConstants.CENTER);
        empcount.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
        empcount.setBounds(44, 54, 112, 34);
        panel_1.add(empcount);

        mc = new JLabel("N/A");
        mc.setHorizontalAlignment(SwingConstants.CENTER);
        mc.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
        mc.setBounds(205, 54, 112, 34);
        panel_1.add(mc);

        adc = new JLabel("N/A");
        adc.setHorizontalAlignment(SwingConstants.CENTER);
        adc.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
        adc.setBounds(370, 54, 112, 34);
        panel_1.add(adc);

        ac = new JLabel("N/A");
        ac.setHorizontalAlignment(SwingConstants.CENTER);
        ac.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
        ac.setBounds(492, 54, 112, 34);
        panel_1.add(ac);

        qc = new JLabel("N/A");
        qc.setHorizontalAlignment(SwingConstants.CENTER);
        qc.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
        qc.setBounds(614, 54, 112, 34);
        panel_1.add(qc);

        cc = new JLabel("N/A");
        cc.setHorizontalAlignment(SwingConstants.CENTER);
        cc.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
        cc.setBounds(748, 54, 112, 34);
        panel_1.add(cc);

        pc = new JLabel("N/A");
        pc.setHorizontalAlignment(SwingConstants.CENTER);
        pc.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
        pc.setBounds(885, 54, 112, 34);
        panel_1.add(pc);

        syearemp = new JTextField();
        syearemp.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        syearemp.setBackground(new Color(224, 255, 255));
        syearemp.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                table.setModel(getDetails.removeYearData(syearemp.getText().trim()));
            }
        });
        syearemp.setColumns(10);
        syearemp.setBounds(601, 22, 192, 40);
        Search.add(syearemp);

        JLabel lblNewLabel_3_2 = new JLabel("Search by year");
        lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblNewLabel_3_2.setBounds(410, 22, 192, 39);
        Search.add(lblNewLabel_3_2);

        JPanel Training = new JPanel();
        Training.setBackground(new Color(255, 228, 196));
        Training.setBounds(0, 0, 1053, 590);
        layeredPane.add(Training);
        Training.setLayout(null);

        train = new JLabel("Department Id:");
        train.setFont(new Font("Segoe UI", Font.BOLD, 19));
        train.setBounds(482, 180, 178, 39);
        Training.add(train);

        JLabel lblNewLabel_6 = new JLabel("Training Details");
        lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 19));
        lblNewLabel_6.setBounds(259, 177, 197, 44);
        Training.add(lblNewLabel_6);

        trained = new JTextField();
        trained.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
        trained.setBackground(new Color(224, 255, 255));
        trained.setBounds(418, 303, 209, 45);
        Training.add(trained);
        trained.setColumns(10);

        JLabel lblNewLabel_6_1 = new JLabel("Training Details");
        lblNewLabel_6_1.setFont(new Font("Segoe UI", Font.BOLD, 19));
        lblNewLabel_6_1.setBounds(211, 299, 197, 44);
        Training.add(lblNewLabel_6_1);

        JButton btnNewButton_6 = new JButton("Add");
        btnNewButton_6.setBackground(new Color(255, 222, 173));
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Connection con = Add.getcon();
                try {
                    Statement promo = con.createStatement();
                    String s = String.format("Update employee set training2 = '%s' where empid = '%s'",
                            trained.getText().trim(), mainid);
                    promo.executeUpdate(s);
                    JOptionPane.showMessageDialog(null, "Your training is added", "Promotion",
                            JOptionPane.INFORMATION_MESSAGE);
                    setProfile(mainid);
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    System.out.println(e1.getMessage());
                }

            }
        });
        btnNewButton_6.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnNewButton_6.setBounds(666, 299, 140, 45);
        Training.add(btnNewButton_6);

        JLabel lblNewLabel_6_2 = new JLabel("Training Details Added");
        lblNewLabel_6_2.setFont(new Font("Segoe UI", Font.BOLD, 19));
        lblNewLabel_6_2.setBounds(258, 407, 243, 44);
        Training.add(lblNewLabel_6_2);

        addtrain = new JLabel((String) null);
        addtrain.setFont(new Font("Segoe UI", Font.BOLD, 19));
        addtrain.setBounds(535, 407, 178, 39);
        Training.add(addtrain);

        JLabel lblNewLabel_19 = new JLabel("New label");
        lblNewLabel_19.setBackground(new Color(255, 228, 181));
        lblNewLabel_19.setIcon(new ImageIcon("D:\\Subjects\\project\\Application\\H R Management\\src\\train.gif"));
        lblNewLabel_19.setBounds(0, 0, 1053, 590);
        Training.add(lblNewLabel_19);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBackground(Color.MAGENTA);
        panel_1_1.setBounds(233, 0, 1053, 52);
        frmHrManagement.getContentPane().add(panel_1_1);

        add = new JButton("Add Employee");
        add.setBackground(new Color(224, 255, 255));
        add.setForeground(Color.BLACK);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPannel(addEmployee);
            }
        });
        add.setFont(new Font("Roboto", Font.BOLD, 15));
        add.setBounds(0, 0, 140, 52);
        panel_1_1.add(add);

        JButton btnRemoveEmplyee = new JButton("Search Emplyee");
        btnRemoveEmplyee.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                table.setModel(getDetails.searchData("employee"));
                ResultSet data = getDetails.whereOneCond("empid", "empid");
                try {
                    data.next();
                    empcount.setText(data.getString("count"));
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                ResultSet data1 = getDetails.whereOneCond("dept", "'Marketing'");
                try {
                    data1.next();
                    mc.setText(data1.getString("count"));
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                ResultSet data2 = getDetails.whereOneCond("dept", "'Administration'");
                try {
                    data2.next();
                    adc.setText(data2.getString("count"));
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                ResultSet data3 = getDetails.whereOneCond("dept", "'Accounting'");
                try {
                    data3.next();
                    ac.setText(data3.getString("count"));
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                ResultSet data4 = getDetails.whereOneCond("dept", "'QualityManagement'");
                try {
                    data4.next();
                    qc.setText(data4.getString("count"));
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                ResultSet data5 = getDetails.whereOneCond("dept", "'Computer Science'");
                try {
                    data5.next();
                    cc.setText(data5.getString("count"));
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                ResultSet data6 = getDetails.whereOneCond("dept", "'Programming'");
                try {
                    data6.next();
                    pc.setText(data6.getString("count"));
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
        btnRemoveEmplyee.setBackground(new Color(224, 255, 255));
        btnRemoveEmplyee.setForeground(Color.BLACK);
        btnRemoveEmplyee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPannel(Search);
            }
        });
        btnRemoveEmplyee.setFont(new Font("Roboto", Font.BOLD, 15));
        btnRemoveEmplyee.setBounds(140, 0, 150, 52);
        panel_1_1.add(btnRemoveEmplyee);

        update = new JButton("Update Employee");
        update.setBackground(new Color(224, 255, 255));
        update.setForeground(Color.BLACK);
        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPannel(updateEmployee);
            }
        });
        update.setFont(new Font("Roboto", Font.BOLD, 15));
        update.setBounds(290, 0, 160, 52);
        panel_1_1.add(update);

        rempanel = new JButton("Remove Employee");
        btnRemoveEmplyee.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                remEmp.setModel(getDetails.searchData("employee"));
            }
        });
        rempanel.setBackground(new Color(224, 255, 255));
        rempanel.setForeground(Color.BLACK);
        rempanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPannel(remove);
            }
        });
        rempanel.setFont(new Font("Roboto", Font.BOLD, 15));
        rempanel.setBounds(450, 0, 170, 52);
        panel_1_1.add(rempanel);

        JButton btnQueries = new JButton("Queries");
        btnQueries.setBackground(new Color(224, 255, 255));
        btnQueries.setForeground(Color.BLACK);
        btnQueries.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPannel(query);
            }
        });
        btnQueries.setFont(new Font("Roboto", Font.BOLD, 15));
        btnQueries.setBounds(620, 0, 150, 52);
        panel_1_1.add(btnQueries);

        JButton btnTest = new JButton("Test ");
        btnTest.setBackground(new Color(224, 255, 255));
        btnTest.setForeground(Color.BLACK);
        btnTest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPannel(take_test);
            }
        });
        btnTest.setFont(new Font("Roboto", Font.BOLD, 15));
        btnTest.setBounds(768, 0, 130, 52);
        panel_1_1.add(btnTest);

        JButton btnTraining = new JButton("Training");
        btnTraining.setBackground(new Color(224, 255, 255));
        btnTraining.setForeground(Color.BLACK);
        btnTraining.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPannel(Training);
            }
        });
        btnTraining.setFont(new Font("Roboto", Font.BOLD, 15));
        btnTraining.setBounds(898, 0, 155, 52);
        panel_1_1.add(btnTraining);

        JMenuBar menuBar = new JMenuBar();
        frmHrManagement.setJMenuBar(menuBar);

        JMenu mnNewMenu = new JMenu("File");
        menuBar.add(mnNewMenu);

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
        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Logout");
        mntmNewMenuItem_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Authentic frame = new Authentic();
                frame.setVisible(true);
                frmHrManagement.dispose();
            }
        });
        mnNewMenu.add(mntmNewMenuItem_5);
    }

    public void switchPannel(JPanel pan) {
        layeredPane.removeAll();
        layeredPane.add(pan);
        layeredPane.repaint();
        layeredPane.revalidate();
    }

    public void setProfile(String a) {
        String eid = a;
        getDetails prof = new getDetails(eid);
        lblNewLabel_1_5_4.setText(prof.getName());
        lblNewLabel_1_1.setText(prof.getDob());
        if (prof.getrole().equals("Admin")) {
            lblNewLabel_1_5_7.setText("Admin");
        } else {
            lblNewLabel_1_5_7.setText("Employee");
             add.setEnabled(false);
             update.setEnabled(false);
             rempanel.setEnabled(false);
        }
        lblNewLabel_1_2.setText(prof.getphno());
        lblNewLabel_1_5_5.setText(prof.getEmail());
        lblNewLabel_1_5_6.setText(prof.getdepart());
        lblNewLabel_1_4.setText(prof.getaddress());

        if (prof.getGender().equals("Male")) {
            lblNewLabel_1_3.setText("Male");
        } else {
            lblNewLabel_1_3.setText("Female");
        }
        lblNewLabel_1.setText(eid);
        lblNewLabel_1_5_21.setText(prof.getdepartid());
        lblNewLabel_1_5_22.setText(prof.getqualify());
        lblNewLabel_1_5_23.setText(prof.getdatej());
        lblNewLabel_1_5_24.setText(prof.getsalary());
        score1.setText(prof.gets1());
        score2.setText(prof.gets2());
        train.setText(prof.gett());
        addtrain.setText(prof.gett2());
    }
}