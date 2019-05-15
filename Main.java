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

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        BottomPanel buttons = new BottomPanel(panel);
        panel.add(label); // Components Added using Flow Layout
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        String[] bookTitles = new String[] {
        	"Effective Java",
        	"Head First Java",
        	"Thinking in Java",
        	"Java for Dummies"
        };
		JComboBox<String> bookList = new JComboBox<>(bookTitles);
		
		// add to the parent container (e.g. a JFrame):
		panel.add(bookList);
		
		// get the selected item:
		String selectedBook = (String) bookList.getSelectedItem();
		System.out.println("You seleted the book: " + selectedBook);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.getContentPane().add(BorderLayout.PAGE_START, bookList);
        frame.setVisible(true);
    }
}