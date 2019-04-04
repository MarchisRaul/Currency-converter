import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class ConvController {
	private ConvModel myModel;
	private ConvView myView;

	public ConvController(ConvModel model, ConvView view) {
		myModel = model;
		myView = view;

		myView.addSelectFrom(new SelectFromActionListener());
		myView.addSelectTo(new SelectToActionListener());
		myView.addSwitchConversion(new SwitchConversionListener());
		myView.addConvertValue(new ConvertValue());
	}

	public class SelectFromActionListener implements ActionListener {
		String selectedOptionFrom;
		String[] castFrom;
		String selectedOptionTo;
		String[] castTo;

		@Override
		public void actionPerformed(ActionEvent e) {
			if (myView.myToggle.getText().equals(">>")) {

				selectedOptionFrom = (String) myView.myComboBoxFirst.getSelectedItem();
				castFrom = selectedOptionFrom.split("-");

				selectedOptionTo = (String) myView.myComboBoxSecond.getSelectedItem();
				castTo = selectedOptionTo.split("-");
			} else {

				selectedOptionFrom = (String) myView.myComboBoxSecond.getSelectedItem();
				castFrom = selectedOptionFrom.split("-");

				selectedOptionTo = (String) myView.myComboBoxFirst.getSelectedItem();
				castTo = selectedOptionTo.split("-");
			}

			myView.from.setText(castFrom[0]);
			myView.to.setText(castTo[0]);

			myModel.setFrom(selectedOptionFrom);
			myModel.setTo(selectedOptionTo);
			myModel.setSuma("1.0");
			myModel.setRezultat("1.0");
			myModel.convertMoney();

			myView.info.setText("1 " + castFrom[0] + " = " + myModel.getRezultat() + " " + castTo[0]);

			myModel.setSuma(myView.numberToConvert.getText());
			myModel.convertMoney();
			myView.numberConverted.setText(myModel.getRezultat());
		}

	}

	public class SelectToActionListener implements ActionListener {
		String selectedOptionFrom;
		String[] castFrom;
		String selectedOptionTo;
		String[] castTo;

		@Override
		public void actionPerformed(ActionEvent e) {
			if (myView.myToggle.getText().equals(">>")) {

				selectedOptionFrom = (String) myView.myComboBoxFirst.getSelectedItem();
				castFrom = selectedOptionFrom.split("-");

				selectedOptionTo = (String) myView.myComboBoxSecond.getSelectedItem();
				castTo = selectedOptionTo.split("-");
			} else {

				selectedOptionFrom = (String) myView.myComboBoxSecond.getSelectedItem();
				castFrom = selectedOptionFrom.split("-");

				selectedOptionTo = (String) myView.myComboBoxFirst.getSelectedItem();
				castTo = selectedOptionTo.split("-");
			}

			myView.from.setText(castFrom[0]);
			myView.to.setText(castTo[0]);

			myModel.setFrom(selectedOptionFrom);
			myModel.setTo(selectedOptionTo);
			myModel.setSuma("1.0");
			myModel.setRezultat("1.0");
			myModel.convertMoney();

			myView.info.setText("1 " + castFrom[0] + " = " + myModel.getRezultat() + " " + castTo[0]);

			myModel.setSuma(myView.numberToConvert.getText());
			myModel.convertMoney();
			myView.numberConverted.setText(myModel.getRezultat());
		}

	}

	public class SwitchConversionListener implements ActionListener {
		String selectedOptionFrom;
		String[] castFrom;
		String selectedOptionTo;
		String[] castTo;

		@Override
		public void actionPerformed(ActionEvent e) {
			if (myView.myToggle.getText().equals(">>")) {
				myView.myToggle.setText("<<");

				selectedOptionFrom = (String) myView.myComboBoxSecond.getSelectedItem();
				castFrom = selectedOptionFrom.split("-");

				selectedOptionTo = (String) myView.myComboBoxFirst.getSelectedItem();
				castTo = selectedOptionTo.split("-");
			} else {
				myView.myToggle.setText(">>");

				selectedOptionFrom = (String) myView.myComboBoxFirst.getSelectedItem();
				castFrom = selectedOptionFrom.split("-");

				selectedOptionTo = (String) myView.myComboBoxSecond.getSelectedItem();
				castTo = selectedOptionTo.split("-");
			}

			myView.from.setText(castFrom[0]);
			myView.to.setText(castTo[0]);

			myModel.setFrom(selectedOptionFrom);
			myModel.setTo(selectedOptionTo);
			myModel.setSuma("1.0");
			myModel.setRezultat("1.0");
			myModel.convertMoney();

			myView.info.setText("1 " + castFrom[0] + " = " + myModel.getRezultat() + " " + castTo[0]);

			myModel.setSuma(myView.numberToConvert.getText());
			myModel.convertMoney();
			myView.numberConverted.setText(myModel.getRezultat());
		}

	}

	public class ConvertValue implements ActionListener {
		String selectedOptionFrom;
		String[] castFrom;
		String selectedOptionTo;
		String[] castTo;

		@Override
		public void actionPerformed(ActionEvent e) {
			if (myView.myToggle.getText().equals(">>")) {

				selectedOptionFrom = (String) myView.myComboBoxFirst.getSelectedItem();
				castFrom = selectedOptionFrom.split("-");

				selectedOptionTo = (String) myView.myComboBoxSecond.getSelectedItem();
				castTo = selectedOptionTo.split("-");
			} else {

				selectedOptionFrom = (String) myView.myComboBoxSecond.getSelectedItem();
				castFrom = selectedOptionFrom.split("-");

				selectedOptionTo = (String) myView.myComboBoxFirst.getSelectedItem();
				castTo = selectedOptionTo.split("-");
			}

			myView.from.setText(castFrom[0]);
			myView.to.setText(castTo[0]);

			myModel.setFrom(selectedOptionFrom);
			myModel.setTo(selectedOptionTo);
			myModel.setSuma("1.0");
			myModel.setRezultat("1.0");
			myModel.convertMoney();

			myView.info.setText("1 " + castFrom[0] + " = " + myModel.getRezultat() + " " + castTo[0]);

			myModel.setSuma(myView.numberToConvert.getText());
			myModel.convertMoney();
			myView.numberConverted.setText(myModel.getRezultat());
		}

	}

}
