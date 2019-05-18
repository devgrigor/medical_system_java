import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PatientRegistration implements ActionListener {
	JPanel myPanel;
	JTextArea ta;
	int patientCount = 0;
	PatientCatalog catalog;

	PatientRegistration (JPanel panel, PatientCatalog catalog) {
		this.myPanel = panel;
		this.catalog = catalog;
		this.initButton();
	}

	public void initButton() {		
		JLabel label = new JLabel("Personal data");
		JButton send = new JButton("Register");
		JButton reset = new JButton("Reset");
		send.addActionListener(this);
		reset.addActionListener(this);
		this.ta = new JTextArea();

		this.myPanel.add(label);
		// this.myPanel.add(reset);
		this.myPanel.add(send);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("some  action performed ==================================");
		
		String params = e.paramString();
		if(params.contains("Register")) {
			System.out.println(ta.getText());
			Patient p = new Patient(this.patientCount++, ta.getText());
			this.catalog.addPateint(p);
		}

		if(params.contains("Reset")) {
			System.out.println("Reset was clicked");
		}
    }
}