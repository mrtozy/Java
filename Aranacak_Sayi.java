

public class Aranacak_Sayi {

    public  static void main(String[] arhs){
 int[] sayilar = new int[]{1,3,4,5,6};
   boolean varMi = false;
      
        int aranacak =3;
      

        for(int sayi : sayilar){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }
       if (varMi == true){
            System.out.println("Aradığınız sayı mevcuttur.");
        }
        else {
            System.out.println("Aradıgınız sayı bulunmamaktadır.");
        }
    }
}
