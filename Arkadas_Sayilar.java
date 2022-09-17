

public class Arkadas_Sayilar {

    public  static void main(String[] arhs){
int sayi1=220;
	 int sayi2=284;
	 int toplam=0;
	 int toplam2=0;
	 for(int i=1; i<sayi1; i++)
	 {
		 if(sayi1%i == 0)
		 {
			 toplam = toplam+i;
		 }
		 
	 }
	    
	 for(int i=1; i<sayi2; i++)
	 {
		 if(sayi2%i == 0)
		 {
			 toplam2 = toplam2+i;
		 }
	 }
		 if (toplam==sayi2 && toplam2 == sayi1)
		 {
			 System.out.println("Bu iki sayi arkadaş sayidir.");
		 }
		 else
		 {
			 System.out.println("Bu iki sayi arkadas sayi degildir");
		 }
    }
}
