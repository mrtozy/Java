public class Metod2 {

   public static void main(String[] args) {
 String message = "Hava Güzel"; 
 String yeniMesaj = sehirVer();
		System.out.println(message);
		
		System.out.println(yeniMesaj);
		int number = topla(15,7);
		System.out.println(number);
		

		
	}
	
	public static void ekle() {
		System.out.println("Added");
	}
	
	public static void sil() {
		System.out.println("Deleted");
	}
	
	public static void guncelle() {
		System.out.println("Updated");
	}
	
	public static int topla(int number1, int number2) {
		return number1+number2;
	}
	
	
	
	public static String sehirVer() {
		return "Ankara";
	}

}
