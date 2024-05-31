import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MouseListenerEx02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseListenerEx02 frame = new MouseListenerEx02();
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
	public MouseListenerEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("버튼 1");
		btn1.addMouseListener(new CustomMouseEvent());
		btn1.setBounds(12, 10, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼 2");
		btn2.addMouseListener(new CustomMouseEvent());
		btn2.setBounds(12, 41, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼 3");
		btn3.addMouseListener(new CustomMouseEvent());
		btn3.setBounds(12, 74, 97, 23);
		contentPane.add(btn3);
	}
	
	class CustomMouseEvent extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
//			System.out.println("click");
			
			System.out.println(((JButton)e.getSource()).getText());
			
			// 소스
			switch(((JButton)e.getSource()).getText()) {
			case "버튼 1":
				System.out.println("btn1 mouseClicked");
				break;
			case "버튼 2":
				System.out.println("btn2 mouseClicked");
				break;
			case "버튼 3":
				System.out.println("btn3 mouseClicked");
				break;
			default:
				System.out.println("에러");
				
			}
			
		}
		
	}

}


















