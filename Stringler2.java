

public class Stringler2 {

    public static void main(String[] args) {

         String name = " Mert Ozsoy";

        System.out.println("kelimeyi istenilen hale getirir. " + name.replace("O", "Ö"));

        System.out.println("Kelime de istenilen harften başlatır: " + name.substring(1));

        System.out.println("Kelime de istenilen harften başlatır: " + name.substring(1,5));

        for (String newName: name.split(" ")) {
            System.out.println("Kelimeyi istenilen harfe göre ayırır: " + newName.replace("O", "Ö"));
        }
    }
}
