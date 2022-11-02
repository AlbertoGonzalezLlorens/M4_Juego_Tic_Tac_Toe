package Ud20.tick_tack_joe;

import javax.swing.JToggleButton;
import javax.swing.JOptionPane;

public class PulsarBoton {
	private int contador_global=0;
	private int contador_x=0;
	private int contador_o=0;
	private int contador_individual[][]=new int[3][3];
	private String text="";
	
	public PulsarBoton() {
		
	}
	
	public void interaccionBoton(int x, int y, JToggleButton tglbtnNewToggleButton) {
		
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
				if (contador_individual[x][y]%2==0) {
					contador_individual[x][y]++;
					tglbtnNewToggleButton.setText("x");
					contador_global++;
					contador_x++;
				}
				else if(contador_individual[x][y]%2!=0) {
					contador_individual[x][y]++;
					tglbtnNewToggleButton.setText("");
					contador_x--;
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
			else if (text.equals("o") && contador_x!=3) {
				JOptionPane.showMessageDialog(null,"Debes marcar otra casilla");
			}
			else {
				if (contador_individual[x][y]%2==0) {
					contador_individual[x][y]++;
					tglbtnNewToggleButton.setText("o");
					contador_global++;
					contador_o++;
				}
				else if(contador_individual[x][y]%2!=0) {
					contador_individual[x][y]++;
					tglbtnNewToggleButton.setText("");
					contador_o--;
				}
			}
		}
	}
	
	
}
