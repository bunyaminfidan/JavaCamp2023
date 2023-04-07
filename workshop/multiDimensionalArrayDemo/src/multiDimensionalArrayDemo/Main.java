package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] cities = new String[3][3];

		cities[0][0] = "Marmara";
		cities[0][1] = "Istanbul";
		cities[0][2] = "Edirne";
		cities[1][0] = "Dogu Anadolu";
		cities[1][1] = "Malatya";
		cities[1][2] = "Diyarbakir";
		cities[2][0] = "Ege";
		cities[2][1] = "Izmir";
		cities[2][2] = "Denizli";

		for (int i = 0; i < cities.length; i++) {
			System.out.println("-----------------------");
			for (int j = 0; j < cities.length; j++) {
				System.out.println("Part of area and city name = " + cities[i][j]);

			}

		}

	}

}
