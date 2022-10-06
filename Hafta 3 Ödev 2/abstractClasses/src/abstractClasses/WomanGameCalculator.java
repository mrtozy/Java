package abstractClasses;

public class WomanGameCalculator extends GameCalculator{
	public void durum() {
		 System.out.println("Kadın ");
		
	}
    @Override
    public void hesapla(){
        System.out.println("Puanınız : 100");
    }
}