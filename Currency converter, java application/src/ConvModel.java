import java.math.BigDecimal;

public class ConvModel {
	private static String suma = "1.0000";
	private static String rezultat = "1.0000";
	private static String from = "EUR - Euro";
	private static String to = "RON - Leul romanesc";
	private static final BigDecimal RON_TO_EURO = new BigDecimal("0.2152");
	private static final BigDecimal RON_TO_USD = new BigDecimal("0.2458");
	private static final BigDecimal EURO_TO_RON = new BigDecimal("4.6458");
	private static final BigDecimal EURO_TO_USD = new BigDecimal("1.1418");
	private static final BigDecimal USD_TO_RON = new BigDecimal("4.0688");
	private static final BigDecimal USD_TO_EURO = new BigDecimal("0.8758");

	public ConvModel() {
		super();
	}

	public static String getSuma() {
		return suma;
	}

	public static void setSuma(String suma) {
		ConvModel.suma = suma;
	}

	public static String getRezultat() {
		return rezultat;
	}

	public static void setRezultat(String rezultat) {
		ConvModel.rezultat = rezultat;
	}

	public static String getFrom() {
		return from;
	}

	public static void setFrom(String from) {
		ConvModel.from = from;
	}

	public static String getTo() {
		return to;
	}

	public static void setTo(String to) {
		ConvModel.to = to;
	}

	public void convertMoney() {
		BigDecimal sumOfMoney = new BigDecimal(this.suma);
		BigDecimal conversionOfMoney = new BigDecimal(this.rezultat);
		switch (from) {
		case "RON - Leul Romanesc":
			switch (to) {
			case "USD - Dolarul SUA":
				conversionOfMoney = sumOfMoney.multiply(RON_TO_USD);
				break;

			case "EUR - Euro":
				conversionOfMoney = sumOfMoney.multiply(RON_TO_EURO);
				break;

			case "RON - Leul Romanesc":
				conversionOfMoney = sumOfMoney;
				break;
			}
			break;

		case "EUR - Euro":
			switch (to) {
			case "USD - Dolarul SUA":
				conversionOfMoney = sumOfMoney.multiply(EURO_TO_USD);
				break;

			case "EUR - Euro":
				conversionOfMoney = sumOfMoney;
				break;

			case "RON - Leul Romanesc":
				conversionOfMoney = sumOfMoney.multiply(EURO_TO_RON);
				break;
			}
			break;

		case "USD - Dolarul SUA":
			switch (to) {
			case "USD - Dolarul SUA":
				conversionOfMoney = sumOfMoney;
				break;

			case "EUR - Euro":
				conversionOfMoney = sumOfMoney.multiply(USD_TO_EURO);
				break;

			case "RON - Leul Romanesc":
				conversionOfMoney = sumOfMoney.multiply(USD_TO_RON);
				break;
			}
			break;
		}
		this.rezultat = conversionOfMoney.toString();
	}

}
