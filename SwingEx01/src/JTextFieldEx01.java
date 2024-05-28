import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class JTextFieldEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField1;
	private JLabel lbl1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTextFieldEx01 frame = new JTextFieldEx01();
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
	public JTextFieldEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setText("난 초기값"); // 중요
		textField1.setBounds(12, 10, 560, 21);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JButton btn1 = new JButton("클릭해주세요");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				lbl1.setText(textField1.getText());
				
//				lbl1.setText(passwordField.getText());
				lbl1.setText(new String(passwordField.getPassword()));
			}
		});
		btn1.setBounds(12, 72, 560, 23);
		contentPane.add(btn1);
		
		lbl1 = new JLabel("New label");
		lbl1.setBounds(12, 241, 560, 15);
		contentPane.add(lbl1);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(12, 41, 560, 21);
		contentPane.add(passwordField);
	}
}
