import jaco.mp3.player.MP3Player;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;


public class GameSplash extends JWindow {
	Timer timer ;
	private boolean isVisible = true;
	int progressValue = 0;
	JProgressBar progressBar = new JProgressBar();
	JLabel lblTictactoe = new JLabel("TicTacToe-2016");
	Icon icon = new ImageIcon(GameSplash.class.getResource("giphy.gif"));
	public static void main(String[] args) {
		
					GameSplash frame = new GameSplash();
					
					frame.setVisible(true);
					frame.playSong();
					frame.doAnimation();
					
				
	}
	private void playSong(){
		MP3Player mp3= new MP3Player(GameSplash.class.getResource("BMB.mp3"));
		mp3.play();
	}
	private void doAnimation(){
		 timer = new Timer(50,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblTictactoe.setVisible(isVisible);
				Random r = new Random();
				if(progressValue>=100){
					timer.stop();
					GameSplash.this.setVisible(false);
					GameSplash.this.dispose();
					TicTacToe toe = new TicTacToe();
					toe.setVisible(true);
				}
				progressValue++;
				progressBar.setValue(progressValue);
				lblTictactoe.setForeground(new Color(r.nextInt(255), r.nextInt(100), r.nextInt(155)));
				isVisible = !isVisible;
				
			}
		});
		timer.start();
	}
	

	
	public GameSplash() {
		getContentPane().setBackground(Color.CYAN);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 450, 432);
		getContentPane().setLayout(null);
		
		JLabel imglbl = new JLabel("");
		imglbl.setIcon(icon);
		imglbl.setBounds(10, 21, 414, 228);
		getContentPane().add(imglbl);
		
		
		lblTictactoe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTictactoe.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblTictactoe.setBounds(83, 280, 341, 35);
		getContentPane().add(lblTictactoe);
		progressBar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		
		progressBar.setBackground(Color.YELLOW);
		progressBar.setForeground(Color.RED);
		progressBar.setStringPainted(true);
		progressBar.setBounds(10, 326, 414, 41);
		getContentPane().add(progressBar);
		
	}
}
