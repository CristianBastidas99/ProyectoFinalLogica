package co.edu.uniquindio.org.exception;

import javax.swing.JOptionPane;

public class PrimeraReglaExption extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PrimeraReglaExption(String msg) {
        super(msg);
        JOptionPane.showMessageDialog(null, msg);
    }
	
}
