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
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class tic_tac_toe extends JFrame {

	private JPanel contentPane;
	PulsarBoton boton = new PulsarBoton();
	private JTextField textField;
	private JTextField textField_1;
	JLabel lblNewLabel = new JLabel("");
	private final List<JToggleButton> list = new ArrayList<JToggleButton>();
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public tic_tac_toe() {
		UIManager.put("ToggleButton.select", Color.TRANSLUCENT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(128, 128, 255));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(10, 111, 287, 102);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2_1.setBounds(10, 245, 287, 176);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Humano");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(93, 118, 79, 21);
		panel_2_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("CPU");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(205, 116, 60, 21);
		panel_2_1.add(rdbtnNewRadioButton_1);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.setEnabled(false);
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected()) {
					boton.interaccionBoton(0,0, tglbtnNewToggleButton, textField, textField_1, lblNewLabel);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					boton.interaccionBotonXCpu(0,0, tglbtnNewToggleButton, textField, textField_1, lblNewLabel);
					boton.interaccionBotonOCpu(textField, textField_1, lblNewLabel,list);
				}			
			}
		});
		tglbtnNewToggleButton.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("");
		tglbtnNewToggleButton_3.setEnabled(false);
		tglbtnNewToggleButton_3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					boton.interaccionBoton(0,1, tglbtnNewToggleButton_3, textField, textField_1, lblNewLabel);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					boton.interaccionBotonXCpu(0,1, tglbtnNewToggleButton_3, textField, textField_1, lblNewLabel);
					boton.interaccionBotonOCpu(textField, textField_1, lblNewLabel,list);
				}
			}
		});
		tglbtnNewToggleButton_3.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("");
		tglbtnNewToggleButton_6.setEnabled(false);
		tglbtnNewToggleButton_6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					boton.interaccionBoton(0,2, tglbtnNewToggleButton_6, textField, textField_1, lblNewLabel);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					boton.interaccionBotonXCpu(0,2, tglbtnNewToggleButton_6, textField, textField_1, lblNewLabel);
					boton.interaccionBotonOCpu(textField, textField_1, lblNewLabel,list);
				}
			}
		});
		tglbtnNewToggleButton_6.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_6);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("");
		tglbtnNewToggleButton_1.setEnabled(false);
		tglbtnNewToggleButton_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					boton.interaccionBoton(1,0, tglbtnNewToggleButton_1, textField, textField_1, lblNewLabel);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					boton.interaccionBotonXCpu(1,0, tglbtnNewToggleButton_1, textField, textField_1, lblNewLabel);
					boton.interaccionBotonOCpu(textField, textField_1, lblNewLabel,list);
				}
			}
		});
		tglbtnNewToggleButton_1.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("");
		tglbtnNewToggleButton_2.setEnabled(false);
		tglbtnNewToggleButton_2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					boton.interaccionBoton(1,1, tglbtnNewToggleButton_2, textField, textField_1, lblNewLabel);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					boton.interaccionBotonXCpu(1,1, tglbtnNewToggleButton_2, textField, textField_1, lblNewLabel);
					boton.interaccionBotonOCpu(textField, textField_1, lblNewLabel,list);
				}
				
			}
		});
		tglbtnNewToggleButton_2.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("");
		tglbtnNewToggleButton_4.setEnabled(false);
		tglbtnNewToggleButton_4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					boton.interaccionBoton(1,2, tglbtnNewToggleButton_4, textField, textField_1, lblNewLabel);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					boton.interaccionBotonXCpu(1,2, tglbtnNewToggleButton_4, textField, textField_1, lblNewLabel);
					boton.interaccionBotonOCpu(textField, textField_1, lblNewLabel,list);
				}
				
			}
		});
		tglbtnNewToggleButton_4.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("");
		tglbtnNewToggleButton_5.setEnabled(false);
		tglbtnNewToggleButton_5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					boton.interaccionBoton(2,0, tglbtnNewToggleButton_5, textField, textField_1, lblNewLabel);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					boton.interaccionBotonXCpu(2,0, tglbtnNewToggleButton_5, textField, textField_1, lblNewLabel);
					boton.interaccionBotonOCpu(textField, textField_1, lblNewLabel,list);
				}
				
			}
		});
		tglbtnNewToggleButton_5.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("");
		tglbtnNewToggleButton_7.setEnabled(false);
		tglbtnNewToggleButton_7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					boton.interaccionBoton(2,1, tglbtnNewToggleButton_7, textField, textField_1, lblNewLabel);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					boton.interaccionBotonXCpu(2,1, tglbtnNewToggleButton_7, textField, textField_1, lblNewLabel);
					boton.interaccionBotonOCpu(textField, textField_1, lblNewLabel,list);
				}
				
			}
		});
		tglbtnNewToggleButton_7.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_7);
		
		JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("");
		tglbtnNewToggleButton_8.setEnabled(false);
		tglbtnNewToggleButton_8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		tglbtnNewToggleButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					boton.interaccionBoton(2,2, tglbtnNewToggleButton_8, textField, textField_1, lblNewLabel);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					boton.interaccionBotonXCpu(2,2, tglbtnNewToggleButton_8, textField, textField_1, lblNewLabel);
					boton.interaccionBotonOCpu(textField, textField_1, lblNewLabel,list);
				}
				
			}
		});
		tglbtnNewToggleButton_8.setBackground(new Color(255, 255, 255));
		panel.add(tglbtnNewToggleButton_8);
		
		JLabel lblNewLabel_1 = new JLabel("Jugador 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 10, 73, 17);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 48, 73, 17);
		panel_2.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(93, 47, 121, 17);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Jugador 2");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 10, 73, 17);
		panel_2_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nombre:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 52, 73, 17);
		panel_2_1.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(93, 53, 121, 17);
		panel_2_1.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(23, 118, 60, 17);
		panel_2_1.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Nueva Partida");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boton.resetearJuego(tglbtnNewToggleButton, tglbtnNewToggleButton_1, tglbtnNewToggleButton_2, tglbtnNewToggleButton_3, tglbtnNewToggleButton_4, tglbtnNewToggleButton_5, tglbtnNewToggleButton_6, tglbtnNewToggleButton_7, tglbtnNewToggleButton_8,lblNewLabel,textField,textField_1);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(73, 10, 170, 31);
		panel_1.add(btnNewButton);
		
		
		lblNewLabel.setEnabled(false);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(25, 51, 272, 21);
		panel_1.add(lblNewLabel);
		
		JButton btnEmpezarPartida = new JButton("Empezar Partida");
		btnEmpezarPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!textField.getText().equals("") && !textField_1.getText().equals("")) {
					tglbtnNewToggleButton.setEnabled(true);
					tglbtnNewToggleButton_1.setEnabled(true);
					tglbtnNewToggleButton_2.setEnabled(true);
					tglbtnNewToggleButton_3.setEnabled(true);
					tglbtnNewToggleButton_4.setEnabled(true);
					tglbtnNewToggleButton_5.setEnabled(true);
					tglbtnNewToggleButton_6.setEnabled(true);
					tglbtnNewToggleButton_7.setEnabled(true);
					tglbtnNewToggleButton_8.setEnabled(true);
					lblNewLabel.setText(""+textField.getText()+", te toca mover ficha");
				} else {
					JOptionPane.showMessageDialog(null,"Introducir nombre de los jugadores");
				}
			}
		});
		btnEmpezarPartida.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEmpezarPartida.setBounds(73, 423, 170, 31);
		panel_1.add(btnEmpezarPartida);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnNewRadioButton_1);
		
		list.add(tglbtnNewToggleButton);
		list.add(tglbtnNewToggleButton_1);
		list.add(tglbtnNewToggleButton_2);
		list.add(tglbtnNewToggleButton_3);
		list.add(tglbtnNewToggleButton_4);
		list.add(tglbtnNewToggleButton_5);
		list.add(tglbtnNewToggleButton_6);
		list.add(tglbtnNewToggleButton_7);
		list.add(tglbtnNewToggleButton_8);
		
	}
}
