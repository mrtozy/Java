package abstractClasses;

public class Main {

	public static void main(String[] args) {
		GameCalculator[] game = {new OlderGameCalculator(),new WomanGameCalculator(),new KidsGameCalculator(),new ManGameCalculator()};
		for (GameCalculator gameCalculator : game) {
			gameCalculator.durum();
			gameCalculator.hesapla();
		}

	}

}
