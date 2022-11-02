package Ud20.tick_tack_joe;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

public class tic_tac_toe extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public tic_tac_toe() {
		UIManager.put("ToggleButton.select", Color.TRANSLUCENT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tglbtnNewToggleButton.setText("X");
				
			}
		});
		tglbtnNewToggleButton.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("");
		tglbtnNewToggleButton_3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_3.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("");
		tglbtnNewToggleButton_6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_6.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_6);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("");
		tglbtnNewToggleButton_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_1.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("");
		tglbtnNewToggleButton_2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_2.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("");
		tglbtnNewToggleButton_4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_4.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("");
		tglbtnNewToggleButton_5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_5.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("");
		tglbtnNewToggleButton_7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_7.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_7);
		
		JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("");
		tglbtnNewToggleButton_8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtnNewToggleButton_8.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(128, 128, 255));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(10, 40, 193, 93);
		panel_1.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2_1.setBounds(10, 158, 193, 93);
		panel_1.add(panel_2_1);
		
	}
}
