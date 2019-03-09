import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class JavaSwingApp extends JFrame implements ActionListener{
    
	//componennts reference
    private JButton btnSwing;
    private JLabel lblSwing;
    private int noClicks=0;
	private JPanel pnlSwing;
	
	public static void main (String[]args){
		//create the frame object 
		new JavaSwingApp();
	}
	
	//create the constructor 
	public JavaSwingApp(){
		//set the properties 
		btnSwing = new JButton("I am Swing Button");
		lblSwing = new JLabel("Number of button clicks"+noClicks);
		//create container 
		pnlSwing = new JPanel();
		Container contentPane=getContentPane();
		//add components to container
		pnlSwing.add(btnSwing);
		pnlSwing.add(lblSwing);
		contentPane.add(pnlSwing,BorderLayout.CENTER);	
		//delegate ActionListener object to btnSwing
		btnSwing.addActionListener(this);
		setTitle("JavaSwingApp");
		setSize(300,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	 @Override
	 public void actionPerformed(ActionEvent e){
		 noClicks++;
		 lblSwing.setText("Number of button clicks:"+noClicks);
	 }
}
