import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MyFirstScreen extends JFrame {
	
	MyFirstScreen(){
		JButton ok = new JButton("OK");
		JButton cancel = new JButton("Cancel");
		ok.setBounds(50, 30, 60, 50);
		cancel.setBounds(120, 30, 90, 50);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(ok);
		this.getContentPane().add(cancel);
	}

	public static void main(String[] args) {
		MyFirstScreen screen = new MyFirstScreen();
		screen.setSize(300, 400);
		screen.setVisible(true);

	}

}
