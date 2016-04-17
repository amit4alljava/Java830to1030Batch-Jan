import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TicTacToe extends JFrame {
	JButton one = new JButton("");
	private boolean isXorZero ;
	
	public static void main(String[] args) {
		
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
				
		
	}

	/**
	 * Create the frame.
	 */
	public TicTacToe() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 450, 300);
		this.getContentPane().setLayout(null);
		
		
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(one);
			}
		});
		one.setFont(new Font("Tahoma", Font.BOLD, 18));
		one.setBounds(29, 43, 115, 33);
		getContentPane().add(one);
		
		JButton two = new JButton("");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(two);
			}
		});
		two.setFont(new Font("Tahoma", Font.BOLD, 18));
		two.setBounds(166, 43, 115, 33);
		getContentPane().add(two);
		
		JButton three = new JButton("");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(three);
			}
		});
		three.setFont(new Font("Tahoma", Font.BOLD, 18));
		three.setBounds(309, 43, 115, 33);
		getContentPane().add(three);
		
		JButton four = new JButton("");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(four);
			}
		});
		four.setFont(new Font("Tahoma", Font.BOLD, 18));
		four.setBounds(29, 108, 115, 33);
		getContentPane().add(four);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(button_3);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_3.setBounds(166, 108, 115, 33);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(button_4);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_4.setBounds(309, 108, 115, 33);
		getContentPane().add(button_4);
	}
	private void printXorZero(JButton btn){
		if(btn.getText().trim().length()==0){
		if(isXorZero){
		btn.setText("X");
		}
		else
		{
			btn.setText("0");
		}
		isXorZero = !isXorZero;
		}
	}

}
