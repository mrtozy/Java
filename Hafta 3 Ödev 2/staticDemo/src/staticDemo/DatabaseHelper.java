package staticDemo;

public class DatabaseHelper {
	public static class Crud { 
        public static void delete(){
        	System.out.println("silindi");
        }
        public static void update(){
        	System.out.println("güncellendi");
        }
    }

    public static class Connection{
        public static void createConnection(){}
    }
}