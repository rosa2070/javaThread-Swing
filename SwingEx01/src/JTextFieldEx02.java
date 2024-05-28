import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JTextFieldEx02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTextFieldEx02 frame = new JTextFieldEx02();
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
	public JTextFieldEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("hong gil dong");
		textField.setBounds(12, 10, 560, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		

		
		JButton btn1 = new JButton("대문자로 변경");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*String[] names = textField.getText().split(" ");
				
				for(int i=0; i<names.length; i++) {
					names[i] = names[i].substring(0,1).toUpperCase() + names[i].substring(1);
				}
				
				textField_result.setText("출력 : " + String.join(" ", names));
				*/
				
				// 입력값 검사
				Util u = new Util(textField.getText());
				textField_result.setText(u.capitalizeName());
			}
		});

		btn1.setBounds(12, 41, 560, 23);
		contentPane.add(btn1);
		
		textField_result = new JTextField();
		textField_result.setEditable(false);
		textField_result.setBounds(12, 74, 560, 21);
		contentPane.add(textField_result);
		textField_result.setColumns(10);
		

	}

}
