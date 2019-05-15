import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BottomPanel implements ActionListener {
	JPanel myPanel;
	BottomPanel (JPanel panel) {
		this.myPanel = panel;
		this.initButton();
	}

	public void initButton() {
		JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        send.addActionListener(this);
        reset.addActionListener(this);

        this.myPanel.add(send);
        this.myPanel.add(reset);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("some  action performed" + e);
		System.out.println(e.getActionCommand());
		String params = e.paramString();
		if(params.contains("Send")) {
			System.out.println("Send was pushed");
		}

		if(params.contains("Reset")) {
			System.out.println("Reset was clicked");
		}
    }
}