import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JCheckboxEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckboxEx01 frame = new JCheckboxEx01();
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
	public JCheckboxEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbx1 = new JCheckBox("사과");
		chckbx1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbx1.isSelected()) {
					System.out.println("선택됨");
				} else {
					System.out.println("선택안됨");
				}
			}
		});
		chckbx1.setSelected(true);
		chckbx1.setBounds(8, 6, 115, 23);
		contentPane.add(chckbx1);
		
		JCheckBox chckbx2 = new JCheckBox("수박");
		chckbx2.setSelected(true);
		chckbx2.setBounds(8, 30, 115, 23);
		contentPane.add(chckbx2);
		
		JCheckBox chckbx3 = new JCheckBox("딸기");
		chckbx3.setBounds(8, 55, 115, 23);
		contentPane.add(chckbx3);
		
		JButton btn1 = new JButton("내용 가져오기");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				System.out.println(chckbx1.isSelected());
				System.out.println(chckbx2.isSelected());
				System.out.println(chckbx3.isSelected());
				
				System.out.println(chckbx1.getText());
				System.out.println(chckbx2.getText());
				System.out.println(chckbx3.getText());
				*/
				
				String result = "";
				if(chckbx1.isSelected()) {
					result += chckbx1.getText() + " ";
				}
				if(chckbx2.isSelected()) {
					result += chckbx2.getText() + " ";
				}
				if(chckbx3.isSelected()) {
					result += chckbx3.getText() + " ";
				}
				
				System.out.println(result);
			}
		});
		btn1.setBounds(8, 84, 128, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("전체 선택");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbx1.setSelected(true);
				chckbx2.setSelected(true);
				chckbx3.setSelected(true);
			}
		});
		btn2.setBounds(8, 117, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("전체 해제");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbx1.setSelected(false);
				chckbx2.setSelected(false);
				chckbx3.setSelected(false);
			}
		});
		btn3.setBounds(117, 117, 97, 23);
		contentPane.add(btn3);
	}
}
