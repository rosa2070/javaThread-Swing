import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameEx04 extends JFrame {
	private JPanel contentPane;
	
	public static void main(String[] args) {
		// 프로그램 설정
		
		JFrameEx04 frame = new JFrameEx04();
		frame.setVisible(true);
	}

	public JFrameEx04() {
		// JFrame 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		// 컴포넌트가 들어갈 공간
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		
		// null - absolute Layout
		contentPane.setLayout(null);
		
		// 입력
		JButton btn1 = new JButton("난 버튼1");
		btn1.setBounds(10, 10, 100, 25);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("난 버튼2");
		btn2.setBounds(10, 40, 100, 25);
		contentPane.add(btn2);
		
		
		// jframe 에 Panel 부착
		setContentPane(contentPane);
		
		
		
	}
	
	

}
