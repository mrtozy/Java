


public class Mukemmel_Sayi {

    public static void main(String[] args) {

      int Mukemmel_Sayi = 6;

        int Toplam = 0;

        for (int i = 1; i<Mukemmel_Sayi; i++) {

            if ((Mukemmel_Sayi % i) == 0) {
                Toplam +=  i;
            }
        }

        if(Toplam == Mukemmel_Sayi) {
            System.out.println("Mukemmel Sayi: " + Toplam);
        }else {
            System.out.println("Mukemmel Sayi Değil");
        }
    }
}
