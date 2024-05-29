import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class JSliderEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSlider slider;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSliderEx01 frame = new JSliderEx01();
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
	public JSliderEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		slider = new JSlider();
		slider.setSnapToTicks(true);
		slider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if( textArea != null) {
					textArea.append(slider.getValue() + System.lineSeparator());
				}
			}
		});
		
		// 계속적
		/*
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if( textArea != null) {
					textArea.append(slider.getValue() + System.lineSeparator());
				}
			}
		});
		*/
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(10);
		slider.setMaximum(200);
		slider.setBounds(12, 10, 560, 44);
		contentPane.add(slider);
		
		JButton btn = new JButton("내용 가져오기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.append(slider.getValue() + System.lineSeparator());
			}
		});
		btn.setBounds(12, 65, 145, 23);
		contentPane.add(btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 106, 560, 510);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}
}
