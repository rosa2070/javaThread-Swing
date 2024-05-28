import javax.swing.JFrame;

public class JFrameEx03 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameEx03 frame = new JFrameEx03();
		
		frame.setSize(1024, 768);
		frame.setLocation(100, 100);
		
		frame.setVisible(true);

	}
	
	public JFrameEx03() {
//		setSize(1024, 768);
//		setLocation(100, 100);
		
		setBounds(100, 100, 1012, 768);
		
		setTitle("프레임 타이틀");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
