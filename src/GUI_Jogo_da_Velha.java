import java.awt.*;
import javax.swing.*;

public class GUI_Jogo_da_Velha extends Metodos_do_Jogo implements AtributosEMetodos {

	

	GUI_Jogo_da_Velha(){
		
		tamanho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tamanho.setSize(800,800);
		tamanho.getContentPane().setBackground(new Color(50,50,50));
		tamanho.setLayout(new BorderLayout());
		tamanho.setVisible(true);
		
		titulo_do_jogo.setBackground(new Color(25,25,25));
		titulo_do_jogo.setForeground(new Color(153, 153, 255));
		titulo_do_jogo.setFont(new Font("Broadway",Font.PLAIN,75));
		titulo_do_jogo.setHorizontalAlignment(JLabel.CENTER);
		titulo_do_jogo.setText("JOGO DA VELHA");
		titulo_do_jogo.setOpaque(true);
		
		painel_do_titulo.setLayout(new BorderLayout());
		painel_do_titulo.setBounds(0,0,800,100);
		
		painel_do_jogo.setLayout(new GridLayout(3,3));
		painel_do_jogo.setBackground(new Color(150,150,150));
		
		for(int i=0;i<9;i++) {
			botoes[i] = new JButton();
			painel_do_jogo.add(botoes[i]);
			botoes[i].setFont(new Font("MV Boli",Font.BOLD,120));
			botoes[i].setFocusable(false);
			botoes[i].addActionListener(this);
		}
		
		painel_do_titulo.add(titulo_do_jogo);
		tamanho.add(painel_do_titulo,BorderLayout.NORTH);
		tamanho.add(painel_do_jogo);
		
		primeiraPartida();
	}
}