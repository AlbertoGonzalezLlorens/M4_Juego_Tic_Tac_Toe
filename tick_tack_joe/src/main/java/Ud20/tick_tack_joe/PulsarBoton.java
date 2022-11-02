package Ud20.tick_tack_joe;

import javax.swing.JToggleButton;

import java.util.List;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PulsarBoton {
	protected int contador_global = 0;
	private int contador_x = 0;
	private int contador_o = 0;
	private int contador_individual[][] = new int[3][3];
	private int contador_individual_cpu[] = new int[9];
	private String text = "";
	private boolean recien_eliminado[][] = new boolean[3][3];
	private boolean recien_eliminado_cpu[] = new boolean[9];
	private int bwhile =0;

	public PulsarBoton() {

	}

	public void interaccionBoton(int x, int y, JToggleButton tglbtnNewToggleButton, JTextField textField, JTextField textField_1, JLabel lblNewLabel) {
		
		if (contador_global%2==0) {
			text=tglbtnNewToggleButton.getText();
			if (text.equals("o")) {
				JOptionPane.showMessageDialog(null,"Esta casilla no se puede modificar");
			}
			else if (!text.equals("x") && !text.equals("o") && contador_x==3){
				JOptionPane.showMessageDialog(null,"Ya tienes 3 X cambia una de lugar");
			}
			else if (text.equals("x") && contador_x!=3) {
				JOptionPane.showMessageDialog(null,"Debes marcar otra casilla");
			}
			else {
				if (recien_eliminado[x][y]==true) {
					JOptionPane.showMessageDialog(null,"Acabas de borrar esta casilla, has de situar la pieza en otro lugar");
				}
				else if (contador_individual[x][y]%2==0) {
					contador_individual[x][y]++;
					tglbtnNewToggleButton.setText("x");
					contador_global++;
					contador_x++;
					lblNewLabel.setText(""+textField_1.getText()+", te toca mover ficha");
					for (int i=0;i<3;i++) {
						for (int j=0;j<3;j++) {
							recien_eliminado[i][j]=false;
						}
					}
				}
				else if(contador_individual[x][y]%2!=0) {
					contador_individual[x][y]++;
					tglbtnNewToggleButton.setText("");
					contador_x--;
					recien_eliminado[x][y]=true;
				}
			}
		}
		else if(contador_global%2!=0) {
			text=tglbtnNewToggleButton.getText();
			if (text.equals("x")) {
				JOptionPane.showMessageDialog(null,"Esta casilla no se puede modificar");
			}
			else if (!text.equals("x") && !text.equals("o") && contador_o==3){
				JOptionPane.showMessageDialog(null,"Ya tienes 3 o cambia una de lugar");
			}
			else if (text.equals("o") && contador_o!=3) {
				JOptionPane.showMessageDialog(null,"Debes marcar otra casilla");
			}
			else {
				if (recien_eliminado[x][y]==true) {
					JOptionPane.showMessageDialog(null,"Acabas de borrar esta casilla, has de situar la pieza en otro lugar");
				}
				else if (contador_individual[x][y]%2==0) {
					contador_individual[x][y]++;
					tglbtnNewToggleButton.setText("o");
					contador_global++;
					contador_o++;
					lblNewLabel.setText(""+textField.getText()+", te toca mover ficha");
					for (int i=0;i<3;i++) {
						for (int j=0;j<3;j++) {
							recien_eliminado[i][j]=false;
						}
					}
				}
				else if(contador_individual[x][y]%2!=0) {
					contador_individual[x][y]++;
					tglbtnNewToggleButton.setText("");
					contador_o--;
					recien_eliminado[x][y]=true;
				}
			}
		}
	}
	
	public void interaccionBotonXCpu(int x, int y, JToggleButton tglbtnNewToggleButton, JTextField textField, JTextField textField_1, JLabel lblNewLabel) {
		
		if (contador_global%2==0) {
			text=tglbtnNewToggleButton.getText();
			if (text.equals("o")) {
				JOptionPane.showMessageDialog(null,"Esta casilla no se puede modificar");
			}
			else if (!text.equals("x") && !text.equals("o") && contador_x==3){
				JOptionPane.showMessageDialog(null,"Ya tienes 3 X cambia una de lugar");
			}
			else if (text.equals("x") && contador_x!=3) {
				JOptionPane.showMessageDialog(null,"Debes marcar otra casilla");
			}
			else {
				if (recien_eliminado[x][y]==true) {
					JOptionPane.showMessageDialog(null,"Acabas de borrar esta casilla, has de situar la pieza en otro lugar");
				}
				else if (contador_individual[x][y]%2==0) {
					contador_individual[x][y]++;
					tglbtnNewToggleButton.setText("x");
					contador_global++;
					contador_x++;
					lblNewLabel.setText(""+textField_1.getText()+", te toca mover ficha");
					for (int i=0;i<3;i++) {
						for (int j=0;j<3;j++) {
							recien_eliminado[i][j]=false;
						}
					}
				}
				else if(contador_individual[x][y]%2!=0) {
					contador_individual[x][y]++;
					tglbtnNewToggleButton.setText("");
					contador_x--;
					recien_eliminado[x][y]=true;
				}
			}
		}
	}
	
	public void interaccionBotonOCpu(JTextField textField, JTextField textField_1, JLabel lblNewLabel,List<JToggleButton> list) {
		bwhile = 0;
		Random rad = new Random();
		if(contador_global%2!=0) {
			while (bwhile==0) {
				int ficha = rad.nextInt(9);
				text=list.get(ficha).getText();
				if (text.equals("x")) {
				}
				else if (!text.equals("x") && !text.equals("o") && contador_o==3){
				}
				else if (text.equals("o") && contador_o!=3) {
				}
				else {
					if (recien_eliminado_cpu[ficha]==true) {
					}
					else if (contador_individual_cpu[ficha]%2==0) {
						contador_individual_cpu[ficha]++;
						list.get(ficha).setText("o");
						contador_global++;
						contador_o++;
						lblNewLabel.setText(""+textField.getText()+", te toca mover ficha");
						for (int i=0;i<9;i++) {
							recien_eliminado_cpu[i]=false;
						}
						bwhile++;
					}
					else if(contador_individual_cpu[ficha]%2!=0) {
						contador_individual_cpu[ficha]++;
						list.get(ficha).setText("");
						contador_o--;
						recien_eliminado_cpu[ficha]=true;
					}
				}
			}
			
		}
	}

	public void resetearJuego(JToggleButton tglbtnNewToggleButton,JToggleButton tglbtnNewToggleButton_1,JToggleButton tglbtnNewToggleButton_2,JToggleButton tglbtnNewToggleButton_3,JToggleButton tglbtnNewToggleButton_4,JToggleButton tglbtnNewToggleButton_5,JToggleButton tglbtnNewToggleButton_6,JToggleButton tglbtnNewToggleButton_7,JToggleButton tglbtnNewToggleButton_8,JLabel lblNewLabel,JTextField textField, JTextField textField_1) {
		
		contador_global = 0;
		contador_x = 0;
		contador_o = 0;
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				recien_eliminado[i][j]=false;
			}
		}
		
		for (int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				contador_individual[i][j]=0;
			}
		}
		
		
		for (int i=0;i<9;i++) {
			recien_eliminado_cpu[i]=false;
		}
		
		for (int i=0; i<9;i++) {
			contador_individual_cpu[i]=0;
		}
		
		tglbtnNewToggleButton.setText("");
		tglbtnNewToggleButton_1.setText("");
		tglbtnNewToggleButton_2.setText("");
		tglbtnNewToggleButton_3.setText("");
		tglbtnNewToggleButton_4.setText("");
		tglbtnNewToggleButton_5.setText("");
		tglbtnNewToggleButton_6.setText("");
		tglbtnNewToggleButton_7.setText("");
		tglbtnNewToggleButton_8.setText("");
		
		tglbtnNewToggleButton.setEnabled(false);
		tglbtnNewToggleButton_1.setEnabled(false);
		tglbtnNewToggleButton_2.setEnabled(false);
		tglbtnNewToggleButton_3.setEnabled(false);
		tglbtnNewToggleButton_4.setEnabled(false);
		tglbtnNewToggleButton_5.setEnabled(false);
		tglbtnNewToggleButton_6.setEnabled(false);
		tglbtnNewToggleButton_7.setEnabled(false);
		tglbtnNewToggleButton_8.setEnabled(false);
		
		lblNewLabel.setText("");
		
		textField.setText("");
		textField_1.setText("");
		
	}
	
	
}
