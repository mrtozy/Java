

public class Cok_Boyutlu_Diziler {

    public static void main(String[] args) {
       String[][] tek_cift_sayilar = new String[2][3];

        tek_cift_sayilar[0][0] = "1";
        tek_cift_sayilar[0][1]  = "3";
        tek_cift_sayilar[0][2]  = "5";

        tek_cift_sayilar[1][0]  = "2";
        tek_cift_sayilar[1][1]  = "4";
        tek_cift_sayilar[1][2]  = "6";

       

        for (int i = 0; i< tek_cift_sayilar.length; i++){

            System.out.println("----------------------------");

              for(int j= 0; j <= tek_cift_sayilar.length; j++){
                  System.out.println(tek_cift_sayilar[i][j]);
              }
        }

    }
}
