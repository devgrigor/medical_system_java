import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main {
	public void actionPerformed(ActionEvent e) {
		System.out.println("action actionPerformed");
	}

    public static void main(String args[]){
       JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 640);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        //Creating the panel at bottom and adding components
        PatientCatalog ctlg = new PatientCatalog();
        CardCatalog cardCtlg = new CardCatalog();
        CardOpening op = new CardOpening(panel2, cardCtlg);
        PatientRegistration patientReg = new PatientRegistration(panel, ctlg);
        CloseCard close = new CloseCard(panel3, cardCtlg);
        CardAugmentation aug = new CardAugmentation(panel4, cardCtlg);
        
		
		// add to the parent container (e.g. a JFrame):
		// panel.add(bookList);
		
		// get the selected item:
		// String selectedBook = (String) bookList.getSelectedItem();
		// System.out.println("You seleted the book: " + selectedBook);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.CENTER, patientReg.ta); 
        frame.getContentPane().add(BorderLayout.PAGE_START, panel);
        frame.getContentPane().add(BorderLayout.EAST, panel4);
        frame.getContentPane().add(BorderLayout.WEST, panel2);
        frame.getContentPane().add(BorderLayout.PAGE_END, panel3);
        
        
        // frame.getContentPane().add(BorderLayout.CENTER, buttons);
        // frame.getContentPane().add(BorderLayout.PAGE_START, bookList);
        frame.setVisible(true);
    }
}