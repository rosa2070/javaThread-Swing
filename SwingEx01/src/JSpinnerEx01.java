import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class JSpinnerEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSpinner spinner1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSpinnerEx01 frame = new JSpinnerEx01();
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
	public JSpinnerEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		spinner1 = new JSpinner();
		spinner1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println((Integer)spinner1.getValue());
			}
			
		});
		spinner1.setModel(new SpinnerNumberModel(10, 0, 100, 10));
		spinner1.setBounds(12, 10, 560, 22);
		contentPane.add(spinner1);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setModel(new SpinnerListModel(new String[] {"사과", "참외", "수박", "\uB538\uAE30", "\uC790\uB450"}));
		spinner2.setBounds(12, 42, 560, 22);
		contentPane.add(spinner2);
		
		JSpinner spinner3 = new JSpinner();
		spinner3.setModel(new SpinnerDateModel(new Date(1716908400000L), new Date(1685286000000L), new Date(1748444400000L), Calendar.DAY_OF_YEAR));
		spinner3.setBounds(12, 74, 560, 22);
		contentPane.add(spinner3);
		
		JButton btn = new JButton("내용 가져오기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println((Integer)spinner1.getValue());
			}
		});
		btn.setBounds(12, 106, 127, 23);
		contentPane.add(btn);
	}
}
