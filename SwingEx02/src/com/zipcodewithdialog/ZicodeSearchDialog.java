package com.zipcodewithdialog;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ZicodeSearchDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTable table;
	
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
			ZicodeSearchDialog dialog = new ZicodeSearchDialog();
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
	public ZicodeSearchDialog() {
		setBounds(100, 100, 450, 606);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.setBounds(12, 10, 269, 21);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btn = new JButton("우편번호 검색");
			btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					outputData = textField.getText();
					String zipcode = new String(outputData);
					table.setModel(new ZipcodeTableModel(zipcode));
					
				}
			});
			btn.setBounds(293, 9, 129, 23);
			contentPanel.add(btn);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 41, 410, 483);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"\uC6B0\uD3B8\uBC88\uD638", "\uC2DC\uB3C4", "\uAD6C\uAD70", "\uB3D9", "\uB9AC", "\uBC88\uC9C0"
			}
		));
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("확인");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						ZicodeSearchDialog.this.dispose();
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
						ZicodeSearchDialog.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
