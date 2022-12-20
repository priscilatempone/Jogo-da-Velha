import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Metodos_do_Jogo implements ActionListener, AtributosEMetodos{
	
	Random aleatorio = new Random();
	JFrame tamanho = new JFrame();
	JPanel painel_do_titulo = new JPanel();
	JPanel painel_do_jogo = new JPanel();
	JLabel titulo_do_jogo = new JLabel();
	JButton[] botoes = new JButton[9];
	
	private boolean vez_do_jogador1;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<9;i++) {
			if(e.getSource()==botoes[i]) {
				if(vez_do_jogador1) {
					if(botoes[i].getText()=="") {
						botoes[i].setForeground(new Color(255,0,0));
						botoes[i].setText("X");
						vez_do_jogador1=false;
						titulo_do_jogo.setText("Vez do Jogador O");
						checarJogo();
					}
				}
				else {
					if(botoes[i].getText()=="") {
						botoes[i].setForeground(new Color(0,0,255));
						botoes[i].setText("O");
						vez_do_jogador1=true;
						titulo_do_jogo.setText("Vez do Jogador X");
						checarJogo();
					}
				}
			}			
		}
	}
	
	private void botoesDaVitoria(int a, int b, int c) {
		botoes[a].setBackground(Color.GREEN);
		botoes[b].setBackground(Color.GREEN);
		botoes[c].setBackground(Color.GREEN);
	}
	
	public void primeiraPartida() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		if(aleatorio.nextInt(2) == 0 ) {
			vez_do_jogador1 = true;
			titulo_do_jogo.setText("Vez do Jogador X");
		}
		else {
			vez_do_jogador1 = false;
			titulo_do_jogo.setText("Vez do Jogador 	O");
		}
	}
	
	public void checarJogo() {
		//check X win conditions
		if(
				(botoes[0].getText()=="X") &&
				(botoes[1].getText()=="X") &&
				(botoes[2].getText()=="X")
				) {
			xVence(0,1,2);
		}
		if(
				(botoes[3].getText()=="X") &&
				(botoes[4].getText()=="X") &&
				(botoes[5].getText()=="X")
				) {
			xVence(3,4,5);
		}
		if(
				(botoes[6].getText()=="X") &&
				(botoes[7].getText()=="X") &&
				(botoes[8].getText()=="X")
				) {
			xVence(6,7,8);
		}
		if(
				(botoes[0].getText()=="X") &&
				(botoes[3].getText()=="X") &&
				(botoes[6].getText()=="X")
				) {
			xVence(0,3,6);
		}
		if(
				(botoes[1].getText()=="X") &&
				(botoes[4].getText()=="X") &&
				(botoes[7].getText()=="X")
				) {
			xVence(1,4,7);
		}
		if(
				(botoes[2].getText()=="X") &&
				(botoes[5].getText()=="X") &&
				(botoes[8].getText()=="X")
				) {
			xVence(2,5,8);
		}
		if(
				(botoes[0].getText()=="X") &&
				(botoes[4].getText()=="X") &&
				(botoes[8].getText()=="X")
				) {
			xVence(0,4,8);
		}
		if(
				(botoes[2].getText()=="X") &&
				(botoes[4].getText()=="X") &&
				(botoes[6].getText()=="X")
				) {
			xVence(2,4,6);
		}
		//check O win conditions
		if(
				(botoes[0].getText()=="O") &&
				(botoes[1].getText()=="O") &&
				(botoes[2].getText()=="O")
				) {
			oVence(0,1,2);
		}
		if(
				(botoes[3].getText()=="O") &&
				(botoes[4].getText()=="O") &&
				(botoes[5].getText()=="O")
				) {
			oVence(3,4,5);
		}
		if(
				(botoes[6].getText()=="O") &&
				(botoes[7].getText()=="O") &&
				(botoes[8].getText()=="O")
				) {
			oVence(6,7,8);
		}
		if(
				(botoes[0].getText()=="O") &&
				(botoes[3].getText()=="O") &&
				(botoes[6].getText()=="O")
				) {
			oVence(0,3,6);
		}
		if(
				(botoes[1].getText()=="O") &&
				(botoes[4].getText()=="O") &&
				(botoes[7].getText()=="O")
				) {
			oVence(1,4,7);
		}
		if(
				(botoes[2].getText()=="O") &&
				(botoes[5].getText()=="O") &&
				(botoes[8].getText()=="O")
				) {
			oVence(2,5,8);
		}
		if(
				(botoes[0].getText()=="O") &&
				(botoes[4].getText()=="O") &&
				(botoes[8].getText()=="O")
				) {
			oVence(0,4,8);
		}
		if(
				(botoes[2].getText()=="O") &&
				(botoes[4].getText()=="O") &&
				(botoes[6].getText()=="O")
				) {
			oVence(2,4,6);
		}
	}
	
	public void xVence(int a,int b,int c) {
		botoesDaVitoria(a, b, c);
		
		for(int i=0;i<9;i++) {
			botoes[i].setEnabled(false);
		}
		titulo_do_jogo.setText("X venceu!");
	}

	public void oVence(int a,int b,int c) {
		botoesDaVitoria(a, b, c);
		
		for(int i=0;i<9;i++) {
			botoes[i].setEnabled(false);
		}
		titulo_do_jogo.setText("O venceu!");
	}
}


