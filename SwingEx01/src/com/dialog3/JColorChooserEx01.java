package com.dialog3;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JColorChooserEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JColorChooserEx01 frame = new JColorChooserEx01();
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
	public JColorChooserEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("New button");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Color color = JColorChooser.showDialog(JColorChooserEx01.this, "팔레트", Color.BLUE);
				if (color != null) {
					System.out.println(color.toString());
					
					// 0 ~ 255 => 16진수
//					System.out.println(color.getRed());
					System.out.println(color.getRed() + ": " + Integer.toHexString(color.getRed()));
					System.out.println(color.getGreen() + ": " + Integer.toHexString(color.getGreen()));
					System.out.println(color.getBlue() + ": " + Integer.toHexString(color.getBlue()));
				} else {
					System.out.println("선택 안함");
				}
			}
		});
		btn1.setBounds(12, 10, 97, 23);
		contentPane.add(btn1);
	}

}
