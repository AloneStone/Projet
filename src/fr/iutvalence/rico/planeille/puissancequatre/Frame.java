/**
 * 
 */
package fr.iutvalence.rico.planeille.puissancequatre;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Graphics;

/**
 * @author planeilb
 *
 */
public class Frame extends JFrame {
	
	
	
	private Panel pan = new Panel();

	  public Frame(){        

	    this.setTitle("Puissance 4");

	    this.setSize(300, 300);

	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    this.setLocationRelativeTo(null);

	    this.setContentPane(pan);

	    this.setVisible(true);
	   GridLayout g1 =new GridLayout(1, 7);
	    this.setLayout(g1);
	    g1.setHgap(20);
	    this.getContentPane().add(new JButton("1"), BorderLayout.NORTH);
	    this.getContentPane().add(new JButton("2"), BorderLayout.NORTH);
	    this.getContentPane().add(new JButton("3"), BorderLayout.NORTH);
	    this.getContentPane().add(new JButton("4"), BorderLayout.NORTH);
	    this.getContentPane().add(new JButton("5"), BorderLayout.NORTH);
	    this.getContentPane().add(new JButton("6") ,BorderLayout.NORTH);
	    this.getContentPane().add(new JButton("7") ,BorderLayout.NORTH);

	    
	  }

	 

	        

}
