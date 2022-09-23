public class Metod {

    public static void main(String[] args) {
    sayiBul();
  }
  public static void sayiBul() {
		int[] sayilar = new int[]{1,2,5,7,9,0};
		int arananSayi = 2;
		boolean oMu = false;
		
		for(int sayi : sayilar) {
			if(sayi==arananSayi) {
				oMu = true;
				break;
			}
		}
		
		if(oMu) {
			mesajVer("sayı var : "+arananSayi);
		}else {
			mesajVer("sayı yok  : "+arananSayi);
		}
	}
	public static void mesajVer(String message) {
		System.out.println(message);
	} 

}
