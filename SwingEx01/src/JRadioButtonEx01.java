import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JRadioButtonEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButtonEx01 frame = new JRadioButtonEx01();
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
	public JRadioButtonEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtn1 = new JRadioButton("사과");
		buttonGroup.add(rdbtn1);
		rdbtn1.setSelected(true);
		rdbtn1.setBounds(8, 6, 121, 23);
		contentPane.add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("딸기");
		buttonGroup.add(rdbtn2);
		rdbtn2.setBounds(8, 31, 121, 23);
		contentPane.add(rdbtn2);
		
		JRadioButton rdbtn3 = new JRadioButton("수박");
		buttonGroup.add(rdbtn3);
		rdbtn3.setBounds(8, 56, 121, 23);
		contentPane.add(rdbtn3);
		
		JButton btn1 = new JButton("내용 가져오기");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String result = "";
				if(rdbtn1.isSelected()) {
					result += rdbtn1.getText() + " ";
				} else if(rdbtn2.isSelected()) {
					result += rdbtn2.getText() + " ";
				} else if(rdbtn3.isSelected()) {
					result += rdbtn3.getText() + " ";
				}
				
				System.out.println(result);
			}
		});
		btn1.setBounds(8, 85, 97, 23);
		contentPane.add(btn1);
	}
}
