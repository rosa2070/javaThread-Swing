import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JSpinnerEx02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSpinner spinner3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSpinnerEx02 frame = new JSpinnerEx02();
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
	public JSpinnerEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner1 = new JSpinner();
		
		// 실제 데이터
		String[] items = new String[] {"\uC0AC\uACFC", "\uB538\uAE30", "\uC218\uBC15", "\uCC38\uC678"};
		//
		SpinnerListModel spinnerListModel = new SpinnerListModel(items);
		spinner1.setModel(spinnerListModel);
		spinner1.setBounds(12, 10, 560, 22);
		contentPane.add(spinner1);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setModel(new CustomSpinnerListModel());
		spinner2.setBounds(12, 42, 560, 22);
		contentPane.add(spinner2);
		
		spinner3 = new JSpinner();
		spinner3.setBounds(12, 74, 560, 22);
		contentPane.add(spinner3);
		
		JButton btn = new JButton("데이터 넣기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				spinner3.setModel(new CustomSpinnerListModel());
			}
		});
		btn.setBounds(12, 106, 202, 23);
		contentPane.add(btn);
	}

}
