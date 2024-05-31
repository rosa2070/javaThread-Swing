package com.dialog1;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JFrameUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameUI frame = new JFrameUI();
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
	public JFrameUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit_on_close : 프로그램 종료
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("다이얼로그 열기");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JDialogUI dialog = new JDialogUI();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // dispose_on_close : 다이얼로그만 닫아줘
				
				// frame 정보
				Rectangle bounds = JFrameUI.this.getBounds();
//				System.out.println(bounds.getX());
//				System.out.println(bounds.getY());
//				System.out.println(bounds.getWidth());
//				System.out.println(bounds.getHeight());
				
				int fx = (int)bounds.getX();
				int fy = (int)bounds.getY();
				int fwidth = (int)bounds.getWidth();
				int fheight = (int) bounds.getHeight();
				
				int dwidth = 450;
				int dheight = 300;
				
				
				// dialog 정보
				dialog.setBounds(fwidth/2 - dwidth/2 + fx, fheight/2 - dheight/2 + fy, dwidth, dheight );

				System.out.println("1");
				dialog.setModal(true);
				System.out.println("2");
				dialog.setVisible(true);
				System.out.println("3");
			}
		});
		btn1.setBounds(12, 10, 150, 23);
		contentPane.add(btn1);
	}
}
