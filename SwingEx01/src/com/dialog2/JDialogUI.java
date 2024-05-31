package com.dialog2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JDialogUI extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField1;
	private JTextField textField2;
	
	private String outputData;
	
	public String getOutputData() {
		return outputData;
	}

	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		try {
			JDiialogUI dialog = new JDiialogUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	/**
	 * Create the dialog.
	 */
	public JDialogUI() {
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField1 = new JTextField();
			textField1.setBounds(12, 10, 410, 21);
			contentPanel.add(textField1);
			textField1.setColumns(10);
		}
		{
			textField2 = new JTextField();
			textField2.setBounds(12, 44, 410, 21);
			contentPanel.add(textField2);
			textField2.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("확인");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String data = textField2.getText();
						System.out.println(data);
						JDialogUI.this.outputData = data; // ?뭔말
						JDialogUI.this.dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("취소");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
					
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public JDialogUI(String data) {
		this();
//		System.out.println(data);
		textField1.setText(data);
	}

}
