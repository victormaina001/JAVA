import javax.swing.*;
import javax.awt.*;
  public class LayoutDemo extends JFrame{
     public LayoutDemo(){
		 //creating a tabbed pane with five different tabs
		 //demonstrating the various layout managers 
		 JTabbedPane tp =new JTabbedPane();
		 tp.addTab("Intro", new IntroPanel());
		 tp.addTab("Flow", new FlowPanel());
		 tp.addTab("Border", new BorderPanel());
		 tp.addTab("Grid", new GridPanel());
		 tp.addTab("Box", new BoxPanel());
		 
		 Container cpane = getContentPane();
		 cpane.add(tp);
		 
		 
		     //set frame properties
		 setTitle("Layout Manager Demo");
		 setSize(400,300);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	     setVisible(true);
	 }
	 
	       public static void main(String[]args){
		          new LayoutDemo();
	     }
  }