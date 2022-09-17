

public class AsalMi {

    public  static void main(String[] arhs){

    int sayi;
    
   
        sayi = 3;
      

         int toplam = 0;

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                toplam++;
            }
        }
        if (toplam == 2) {
            System.out.println("Asal sayidir");
        } else {
            System.out.println("Asal sayi değildir");
        }
    }
}
