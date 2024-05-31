package com.menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JMenuBarEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenuBarEx01 frame = new JMenuBarEx01();
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
	public JMenuBarEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu1 = new JMenu("File");
		menuBar.add(mnNewMenu1);
		
		JMenuItem mntmNewMenuItem1 = new JMenuItem("New");
		mntmNewMenuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("click");
			}
		});
		mnNewMenu1.add(mntmNewMenuItem1);
		
		JMenuItem mntmNewMenuItem2 = new JMenuItem("Open");
		mnNewMenu1.add(mntmNewMenuItem2);
		
		JMenuItem mntmNewMenuItem3 = new JMenuItem("Save");
		mnNewMenu1.add(mntmNewMenuItem3);
		
		JMenu mnNewMenu2 = new JMenu("Edit");
		menuBar.add(mnNewMenu2);
		
		JMenuItem mntmNewMenuItem4 = new JMenuItem("Undo");
		mnNewMenu2.add(mntmNewMenuItem4);
		
		mnNewMenu2.addSeparator();
		
		JMenuItem mntmNewMenuItem5 = new JMenuItem("Redo");
		mnNewMenu2.add(mntmNewMenuItem5);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
