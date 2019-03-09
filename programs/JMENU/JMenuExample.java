import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 public class JMenuExample extends JFrame{
	 public JMenuExample(){
		 super("Menus");
		 setSize(450,220);
		 JMenuBar mb;
		 JMenu m;
		 
		 mb=new JMenuBar();
		 setJMenuBar(mb);
		 
		 mb.add(m = new JMenu("File"));
		 m.add(new JMenuItem("Open"));
		 m.add(new JMenuItem("Save"));
		 m.add(new JMenuItem("Save as"));
		 m.add(new JMenuItem("Close"));
		 
		 mb.add(m = new JMenu ("Edit"));
		 m.add(new JMenuItem("Undo"));
		 m.add(new JMenuItem("Cut"));
		 m.add(new JMenuItem("Copy"));
		 m.add(new JMenuItem("Paste"));
		 
		 JPanel p = new JPanel();
		 p.add(new JTextArea());
		 add(p);
		 setVisible(true);
	 }
	 public static void main(String[]args){
		     new JMenuExample();
	 }
 }