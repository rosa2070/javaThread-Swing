import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JProgressBarEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JProgressBarEx01 frame = new JProgressBarEx01();
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
	public JProgressBarEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setValue(50);
		progressBar.setBounds(12, 10, 560, 23);
		contentPane.add(progressBar);
		
		btn1 = new JButton("감소");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(progressBar.getValue());
				// 최소값에 도달하면 
				// 최소값에 도달했다는 메시지
				if (progressBar.getValue() == progressBar.getMinimum()) {
					JOptionPane.showMessageDialog(JProgressBarEx01.this, "최소값에 도달", "에러", JOptionPane.WARNING_MESSAGE);
				} else {
					progressBar.setValue(progressBar.getValue() - 10);

				}	
			}
		});
		btn1.setBounds(12, 53, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("증가");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 최대값에 도달하면 
				// 최대값에 도달했다는 메시지
				if (progressBar.getValue() == progressBar.getMaximum()) {
					JOptionPane.showMessageDialog(JProgressBarEx01.this, "최대값에 도달", "에러", JOptionPane.WARNING_MESSAGE);
				} else {
					progressBar.setValue(progressBar.getValue() + 10);

				}
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2.setBounds(475, 53, 97, 23);
		contentPane.add(btn2);
	}
}
