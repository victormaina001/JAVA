     import javax.swing.*;
	 import java.awt.*;
 public class JavaApp extends JFrame{
	 public JavaApp(){
		 JFrame frame = new JFrame();
		 
		 //set layout manager
		 setLayout(new BorderLayout());
		 // create swing components
		 JTextArea textarea= new JTextArea();
		 JLabel label =new JLabel("@MAINA ENGINE");
		 JButton button =new JButton("click Me!");
		 // add swing components to the contentpane
	Container c =getContentPane();
	 c.add(textarea,BorderLayout.CENTER);
	 c.add(button,BorderLayout.SOUTH);
	 c.add(label,BorderLayout.WEST);
	 
	 
	       setVisible(true);
		 setSize(500,400);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setTitle("Hello World Swing!");
	}
	public static void main(String[]args){
		new JavaApp();
	}
 }