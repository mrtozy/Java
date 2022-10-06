package abstractClasses;

public class OlderGameCalculator extends GameCalculator{
	public void durum() {
		 System.out.println("Yaşlı ");
		
	}
    @Override
    public void hesapla() {
    	 System.out.println("Puanınız : 10");
    }
}