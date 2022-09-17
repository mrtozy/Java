

public class String1 {

    public static void main(String[] args) {

         String mesaj = "Bugün hava çok güzel.";
System.out.println(mesaj);
System.out.println("Eleman sayısı : " + mesaj.length());
System.out.println("5. eleman : " + mesaj.charAt(4));
System.out.println(mesaj.concat(" Yaşasın!"));
System.out.println(mesaj.startsWith("B"));

System.out.println(mesaj.endsWith("."));
char[] karakterler = new char[5];

System.out.println(karakterler);
System.out.println(mesaj.indexOf("av"));


        System.out.println("Mesaj lastIndexOf " + mesaj.lastIndexOf("n"));

    }
}
