import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;


public class prototype extends JFrame {

	private JPanel contentPane;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prototype frame = new prototype();
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
	public prototype() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		contentPane.add(panel, "name_50788888364615");
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton btnNewButton = new JButton("CUSTOMERS");
		btnNewButton.setForeground(new Color(0, 0, 102));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton, 142, SpringLayout.WEST, panel);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DEBTORS");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, btnNewButton_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, 0, SpringLayout.SOUTH, btnNewButton_1);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_1, -126, SpringLayout.EAST, panel);
		btnNewButton_1.setForeground(new Color(0, 0, 102));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("INSURANCE COMPANIES");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_2, 224, SpringLayout.NORTH, panel);
		btnNewButton_2.setForeground(new Color(0, 0, 102));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2, 186, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2, 114, SpringLayout.WEST, panel);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("BANKS");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_3, 186, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -31, SpringLayout.NORTH, btnNewButton_3);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_3, 104, SpringLayout.EAST, btnNewButton_2);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_3, -72, SpringLayout.SOUTH, panel);
		btnNewButton_3.setForeground(new Color(0, 0, 102));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
				cl.next(contentPane);
			}
		});
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_63 = new JLabel("MAIN MENU");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_1, 46, SpringLayout.SOUTH, lblNewLabel_63);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_63, 21, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_63, 193, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_63, -225, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_63, -192, SpringLayout.EAST, panel);
		lblNewLabel_63.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_63.setForeground(new Color(0, 0, 102));
		panel.add(lblNewLabel_63);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "name_50790408448602");
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JButton btnBack = new JButton("Back");
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, panel_1);
		btnBack.setForeground(new Color(0, 0, 102));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel_1.putConstraint(SpringLayout.EAST, btnBack, -38, SpringLayout.EAST, panel_1);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
			}
		});
		panel_1.add(btnBack);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_panel_1.putConstraint(SpringLayout.SOUTH, scrollPane, -56, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, scrollPane, 23, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, scrollPane, -21, SpringLayout.EAST, panel_1);
		panel_1.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setColumnHeaderView(list);
		
		JButton btnNewButton_5 = new JButton("ADD");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_5, 202, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_5, 121, SpringLayout.WEST, panel_1);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
			}
		});
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("DELETE");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_6, 0, SpringLayout.NORTH, btnBack);
		btnNewButton_6.setForeground(new Color(0, 0, 102));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_1.add(btnNewButton_6);
		
		JLabel lblCustomers = new JLabel("Customers");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblCustomers, 238, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblCustomers, -229, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, scrollPane, 24, SpringLayout.SOUTH, lblCustomers);
		lblCustomers.setForeground(new Color(0, 0, 102));
		lblCustomers.setFont(new Font("Tahoma", Font.BOLD, 18));
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblCustomers, 44, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblCustomers, 10, SpringLayout.NORTH, panel_1);
		panel_1.add(lblCustomers);
		
		JButton btnView = new JButton("VIEW");
		sl_panel_1.putConstraint(SpringLayout.WEST, btnView, 198, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton_6, -17, SpringLayout.WEST, btnView);
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnView, 0, SpringLayout.NORTH, btnBack);
		btnView.setForeground(new Color(0, 0, 102));
		btnView.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
				cl.next(contentPane);
				
			}
		});
		panel_1.add(btnView);
		
		JLabel lblNewLabel_64 = new JLabel("Name");
		lblNewLabel_64.setForeground(new Color(0, 0, 102));
		lblNewLabel_64.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_64, 29, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_64, -6, SpringLayout.NORTH, scrollPane);
		panel_1.add(lblNewLabel_64);
		
		JLabel lblNewLabel_65 = new JLabel("ID");
		lblNewLabel_65.setForeground(new Color(0, 0, 102));
		lblNewLabel_65.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_65, 0, SpringLayout.NORTH, lblNewLabel_64);
		panel_1.add(lblNewLabel_65);
		
		JLabel lblNewLabel_66 = new JLabel("Tel1");
		lblNewLabel_66.setForeground(new Color(0, 0, 102));
		lblNewLabel_66.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_65, -25, SpringLayout.WEST, lblNewLabel_66);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_66, 0, SpringLayout.WEST, btnNewButton_5);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_66, -6, SpringLayout.NORTH, scrollPane);
		panel_1.add(lblNewLabel_66);
		
		JLabel lblNewLabel_67 = new JLabel("Tel2");
		lblNewLabel_67.setForeground(new Color(0, 0, 102));
		lblNewLabel_67.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_67, 0, SpringLayout.NORTH, lblNewLabel_64);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_67, 35, SpringLayout.EAST, lblNewLabel_66);
		panel_1.add(lblNewLabel_67);
		
		JLabel lblNewLabel_68 = new JLabel("Address");
		lblNewLabel_68.setForeground(new Color(0, 0, 102));
		lblNewLabel_68.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_68, 6, SpringLayout.SOUTH, lblCustomers);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_68, 0, SpringLayout.WEST, lblCustomers);
		panel_1.add(lblNewLabel_68);
		
		JLabel lblNewLabel_69 = new JLabel("Email");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_69, 6, SpringLayout.SOUTH, lblCustomers);
		lblNewLabel_69.setForeground(new Color(0, 0, 102));
		lblNewLabel_69.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblNewLabel_69);
		
		JLabel lblNewLabel_70 = new JLabel("Date of Birth");
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_69, -22, SpringLayout.WEST, lblNewLabel_70);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_70, 0, SpringLayout.NORTH, lblNewLabel_64);
		lblNewLabel_70.setForeground(new Color(0, 0, 102));
		lblNewLabel_70.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblNewLabel_70);
		
		JLabel lblNewLabel_71 = new JLabel("Type of Insurance");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_71, 467, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_70, -13, SpringLayout.WEST, lblNewLabel_71);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_71, -6, SpringLayout.NORTH, scrollPane);
		lblNewLabel_71.setForeground(new Color(0, 0, 102));
		lblNewLabel_71.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblNewLabel_71);
		
		JButton btnNewButton_29 = new JButton("ADD");
		btnNewButton_29.setForeground(new Color(0, 0, 102));
		btnNewButton_29.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_29, 2, SpringLayout.NORTH, btnBack);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton_29, -22, SpringLayout.WEST, btnNewButton_6);
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
			}
		});
		panel_1.add(btnNewButton_29);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, "name_50792032574777");
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JButton btnNewButton_4 = new JButton("Back");
		sl_panel_2.putConstraint(SpringLayout.EAST, btnNewButton_4, -68, SpringLayout.EAST, panel_2);
		btnNewButton_4.setForeground(new Color(0, 0, 102));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
		
			}
		});
		panel_2.add(btnNewButton_4);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setForeground(new Color(0, 0, 102));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 29, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_3, 28, SpringLayout.WEST, panel_2);
		panel_2.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_3, 0, SpringLayout.NORTH, lblNewLabel_3);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_3, 31, SpringLayout.EAST, lblNewLabel_3);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("ID");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 23, SpringLayout.SOUTH, lblNewLabel_3);
		lblNewLabel_4.setForeground(new Color(0, 0, 102));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, lblNewLabel_3);
		panel_2.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_4, -1, SpringLayout.NORTH, lblNewLabel_4);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, textField_3);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Tel1");
		lblNewLabel_5.setForeground(new Color(0, 0, 102));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 59, SpringLayout.SOUTH, lblNewLabel_3);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_5, 0, SpringLayout.WEST, lblNewLabel_3);
		panel_2.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_5, -3, SpringLayout.NORTH, lblNewLabel_5);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_5, 0, SpringLayout.EAST, textField_3);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("SAVE");
		sl_panel_2.putConstraint(SpringLayout.SOUTH, btnNewButton_8, -28, SpringLayout.SOUTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton_4, 0, SpringLayout.NORTH, btnNewButton_8);
		btnNewButton_8.setForeground(new Color(0, 0, 102));
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_2.putConstraint(SpringLayout.WEST, btnNewButton_8, 115, SpringLayout.WEST, panel_2);
		panel_2.add(btnNewButton_8);
		
		JLabel lblNewLabel = new JLabel("Tel2");
		lblNewLabel.setForeground(new Color(0, 0, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel, 22, SpringLayout.SOUTH, lblNewLabel_5);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblNewLabel_3);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setForeground(new Color(0, 0, 102));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 15, SpringLayout.SOUTH, lblNewLabel);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel_3);
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textField, 0, SpringLayout.SOUTH, lblNewLabel);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_3);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField_3);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setForeground(new Color(0, 0, 102));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_2, 101, SpringLayout.EAST, textField_3);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 0, SpringLayout.SOUTH, lblNewLabel_3);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Date of Birth");
		lblNewLabel_6.setForeground(new Color(0, 0, 102));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, lblNewLabel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_6, 0, SpringLayout.SOUTH, lblNewLabel_4);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Type of Insurance");
		lblNewLabel_7.setForeground(new Color(0, 0, 102));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_7, 0, SpringLayout.NORTH, lblNewLabel_5);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_7, 0, SpringLayout.WEST, lblNewLabel_2);
		panel_2.add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_2, -1, SpringLayout.NORTH, lblNewLabel_3);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_6 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField_6);
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_6, -1, SpringLayout.NORTH, lblNewLabel_4);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_6, 0, SpringLayout.EAST, textField_7);
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_7, -1, SpringLayout.NORTH, lblNewLabel_5);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_7, 10, SpringLayout.EAST, lblNewLabel_7);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, "name_50793456859592");
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);
		
		JLabel lblNewLabel_8 = new JLabel("Name");
		lblNewLabel_8.setForeground(new Color(0, 0, 102));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_8, 29, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_8, 36, SpringLayout.WEST, panel_3);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("ID");
		lblNewLabel_9.setForeground(new Color(0, 0, 102));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_9, 20, SpringLayout.SOUTH, lblNewLabel_8);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_9, 0, SpringLayout.WEST, lblNewLabel_8);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Tel1");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_10, 20, SpringLayout.SOUTH, lblNewLabel_9);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_10, 0, SpringLayout.WEST, lblNewLabel_8);
		lblNewLabel_10.setForeground(new Color(0, 0, 102));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_3.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Tel2");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_11, 20, SpringLayout.SOUTH, lblNewLabel_10);
		lblNewLabel_11.setForeground(new Color(0, 0, 102));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_11, 0, SpringLayout.WEST, lblNewLabel_8);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Address");
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_12, 0, SpringLayout.WEST, lblNewLabel_8);
		lblNewLabel_12.setForeground(new Color(0, 0, 102));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Email");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_13, 0, SpringLayout.NORTH, lblNewLabel_8);
		lblNewLabel_13.setForeground(new Color(0, 0, 102));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_3.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Date of Birth");
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_13, 0, SpringLayout.WEST, lblNewLabel_14);
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_14, 0, SpringLayout.NORTH, lblNewLabel_9);
		lblNewLabel_14.setForeground(new Color(0, 0, 102));
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_3.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Type of Insurance");
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_14, 0, SpringLayout.WEST, lblNewLabel_15);
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_15, 0, SpringLayout.NORTH, lblNewLabel_10);
		lblNewLabel_15.setForeground(new Color(0, 0, 102));
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_3.add(lblNewLabel_15);
		
		textField_8 = new JTextField();
		sl_panel_3.putConstraint(SpringLayout.NORTH, textField_8, 0, SpringLayout.NORTH, lblNewLabel_8);
		sl_panel_3.putConstraint(SpringLayout.WEST, textField_8, 29, SpringLayout.EAST, lblNewLabel_8);
		panel_3.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		sl_panel_3.putConstraint(SpringLayout.SOUTH, textField_9, 0, SpringLayout.SOUTH, lblNewLabel_9);
		sl_panel_3.putConstraint(SpringLayout.EAST, textField_9, 0, SpringLayout.EAST, textField_8);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		sl_panel_3.putConstraint(SpringLayout.NORTH, textField_10, 20, SpringLayout.SOUTH, textField_9);
		sl_panel_3.putConstraint(SpringLayout.EAST, textField_10, 0, SpringLayout.EAST, textField_8);
		panel_3.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		sl_panel_3.putConstraint(SpringLayout.NORTH, textField_11, 0, SpringLayout.NORTH, lblNewLabel_11);
		sl_panel_3.putConstraint(SpringLayout.EAST, textField_11, 0, SpringLayout.EAST, textField_8);
		panel_3.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		sl_panel_3.putConstraint(SpringLayout.NORTH, textField_12, 18, SpringLayout.SOUTH, textField_11);
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_12, 1, SpringLayout.NORTH, textField_12);
		sl_panel_3.putConstraint(SpringLayout.EAST, textField_12, 0, SpringLayout.EAST, textField_8);
		panel_3.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		sl_panel_3.putConstraint(SpringLayout.NORTH, textField_13, 0, SpringLayout.NORTH, lblNewLabel_8);
		sl_panel_3.putConstraint(SpringLayout.WEST, textField_13, 372, SpringLayout.WEST, panel_3);
		panel_3.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		sl_panel_3.putConstraint(SpringLayout.EAST, textField_14, -142, SpringLayout.EAST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.NORTH, textField_14, 0, SpringLayout.NORTH, lblNewLabel_9);
		panel_3.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		sl_panel_3.putConstraint(SpringLayout.EAST, lblNewLabel_15, -6, SpringLayout.WEST, textField_15);
		sl_panel_3.putConstraint(SpringLayout.WEST, textField_15, 0, SpringLayout.WEST, textField_13);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, textField_15, 0, SpringLayout.SOUTH, textField_10);
		panel_3.add(textField_15);
		textField_15.setColumns(10);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.setForeground(new Color(0, 0, 102));
		btnBack_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_3.putConstraint(SpringLayout.EAST, btnBack_1, -119, SpringLayout.EAST, panel_3);
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
				cl.previous(contentPane);
		
			}
		});
		panel_3.add(btnBack_1);
		
		JButton btnNewButton_14 = new JButton("AMEND");
		btnNewButton_14.setForeground(new Color(0, 0, 102));
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_3.putConstraint(SpringLayout.SOUTH, btnNewButton_14, -22, SpringLayout.SOUTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.NORTH, btnBack_1, 0, SpringLayout.NORTH, btnNewButton_14);
		sl_panel_3.putConstraint(SpringLayout.WEST, btnNewButton_14, 153, SpringLayout.WEST, panel_3);
		panel_3.add(btnNewButton_14);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, "name_50799248911408");
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);
		
		JLabel lblNewLabel_16 = new JLabel("Debtors");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNewLabel_16, 10, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_16, 234, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lblNewLabel_16, 35, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, lblNewLabel_16, -202, SpringLayout.EAST, panel_4);
		lblNewLabel_16.setForeground(new Color(0, 0, 102));
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_4.add(lblNewLabel_16);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		sl_panel_4.putConstraint(SpringLayout.WEST, scrollPane_1, 29, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, scrollPane_1, -28, SpringLayout.EAST, panel_4);
		panel_4.add(scrollPane_1);
		
		JList list_1 = new JList();
		scrollPane_1.setColumnHeaderView(list_1);
		
		JButton btnNewButton_9 = new JButton("ADD");
		sl_panel_4.putConstraint(SpringLayout.SOUTH, btnNewButton_9, -10, SpringLayout.SOUTH, panel_4);
		btnNewButton_9.setForeground(new Color(0, 0, 102));
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_4.putConstraint(SpringLayout.SOUTH, scrollPane_1, -50, SpringLayout.NORTH, btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
			}
		});
		panel_4.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("DELETE");
		sl_panel_4.putConstraint(SpringLayout.NORTH, btnNewButton_10, 0, SpringLayout.NORTH, btnNewButton_9);
		sl_panel_4.putConstraint(SpringLayout.WEST, btnNewButton_10, 18, SpringLayout.EAST, btnNewButton_9);
		btnNewButton_10.setForeground(new Color(0, 0, 102));
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("VIEW");
		btnNewButton_11.setForeground(new Color(0, 0, 102));
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_4.putConstraint(SpringLayout.SOUTH, btnNewButton_11, -10, SpringLayout.SOUTH, panel_4);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
				cl.next(contentPane);
			}
		});
		panel_4.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("Back");
		btnNewButton_13.setForeground(new Color(0, 0, 102));
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_4.putConstraint(SpringLayout.SOUTH, btnNewButton_13, -10, SpringLayout.SOUTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, btnNewButton_13, -57, SpringLayout.EAST, panel_4);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
			}
		});
		panel_4.add(btnNewButton_13);
		
		JLabel lblNewLabel_72 = new JLabel("Description");
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lblNewLabel_72, -226, SpringLayout.SOUTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.NORTH, scrollPane_1, 6, SpringLayout.SOUTH, lblNewLabel_72);
		sl_panel_4.putConstraint(SpringLayout.EAST, btnNewButton_9, 0, SpringLayout.EAST, lblNewLabel_72);
		lblNewLabel_72.setForeground(new Color(0, 0, 102));
		lblNewLabel_72.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_72, 0, SpringLayout.WEST, scrollPane_1);
		panel_4.add(lblNewLabel_72);
		
		JLabel lblNewLabel_73 = new JLabel("Receipt No.");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNewLabel_73, 0, SpringLayout.NORTH, lblNewLabel_72);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_73, 7, SpringLayout.EAST, lblNewLabel_72);
		lblNewLabel_73.setForeground(new Color(0, 0, 102));
		lblNewLabel_73.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblNewLabel_73);
		
		JLabel lblNewLabel_74 = new JLabel("Name");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNewLabel_74, 0, SpringLayout.NORTH, lblNewLabel_72);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_74, 11, SpringLayout.EAST, lblNewLabel_73);
		lblNewLabel_74.setForeground(new Color(0, 0, 102));
		lblNewLabel_74.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblNewLabel_74);
		
		JLabel lblNewLabel_75 = new JLabel("Address");
		sl_panel_4.putConstraint(SpringLayout.EAST, btnNewButton_11, 0, SpringLayout.EAST, lblNewLabel_75);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_75, 0, SpringLayout.WEST, lblNewLabel_16);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lblNewLabel_75, -6, SpringLayout.NORTH, scrollPane_1);
		lblNewLabel_75.setForeground(new Color(0, 0, 102));
		lblNewLabel_75.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblNewLabel_75);
		
		JLabel lblNewLabel_76 = new JLabel("Tel1");
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_76, 12, SpringLayout.EAST, lblNewLabel_75);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lblNewLabel_76, -6, SpringLayout.NORTH, scrollPane_1);
		lblNewLabel_76.setForeground(new Color(0, 0, 102));
		lblNewLabel_76.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblNewLabel_76);
		
		JLabel lblNewLabel_77 = new JLabel("Tel2");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNewLabel_77, 0, SpringLayout.NORTH, lblNewLabel_72);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_77, 6, SpringLayout.EAST, lblNewLabel_76);
		lblNewLabel_77.setForeground(new Color(0, 0, 102));
		lblNewLabel_77.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblNewLabel_77);
		
		JLabel lblNewLabel_78 = new JLabel("ID");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNewLabel_78, 0, SpringLayout.NORTH, lblNewLabel_72);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_78, 22, SpringLayout.EAST, lblNewLabel_77);
		lblNewLabel_78.setForeground(new Color(0, 0, 102));
		lblNewLabel_78.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblNewLabel_78);
		
		JLabel lblNewLabel_79 = new JLabel("Date");
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_79, 16, SpringLayout.EAST, lblNewLabel_78);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lblNewLabel_79, -6, SpringLayout.NORTH, scrollPane_1);
		lblNewLabel_79.setForeground(new Color(0, 0, 102));
		lblNewLabel_79.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblNewLabel_79);
		
		JLabel lblNewLabel_80 = new JLabel("Debit");
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_80, 6, SpringLayout.EAST, lblNewLabel_79);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lblNewLabel_80, -6, SpringLayout.NORTH, scrollPane_1);
		lblNewLabel_80.setForeground(new Color(0, 0, 102));
		lblNewLabel_80.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblNewLabel_80);
		
		JLabel lblNewLabel_81 = new JLabel("Credit");
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_81, 6, SpringLayout.EAST, lblNewLabel_80);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lblNewLabel_81, -6, SpringLayout.NORTH, scrollPane_1);
		lblNewLabel_81.setForeground(new Color(0, 0, 102));
		lblNewLabel_81.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblNewLabel_81);
		
		JLabel lblNewLabel_82 = new JLabel("Balance");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNewLabel_82, 0, SpringLayout.NORTH, lblNewLabel_72);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_82, 6, SpringLayout.EAST, lblNewLabel_81);
		lblNewLabel_82.setForeground(new Color(0, 0, 102));
		lblNewLabel_82.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblNewLabel_82);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5, "name_50800801481888");
		SpringLayout sl_panel_5 = new SpringLayout();
		panel_5.setLayout(sl_panel_5);
		
		JLabel lblNewLabel_17 = new JLabel("Description");
		lblNewLabel_17.setForeground(new Color(0, 0, 102));
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNewLabel_17, 36, SpringLayout.NORTH, panel_5);
		sl_panel_5.putConstraint(SpringLayout.WEST, lblNewLabel_17, 32, SpringLayout.WEST, panel_5);
		panel_5.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Receipt No");
		lblNewLabel_18.setForeground(new Color(0, 0, 102));
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNewLabel_18, 25, SpringLayout.SOUTH, lblNewLabel_17);
		sl_panel_5.putConstraint(SpringLayout.WEST, lblNewLabel_18, 0, SpringLayout.WEST, lblNewLabel_17);
		panel_5.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Name");
		lblNewLabel_19.setForeground(new Color(0, 0, 102));
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNewLabel_19, 23, SpringLayout.SOUTH, lblNewLabel_18);
		sl_panel_5.putConstraint(SpringLayout.EAST, lblNewLabel_19, 0, SpringLayout.EAST, lblNewLabel_17);
		panel_5.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Address");
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNewLabel_20, 26, SpringLayout.SOUTH, lblNewLabel_19);
		lblNewLabel_20.setForeground(new Color(0, 0, 102));
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Tel1");
		lblNewLabel_21.setForeground(new Color(0, 0, 102));
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNewLabel_21, 189, SpringLayout.NORTH, panel_5);
		sl_panel_5.putConstraint(SpringLayout.EAST, lblNewLabel_21, 0, SpringLayout.EAST, lblNewLabel_17);
		panel_5.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Tel2");
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNewLabel_22, 19, SpringLayout.SOUTH, lblNewLabel_21);
		sl_panel_5.putConstraint(SpringLayout.EAST, lblNewLabel_22, 0, SpringLayout.EAST, lblNewLabel_17);
		lblNewLabel_22.setForeground(new Color(0, 0, 102));
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("ID");
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNewLabel_23, 0, SpringLayout.NORTH, lblNewLabel_17);
		lblNewLabel_23.setForeground(new Color(0, 0, 102));
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Date");
		sl_panel_5.putConstraint(SpringLayout.WEST, lblNewLabel_23, 0, SpringLayout.WEST, lblNewLabel_24);
		sl_panel_5.putConstraint(SpringLayout.EAST, lblNewLabel_23, -4, SpringLayout.EAST, lblNewLabel_24);
		lblNewLabel_24.setForeground(new Color(0, 0, 102));
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_5.putConstraint(SpringLayout.EAST, lblNewLabel_24, -285, SpringLayout.EAST, panel_5);
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNewLabel_24, 0, SpringLayout.NORTH, lblNewLabel_18);
		panel_5.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Debit");
		lblNewLabel_25.setForeground(new Color(0, 0, 102));
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNewLabel_25, 0, SpringLayout.NORTH, lblNewLabel_19);
		sl_panel_5.putConstraint(SpringLayout.EAST, lblNewLabel_25, -285, SpringLayout.EAST, panel_5);
		panel_5.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Credit");
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNewLabel_26, 0, SpringLayout.NORTH, lblNewLabel_20);
		sl_panel_5.putConstraint(SpringLayout.WEST, lblNewLabel_26, 0, SpringLayout.WEST, lblNewLabel_23);
		lblNewLabel_26.setForeground(new Color(0, 0, 102));
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Balances");
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNewLabel_27, 0, SpringLayout.NORTH, lblNewLabel_21);
		sl_panel_5.putConstraint(SpringLayout.WEST, lblNewLabel_27, 0, SpringLayout.WEST, lblNewLabel_23);
		lblNewLabel_27.setForeground(new Color(0, 0, 102));
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(lblNewLabel_27);
		
		textField_16 = new JTextField();
		sl_panel_5.putConstraint(SpringLayout.NORTH, textField_16, -2, SpringLayout.NORTH, lblNewLabel_17);
		sl_panel_5.putConstraint(SpringLayout.WEST, textField_16, 37, SpringLayout.EAST, lblNewLabel_17);
		panel_5.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		sl_panel_5.putConstraint(SpringLayout.NORTH, textField_17, -2, SpringLayout.NORTH, lblNewLabel_18);
		sl_panel_5.putConstraint(SpringLayout.EAST, textField_17, 0, SpringLayout.EAST, textField_16);
		panel_5.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		sl_panel_5.putConstraint(SpringLayout.NORTH, textField_18, 0, SpringLayout.NORTH, lblNewLabel_19);
		sl_panel_5.putConstraint(SpringLayout.WEST, textField_18, 37, SpringLayout.EAST, lblNewLabel_19);
		panel_5.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		sl_panel_5.putConstraint(SpringLayout.NORTH, textField_19, 19, SpringLayout.SOUTH, textField_18);
		sl_panel_5.putConstraint(SpringLayout.EAST, lblNewLabel_20, -37, SpringLayout.WEST, textField_19);
		sl_panel_5.putConstraint(SpringLayout.WEST, textField_19, 0, SpringLayout.WEST, textField_16);
		panel_5.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		sl_panel_5.putConstraint(SpringLayout.NORTH, textField_20, -2, SpringLayout.NORTH, lblNewLabel_21);
		sl_panel_5.putConstraint(SpringLayout.WEST, textField_20, 0, SpringLayout.WEST, textField_16);
		panel_5.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		sl_panel_5.putConstraint(SpringLayout.NORTH, textField_21, -2, SpringLayout.NORTH, lblNewLabel_22);
		sl_panel_5.putConstraint(SpringLayout.EAST, textField_21, 0, SpringLayout.EAST, textField_16);
		panel_5.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		sl_panel_5.putConstraint(SpringLayout.NORTH, textField_22, 0, SpringLayout.NORTH, lblNewLabel_17);
		sl_panel_5.putConstraint(SpringLayout.WEST, textField_22, 352, SpringLayout.WEST, panel_5);
		panel_5.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		sl_panel_5.putConstraint(SpringLayout.NORTH, textField_23, 0, SpringLayout.NORTH, lblNewLabel_18);
		sl_panel_5.putConstraint(SpringLayout.EAST, textField_23, 0, SpringLayout.EAST, textField_22);
		panel_5.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		sl_panel_5.putConstraint(SpringLayout.EAST, textField_24, -160, SpringLayout.EAST, panel_5);
		sl_panel_5.putConstraint(SpringLayout.NORTH, textField_24, 0, SpringLayout.NORTH, lblNewLabel_19);
		panel_5.add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		sl_panel_5.putConstraint(SpringLayout.NORTH, textField_25, -2, SpringLayout.NORTH, lblNewLabel_20);
		sl_panel_5.putConstraint(SpringLayout.EAST, textField_25, 0, SpringLayout.EAST, textField_22);
		panel_5.add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		sl_panel_5.putConstraint(SpringLayout.NORTH, textField_26, 13, SpringLayout.SOUTH, textField_25);
		sl_panel_5.putConstraint(SpringLayout.WEST, textField_26, 0, SpringLayout.WEST, textField_22);
		panel_5.add(textField_26);
		textField_26.setColumns(10);
		
		JButton btnBack_2 = new JButton("Back");
		btnBack_2.setForeground(new Color(0, 0, 102));
		btnBack_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_5.putConstraint(SpringLayout.EAST, btnBack_2, -97, SpringLayout.EAST, panel_5);
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
			}
		});
		panel_5.add(btnBack_2);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setForeground(new Color(0, 0, 102));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_5.putConstraint(SpringLayout.SOUTH, btnSave, -6, SpringLayout.SOUTH, panel_5);
		sl_panel_5.putConstraint(SpringLayout.NORTH, btnBack_2, 0, SpringLayout.NORTH, btnSave);
		sl_panel_5.putConstraint(SpringLayout.WEST, btnSave, 0, SpringLayout.WEST, textField_16);
		panel_5.add(btnSave);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6, "name_50804640068807");
		SpringLayout sl_panel_6 = new SpringLayout();
		panel_6.setLayout(sl_panel_6);
		
		JButton btnBack_3 = new JButton("Back");
		sl_panel_6.putConstraint(SpringLayout.EAST, btnBack_3, -113, SpringLayout.EAST, panel_6);
		btnBack_3.setForeground(new Color(0, 0, 102));
		btnBack_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
				cl.previous(contentPane);
			}
		});
		panel_6.add(btnBack_3);
		
		JButton btnNewButton_7 = new JButton("AMEND");
		sl_panel_6.putConstraint(SpringLayout.NORTH, btnBack_3, 0, SpringLayout.NORTH, btnNewButton_7);
		sl_panel_6.putConstraint(SpringLayout.WEST, btnNewButton_7, 104, SpringLayout.WEST, panel_6);
		btnNewButton_7.setForeground(new Color(0, 0, 102));
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(btnNewButton_7);
		
		JLabel lblNewLabel_28 = new JLabel("Description");
		lblNewLabel_28.setForeground(new Color(0, 0, 102));
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblNewLabel_28, 10, SpringLayout.NORTH, panel_6);
		sl_panel_6.putConstraint(SpringLayout.WEST, lblNewLabel_28, 25, SpringLayout.WEST, panel_6);
		panel_6.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Receipt No.");
		lblNewLabel_29.setForeground(new Color(0, 0, 102));
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblNewLabel_29, 24, SpringLayout.SOUTH, lblNewLabel_28);
		sl_panel_6.putConstraint(SpringLayout.EAST, lblNewLabel_29, 0, SpringLayout.EAST, lblNewLabel_28);
		panel_6.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Name");
		lblNewLabel_30.setForeground(new Color(0, 0, 102));
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblNewLabel_30, 23, SpringLayout.SOUTH, lblNewLabel_29);
		sl_panel_6.putConstraint(SpringLayout.WEST, lblNewLabel_30, 0, SpringLayout.WEST, lblNewLabel_28);
		panel_6.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("Address");
		sl_panel_6.putConstraint(SpringLayout.WEST, lblNewLabel_31, 0, SpringLayout.WEST, lblNewLabel_28);
		lblNewLabel_31.setForeground(new Color(0, 0, 102));
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("Tel1");
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblNewLabel_32, 25, SpringLayout.SOUTH, lblNewLabel_31);
		lblNewLabel_32.setForeground(new Color(0, 0, 102));
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_6.putConstraint(SpringLayout.WEST, lblNewLabel_32, 0, SpringLayout.WEST, lblNewLabel_28);
		panel_6.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("Tel2");
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblNewLabel_33, 23, SpringLayout.SOUTH, lblNewLabel_32);
		sl_panel_6.putConstraint(SpringLayout.WEST, lblNewLabel_33, 0, SpringLayout.WEST, lblNewLabel_28);
		lblNewLabel_33.setForeground(new Color(0, 0, 102));
		lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(lblNewLabel_33);
		
		textField_27 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_27, 0, SpringLayout.NORTH, lblNewLabel_28);
		sl_panel_6.putConstraint(SpringLayout.WEST, textField_27, 41, SpringLayout.EAST, lblNewLabel_28);
		panel_6.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_28, 0, SpringLayout.NORTH, lblNewLabel_29);
		sl_panel_6.putConstraint(SpringLayout.EAST, textField_28, 0, SpringLayout.EAST, textField_27);
		panel_6.add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_29, 21, SpringLayout.SOUTH, textField_28);
		sl_panel_6.putConstraint(SpringLayout.WEST, textField_29, 0, SpringLayout.WEST, textField_27);
		panel_6.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_30, 15, SpringLayout.SOUTH, textField_29);
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblNewLabel_31, 2, SpringLayout.NORTH, textField_30);
		sl_panel_6.putConstraint(SpringLayout.WEST, textField_30, 0, SpringLayout.WEST, textField_27);
		panel_6.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_31, 0, SpringLayout.NORTH, lblNewLabel_32);
		sl_panel_6.putConstraint(SpringLayout.EAST, textField_31, 0, SpringLayout.EAST, textField_27);
		panel_6.add(textField_31);
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.NORTH, btnNewButton_7, 24, SpringLayout.SOUTH, textField_32);
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_32, -2, SpringLayout.NORTH, lblNewLabel_33);
		sl_panel_6.putConstraint(SpringLayout.WEST, textField_32, 0, SpringLayout.WEST, textField_27);
		panel_6.add(textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_33, 0, SpringLayout.NORTH, lblNewLabel_28);
		sl_panel_6.putConstraint(SpringLayout.EAST, textField_33, -129, SpringLayout.EAST, panel_6);
		panel_6.add(textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_34, 0, SpringLayout.NORTH, lblNewLabel_29);
		sl_panel_6.putConstraint(SpringLayout.EAST, textField_34, -129, SpringLayout.EAST, panel_6);
		panel_6.add(textField_34);
		textField_34.setColumns(10);
		
		textField_35 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_35, 0, SpringLayout.NORTH, lblNewLabel_30);
		sl_panel_6.putConstraint(SpringLayout.EAST, textField_35, -129, SpringLayout.EAST, panel_6);
		panel_6.add(textField_35);
		textField_35.setColumns(10);
		
		textField_36 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_36, 23, SpringLayout.SOUTH, textField_35);
		sl_panel_6.putConstraint(SpringLayout.EAST, textField_36, -129, SpringLayout.EAST, panel_6);
		panel_6.add(textField_36);
		textField_36.setColumns(10);
		
		textField_37 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_37, 0, SpringLayout.NORTH, lblNewLabel_32);
		sl_panel_6.putConstraint(SpringLayout.WEST, textField_37, 0, SpringLayout.WEST, textField_33);
		panel_6.add(textField_37);
		textField_37.setColumns(10);
		
		JLabel lblNewLabel_34 = new JLabel("ID");
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblNewLabel_34, 0, SpringLayout.NORTH, lblNewLabel_28);
		lblNewLabel_34.setForeground(new Color(0, 0, 102));
		lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("Date");
		sl_panel_6.putConstraint(SpringLayout.EAST, lblNewLabel_35, -51, SpringLayout.WEST, textField_34);
		sl_panel_6.putConstraint(SpringLayout.WEST, lblNewLabel_34, 0, SpringLayout.WEST, lblNewLabel_35);
		lblNewLabel_35.setForeground(new Color(0, 0, 102));
		lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblNewLabel_35, 0, SpringLayout.NORTH, lblNewLabel_29);
		panel_6.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("Debit");
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblNewLabel_36, 0, SpringLayout.NORTH, lblNewLabel_30);
		sl_panel_6.putConstraint(SpringLayout.WEST, lblNewLabel_36, 0, SpringLayout.WEST, lblNewLabel_34);
		lblNewLabel_36.setForeground(new Color(0, 0, 102));
		lblNewLabel_36.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel("Credit");
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblNewLabel_37, 0, SpringLayout.NORTH, lblNewLabel_31);
		sl_panel_6.putConstraint(SpringLayout.WEST, lblNewLabel_37, 0, SpringLayout.WEST, lblNewLabel_34);
		lblNewLabel_37.setForeground(new Color(0, 0, 102));
		lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(lblNewLabel_37);
		
		JLabel lblBalance = new JLabel("Balance");
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblBalance, 0, SpringLayout.NORTH, lblNewLabel_32);
		sl_panel_6.putConstraint(SpringLayout.WEST, lblBalance, 0, SpringLayout.WEST, lblNewLabel_34);
		lblBalance.setForeground(new Color(0, 0, 102));
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(lblBalance);
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7, "name_54010054577595");
		SpringLayout sl_panel_7 = new SpringLayout();
		panel_7.setLayout(sl_panel_7);
		
		JLabel lblNewLabel_38 = new JLabel("Inscurance Companies");
		lblNewLabel_38.setForeground(new Color(0, 0, 102));
		lblNewLabel_38.setFont(new Font("Tahoma", Font.BOLD, 18));
		sl_panel_7.putConstraint(SpringLayout.NORTH, lblNewLabel_38, 10, SpringLayout.NORTH, panel_7);
		sl_panel_7.putConstraint(SpringLayout.WEST, lblNewLabel_38, 204, SpringLayout.WEST, panel_7);
		panel_7.add(lblNewLabel_38);
		
		JButton btnNewButton_12 = new JButton("Back");
		btnNewButton_12.setForeground(new Color(0, 0, 102));
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
		
			}
		});
		sl_panel_7.putConstraint(SpringLayout.SOUTH, btnNewButton_12, -10, SpringLayout.SOUTH, panel_7);
		sl_panel_7.putConstraint(SpringLayout.EAST, btnNewButton_12, -27, SpringLayout.EAST, panel_7);
		panel_7.add(btnNewButton_12);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		sl_panel_7.putConstraint(SpringLayout.NORTH, scrollPane_2, 36, SpringLayout.SOUTH, lblNewLabel_38);
		sl_panel_7.putConstraint(SpringLayout.WEST, scrollPane_2, 34, SpringLayout.WEST, panel_7);
		sl_panel_7.putConstraint(SpringLayout.SOUTH, scrollPane_2, -35, SpringLayout.NORTH, btnNewButton_12);
		sl_panel_7.putConstraint(SpringLayout.EAST, scrollPane_2, 563, SpringLayout.WEST, panel_7);
		panel_7.add(scrollPane_2);
		
		JList list_2 = new JList();
		scrollPane_2.setViewportView(list_2);
		
		JButton btnNewButton_15 = new JButton("ADD");
		btnNewButton_15.setForeground(new Color(0, 0, 102));
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
			}
		});
		sl_panel_7.putConstraint(SpringLayout.WEST, btnNewButton_15, 37, SpringLayout.WEST, panel_7);
		sl_panel_7.putConstraint(SpringLayout.SOUTH, btnNewButton_15, 0, SpringLayout.SOUTH, btnNewButton_12);
		panel_7.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("DELETE");
		btnNewButton_16.setForeground(new Color(0, 0, 102));
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_7.putConstraint(SpringLayout.NORTH, btnNewButton_16, 0, SpringLayout.NORTH, btnNewButton_12);
		sl_panel_7.putConstraint(SpringLayout.WEST, btnNewButton_16, 27, SpringLayout.EAST, btnNewButton_15);
		panel_7.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("VIEW");
		btnNewButton_17.setForeground(new Color(0, 0, 102));
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
				cl.next(contentPane);
				
			}
		});
		sl_panel_7.putConstraint(SpringLayout.NORTH, btnNewButton_17, 0, SpringLayout.NORTH, btnNewButton_12);
		sl_panel_7.putConstraint(SpringLayout.WEST, btnNewButton_17, 48, SpringLayout.EAST, btnNewButton_16);
		panel_7.add(btnNewButton_17);
		
		JLabel lblNewLabel_83 = new JLabel("Name");
		sl_panel_7.putConstraint(SpringLayout.WEST, lblNewLabel_83, 0, SpringLayout.WEST, btnNewButton_15);
		sl_panel_7.putConstraint(SpringLayout.SOUTH, lblNewLabel_83, -6, SpringLayout.NORTH, scrollPane_2);
		lblNewLabel_83.setForeground(new Color(0, 0, 102));
		lblNewLabel_83.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(lblNewLabel_83);
		
		JLabel lblNewLabel_84 = new JLabel("Con.Tel1");
		sl_panel_7.putConstraint(SpringLayout.SOUTH, lblNewLabel_84, -6, SpringLayout.NORTH, scrollPane_2);
		lblNewLabel_84.setForeground(new Color(0, 0, 102));
		lblNewLabel_84.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(lblNewLabel_84);
		
		JLabel lblNewLabel_86 = new JLabel("Con.Tel2");
		sl_panel_7.putConstraint(SpringLayout.WEST, lblNewLabel_86, 164, SpringLayout.WEST, panel_7);
		sl_panel_7.putConstraint(SpringLayout.EAST, lblNewLabel_84, -17, SpringLayout.WEST, lblNewLabel_86);
		sl_panel_7.putConstraint(SpringLayout.SOUTH, lblNewLabel_86, -6, SpringLayout.NORTH, scrollPane_2);
		lblNewLabel_86.setForeground(new Color(0, 0, 102));
		lblNewLabel_86.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(lblNewLabel_86);
		
		JLabel lblNewLabel_87 = new JLabel("Claim Tel.");
		sl_panel_7.putConstraint(SpringLayout.WEST, lblNewLabel_87, 18, SpringLayout.EAST, lblNewLabel_86);
		sl_panel_7.putConstraint(SpringLayout.SOUTH, lblNewLabel_87, -6, SpringLayout.NORTH, scrollPane_2);
		lblNewLabel_87.setForeground(new Color(0, 0, 102));
		lblNewLabel_87.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(lblNewLabel_87);
		
		JLabel lblNewLabel_88 = new JLabel("Email");
		sl_panel_7.putConstraint(SpringLayout.WEST, lblNewLabel_88, 23, SpringLayout.EAST, lblNewLabel_87);
		lblNewLabel_88.setForeground(new Color(0, 0, 102));
		lblNewLabel_88.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_7.putConstraint(SpringLayout.SOUTH, lblNewLabel_88, -6, SpringLayout.NORTH, scrollPane_2);
		panel_7.add(lblNewLabel_88);
		
		JLabel lblNewLabel_85 = new JLabel("Debit");
		sl_panel_7.putConstraint(SpringLayout.SOUTH, lblNewLabel_85, -6, SpringLayout.NORTH, scrollPane_2);
		sl_panel_7.putConstraint(SpringLayout.EAST, lblNewLabel_85, 0, SpringLayout.EAST, lblNewLabel_38);
		lblNewLabel_85.setForeground(new Color(0, 0, 102));
		lblNewLabel_85.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(lblNewLabel_85);
		
		JLabel lblNewLabel_89 = new JLabel("Credit");
		sl_panel_7.putConstraint(SpringLayout.SOUTH, lblNewLabel_89, -6, SpringLayout.NORTH, scrollPane_2);
		lblNewLabel_89.setForeground(new Color(0, 0, 102));
		lblNewLabel_89.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(lblNewLabel_89);
		
		JLabel lblNewLabel_90 = new JLabel("Balance");
		sl_panel_7.putConstraint(SpringLayout.WEST, lblNewLabel_90, 499, SpringLayout.WEST, panel_7);
		sl_panel_7.putConstraint(SpringLayout.SOUTH, lblNewLabel_90, -6, SpringLayout.NORTH, scrollPane_2);
		sl_panel_7.putConstraint(SpringLayout.EAST, lblNewLabel_89, -30, SpringLayout.WEST, lblNewLabel_90);
		lblNewLabel_90.setForeground(new Color(0, 0, 102));
		lblNewLabel_90.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(lblNewLabel_90);
		
		JPanel panel_8 = new JPanel();
		contentPane.add(panel_8, "name_54012244867064");
		SpringLayout sl_panel_8 = new SpringLayout();
		panel_8.setLayout(sl_panel_8);
		
		JLabel lblNewLabel_39 = new JLabel("Name");
		lblNewLabel_39.setForeground(new Color(0, 0, 102));
		lblNewLabel_39.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_8.putConstraint(SpringLayout.NORTH, lblNewLabel_39, 29, SpringLayout.NORTH, panel_8);
		sl_panel_8.putConstraint(SpringLayout.WEST, lblNewLabel_39, 38, SpringLayout.WEST, panel_8);
		panel_8.add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel("Tel1");
		lblNewLabel_40.setForeground(new Color(0, 0, 102));
		lblNewLabel_40.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_8.putConstraint(SpringLayout.NORTH, lblNewLabel_40, 25, SpringLayout.SOUTH, lblNewLabel_39);
		sl_panel_8.putConstraint(SpringLayout.EAST, lblNewLabel_40, 0, SpringLayout.EAST, lblNewLabel_39);
		panel_8.add(lblNewLabel_40);
		
		JLabel lblNewLabel_41 = new JLabel("Tel2");
		lblNewLabel_41.setForeground(new Color(0, 0, 102));
		lblNewLabel_41.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_8.putConstraint(SpringLayout.NORTH, lblNewLabel_41, 21, SpringLayout.SOUTH, lblNewLabel_40);
		sl_panel_8.putConstraint(SpringLayout.EAST, lblNewLabel_41, 0, SpringLayout.EAST, lblNewLabel_39);
		panel_8.add(lblNewLabel_41);
		
		JLabel lblNewLabel_42 = new JLabel("Claims Tel");
		lblNewLabel_42.setForeground(new Color(0, 0, 102));
		lblNewLabel_42.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_8.putConstraint(SpringLayout.NORTH, lblNewLabel_42, 27, SpringLayout.SOUTH, lblNewLabel_41);
		sl_panel_8.putConstraint(SpringLayout.EAST, lblNewLabel_42, 0, SpringLayout.EAST, lblNewLabel_39);
		panel_8.add(lblNewLabel_42);
		
		textField_38 = new JTextField();
		sl_panel_8.putConstraint(SpringLayout.WEST, textField_38, 36, SpringLayout.EAST, lblNewLabel_39);
		sl_panel_8.putConstraint(SpringLayout.SOUTH, textField_38, 0, SpringLayout.SOUTH, lblNewLabel_39);
		panel_8.add(textField_38);
		textField_38.setColumns(10);
		
		textField_39 = new JTextField();
		sl_panel_8.putConstraint(SpringLayout.NORTH, textField_39, 0, SpringLayout.NORTH, lblNewLabel_40);
		sl_panel_8.putConstraint(SpringLayout.EAST, textField_39, 0, SpringLayout.EAST, textField_38);
		panel_8.add(textField_39);
		textField_39.setColumns(10);
		
		textField_40 = new JTextField();
		sl_panel_8.putConstraint(SpringLayout.NORTH, textField_40, 0, SpringLayout.NORTH, lblNewLabel_41);
		sl_panel_8.putConstraint(SpringLayout.EAST, textField_40, 0, SpringLayout.EAST, textField_38);
		panel_8.add(textField_40);
		textField_40.setColumns(10);
		
		textField_41 = new JTextField();
		sl_panel_8.putConstraint(SpringLayout.NORTH, textField_41, 0, SpringLayout.NORTH, lblNewLabel_42);
		sl_panel_8.putConstraint(SpringLayout.EAST, textField_41, 0, SpringLayout.EAST, textField_38);
		panel_8.add(textField_41);
		textField_41.setColumns(10);
		
		JLabel lblNewLabel_43 = new JLabel("Email");
		lblNewLabel_43.setForeground(new Color(0, 0, 102));
		lblNewLabel_43.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_8.putConstraint(SpringLayout.NORTH, lblNewLabel_43, 0, SpringLayout.NORTH, lblNewLabel_39);
		sl_panel_8.putConstraint(SpringLayout.WEST, lblNewLabel_43, 66, SpringLayout.EAST, textField_38);
		panel_8.add(lblNewLabel_43);
		
		JLabel lblNewLabel_44 = new JLabel("Debit");
		lblNewLabel_44.setForeground(new Color(0, 0, 102));
		lblNewLabel_44.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_8.putConstraint(SpringLayout.SOUTH, lblNewLabel_44, 0, SpringLayout.SOUTH, lblNewLabel_40);
		sl_panel_8.putConstraint(SpringLayout.EAST, lblNewLabel_44, 0, SpringLayout.EAST, lblNewLabel_43);
		panel_8.add(lblNewLabel_44);
		
		JLabel lblNewLabel_45 = new JLabel("Credit");
		sl_panel_8.putConstraint(SpringLayout.NORTH, lblNewLabel_45, 0, SpringLayout.NORTH, lblNewLabel_41);
		sl_panel_8.putConstraint(SpringLayout.WEST, lblNewLabel_45, 0, SpringLayout.WEST, lblNewLabel_43);
		lblNewLabel_45.setForeground(new Color(0, 0, 102));
		lblNewLabel_45.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(lblNewLabel_45);
		
		JLabel lblNewLabel_46 = new JLabel("Balance");
		lblNewLabel_46.setForeground(new Color(0, 0, 102));
		lblNewLabel_46.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_8.putConstraint(SpringLayout.WEST, lblNewLabel_46, 0, SpringLayout.WEST, lblNewLabel_43);
		sl_panel_8.putConstraint(SpringLayout.SOUTH, lblNewLabel_46, 0, SpringLayout.SOUTH, lblNewLabel_42);
		panel_8.add(lblNewLabel_46);
		
		textField_42 = new JTextField();
		sl_panel_8.putConstraint(SpringLayout.WEST, textField_42, 53, SpringLayout.EAST, lblNewLabel_43);
		sl_panel_8.putConstraint(SpringLayout.SOUTH, textField_42, 0, SpringLayout.SOUTH, lblNewLabel_39);
		panel_8.add(textField_42);
		textField_42.setColumns(10);
		
		textField_43 = new JTextField();
		sl_panel_8.putConstraint(SpringLayout.NORTH, textField_43, 0, SpringLayout.NORTH, lblNewLabel_40);
		sl_panel_8.putConstraint(SpringLayout.EAST, textField_43, 0, SpringLayout.EAST, textField_42);
		panel_8.add(textField_43);
		textField_43.setColumns(10);
		
		textField_44 = new JTextField();
		sl_panel_8.putConstraint(SpringLayout.NORTH, textField_44, 0, SpringLayout.NORTH, lblNewLabel_41);
		sl_panel_8.putConstraint(SpringLayout.WEST, textField_44, 0, SpringLayout.WEST, textField_42);
		panel_8.add(textField_44);
		textField_44.setColumns(10);
		
		textField_45 = new JTextField();
		sl_panel_8.putConstraint(SpringLayout.NORTH, textField_45, 0, SpringLayout.NORTH, lblNewLabel_42);
		sl_panel_8.putConstraint(SpringLayout.WEST, textField_45, 0, SpringLayout.WEST, textField_42);
		panel_8.add(textField_45);
		textField_45.setColumns(10);
		
		JButton btnNewButton_18 = new JButton("Back");
		sl_panel_8.putConstraint(SpringLayout.EAST, btnNewButton_18, -139, SpringLayout.EAST, panel_8);
		btnNewButton_18.setForeground(new Color(0, 0, 102));
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
				
			}
		});
		panel_8.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("SAVE");
		sl_panel_8.putConstraint(SpringLayout.NORTH, btnNewButton_18, 0, SpringLayout.NORTH, btnNewButton_19);
		sl_panel_8.putConstraint(SpringLayout.WEST, btnNewButton_19, 0, SpringLayout.WEST, textField_38);
		sl_panel_8.putConstraint(SpringLayout.SOUTH, btnNewButton_19, -30, SpringLayout.SOUTH, panel_8);
		btnNewButton_19.setForeground(new Color(0, 0, 102));
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(btnNewButton_19);
		
		JPanel panel_9 = new JPanel();
		contentPane.add(panel_9, "name_54014253143271");
		SpringLayout sl_panel_9 = new SpringLayout();
		panel_9.setLayout(sl_panel_9);
		
		JLabel lblNewLabel_47 = new JLabel("Name");
		lblNewLabel_47.setForeground(new Color(0, 0, 102));
		lblNewLabel_47.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_9.putConstraint(SpringLayout.NORTH, lblNewLabel_47, 30, SpringLayout.NORTH, panel_9);
		sl_panel_9.putConstraint(SpringLayout.WEST, lblNewLabel_47, 55, SpringLayout.WEST, panel_9);
		panel_9.add(lblNewLabel_47);
		
		JLabel lblNewLabel_48 = new JLabel("Tel1");
		lblNewLabel_48.setForeground(new Color(0, 0, 102));
		lblNewLabel_48.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_9.putConstraint(SpringLayout.NORTH, lblNewLabel_48, 22, SpringLayout.SOUTH, lblNewLabel_47);
		sl_panel_9.putConstraint(SpringLayout.EAST, lblNewLabel_48, 0, SpringLayout.EAST, lblNewLabel_47);
		panel_9.add(lblNewLabel_48);
		
		JLabel lblNewLabel_49 = new JLabel("Tel2");
		lblNewLabel_49.setForeground(new Color(0, 0, 102));
		lblNewLabel_49.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_9.putConstraint(SpringLayout.NORTH, lblNewLabel_49, 27, SpringLayout.SOUTH, lblNewLabel_48);
		sl_panel_9.putConstraint(SpringLayout.EAST, lblNewLabel_49, 0, SpringLayout.EAST, lblNewLabel_47);
		panel_9.add(lblNewLabel_49);
		
		JLabel lblNewLabel_50 = new JLabel("Claim Tel.");
		lblNewLabel_50.setForeground(new Color(0, 0, 102));
		lblNewLabel_50.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_9.putConstraint(SpringLayout.NORTH, lblNewLabel_50, 26, SpringLayout.SOUTH, lblNewLabel_49);
		sl_panel_9.putConstraint(SpringLayout.WEST, lblNewLabel_50, 0, SpringLayout.WEST, lblNewLabel_47);
		panel_9.add(lblNewLabel_50);
		
		JLabel lblNewLabel_51 = new JLabel("Email");
		sl_panel_9.putConstraint(SpringLayout.NORTH, lblNewLabel_51, 0, SpringLayout.NORTH, lblNewLabel_47);
		lblNewLabel_51.setForeground(new Color(0, 0, 102));
		lblNewLabel_51.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9.add(lblNewLabel_51);
		
		JLabel lblNewLabel_52 = new JLabel("Debit");
		sl_panel_9.putConstraint(SpringLayout.WEST, lblNewLabel_52, 285, SpringLayout.WEST, panel_9);
		sl_panel_9.putConstraint(SpringLayout.WEST, lblNewLabel_51, 0, SpringLayout.WEST, lblNewLabel_52);
		sl_panel_9.putConstraint(SpringLayout.NORTH, lblNewLabel_52, 0, SpringLayout.NORTH, lblNewLabel_48);
		lblNewLabel_52.setForeground(new Color(0, 0, 102));
		lblNewLabel_52.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9.add(lblNewLabel_52);
		
		JLabel lblNewLabel_53 = new JLabel("Credit");
		sl_panel_9.putConstraint(SpringLayout.EAST, lblNewLabel_53, -278, SpringLayout.EAST, panel_9);
		lblNewLabel_53.setForeground(new Color(0, 0, 102));
		lblNewLabel_53.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_9.putConstraint(SpringLayout.NORTH, lblNewLabel_53, 0, SpringLayout.NORTH, lblNewLabel_49);
		panel_9.add(lblNewLabel_53);
		
		JLabel lblNewLabel_54 = new JLabel("Balance");
		sl_panel_9.putConstraint(SpringLayout.NORTH, lblNewLabel_54, 0, SpringLayout.NORTH, lblNewLabel_50);
		sl_panel_9.putConstraint(SpringLayout.WEST, lblNewLabel_54, 0, SpringLayout.WEST, lblNewLabel_51);
		lblNewLabel_54.setForeground(new Color(0, 0, 102));
		lblNewLabel_54.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9.add(lblNewLabel_54);
		
		textField_46 = new JTextField();
		sl_panel_9.putConstraint(SpringLayout.NORTH, textField_46, 0, SpringLayout.NORTH, lblNewLabel_47);
		sl_panel_9.putConstraint(SpringLayout.WEST, textField_46, 43, SpringLayout.EAST, lblNewLabel_47);
		panel_9.add(textField_46);
		textField_46.setColumns(10);
		
		textField_47 = new JTextField();
		sl_panel_9.putConstraint(SpringLayout.NORTH, textField_47, 0, SpringLayout.NORTH, lblNewLabel_48);
		sl_panel_9.putConstraint(SpringLayout.EAST, textField_47, 0, SpringLayout.EAST, textField_46);
		panel_9.add(textField_47);
		textField_47.setColumns(10);
		
		textField_48 = new JTextField();
		sl_panel_9.putConstraint(SpringLayout.NORTH, textField_48, 0, SpringLayout.NORTH, lblNewLabel_49);
		sl_panel_9.putConstraint(SpringLayout.EAST, textField_48, 0, SpringLayout.EAST, textField_46);
		panel_9.add(textField_48);
		textField_48.setColumns(10);
		
		textField_49 = new JTextField();
		sl_panel_9.putConstraint(SpringLayout.WEST, textField_49, 0, SpringLayout.WEST, textField_46);
		sl_panel_9.putConstraint(SpringLayout.SOUTH, textField_49, 0, SpringLayout.SOUTH, lblNewLabel_50);
		panel_9.add(textField_49);
		textField_49.setColumns(10);
		
		textField_50 = new JTextField();
		sl_panel_9.putConstraint(SpringLayout.NORTH, textField_50, 0, SpringLayout.NORTH, lblNewLabel_47);
		sl_panel_9.putConstraint(SpringLayout.WEST, textField_50, 368, SpringLayout.WEST, panel_9);
		panel_9.add(textField_50);
		textField_50.setColumns(10);
		
		textField_51 = new JTextField();
		sl_panel_9.putConstraint(SpringLayout.NORTH, textField_51, 0, SpringLayout.NORTH, lblNewLabel_48);
		sl_panel_9.putConstraint(SpringLayout.EAST, textField_51, 0, SpringLayout.EAST, textField_50);
		panel_9.add(textField_51);
		textField_51.setColumns(10);
		
		textField_52 = new JTextField();
		sl_panel_9.putConstraint(SpringLayout.EAST, textField_52, -146, SpringLayout.EAST, panel_9);
		sl_panel_9.putConstraint(SpringLayout.NORTH, textField_52, 0, SpringLayout.NORTH, lblNewLabel_49);
		panel_9.add(textField_52);
		textField_52.setColumns(10);
		
		textField_53 = new JTextField();
		sl_panel_9.putConstraint(SpringLayout.NORTH, textField_53, 0, SpringLayout.NORTH, lblNewLabel_50);
		sl_panel_9.putConstraint(SpringLayout.WEST, textField_53, 0, SpringLayout.WEST, textField_50);
		panel_9.add(textField_53);
		textField_53.setColumns(10);
		
		JButton btnNewButton_20 = new JButton("Back");
		sl_panel_9.putConstraint(SpringLayout.EAST, btnNewButton_20, 0, SpringLayout.EAST, textField_50);
		btnNewButton_20.setForeground(new Color(0, 0, 102));
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
				cl.previous(contentPane);
			}
		});
		panel_9.add(btnNewButton_20);
		
		JButton btnAmend = new JButton("AMEND");
		sl_panel_9.putConstraint(SpringLayout.NORTH, btnNewButton_20, 0, SpringLayout.NORTH, btnAmend);
		sl_panel_9.putConstraint(SpringLayout.WEST, btnAmend, 86, SpringLayout.WEST, panel_9);
		sl_panel_9.putConstraint(SpringLayout.SOUTH, btnAmend, -25, SpringLayout.SOUTH, panel_9);
		btnAmend.setForeground(new Color(0, 0, 102));
		btnAmend.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9.add(btnAmend);
		
		JPanel panel_10 = new JPanel();
		contentPane.add(panel_10, "name_54015925295814");
		SpringLayout sl_panel_10 = new SpringLayout();
		panel_10.setLayout(sl_panel_10);
		
		JButton btnNewButton_21 = new JButton("Back");
		btnNewButton_21.setForeground(new Color(0, 0, 102));
		btnNewButton_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
				cl.previous(contentPane);
			}
		});
		panel_10.add(btnNewButton_21);
		
		JLabel lblBanks = new JLabel("Banks");
		lblBanks.setForeground(new Color(0, 0, 102));
		lblBanks.setFont(new Font("Tahoma", Font.BOLD, 15));
		sl_panel_10.putConstraint(SpringLayout.NORTH, lblBanks, 10, SpringLayout.NORTH, panel_10);
		sl_panel_10.putConstraint(SpringLayout.WEST, lblBanks, 214, SpringLayout.WEST, panel_10);
		panel_10.add(lblBanks);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		sl_panel_10.putConstraint(SpringLayout.EAST, btnNewButton_21, 0, SpringLayout.EAST, scrollPane_3);
		sl_panel_10.putConstraint(SpringLayout.NORTH, scrollPane_3, 41, SpringLayout.SOUTH, lblBanks);
		sl_panel_10.putConstraint(SpringLayout.WEST, scrollPane_3, 59, SpringLayout.WEST, panel_10);
		sl_panel_10.putConstraint(SpringLayout.SOUTH, scrollPane_3, 134, SpringLayout.SOUTH, lblBanks);
		sl_panel_10.putConstraint(SpringLayout.EAST, scrollPane_3, -104, SpringLayout.EAST, panel_10);
		panel_10.add(scrollPane_3);
		
		JList list_3 = new JList();
		scrollPane_3.setViewportView(list_3);
		
		JButton btnNewButton_22 = new JButton("ADD");
		sl_panel_10.putConstraint(SpringLayout.NORTH, btnNewButton_21, 0, SpringLayout.NORTH, btnNewButton_22);
		sl_panel_10.putConstraint(SpringLayout.SOUTH, btnNewButton_22, -49, SpringLayout.SOUTH, panel_10);
		btnNewButton_22.setForeground(new Color(0, 0, 102));
		btnNewButton_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
			}
		});
		panel_10.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("DELETE");
		sl_panel_10.putConstraint(SpringLayout.NORTH, btnNewButton_23, 0, SpringLayout.NORTH, btnNewButton_22);
		btnNewButton_23.setForeground(new Color(0, 0, 102));
		btnNewButton_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_10.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("VIEW");
		sl_panel_10.putConstraint(SpringLayout.NORTH, btnNewButton_24, 0, SpringLayout.NORTH, btnNewButton_22);
		sl_panel_10.putConstraint(SpringLayout.WEST, btnNewButton_24, 25, SpringLayout.EAST, btnNewButton_23);
		btnNewButton_24.setForeground(new Color(0, 0, 102));
		btnNewButton_24.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.next(contentPane);
				cl.next(contentPane);
			}
		});
		panel_10.add(btnNewButton_24);
		
		JLabel lblNewLabel_91 = new JLabel("Bank");
		sl_panel_10.putConstraint(SpringLayout.WEST, btnNewButton_22, 0, SpringLayout.WEST, lblNewLabel_91);
		lblNewLabel_91.setForeground(new Color(0, 0, 102));
		lblNewLabel_91.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_10.putConstraint(SpringLayout.WEST, lblNewLabel_91, 82, SpringLayout.WEST, panel_10);
		sl_panel_10.putConstraint(SpringLayout.SOUTH, lblNewLabel_91, -6, SpringLayout.NORTH, scrollPane_3);
		panel_10.add(lblNewLabel_91);
		
		JLabel lblNewLabel_92 = new JLabel("Debit");
		lblNewLabel_92.setForeground(new Color(0, 0, 102));
		lblNewLabel_92.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_10.putConstraint(SpringLayout.WEST, lblNewLabel_92, 27, SpringLayout.EAST, lblNewLabel_91);
		sl_panel_10.putConstraint(SpringLayout.SOUTH, lblNewLabel_92, -6, SpringLayout.NORTH, scrollPane_3);
		panel_10.add(lblNewLabel_92);
		
		JLabel lblNewLabel_93 = new JLabel("Credit");
		sl_panel_10.putConstraint(SpringLayout.EAST, btnNewButton_23, 0, SpringLayout.EAST, lblNewLabel_93);
		lblNewLabel_93.setForeground(new Color(0, 0, 102));
		lblNewLabel_93.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_10.putConstraint(SpringLayout.WEST, lblNewLabel_93, 35, SpringLayout.EAST, lblNewLabel_92);
		sl_panel_10.putConstraint(SpringLayout.SOUTH, lblNewLabel_93, -6, SpringLayout.NORTH, scrollPane_3);
		panel_10.add(lblNewLabel_93);
		
		JLabel lblNewLabel_94 = new JLabel("Balance");
		lblNewLabel_94.setForeground(new Color(0, 0, 102));
		lblNewLabel_94.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_10.putConstraint(SpringLayout.NORTH, lblNewLabel_94, 0, SpringLayout.NORTH, lblNewLabel_91);
		sl_panel_10.putConstraint(SpringLayout.WEST, lblNewLabel_94, 48, SpringLayout.EAST, lblNewLabel_93);
		panel_10.add(lblNewLabel_94);
		
		JPanel panel_11 = new JPanel();
		contentPane.add(panel_11, "name_54017445595723");
		SpringLayout sl_panel_11 = new SpringLayout();
		panel_11.setLayout(sl_panel_11);
		
		JLabel lblNewLabel_55 = new JLabel("Bank");
		lblNewLabel_55.setForeground(new Color(0, 0, 102));
		lblNewLabel_55.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_11.add(lblNewLabel_55);
		
		JLabel lblNewLabel_56 = new JLabel("Debit");
		lblNewLabel_56.setForeground(new Color(0, 0, 102));
		lblNewLabel_56.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_11.putConstraint(SpringLayout.WEST, lblNewLabel_55, 0, SpringLayout.WEST, lblNewLabel_56);
		sl_panel_11.putConstraint(SpringLayout.NORTH, lblNewLabel_56, 107, SpringLayout.NORTH, panel_11);
		sl_panel_11.putConstraint(SpringLayout.WEST, lblNewLabel_56, 59, SpringLayout.WEST, panel_11);
		panel_11.add(lblNewLabel_56);
		
		JLabel lblNewLabel_57 = new JLabel("Credit");
		lblNewLabel_57.setForeground(new Color(0, 0, 102));
		lblNewLabel_57.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_11.putConstraint(SpringLayout.WEST, lblNewLabel_57, 0, SpringLayout.WEST, lblNewLabel_55);
		panel_11.add(lblNewLabel_57);
		
		JLabel lblNewLabel_58 = new JLabel("Balances");
		lblNewLabel_58.setForeground(new Color(0, 0, 102));
		lblNewLabel_58.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_11.putConstraint(SpringLayout.NORTH, lblNewLabel_58, 26, SpringLayout.SOUTH, lblNewLabel_57);
		sl_panel_11.putConstraint(SpringLayout.WEST, lblNewLabel_58, 0, SpringLayout.WEST, lblNewLabel_56);
		panel_11.add(lblNewLabel_58);
		
		textField_54 = new JTextField();
		sl_panel_11.putConstraint(SpringLayout.NORTH, lblNewLabel_55, 3, SpringLayout.NORTH, textField_54);
		panel_11.add(textField_54);
		textField_54.setColumns(10);
		
		textField_55 = new JTextField();
		sl_panel_11.putConstraint(SpringLayout.WEST, textField_55, 46, SpringLayout.EAST, lblNewLabel_56);
		sl_panel_11.putConstraint(SpringLayout.WEST, textField_54, 0, SpringLayout.WEST, textField_55);
		sl_panel_11.putConstraint(SpringLayout.SOUTH, textField_54, -22, SpringLayout.NORTH, textField_55);
		sl_panel_11.putConstraint(SpringLayout.NORTH, textField_55, -3, SpringLayout.NORTH, lblNewLabel_56);
		panel_11.add(textField_55);
		textField_55.setColumns(10);
		
		textField_56 = new JTextField();
		sl_panel_11.putConstraint(SpringLayout.NORTH, textField_56, 20, SpringLayout.SOUTH, textField_55);
		sl_panel_11.putConstraint(SpringLayout.WEST, textField_56, 42, SpringLayout.EAST, lblNewLabel_57);
		sl_panel_11.putConstraint(SpringLayout.NORTH, lblNewLabel_57, 3, SpringLayout.NORTH, textField_56);
		panel_11.add(textField_56);
		textField_56.setColumns(10);
		
		textField_57 = new JTextField();
		sl_panel_11.putConstraint(SpringLayout.NORTH, textField_57, -3, SpringLayout.NORTH, lblNewLabel_58);
		sl_panel_11.putConstraint(SpringLayout.WEST, textField_57, 29, SpringLayout.EAST, lblNewLabel_58);
		panel_11.add(textField_57);
		textField_57.setColumns(10);
		
		JButton btnNewButton_25 = new JButton("Back");
		btnNewButton_25.setForeground(new Color(0, 0, 102));
		btnNewButton_25.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
			}
		});
		sl_panel_11.putConstraint(SpringLayout.SOUTH, btnNewButton_25, -28, SpringLayout.SOUTH, panel_11);
		sl_panel_11.putConstraint(SpringLayout.EAST, btnNewButton_25, -46, SpringLayout.EAST, panel_11);
		panel_11.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("SAVE");
		btnNewButton_26.setForeground(new Color(0, 0, 102));
		btnNewButton_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
			}
		});
		sl_panel_11.putConstraint(SpringLayout.NORTH, btnNewButton_26, 0, SpringLayout.NORTH, btnNewButton_25);
		sl_panel_11.putConstraint(SpringLayout.WEST, btnNewButton_26, 175, SpringLayout.WEST, panel_11);
		panel_11.add(btnNewButton_26);
		
		JPanel panel_12 = new JPanel();
		contentPane.add(panel_12, "name_54019157959698");
		SpringLayout sl_panel_12 = new SpringLayout();
		panel_12.setLayout(sl_panel_12);
		
		JLabel lblNewLabel_59 = new JLabel("Bank");
		lblNewLabel_59.setForeground(new Color(0, 0, 102));
		lblNewLabel_59.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_12.putConstraint(SpringLayout.NORTH, lblNewLabel_59, 31, SpringLayout.NORTH, panel_12);
		sl_panel_12.putConstraint(SpringLayout.WEST, lblNewLabel_59, 47, SpringLayout.WEST, panel_12);
		panel_12.add(lblNewLabel_59);
		
		JLabel lblNewLabel_60 = new JLabel("Debit");
		lblNewLabel_60.setForeground(new Color(0, 0, 102));
		lblNewLabel_60.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_12.putConstraint(SpringLayout.NORTH, lblNewLabel_60, 23, SpringLayout.SOUTH, lblNewLabel_59);
		sl_panel_12.putConstraint(SpringLayout.WEST, lblNewLabel_60, 0, SpringLayout.WEST, lblNewLabel_59);
		panel_12.add(lblNewLabel_60);
		
		JLabel lblNewLabel_61 = new JLabel("Credit");
		lblNewLabel_61.setForeground(new Color(0, 0, 102));
		lblNewLabel_61.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_12.putConstraint(SpringLayout.NORTH, lblNewLabel_61, 25, SpringLayout.SOUTH, lblNewLabel_60);
		sl_panel_12.putConstraint(SpringLayout.WEST, lblNewLabel_61, 0, SpringLayout.WEST, lblNewLabel_59);
		panel_12.add(lblNewLabel_61);
		
		JLabel lblNewLabel_62 = new JLabel("Balances");
		lblNewLabel_62.setForeground(new Color(0, 0, 102));
		lblNewLabel_62.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_12.putConstraint(SpringLayout.NORTH, lblNewLabel_62, 21, SpringLayout.SOUTH, lblNewLabel_61);
		sl_panel_12.putConstraint(SpringLayout.WEST, lblNewLabel_62, 0, SpringLayout.WEST, lblNewLabel_59);
		panel_12.add(lblNewLabel_62);
		
		textField_58 = new JTextField();
		sl_panel_12.putConstraint(SpringLayout.NORTH, textField_58, -3, SpringLayout.NORTH, lblNewLabel_61);
		panel_12.add(textField_58);
		textField_58.setColumns(10);
		
		textField_59 = new JTextField();
		sl_panel_12.putConstraint(SpringLayout.WEST, textField_58, 0, SpringLayout.WEST, textField_59);
		sl_panel_12.putConstraint(SpringLayout.NORTH, textField_59, -3, SpringLayout.NORTH, lblNewLabel_59);
		sl_panel_12.putConstraint(SpringLayout.WEST, textField_59, 55, SpringLayout.EAST, lblNewLabel_59);
		panel_12.add(textField_59);
		textField_59.setColumns(10);
		
		textField_60 = new JTextField();
		sl_panel_12.putConstraint(SpringLayout.NORTH, textField_60, -3, SpringLayout.NORTH, lblNewLabel_60);
		sl_panel_12.putConstraint(SpringLayout.WEST, textField_60, 0, SpringLayout.WEST, textField_59);
		panel_12.add(textField_60);
		textField_60.setColumns(10);
		
		textField_61 = new JTextField();
		sl_panel_12.putConstraint(SpringLayout.NORTH, textField_61, -3, SpringLayout.NORTH, lblNewLabel_62);
		sl_panel_12.putConstraint(SpringLayout.WEST, textField_61, 0, SpringLayout.WEST, textField_58);
		panel_12.add(textField_61);
		textField_61.setColumns(10);
		
		JButton btnNewButton_27 = new JButton("AMEND");
		btnNewButton_27.setForeground(new Color(0, 0, 102));
		btnNewButton_27.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_12.putConstraint(SpringLayout.NORTH, btnNewButton_27, 51, SpringLayout.SOUTH, textField_61);
		sl_panel_12.putConstraint(SpringLayout.WEST, btnNewButton_27, 109, SpringLayout.WEST, panel_12);
		panel_12.add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("Back");
		btnNewButton_28.setForeground(new Color(0, 0, 102));
		btnNewButton_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_panel_12.putConstraint(SpringLayout.NORTH, btnNewButton_28, 0, SpringLayout.NORTH, btnNewButton_27);
		sl_panel_12.putConstraint(SpringLayout.WEST, btnNewButton_28, 166, SpringLayout.EAST, btnNewButton_27);
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)contentPane.getLayout();
				cl.previous(contentPane);
				cl.previous(contentPane);
			}
		});
		panel_12.add(btnNewButton_28);
	}
}
