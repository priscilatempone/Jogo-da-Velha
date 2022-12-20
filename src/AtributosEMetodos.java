
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public interface AtributosEMetodos {

	Random aleatorio = new Random();
	JFrame tamanho = new JFrame();
	JPanel painel_do_titulo = new JPanel();
	JPanel painel_do_jogo = new JPanel();
	JLabel titulo_do_jogo = new JLabel();
	JButton[] botoes = new JButton[9];
	public static final boolean vez_do_jogador1 = false;

	
	public void primeiraPartida();
	
	public void checarJogo();
	
	public void xVence(int a,int b,int c);
	
	public void oVence(int a,int b,int c);

	


}
