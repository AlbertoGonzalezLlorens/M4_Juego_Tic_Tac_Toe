package Ud20.tick_tack_joe;

import java.awt.EventQueue;

public class TicTacToeApp {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tic_tac_toe frame = new tic_tac_toe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
