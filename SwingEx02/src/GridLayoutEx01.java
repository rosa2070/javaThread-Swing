import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;

public class GridLayoutEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutEx01 frame = new GridLayoutEx01();
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
	public GridLayoutEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);
		
		JButton btn1 = new JButton("New button");
		panel1.add(btn1);
		
		JButton btn2 = new JButton("New button");
		panel1.add(btn2);
		
		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new GridLayout(3, 3, 10, 10));
		
		JButton btnNewButton = new JButton("New button");
		panel2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		panel2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		panel2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		panel2.add(btnNewButton_9);
	}

}
