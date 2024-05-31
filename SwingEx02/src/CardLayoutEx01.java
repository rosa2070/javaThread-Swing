import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class CardLayoutEx01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutEx01 frame = new CardLayoutEx01();
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
	public CardLayoutEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);
		
		JButton btn1 = new JButton("panel1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout)panel2.getLayout()).show(panel2, "name_1229788386194000");

			}
		});
		panel1.add(btn1);
		
		JButton btn2 = new JButton("panel2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout)panel2.getLayout()).show(panel2, "name_1229802133245100");

			}
		});
		panel1.add(btn2);
		
		JButton btn3 = new JButton("panel3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout)panel2.getLayout()).show(panel2, "name_1229809535751800");

			}
		});
		panel1.add(btn3);
		
		panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new CardLayout(0, 0));
		
		JPanel panel2_1 = new JPanel();
		panel2_1.setBackground(Color.CYAN);
		panel2.add(panel2_1, "name_1229788386194000");
		panel2_1.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(12, 10, 550, 23);
		panel2_1.add(btnNewButton);
		
		JPanel panel2_2 = new JPanel();
		panel2_2.setBackground(Color.ORANGE);
		panel2.add(panel2_2, "name_1229802133245100");
		panel2_2.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(8, 6, 115, 23);
		panel2_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(8, 31, 115, 23);
		panel2_2.add(chckbxNewCheckBox_1);
		
		JPanel panel2_3 = new JPanel();
		panel2_3.setBackground(Color.MAGENTA);
		panel2.add(panel2_3, "name_1229809535751800");
		panel2_3.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(8, 6, 121, 23);
		panel2_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(8, 31, 121, 23);
		panel2_3.add(rdbtnNewRadioButton_1);
	}
}
