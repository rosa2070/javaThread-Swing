package com.dialog3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class JFileChooserEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileChooserEx01 frame = new JFileChooserEx01();
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
	public JFileChooserEx01() {
		setResizable(false);
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
				// 파일 선택 - 열기 / 저장 => 파일 위치 + IO
				
				JFileChooser fileChooser = new JFileChooser("c:\\");
				int result = fileChooser.showOpenDialog(JFileChooserEx01.this);
				
				if (result == JFileChooser.APPROVE_OPTION) {
					// 확인
					File file = fileChooser.getSelectedFile();
					System.out.println(file.getName());
					System.out.println(file.getAbsolutePath());
				} else {
					// 취소
					System.out.println("취소 선택");
				}
			}
		});
		btn1.setBounds(12, 10, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("New button");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser("c:\\");
				int result = fileChooser.showSaveDialog(JFileChooserEx01.this);
			}
		});
		btn2.setBounds(12, 43, 97, 23);
		contentPane.add(btn2);
	}

}
