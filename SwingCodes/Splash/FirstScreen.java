import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FirstScreen extends JFrame { // implements ActionListener {

	/*public void actionPerformed(ActionEvent e){
		String btnLbl = e.getActionCommand();
		String msg = "";
		if(btnLbl.equalsIgnoreCase("ok")){
			msg = "Hello U Click on "+btnLbl;
		}
		else
		{
			msg = "Bye U Click on "+btnLbl;
		}
		JOptionPane.showMessageDialog(this, msg);
	}*/
	
	public static void main(String[] args) {
		
					FirstScreen frame = new FirstScreen();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public FirstScreen() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 601, 373);
		this.getContentPane().setLayout(null);
		
		JButton btnOk = new JButton("Ok");
		// Register Listener on Button
		
		
		/*ActionListener l = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(FirstScreen.this, "Hello U Click on Ok"); 
				
			}
		};
		btnOk.addActionListener(l);*/
		btnOk.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				 okClick();
				
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOk.setBounds(45, 79, 89, 23);
		getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelClick();
			}
		});
		//btnCancel.addActionListener(this);
		btnCancel.setBounds(174, 79, 89, 23);
		getContentPane().add(btnCancel);
		
	}
	private void okClick(){
		JOptionPane.showMessageDialog(this, "Hello U Click on Ok");
	}
	private void cancelClick(){
		JOptionPane.showMessageDialog(this, "Bye U Click on Cancel"); 
	}
	
}
