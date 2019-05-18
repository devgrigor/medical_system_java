import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CardAugmentation implements ActionListener {
	Container myPanel;
	JTextArea ta;
	int patientCount = 0;
    CardCatalog catalog;
    JComboBox<String> cardList;

	CardAugmentation (Container panel, CardCatalog catalog) {
		this.myPanel = panel;
		this.catalog = catalog;
		this.initButton();
	}

	public void initButton() {		
		JLabel label = new JLabel("Card augmentation");
		JButton send = new JButton("CardAugmentation");
		send.addActionListener(this);
        this.ta = new JTextArea();
        String[] cards = new String[] {
        	"Card 1",
        	"Card 2",
        	"Card 3"
        };

		this.cardList = new JComboBox<>(cards);

		this.myPanel.add(label);
		this.myPanel.add(cardList);
		this.myPanel.add(send);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("some  action performed ==================================");
		String params = e.paramString();
        
        String selectedBook = (String) this.cardList.getSelectedItem();

		if(params.contains("CardAugmentation")) {
			System.out.println("Card is augmented for " + selectedBook);
		}
    }
}