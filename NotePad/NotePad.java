import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class NotePad extends JFrame {
	ImageIcon icon = new ImageIcon(NotePad.class.getResource("favicon.png"));
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane();
	
	public static void main(String[] args) {
		
					NotePad frame = new NotePad();
					frame.setVisible(true);
				
	}
	private void closeNotePad(boolean action){
		
		if(!action && textArea.getText().length()==0){	
		this.setVisible(false);
		this.dispose();
		}
		else{
			int choice =JOptionPane.showConfirmDialog(this, "Do U want to Save this or Not","NOtepad2016",JOptionPane.YES_NO_CANCEL_OPTION);
			if(choice==JOptionPane.YES_OPTION){
				JFileChooser chooser = new JFileChooser("c:");
				chooser.showSaveDialog(this);
			}
			else
			if(choice == JOptionPane.NO_OPTION){
				if(action){
					textArea.setText("");
					return ;
				}
				this.setVisible(false);
				this.dispose();
			}
			else
			if(choice == JOptionPane.CANCEL_OPTION){	
				return ;
			}
		}
	}
	private void openDialog(){
		JFileChooser chooser = new JFileChooser("c:");
		chooser.showOpenDialog(this);
	}
	private void saveDialog(){
		JFileChooser chooser = new JFileChooser("c:");
		chooser.showSaveDialog(this);
	}
	private void notepadResize(){
		textArea.setSize(this.getWidth()-50, this.getHeight()-50);
		scrollPane.setSize(this.getWidth()-50, this.getHeight()-50);
		
	}
	public NotePad() {
		this.setIconImage(icon.getImage());
		setTitle("Untitled NotePad");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				closeNotePad(false);
			}
		});
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
			notepadResize();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setBounds(100, 100, 598, 410);
		getContentPane().setLayout(null);
		
		
		textArea.setBounds(42, 35, 358, 211);
		//getContentPane().add(textArea);
		
		
		scrollPane.setBounds(10, 30, 550, 390);
		scrollPane.setViewportView(textArea);
		getContentPane().add(scrollPane);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			closeNotePad(true);
			}
		});
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			openDialog();
			}
		});
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			saveDialog();
			}
		});
		mnFile.add(mntmSave);
		
		JMenuItem mntmSaveas = new JMenuItem("SaveAs");
		mnFile.add(mntmSaveas);
		
		JMenuItem mntmPrint = new JMenuItem("Print");
		mnFile.add(mntmPrint);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		
		//menuBar.setBounds(20, 0, 97, 21);
		//getContentPane().add(menuBar);
	}
}
