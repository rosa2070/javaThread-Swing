import javax.swing.JFrame;

public class JFrameEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// JFrame
		// has ~ a     : 인스턴스 
		// is ~ a      : 상속
		
		JFrame frame = new JFrame();
		
		// 크기와 위치
		frame.setSize(1024, 768);
		frame.setLocation(100, 100);
		
		frame.setVisible(true);

	}

}
