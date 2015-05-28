/**
 * 
 */
package fr.iutvalence.rico.planeille.puissancequatre;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.event.ActionListener; 

/**
 * @author planeilb
 *
 */
public class Frame extends JFrame implements ActionListener{
	
	private JButton[] column;
	private JButton[] colorCase;
	private JPanel buttonPanel;
	private JPanel gameGrid;
	private JSplitPane gamePanel;

	

	  public Frame(){        

		  
				
				this.setTitle("Puissance 4");
				this.setSize(300, 300);
				this.setResizable(true);
				this.setLocationRelativeTo(null);
			    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    
			    
			    this.gamePanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
			    this.gamePanel.setDividerLocation(50);
			    this.gamePanel.enable(false);
			    
			    
			    this.buttonPanel = new JPanel();
			    this.buttonPanel.setLayout(new GridLayout(1,7));
			    
			    column = new JButton[7];
			    
			    for(int numberOfButton = 0; numberOfButton < 7; numberOfButton++){
			    	this.column[numberOfButton] = new Button(numberOfButton);
			    	this.column[numberOfButton].addActionListener(this);
			    	this.buttonPanel.add(column[numberOfButton]);
			    	
			    }
			    
			    this.gamePanel.setTopComponent(this.buttonPanel);
			   
			    this.gameGrid = new JPanel();
			    
			    this.gameGrid.setLayout(new GridLayout(6,7));
			    
			    this.colorCase = new JButton[42];
			    
			    for(int numberOfCase = 0; numberOfCase < 42; numberOfCase++){
			    	colorCase[numberOfCase] = new JButton();
			    	this.gameGrid.add(this.colorCase[numberOfCase]);
			    	
			    }
			    
			  
			    
			    
			    
			    this.gamePanel.setBottomComponent(this.gameGrid);
	
			    
			    
			    
			    
			    this.getContentPane().add(this.gamePanel);
				this.setVisible(true);
				
			}
		
	    
	  
	  public void actionPerformed(ActionEvent arg0) {  
		  
	  Grid.stack() 

	  } 
	  
	  
	  
	  }


	 

	        


