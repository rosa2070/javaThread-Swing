import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpSearch extends JFrame {

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
					EmpSearch frame = new EmpSearch();
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
	public EmpSearch() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC0AC\uC6D0\uC774\uB984 \uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(20, 16, 530, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 18, 360, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("사용이름 검색");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String empName = new String(textField.getText());
				if (empName.length() < 1) {
					textArea.setText("사원이름을 1자 이상 입력");
				} else {
					textArea.setText("");
					
					EmpDAO dao = new EmpDAO();
					ArrayList<EmpTO> emps = dao.searchEmp(empName);
					
					for (EmpTO emp : emps) {
						String empno = emp.getEmpno();
						String ename = emp.getEname();
						String job = emp.getJob();
						String dname = emp.getDname();
						String loc = emp.getLoc();
						
						String result = String.format("%s %s %s %s %s",
								empno, ename, job, dname, loc);
						textArea.append(result + System.lineSeparator()); 
					}
				    
				}
			}
		});
		btn.setBounds(387, 17, 119, 23);
		panel.add(btn);
		
		textArea = new JTextArea();
		textArea.setBounds(24, 89, 522, 443);
		contentPane.add(textArea);
	}

}
