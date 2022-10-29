import java.awt.*; 
//import java.awt.event.*;
//import java.util.*;
import javax.swing.*;
public class GameFrame extends JFrame {
	
	GamePanel Panel;
	  
	GameFrame()
	{
		Panel = new GamePanel();
		this.add(Panel);
		this.setTitle("pong Game");
		this.setResizable(false);
		 this.setBackground(Color.black);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   this.pack();
		   this.setVisible(true);
		   this.setLocationRelativeTo(null);
		   
		   
		 
		
		
		
	}
	

}
