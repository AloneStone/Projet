/**
 * 
 */
package fr.iutvalence.rico.planeille.puissancequatre;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener; 
/**
 * @author planeilb
 *
 */
public class Button extends JButton{
	

	private int numberOfColumn;
	
	public Button(int columnNumber){
		super("↓");
		this.numberOfColumn = columnNumber;
	}

	public int getNumberOfColumn() {
		return numberOfColumn;
	}
	
	  
	  
}
