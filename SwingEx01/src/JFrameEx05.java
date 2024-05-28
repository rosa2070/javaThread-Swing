import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameEx05 extends JFrame {
	private JPanel contentPane;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrameEx05 frame = new JFrameEx05();
				frame.setVisible(true);
			}
		});
		
		


	}
	
	public JFrameEx05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		
		// 나머지 컴포넌트 넣기
		JButton btn1 = new JButton("난 버튼1");
		
		// 크기와 좌표 => 도구 WYSWYG(완벽) => window builder
		btn1.setBounds(10, 10, 100, 25);
		contentPane.add(btn1);
		
		
		setContentPane(contentPane);
		
	}

}
