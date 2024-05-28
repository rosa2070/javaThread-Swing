import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GugudanEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GugudanEx01 frame = new GugudanEx01();
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
	public GugudanEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uAD6C\uAD6C\uB2E8 \uC785\uB825", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 18, 566, 82);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl = new JLabel("단수입력: ");
		lbl.setBounds(12, 49, 57, 15);
		panel.add(lbl);
		
		textField = new JTextField();
		textField.setBounds(69, 46, 346, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("구구단 출력");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 초기화
				textArea.setText("");
				
				String dan = new String(textField.getText());
				
				for (int i=1; i<=9; i++) {
					String strGugudan = String.format("%s X %s = %s%n", dan, i, (Integer.parseInt(dan) * i));	
					textArea.append(strGugudan);
				}
			}
		});
		
		
		btn.setBounds(423, 45, 109, 23);
		panel.add(btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 115, 560, 636);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}

}
