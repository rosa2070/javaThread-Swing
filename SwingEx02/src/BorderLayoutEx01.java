import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class BorderLayoutEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderLayoutEx01 frame = new BorderLayoutEx01();
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
	public BorderLayoutEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 10));
		
		JButton btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("New button");
		contentPane.add(btnNewButton_3, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("New button");
		contentPane.add(btnNewButton_4, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(10);
		flowLayout.setHgap(50);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		panel.add(btnNewButton_9);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_10 = new JButton("New button");
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		panel_1.add(btnNewButton_11);
	}

}
