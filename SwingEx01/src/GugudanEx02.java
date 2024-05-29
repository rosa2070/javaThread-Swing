import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GugudanEx02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GugudanEx02 frame = new GugudanEx02();
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
	public GugudanEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("구구단 입력");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String dan = JOptionPane.showInputDialog( GugudanEx02.this, "단수 입력", "구구단", JOptionPane.QUESTION_MESSAGE );
				if( dan != null ) {
					textArea.setText("");
					String[] dans = dan.split( "," );
					for(String d : dans) {
						for(int i=1; i<=9; i++) {
//							System.out.printf("%s X %s =%s%n", d, i, Integer.parseInt(d)*i);
							String strGugudan = String.format("%s x %s = %s%n", d, i, (Integer.parseInt(d) * i));
							textArea.append(strGugudan);
						}
					}
				} else {
					JOptionPane.showMessageDialog( GugudanEx02.this, "단수를 입력해 주세요", "구구단", JOptionPane.WARNING_MESSAGE );
				}
			}
		});
		btn.setBounds(12, 10, 560, 23);
		contentPane.add(btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 43, 560, 708);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}
}
