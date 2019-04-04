import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class ConvView extends JFrame {
	ConvModel myModel;
	JPanel myPanelVertical = new JPanel();
	JPanel firstPanelHoriz = new JPanel();
	JPanel secondPanelHoriz = new JPanel();
	JPanel thirdPanelHoriz = new JPanel();
	JPanel thirdPanelFirstVertical = new JPanel();
	JPanel thirdPanelSecondVertical = new JPanel();
	JPanel thirdPanelThirdVertical = new JPanel();
	JLabel info = new JLabel("1 EURO = 4.6458 RON", JLabel.CENTER);

	JComboBox myComboBoxFirst = new JComboBox(
			new String[] { "RON - Leul Romanesc", "EUR - Euro", "USD - Dolarul SUA" });
	JComboBox myComboBoxSecond = new JComboBox(
			new String[] { "RON - Leul Romanesc", "EUR - Euro", "USD - Dolarul SUA" });

	JButton myToggle = new JButton(">>");

	JLabel suma = new JLabel("Suma: ");
	JLabel rezultat = new JLabel("Rezultat: ");
	JTextField numberToConvert = new JTextField("1", 10);
	JTextField numberConverted = new JTextField("4.4693", 10);

	JLabel from = new JLabel("EUR");
	JLabel to = new JLabel("RON");
	// JScrollPane scrollPane1 = new JScrollPane(myComboBoxFirst);
	// JScrollPane scrollPane2 = new JScrollPane(myComboBoxSecond);

	public ConvView(ConvModel model) {
		myModel = model;
		myPanelVertical.setLayout(new BoxLayout(myPanelVertical, BoxLayout.Y_AXIS));
		firstPanelHoriz.setLayout(new BoxLayout(firstPanelHoriz, BoxLayout.X_AXIS));
		secondPanelHoriz.setLayout(new BoxLayout(secondPanelHoriz, BoxLayout.X_AXIS));
		thirdPanelHoriz.setLayout(new BoxLayout(thirdPanelHoriz, BoxLayout.X_AXIS));
		thirdPanelFirstVertical.setLayout(new BoxLayout(thirdPanelFirstVertical, BoxLayout.Y_AXIS));
		thirdPanelSecondVertical.setLayout(new BoxLayout(thirdPanelSecondVertical, BoxLayout.Y_AXIS));
		thirdPanelThirdVertical.setLayout(new BoxLayout(thirdPanelThirdVertical, BoxLayout.Y_AXIS));

		thirdPanelFirstVertical.add(suma);
		thirdPanelFirstVertical.add(Box.createRigidArea(new Dimension(0, 5)));
		thirdPanelFirstVertical.add(rezultat);
		thirdPanelSecondVertical.add(numberToConvert);
		thirdPanelSecondVertical.add(Box.createRigidArea(new Dimension(0, 5)));
		thirdPanelSecondVertical.add(numberConverted);
		thirdPanelThirdVertical.add(from);
		thirdPanelThirdVertical.add(Box.createRigidArea(new Dimension(0, 5)));
		thirdPanelThirdVertical.add(to);

		thirdPanelHoriz.add(Box.createRigidArea(new Dimension(10, 0)));
		thirdPanelHoriz.add(thirdPanelFirstVertical);
		thirdPanelHoriz.add(Box.createRigidArea(new Dimension(10, 0)));
		thirdPanelHoriz.add(thirdPanelSecondVertical);
		thirdPanelHoriz.add(Box.createRigidArea(new Dimension(10, 0)));
		thirdPanelHoriz.add(thirdPanelThirdVertical);
		thirdPanelHoriz.add(Box.createRigidArea(new Dimension(10, 0)));

		myToggle.setBackground(Color.lightGray);

		firstPanelHoriz.add(info);
		secondPanelHoriz.add(Box.createRigidArea(new Dimension(10, 0)));
		secondPanelHoriz.add(myComboBoxFirst);
		secondPanelHoriz.add(Box.createRigidArea(new Dimension(20, 0)));
		secondPanelHoriz.add(myToggle);
		secondPanelHoriz.add(Box.createRigidArea(new Dimension(20, 0)));
		secondPanelHoriz.add(myComboBoxSecond);
		secondPanelHoriz.add(Box.createRigidArea(new Dimension(10, 0)));

		myPanelVertical.add(Box.createRigidArea(new Dimension(0, 10)));
		myPanelVertical.add(firstPanelHoriz);
		myPanelVertical.add(Box.createRigidArea(new Dimension(0, 10)));
		myPanelVertical.add(secondPanelHoriz);
		myPanelVertical.add(Box.createRigidArea(new Dimension(0, 10)));
		myPanelVertical.add(thirdPanelHoriz);
		myPanelVertical.add(Box.createRigidArea(new Dimension(0, 10)));

		numberToConvert.setEditable(true);
		numberConverted.setEditable(false);

		myComboBoxFirst.setSelectedIndex(1);
		myComboBoxSecond.setSelectedIndex(0);

		this.setSize(new Dimension(500, 250));
		this.setContentPane(myPanelVertical);
		this.pack();
		this.setTitle("Simple money convertor");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void addSelectFrom(ActionListener action) {
		myComboBoxFirst.addActionListener(action);
	}

	public void addSelectTo(ActionListener action) {
		myComboBoxSecond.addActionListener(action);
	}

	public void addSwitchConversion(ActionListener action) {
		myToggle.addActionListener(action);
	}

	public void addConvertValue(ActionListener action) {
		numberToConvert.addActionListener(action);
	}

}
