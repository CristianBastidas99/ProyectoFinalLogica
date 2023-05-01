package co.edu.uniquindio.org.exception;

import javax.swing.JOptionPane;

public class ReglaTresExeption extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReglaTresExeption(String msg) {
        super(msg);
        JOptionPane.showMessageDialog(null, msg);
    }
	
}
