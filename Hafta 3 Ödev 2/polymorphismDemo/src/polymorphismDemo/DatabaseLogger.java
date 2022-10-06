package polymorphismDemo;

public class DatabaseLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Veri tabanına loglandı : " + message);
	}
}