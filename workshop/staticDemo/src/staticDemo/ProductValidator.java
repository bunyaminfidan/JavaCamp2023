package staticDemo;

public class ProductValidator {

	public static boolean isValid(Product procudt) {

		if (!procudt.name.isEmpty() && procudt.price > 0) {

			return true;

		} else {
			return false;
		}

	}

}
