import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CardOpening implements ActionListener {
	Container myPanel;
	JTextArea ta;
	int cardCount = 0;
    CardCatalog catalog;
    JComboBox<String> docList;
    JComboBox<String> desList;
    JComboBox<String> patList;

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
        String[] desieses = new String[] {
        	"Famin",
        	"AIDS",
        	"Tripper",
        	"Tuberculoses"
        };

        String[] patients = new String[] {
        	"Patient 1",
        	"Patient 3",
        	"Patient 4",
        	"Patient 2"
        };
        this.docList = new JComboBox<>(doctors);
        this.desList = new JComboBox<>(desieses);
        this.patList = new JComboBox<>(patients);

		this.myPanel.add(label);
        this.myPanel.add(docList);
        this.myPanel.add(desList);
        this.myPanel.add(patList);
		this.myPanel.add(send);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("some  action performed ==================================");
		String params = e.paramString();
        
        Integer doctorID = (Integer) this.docList.getSelectedIndex();
        Integer desesaseID = (Integer) this.desList.getSelectedIndex();
        Integer patientID = (Integer) this.patList.getSelectedIndex();
        

		if(params.contains("OpenCard")) {
            Card c = new Card(this.cardCount++, patientID, desesaseID, doctorID);
            this.catalog.addCard(this.cardCount, c);
			System.out.println("Card is opened  and added" + this.cardCount);
		}
    }
}