package com.employee;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class EmployeeSearchUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox comboBox;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeSearchUI frame = new EmployeeSearchUI();
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
	public EmployeeSearchUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("부서목록 가져오기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				comboBox.setModel( new EmployeeComboBoxModel() );
			}
		});
		btn.setBounds(12, 10, 560, 23);
		contentPane.add(btn);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textArea.setText("");
				
				if (e.getStateChange() == ItemEvent.SELECTED) {
//					System.out.println((String)comboBox.getSelectedItem());
					
					EmployeeDAO dao = new EmployeeDAO();
					ArrayList<EmployeeTO> datas = dao.listEmployee((String)comboBox.getSelectedItem());
					for(EmployeeTO to : datas) {
						String result = String.format("[%s] %s %s %s %s %s %s%n", 
								to.getEmpno(), to.getEname(), to.getJob(), to.getMgr(), 
								to.getHiredate(), to.getSal(), to.getComm());
						
						textArea.append(result);
					}
				}
			}
		});
		comboBox.setBounds(12, 43, 560, 23);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 76, 560, 675);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}

}
