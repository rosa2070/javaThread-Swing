package com.dialog3;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ViewerEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewerEx01 frame = new ViewerEx01();
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
	public ViewerEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("파일 열기");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JFileChooser fileChooser = new JFileChooser( "c:\\java" );
				
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Java Source", "java");
				fileChooser.setFileFilter(filter);
				
				int flag = fileChooser.showOpenDialog( ViewerEx01.this );
				if( flag == JFileChooser.APPROVE_OPTION ) {
					File file = fileChooser.getSelectedFile();
					
					StringBuilder sbResult = new StringBuilder();
					
					BufferedReader br = null;
					try {
						br = new BufferedReader( new FileReader( file ) );
						
						String line = null;
						while( ( line = br.readLine() ) != null ) {
							sbResult.append( line + System.lineSeparator() );
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						System.out.println( "[에러] " + e1.getMessage() );
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						System.out.println( "[에러] " + e1.getMessage() );
					} finally {
						if( br != null ) try { br.close(); } catch( IOException e1 ) {}
					}
					
					textArea.setText( sbResult.toString() );
				}
			}
		});
		btn1.setBounds(12, 10, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("파일 저장");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 저장용 다이얼로그를 쓸거야
				JFileChooser fileChooser = new JFileChooser("c:\\java" );
				

				
				int flag = fileChooser.showSaveDialog(ViewerEx01.this);
				if (flag == JFileChooser.APPROVE_OPTION) {
					
					File file = fileChooser.getSelectedFile();
					
					BufferedWriter bw = null;
					
					try {
						bw = new BufferedWriter(new FileWriter(file));
						bw.write(textArea.getText());
						
						JOptionPane.showMessageDialog(ViewerEx01.this, "저장 완료");
					} catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						System.out.println( "[에러] " + e1.getMessage() );
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						System.out.println( "[에러] " + e1.getMessage() );
					} finally {
						if (bw != null) try { bw.close(); } catch (IOException e1) {}
					}
				}
			}
		});
		btn2.setBounds(121, 10, 97, 23);
		contentPane.add(btn2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 43, 760, 508);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
