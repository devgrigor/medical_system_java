import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CardOpening implements ActionListener {
	Container myPanel;
	JTextArea ta;
	int patientCount = 0;
    CardCatalog catalog;
    JComboBox<String> docList;

	CardOpening (Container panel, CardCatalog catalog) {
		this.myPanel = panel;
		this.catalog = catalog;
		this.initButton();
	}

	public void initButton() {		
		JLabel label = new JLabel("Card opening");
		JButton send = new JButton("OpenCard");
		send.addActionListener(this);
        this.ta = new JTextArea();
        String[] doctors = new String[] {
        	"Dr newton",
        	"Dr something else",
        	"Dr stievence",
        	"Dr noone"
        };
		this.docList = new JComboBox<>(doctors);

		this.myPanel.add(label);
		this.myPanel.add(docList);
		this.myPanel.add(send);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("some  action performed ==================================");
		String params = e.paramString();
        
        String selectedBook = (String) this.docList.getSelectedItem();

		if(params.contains("OpenCard")) {
			System.out.println("Card is opened for " + selectedBook);
		}
    }
}