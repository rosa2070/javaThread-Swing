import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class JLabelEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelEx01 frame = new JLabelEx01();
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
	public JLabelEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("New label");
		lbl1.setIcon(new ImageIcon(JLabelEx01.class.getResource("/images/button.jpeg")));
		lbl1.setBounds(12, 10, 187, 80);
		contentPane.add(lbl1);
	}
}
