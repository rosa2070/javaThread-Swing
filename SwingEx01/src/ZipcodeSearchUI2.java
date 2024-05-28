import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class ZipcodeSearchUI2 extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater( new Runnable() {
			public void run() {
				try {
					ZipcodeSearchUI2 frame = new ZipcodeSearchUI2();
					frame.setVisible( true );
				} catch( Exception e ) {
					e.printStackTrace();
				}
			}
		} );
	}
	/**
	 * Create the frame.
	 */
	public ZipcodeSearchUI2() {
		setResizable( false );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 617, 611 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder(5, 5, 5, 5 ) );
		setContentPane( contentPane );
        
		contentPane.setLayout(null);
        
		JPanel panel = new JPanel();
		panel.setBorder( new TitledBorder( new EtchedBorder( EtchedBorder.LOWERED, new Color( 255, 255, 255 ), new Color( 160, 160, 160 ) ), "\uC6B0\uD380\uBC88\uD638 \uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );
		panel.setBounds( 6, 17, 583, 77 );
		contentPane.add( panel );
        
		panel.setLayout(null);
        
		textField = new JTextField();
		textField.setBounds( 12, 34, 419, 21 );
		panel.add( textField );
		textField.setColumns( 10 );
        
		JButton btn = new JButton( "우편번호 검색" );
		btn.addMouseListener( new MouseAdapter() {
			@Override
			public void mouseClicked( MouseEvent e ) {
				String strDong = textField.getText();
				if( strDong.length() < 2 ) {
					textArea.setText( "동이름을 2자 이상 입력" );
				} else {
					// 초기화
					textArea.setText( "" );
					
					// 데이터베이스 연결
					ZipcodeDAO dao = new ZipcodeDAO();
					// select
					ArrayList<ZipcodeTO> addresses = dao.searchZipcode( strDong );
					
					for( ZipcodeTO to : addresses ) {
						String zipcode = to.getZipcode();
						String sido = to.getSido();
						String gugun = to.getGugun();
						String dong = to.getDong();
						String ri = to.getRi();
						String bunji = to.getBunji();
							
						String address = String.format( "[%s] %s %s %s %s %s",
							zipcode, sido, gugun, dong, ri, bunji );
						textArea.append( address + System.lineSeparator() );
					}
				}
			}
		});
		btn.setBounds( 443, 33, 117, 23 );
		panel.add( btn );
        
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds( 12, 109, 577, 454 );
		contentPane.add( scrollPane );
        
		textArea = new JTextArea();
		textArea.setEditable( false );
		scrollPane.setViewportView( textArea );
	}
}
